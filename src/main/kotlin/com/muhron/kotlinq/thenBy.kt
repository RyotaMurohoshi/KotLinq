package com.muhron.kotlinq

import java.util.Comparator
import kotlin.comparisons.naturalOrder

// thenBy with keySelector
fun <T, K : Comparable<K>> IOrderedEnumerable<T>.thenBy(keySelector: (T) -> K): IOrderedEnumerable<T>
        = this.createOrderedEnumerable(keySelector, naturalOrder(), false)

// thenBy with keySelector and comparer
fun <T, K : Comparable<K>> IOrderedEnumerable<T>.thenBy(keySelector: (T) -> K, comparer: Comparator<K>): IOrderedEnumerable<T>
        = this.createOrderedEnumerable(keySelector, comparer, false)

// thenByDescending with keySelector
fun <T, K : Comparable<K>> IOrderedEnumerable<T>.thenByDescending(keySelector: (T) -> K): IOrderedEnumerable<T>
        = this.createOrderedEnumerable(keySelector, naturalOrder(), true)

// thenByDescending with keySelector and comparer
fun <T, K : Comparable<K>> IOrderedEnumerable<T>.thenByDescending(keySelector: (T) -> K, comparer: Comparator<K>): IOrderedEnumerable<T>
        = this.createOrderedEnumerable(keySelector, comparer, true)
