package com.muhron.kotlinq

fun <TSource, TKey> Sequence<TSource>.toDictionary(keySelector: (TSource) -> TKey): Map<TKey, TSource> =
        toDictionary(keySelector, { it -> it })

fun <TSource, TKey> Iterable<TSource>.toDictionary(keySelector: (TSource) -> TKey): Map<TKey, TSource> =
        toDictionary(keySelector)

fun <TSource, TKey> Array<TSource>.toDictionary(keySelector: (TSource) -> TKey): Map<TKey, TSource> =
        toDictionary(keySelector)

fun <TSourceK, TSourceV, TKey> Map<TSourceK, TSourceV>.toDictionary(keySelector: (Map.Entry<TSourceK, TSourceV>) -> TKey): Map<TKey, Map.Entry<TSourceK, TSourceV>> =
        toDictionary(keySelector)

fun <TSource, TKey, TElement> Iterable<TSource>.toDictionary(keySelector: (TSource) -> TKey, elementSelector: (TSource) -> TElement): Map<TKey, TElement> =
        asSequence().toDictionary(keySelector, elementSelector)

fun <TSource, TKey, TElement> Array<TSource>.toDictionary(keySelector: (TSource) -> TKey, elementSelector: (TSource) -> TElement): Map<TKey, TElement> =
        asSequence().toDictionary(keySelector, elementSelector)

fun <TSourceK, TSourceV, TKey, TElement> Map<TSourceK, TSourceV>.toDictionary(keySelector: (Map.Entry<TSourceK, TSourceV>) -> TKey, elementSelector: (Map.Entry<TSourceK, TSourceV>) -> TElement): Map<TKey, TElement> =
        asSequence().toDictionary(keySelector, elementSelector)


fun <TSource, TKey, TElement> Sequence<TSource>.toDictionary(keySelector: (TSource) -> TKey, elementSelector: (TSource) -> TElement): Map<TKey, TElement> {
    val list = toList()
    val result = list.associateBy(keySelector, elementSelector)

    require(result.keys.size == list.size) { "duplicate key" }

    return result
}
