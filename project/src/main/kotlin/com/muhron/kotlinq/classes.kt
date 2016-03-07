package com.muhron.kotlinq

import java.util.*
import kotlin.comparisons.*

internal class Grouping<K, E> internal constructor(private val entry: Map.Entry<K, List<E>>) : IGrouping<K, E> {
    override val key: K
        get() = entry.key

    override fun iterator(): Iterator<E> = entry.value.iterator()
}

class Lookup<K, E> internal constructor(val list: List<IGrouping<K, E>>) : ILookup<K, E> {
    fun <R> applyResultSelector(resultSelector: (K, Sequence<E>) -> R): Sequence<R>
            = asSequence().map { resultSelector(it.key, it) }

    override fun get(key: K): Sequence<E> = list.firstOrNull { it.key == key } ?: empty()

    override fun iterator(): Iterator<IGrouping<K, E>> = list.iterator()

    override fun contains(key: K): Boolean = list.any { it.key == key }

    override val count: Int
        get() = list.size
}

class OrderedEnumerable<E> internal constructor(private val originalSequence: Sequence<E>, private val elementComparator: Comparator<E>) : IOrderedEnumerable<E> {
    override fun iterator(): Iterator<E> = originalSequence.sortedWith(elementComparator).iterator()

    override fun <K : Comparable<K>> createOrderedEnumerable(keySelector: (E) -> K, comparator: Comparator<in K>, descending: Boolean): IOrderedEnumerable<E> {
        val newComparator = compareBy(comparator, keySelector)

        val childComparator =
                if (descending)
                    elementComparator.thenDescending(newComparator)
                else
                    elementComparator.then(newComparator)

        return OrderedEnumerable(originalSequence, childComparator)
    }
}
