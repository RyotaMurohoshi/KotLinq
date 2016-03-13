package com.muhron.kotlinq

import java.util.Comparator

interface Grouping<TKey, TElement> : Sequence<TElement> {
    val key: TKey
}

interface Lookup<TKey, TElement> : Sequence<Grouping<TKey, TElement>> {
    val count: Int
    operator fun get(key: TKey): Sequence<TElement>
    fun contains(key: TKey): Boolean
}

interface OrderedEnumerable<TElement> : Sequence<TElement> {
    fun <TKey : Comparable<TKey>> createOrderedEnumerable(keySelector: (TElement) -> TKey, comparator: Comparator<in TKey>, descending: Boolean): OrderedEnumerable<TElement>
}
