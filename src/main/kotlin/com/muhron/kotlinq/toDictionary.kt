package com.muhron.kotlinq

fun <TSource, TKey> Sequence<TSource>.toDictionary(keySelector: (TSource) -> TKey): Map<TKey, TSource> =
        toDictionary(keySelector, { it -> it })

fun <TSource, TKey> Iterable<TSource>.toDictionary(keySelector: (TSource) -> TKey): Map<TKey, TSource> =
        toDictionary(keySelector)

fun <TSource, TKey> Array<TSource>.toDictionary(keySelector: (TSource) -> TKey): Map<TKey, TSource> =
        toDictionary(keySelector)

fun <K, TKey, V> Map<K, V>.toDictionary(keySelector: (Map.Entry<K, V>) -> TKey): Map<TKey, Map.Entry<K, V>> =
        toDictionary(keySelector)

fun <TSource, TKey, TElement> Iterable<TSource>.toDictionary(keySelector: (TSource) -> TKey, elementSelector: (TSource) -> TElement): Map<TKey, TElement> =
        asSequence().toDictionary(keySelector, elementSelector)

fun <TSource, TKey, TElement> Array<TSource>.toDictionary(keySelector: (TSource) -> TKey, elementSelector: (TSource) -> TElement): Map<TKey, TElement> =
        asSequence().toDictionary(keySelector, elementSelector)

fun <K, V, TKey, TElement> Map<K, V>.toDictionary(keySelector: (Map.Entry<K, V>) -> TKey, elementSelector: (Map.Entry<K, V>) -> TElement): Map<TKey, TElement> =
        asSequence().toDictionary(keySelector, elementSelector)


fun <TSource, TKey, V> Sequence<TSource>.toDictionary(keySelector: (TSource) -> TKey, elementSelector: (TSource) -> V): Map<TKey, V> {
    val list = toList()
    val result = list.associateBy(keySelector, elementSelector)

    require(result.keys.size == list.size) { "duplicate key" }

    return result
}
