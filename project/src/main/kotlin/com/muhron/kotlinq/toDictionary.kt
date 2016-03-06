package com.muhron.kotlinq

fun <T, K> Sequence<T>.toDictionary(keySelector: (T) -> K): Map<K, T> =
        toDictionary(keySelector, { it -> it })

fun <T, K> Iterable<T>.toDictionary(keySelector: (T) -> K): Map<K, T> =
        toDictionary(keySelector, { it -> it })

fun <T, K> Array<T>.toDictionary(keySelector: (T) -> K): Map<K, T> =
        toDictionary(keySelector, { it -> it })

fun <K0, K1, V> Map<K0, V>.toDictionary(keySelector: (Map.Entry<K0, V>) -> K1): Map<K1, V> =
        toDictionary(keySelector, { it -> it.value })

fun <T, K, V> Sequence<T>.toDictionary(keySelector: (T) -> K, elementSelector: (T) -> V): Map<K, V> {
    val list = toList()
    val result = list.associateBy(keySelector, elementSelector)

    require(result.keys.size == list.size) { "duplicate key" }

    return result
}

fun <T, K, V> Iterable<T>.toDictionary(keySelector: (T) -> K, elementSelector: (T) -> V): Map<K, V> =
        asSequence().toDictionary(keySelector, elementSelector)

fun <T, K, V> Array<T>.toDictionary(keySelector: (T) -> K, elementSelector: (T) -> V): Map<K, V> =
        asSequence().toDictionary(keySelector, elementSelector)

fun <K0, V0, K1, V1> Map<K0, V0>.toDictionary(keySelector: (Map.Entry<K0, V0>) -> K1, elementSelector: (Map.Entry<K0, V0>) -> V1): Map<K1, V1> {
    val result = map { keySelector(it) to elementSelector(it) }.toMap()

    require(result.keys.size == size) { "duplicate key" }

    return result
}
