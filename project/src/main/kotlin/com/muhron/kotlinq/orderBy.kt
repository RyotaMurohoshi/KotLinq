package com.muhron.kotlinq

import java.util.Comparator
import kotlin.comparisons.compareBy

// orderBy with keySelector
fun <T, K : Comparable<K>> Sequence<T>.orderBy(keySelector: (T) -> K): IOrderedEnumerable<T>
        = OrderedEnumerable(this, compareBy(keySelector))

fun <T, K : Comparable<K>> Iterable<T>.orderBy(keySelector: (T) -> K): IOrderedEnumerable<T>
        = asSequence().orderBy(keySelector)

fun <T, K : Comparable<K>> Array<T>.orderBy(keySelector: (T) -> K): IOrderedEnumerable<T>
        = asSequence().orderBy(keySelector)

fun <K, V, C : Comparable<C>> Map<K, V>.orderBy(keySelector: (Map.Entry<K, V>) -> C): IOrderedEnumerable<Map.Entry<K, V>>
        = asSequence().orderBy(keySelector)

// orderBy with keySelector and comparer
fun <T, K : Comparable<K>> Sequence<T>.orderBy(keySelector: (T) -> K, comparer: Comparator<K>): IOrderedEnumerable<T>
        = OrderedEnumerable(this, compareBy(comparer, keySelector))

fun <T, K : Comparable<K>> Iterable<T>.orderBy(keySelector: (T) -> K, comparer: Comparator<K>): IOrderedEnumerable<T>
        = asSequence().orderBy(keySelector, comparer)

fun <T, K : Comparable<K>> Array<T>.orderBy(keySelector: (T) -> K, comparer: Comparator<K>): IOrderedEnumerable<T>
        = asSequence().orderBy(keySelector, comparer)

fun <K, V, C : Comparable<C>> Map<K, V>.orderBy(keySelector: (Map.Entry<K, V>) -> C, comparer: Comparator<C>): IOrderedEnumerable<Map.Entry<K, V>>
        = asSequence().orderBy(keySelector, comparer)

// orderByDescending with keySelector
fun <T, K : Comparable<K>> Sequence<T>.orderByDescending(keySelector: (T) -> K): IOrderedEnumerable<T>
        = OrderedEnumerable(this, compareBy(keySelector).reversed())

fun <T, K : Comparable<K>> Iterable<T>.orderByDescending(keySelector: (T) -> K): IOrderedEnumerable<T>
        = asSequence().orderByDescending (keySelector)

fun <T, K : Comparable<K>> Array<T>.orderByDescending(keySelector: (T) -> K): IOrderedEnumerable<T>
        = asSequence().orderByDescending(keySelector)

fun <K, V, C : Comparable<C>> Map<K, V>.orderByDescending(keySelector: (Map.Entry<K, V>) -> C): IOrderedEnumerable<Map.Entry<K, V>>
        = asSequence().orderByDescending(keySelector)

// orderByDescending with keySelector and comparer
fun <T, K : Comparable<K>> Sequence<T>.orderByDescending(keySelector: (T) -> K, comparer: Comparator<K>): IOrderedEnumerable<T>
        = OrderedEnumerable(this, compareBy(comparer, keySelector).reversed())

fun <T, K : Comparable<K>> Iterable<T>.orderByDescending(keySelector: (T) -> K, comparer: Comparator<K>): IOrderedEnumerable<T>
        = asSequence().orderByDescending(keySelector, comparer)

fun <T, K : Comparable<K>> Array<T>.orderByDescending(keySelector: (T) -> K, comparer: Comparator<K>): IOrderedEnumerable<T>
        = asSequence().orderByDescending(keySelector, comparer)

fun <K, V, C : Comparable<C>> Map<K, V>.orderByDescending(keySelector: (Map.Entry<K, V>) -> C, comparer: Comparator<C>): IOrderedEnumerable<Map.Entry<K, V>>
        = asSequence().orderByDescending(keySelector, comparer)
