package com.muhron.kotlinq

import java.util.Comparator

interface IGrouping<K, E> : Sequence<E> {
    val key: K
}

interface ILookup<K, E> : Sequence<IGrouping<K, E>> {
    val count: Int
    operator fun get(key: K): Sequence<E>
    fun contains(key: K): Boolean
}

interface IOrderedEnumerable<E> : Sequence<E> {
    fun <K : Comparable<K>> createOrderedEnumerable(keySelector: (E) -> K, comparator: Comparator<in K>, descending: Boolean): IOrderedEnumerable<E>
}
