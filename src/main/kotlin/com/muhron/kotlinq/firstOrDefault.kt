package com.muhron.kotlinq

// firstOrDefault
inline fun <TSource> Sequence<TSource>.firstOrDefault(): TSource? =
        firstOrNull()

inline fun <TSource> Iterable<TSource>.firstOrDefault(): TSource? =
        firstOrNull()

inline fun <K, V> Map<K, V>.firstOrDefault(): Map.Entry<K, V>? =
        asSequence().firstOrNull()

inline fun <TSource> Array<TSource>.firstOrDefault(): TSource? =
        firstOrNull()

// firstOrDefault with predicate
inline fun <TSource> Sequence<TSource>.firstOrDefault(predicate: (TSource) -> Boolean): TSource? =
        firstOrNull(predicate)

inline fun <TSource> Iterable<TSource>.firstOrDefault(predicate: (TSource) -> Boolean): TSource? =
        firstOrNull(predicate)

inline fun <K, V> Map<K, V>.firstOrDefault(predicate: (Map.Entry<K, V>) -> Boolean): Map.Entry<K, V>? =
        asSequence().firstOrNull(predicate)

inline fun <TSource> Array<TSource>.firstOrDefault(predicate: (TSource) -> Boolean): TSource? =
        firstOrNull(predicate)
