package com.muhron.kotlinq

import java.util.*
import kotlin.comparisons.*

internal class Grouping<TKey, TElement> internal constructor(private val entry: Map.Entry<TKey, List<TElement>>) : IGrouping<TKey, TElement> {
    override val key: TKey
        get() = entry.key

    override fun iterator(): Iterator<TElement> = entry.value.iterator()
}

class Lookup<TKey, TElement> internal constructor(val list: List<IGrouping<TKey, TElement>>) : ILookup<TKey, TElement> {
    fun <R> applyResultSelector(resultSelector: (TKey, Sequence<TElement>) -> R): Sequence<R>
            = asSequence().map { resultSelector(it.key, it) }

    override operator fun get(key: TKey): Sequence<TElement> = list.firstOrNull { it.key == key } ?: empty()

    override fun iterator(): Iterator<IGrouping<TKey, TElement>> = list.iterator()

    override fun contains(key: TKey): Boolean = list.any { it.key == key }

    override val count: Int
        get() = list.size
}

class OrderedEnumerable<TElement> internal constructor(private val originalSequence: Sequence<TElement>, private val elementComparator: Comparator<TElement>) : IOrderedEnumerable<TElement> {
    override fun iterator(): Iterator<TElement> = originalSequence.sortedWith(elementComparator).iterator()

    override fun <TKey : Comparable<TKey>> createOrderedEnumerable(keySelector: (TElement) -> TKey, comparator: Comparator<in TKey>, descending: Boolean): IOrderedEnumerable<TElement> {
        val newComparator = compareBy(comparator, keySelector)

        val childComparator =
                if (descending)
                    elementComparator.thenDescending(newComparator)
                else
                    elementComparator.then(newComparator)

        return OrderedEnumerable(originalSequence, childComparator)
    }
}
