package com.muhron.kotlinq

import java.util.Comparator
import kotlin.comparisons.compareBy

fun <T, K : Comparable<K>> Sequence<T>.orderBy(keySelector: (T) -> K): IOrderedEnumerable<T>
        = OrderedEnumerable(this, compareBy(keySelector))

fun <T, K : Comparable<K>> Sequence<T>.orderBy(keySelector: (T) -> K, comparer: Comparator<K>): IOrderedEnumerable<T>
        = OrderedEnumerable(this, compareBy(comparer, keySelector))

fun <T, K : Comparable<K>> Sequence<T>.orderByDescending(keySelector: (T) -> K): IOrderedEnumerable<T>
        = OrderedEnumerable(this, compareBy(keySelector).reversed())

fun <T, K : Comparable<K>> Sequence<T>.orderByDescending(keySelector: (T) -> K, comparer: Comparator<K>): IOrderedEnumerable<T>
        = OrderedEnumerable(this, compareBy(comparer, keySelector).reversed())
