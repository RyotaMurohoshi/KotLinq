package com.muhron.kotlinq

import java.util.Comparator
import kotlin.comparisons.compareBy

// orderBy with keySelector
fun <TSource, TKey : Comparable<TKey>> Sequence<TSource>.orderBy(keySelector: (TSource) -> TKey): OrderedEnumerable<TSource>
        = OrderedEnumerableInternal(this, compareBy(keySelector))

fun <TSource, TKey : Comparable<TKey>> Iterable<TSource>.orderBy(keySelector: (TSource) -> TKey): OrderedEnumerable<TSource>
        = asSequence().orderBy(keySelector)

fun <TSource, TKey : Comparable<TKey>> Array<TSource>.orderBy(keySelector: (TSource) -> TKey): OrderedEnumerable<TSource>
        = asSequence().orderBy(keySelector)

fun <TSourceK, TSourceV, TKey : Comparable<TKey>> Map<TSourceK, TSourceV>.orderBy(keySelector: (Map.Entry<TSourceK, TSourceV>) -> TKey): OrderedEnumerable<Map.Entry<TSourceK, TSourceV>>
        = asSequence().orderBy(keySelector)

// orderBy with keySelector and comparer
fun <TSource, TKey : Comparable<TKey>> Sequence<TSource>.orderBy(keySelector: (TSource) -> TKey, comparer: Comparator<TKey>): OrderedEnumerable<TSource>
        = OrderedEnumerableInternal(this, compareBy(comparer, keySelector))

fun <TSource, TKey : Comparable<TKey>> Iterable<TSource>.orderBy(keySelector: (TSource) -> TKey, comparer: Comparator<TKey>): OrderedEnumerable<TSource>
        = asSequence().orderBy(keySelector, comparer)

fun <TSource, TKey : Comparable<TKey>> Array<TSource>.orderBy(keySelector: (TSource) -> TKey, comparer: Comparator<TKey>): OrderedEnumerable<TSource>
        = asSequence().orderBy(keySelector, comparer)

fun <TSourceK, TSourceV, TKey : Comparable<TKey>> Map<TSourceK, TSourceV>.orderBy(keySelector: (Map.Entry<TSourceK, TSourceV>) -> TKey, comparer: Comparator<TKey>): OrderedEnumerable<Map.Entry<TSourceK, TSourceV>>
        = asSequence().orderBy(keySelector, comparer)

// orderByDescending with keySelector
fun <TSource, TKey : Comparable<TKey>> Sequence<TSource>.orderByDescending(keySelector: (TSource) -> TKey): OrderedEnumerable<TSource>
        = OrderedEnumerableInternal(this, compareBy(keySelector).reversed())

fun <TSource, TKey : Comparable<TKey>> Iterable<TSource>.orderByDescending(keySelector: (TSource) -> TKey): OrderedEnumerable<TSource>
        = asSequence().orderByDescending (keySelector)

fun <TSource, TKey : Comparable<TKey>> Array<TSource>.orderByDescending(keySelector: (TSource) -> TKey): OrderedEnumerable<TSource>
        = asSequence().orderByDescending(keySelector)

fun <TSourceK, TSourceV, TKey : Comparable<TKey>> Map<TSourceK, TSourceV>.orderByDescending(keySelector: (Map.Entry<TSourceK, TSourceV>) -> TKey): OrderedEnumerable<Map.Entry<TSourceK, TSourceV>>
        = asSequence().orderByDescending(keySelector)

// orderByDescending with keySelector and comparer
fun <TSource, TKey : Comparable<TKey>> Sequence<TSource>.orderByDescending(keySelector: (TSource) -> TKey, comparer: Comparator<TKey>): OrderedEnumerable<TSource>
        = OrderedEnumerableInternal(this, compareBy(comparer, keySelector).reversed())

fun <TSource, TKey : Comparable<TKey>> Iterable<TSource>.orderByDescending(keySelector: (TSource) -> TKey, comparer: Comparator<TKey>): OrderedEnumerable<TSource>
        = asSequence().orderByDescending(keySelector, comparer)

fun <TSource, TKey : Comparable<TKey>> Array<TSource>.orderByDescending(keySelector: (TSource) -> TKey, comparer: Comparator<TKey>): OrderedEnumerable<TSource>
        = asSequence().orderByDescending(keySelector, comparer)

fun <TSourceK, TSourceV, TKey : Comparable<TKey>> Map<TSourceK, TSourceV>.orderByDescending(keySelector: (Map.Entry<TSourceK, TSourceV>) -> TKey, comparer: Comparator<TKey>): OrderedEnumerable<Map.Entry<TSourceK, TSourceV>>
        = asSequence().orderByDescending(keySelector, comparer)
