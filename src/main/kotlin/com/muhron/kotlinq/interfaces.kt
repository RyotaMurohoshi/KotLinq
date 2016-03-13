package com.muhron.kotlinq

import java.util.Comparator

interface IGrouping<TKey, TElement> : Sequence<TElement> {
    val key: TKey
}

interface ILookup<TKey, TElement> : Sequence<IGrouping<TKey, TElement>> {
    val count: Int
    operator fun get(key: TKey): Sequence<TElement>
    fun contains(key: TKey): Boolean
}

interface IOrderedEnumerable<TElement> : Sequence<TElement> {
    fun <TKey : Comparable<TKey>> createOrderedEnumerable(keySelector: (TElement) -> TKey, comparator: Comparator<in TKey>, descending: Boolean): IOrderedEnumerable<TElement>
}
