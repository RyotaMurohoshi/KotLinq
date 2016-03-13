package com.muhron.kotlinq

fun <TSource, TKey> Sequence<TSource>.toLookup(keySelector: (TSource) -> TKey): Lookup<TKey, TSource>
        = LookupImpl(groupBy(keySelector = keySelector, valueTransform = { it }).map { GroupingImpl(it) })

fun <TSource, TKey> Iterable<TSource>.toLookup(keySelector: (TSource) -> TKey): Lookup<TKey, TSource>
        = asSequence().toLookup(keySelector)

fun <TSource, TKey> Array<TSource>.toLookup(keySelector: (TSource) -> TKey): Lookup<TKey, TSource>
        = asSequence().toLookup(keySelector)

fun <K, V, TKey> Map<K, V>.toLookup(keySelector: (Map.Entry<K, V>) -> TKey): Lookup<TKey, Map.Entry<K, V>>
        = asSequence().toLookup(keySelector)

fun <TSource, TKey, TElement> Sequence<TSource>.toLookup(keySelector: (TSource) -> TKey, elementSelector: (TSource) -> TElement): Lookup<TKey, TElement>
        = LookupImpl(groupBy(keySelector = keySelector, valueTransform = elementSelector).map { GroupingImpl(it) })

fun <TSource, TKey, TElement> Iterable<TSource>.toLookup(keySelector: (TSource) -> TKey, elementSelector: (TSource) -> TElement): Lookup<TKey, TElement>
        = asSequence().toLookup(keySelector, elementSelector)

fun <TSource, TKey, TElement> Array<TSource>.toLookup(keySelector: (TSource) -> TKey, elementSelector: (TSource) -> TElement): Lookup<TKey, TElement>
        = asSequence().toLookup(keySelector, elementSelector)

fun <K, V, TKey, TElement> Map<K, V>.toLookup(keySelector: (Map.Entry<K, V>) -> TKey, elementSelector: (Map.Entry<K, V>) -> TElement): Lookup<TKey, TElement>
        = asSequence().toLookup(keySelector, elementSelector)
