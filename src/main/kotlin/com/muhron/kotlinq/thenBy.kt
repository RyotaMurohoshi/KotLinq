package com.muhron.kotlinq

import java.util.Comparator
import kotlin.comparisons.naturalOrder

// thenBy with keySelector
fun <T, K : Comparable<K>> OrderedEnumerable<T>.thenBy(keySelector: (T) -> K): OrderedEnumerable<T>
        = this.createOrderedEnumerable(keySelector, naturalOrder(), false)

// thenBy with keySelector and comparer
fun <T, K : Comparable<K>> OrderedEnumerable<T>.thenBy(keySelector: (T) -> K, comparer: Comparator<K>): OrderedEnumerable<T>
        = this.createOrderedEnumerable(keySelector, comparer, false)

// thenByDescending with keySelector
fun <T, K : Comparable<K>> OrderedEnumerable<T>.thenByDescending(keySelector: (T) -> K): OrderedEnumerable<T>
        = this.createOrderedEnumerable(keySelector, naturalOrder(), true)

// thenByDescending with keySelector and comparer
fun <T, K : Comparable<K>> OrderedEnumerable<T>.thenByDescending(keySelector: (T) -> K, comparer: Comparator<K>): OrderedEnumerable<T>
        = this.createOrderedEnumerable(keySelector, comparer, true)
