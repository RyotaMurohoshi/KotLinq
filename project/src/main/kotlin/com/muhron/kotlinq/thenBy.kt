package com.muhron.kotlinq

import java.util.Comparator
import kotlin.comparisons.naturalOrder

fun <T, K : Comparable<K>> IOrderedEnumerable<T>.thenBy(keySelector: (T) -> K): IOrderedEnumerable<T>
        = this.createOrderedEnumerable(keySelector, naturalOrder(), false)

fun <T, K : Comparable<K>> IOrderedEnumerable<T>.thenBy(keySelector: (T) -> K, comparer: Comparator<K>): IOrderedEnumerable<T>
        = this.createOrderedEnumerable(keySelector, comparer, false)

fun <T, K : Comparable<K>> IOrderedEnumerable<T>.thenByDescending(keySelector: (T) -> K): IOrderedEnumerable<T>
        = this.createOrderedEnumerable(keySelector, naturalOrder(), true)

fun <T, K : Comparable<K>> IOrderedEnumerable<T>.thenByDescending(keySelector: (T) -> K, comparer: Comparator<K>): IOrderedEnumerable<T>
        = this.createOrderedEnumerable(keySelector, comparer, true)
