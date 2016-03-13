package com.muhron.kotlinq

import java.util.Comparator
import kotlin.comparisons.compareBy

// orderBy with keySelector
fun <TSource, TKey : Comparable<TKey>> Sequence<TSource>.orderBy(keySelector: (TSource) -> TKey): IOrderedEnumerable<TSource>
        = OrderedEnumerable(this, compareBy(keySelector))

fun <TSource, TKey : Comparable<TKey>> Iterable<TSource>.orderBy(keySelector: (TSource) -> TKey): IOrderedEnumerable<TSource>
        = asSequence().orderBy(keySelector)

fun <TSource, TKey : Comparable<TKey>> Array<TSource>.orderBy(keySelector: (TSource) -> TKey): IOrderedEnumerable<TSource>
        = asSequence().orderBy(keySelector)

fun <K, V, TKey : Comparable<TKey>> Map<K, V>.orderBy(keySelector: (Map.Entry<K, V>) -> TKey): IOrderedEnumerable<Map.Entry<K, V>>
        = asSequence().orderBy(keySelector)

// orderBy with keySelector and comparer
fun <TSource, TKey : Comparable<TKey>> Sequence<TSource>.orderBy(keySelector: (TSource) -> TKey, comparer: Comparator<TKey>): IOrderedEnumerable<TSource>
        = OrderedEnumerable(this, compareBy(comparer, keySelector))

fun <TSource, TKey : Comparable<TKey>> Iterable<TSource>.orderBy(keySelector: (TSource) -> TKey, comparer: Comparator<TKey>): IOrderedEnumerable<TSource>
        = asSequence().orderBy(keySelector, comparer)

fun <TSource, TKey : Comparable<TKey>> Array<TSource>.orderBy(keySelector: (TSource) -> TKey, comparer: Comparator<TKey>): IOrderedEnumerable<TSource>
        = asSequence().orderBy(keySelector, comparer)

fun <K, V, TKey : Comparable<TKey>> Map<K, V>.orderBy(keySelector: (Map.Entry<K, V>) -> TKey, comparer: Comparator<TKey>): IOrderedEnumerable<Map.Entry<K, V>>
        = asSequence().orderBy(keySelector, comparer)

// orderByDescending with keySelector
fun <TSource, TKey : Comparable<TKey>> Sequence<TSource>.orderByDescending(keySelector: (TSource) -> TKey): IOrderedEnumerable<TSource>
        = OrderedEnumerable(this, compareBy(keySelector).reversed())

fun <TSource, TKey : Comparable<TKey>> Iterable<TSource>.orderByDescending(keySelector: (TSource) -> TKey): IOrderedEnumerable<TSource>
        = asSequence().orderByDescending (keySelector)

fun <TSource, TKey : Comparable<TKey>> Array<TSource>.orderByDescending(keySelector: (TSource) -> TKey): IOrderedEnumerable<TSource>
        = asSequence().orderByDescending(keySelector)

fun <K, V, TKey : Comparable<TKey>> Map<K, V>.orderByDescending(keySelector: (Map.Entry<K, V>) -> TKey): IOrderedEnumerable<Map.Entry<K, V>>
        = asSequence().orderByDescending(keySelector)

// orderByDescending with keySelector and comparer
fun <TSource, TKey : Comparable<TKey>> Sequence<TSource>.orderByDescending(keySelector: (TSource) -> TKey, comparer: Comparator<TKey>): IOrderedEnumerable<TSource>
        = OrderedEnumerable(this, compareBy(comparer, keySelector).reversed())

fun <TSource, TKey : Comparable<TKey>> Iterable<TSource>.orderByDescending(keySelector: (TSource) -> TKey, comparer: Comparator<TKey>): IOrderedEnumerable<TSource>
        = asSequence().orderByDescending(keySelector, comparer)

fun <TSource, TKey : Comparable<TKey>> Array<TSource>.orderByDescending(keySelector: (TSource) -> TKey, comparer: Comparator<TKey>): IOrderedEnumerable<TSource>
        = asSequence().orderByDescending(keySelector, comparer)

fun <K, V, TKey : Comparable<TKey>> Map<K, V>.orderByDescending(keySelector: (Map.Entry<K, V>) -> TKey, comparer: Comparator<TKey>): IOrderedEnumerable<Map.Entry<K, V>>
        = asSequence().orderByDescending(keySelector, comparer)
