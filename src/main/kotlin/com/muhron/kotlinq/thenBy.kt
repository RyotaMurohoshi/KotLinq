package com.muhron.kotlinq

import java.util.Comparator
import kotlin.comparisons.naturalOrder

// thenBy with keySelector
fun <TSource, TKey : Comparable<TKey>> OrderedEnumerable<TSource>.thenBy(keySelector: (TSource) -> TKey): OrderedEnumerable<TSource>
        = this.createOrderedEnumerable(keySelector, naturalOrder(), false)

// thenBy with keySelector and comparer
fun <TSource, TKey : Comparable<TKey>> OrderedEnumerable<TSource>.thenBy(keySelector: (TSource) -> TKey, comparer: Comparator<TKey>): OrderedEnumerable<TSource>
        = this.createOrderedEnumerable(keySelector, comparer, false)

// thenByDescending with keySelector
fun <TSource, TKey : Comparable<TKey>> OrderedEnumerable<TSource>.thenByDescending(keySelector: (TSource) -> TKey): OrderedEnumerable<TSource>
        = this.createOrderedEnumerable(keySelector, naturalOrder(), true)

// thenByDescending with keySelector and comparer
fun <TSource, TKey : Comparable<TKey>> OrderedEnumerable<TSource>.thenByDescending(keySelector: (TSource) -> TKey, comparer: Comparator<TKey>): OrderedEnumerable<TSource>
        = this.createOrderedEnumerable(keySelector, comparer, true)
