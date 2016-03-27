package com.muhron.kotlinq

fun <TSource, TKey> Sequence<TSource>.toLookup(keySelector: (TSource) -> TKey): Lookup<TKey, TSource>
        = LookupImpl(groupBy(keySelector = keySelector, valueTransform = { it }).map { GroupingImpl(it) })

fun <TSource, TKey> Iterable<TSource>.toLookup(keySelector: (TSource) -> TKey): Lookup<TKey, TSource>
        = asSequence().toLookup(keySelector)

fun <TSource, TKey> Array<TSource>.toLookup(keySelector: (TSource) -> TKey): Lookup<TKey, TSource>
        = asSequence().toLookup(keySelector)

fun <TSourceK, TSourceV, TKey> Map<TSourceK, TSourceV>.toLookup(keySelector: (Map.Entry<TSourceK, TSourceV>) -> TKey): Lookup<TKey, Map.Entry<TSourceK, TSourceV>>
        = asSequence().toLookup(keySelector)

fun <TSource, TKey, TElement> Sequence<TSource>.toLookup(keySelector: (TSource) -> TKey, elementSelector: (TSource) -> TElement): Lookup<TKey, TElement>
        = LookupImpl(groupBy(keySelector = keySelector, valueTransform = elementSelector).map { GroupingImpl(it) })

fun <TSource, TKey, TElement> Iterable<TSource>.toLookup(keySelector: (TSource) -> TKey, elementSelector: (TSource) -> TElement): Lookup<TKey, TElement>
        = asSequence().toLookup(keySelector, elementSelector)

fun <TSource, TKey, TElement> Array<TSource>.toLookup(keySelector: (TSource) -> TKey, elementSelector: (TSource) -> TElement): Lookup<TKey, TElement>
        = asSequence().toLookup(keySelector, elementSelector)

fun <TSourceK, TSourceV, TKey, TElement> Map<TSourceK, TSourceV>.toLookup(keySelector: (Map.Entry<TSourceK, TSourceV>) -> TKey, elementSelector: (Map.Entry<TSourceK, TSourceV>) -> TElement): Lookup<TKey, TElement>
        = asSequence().toLookup(keySelector, elementSelector)
