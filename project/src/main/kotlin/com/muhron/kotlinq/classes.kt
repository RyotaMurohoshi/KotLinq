package com.muhron.kotlinq

internal  class Grouping<K, E> internal constructor(private val entry: Map.Entry<K, List<E>>) : IGrouping<K, E> {
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
