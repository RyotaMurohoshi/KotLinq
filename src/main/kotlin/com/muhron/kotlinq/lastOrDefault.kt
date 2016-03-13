package com.muhron.kotlinq

// lastOrDefault
inline fun <TSource> Sequence<TSource>.lastOrDefault(): TSource? =
        lastOrNull()

inline fun <TSource> Iterable<TSource>.lastOrDefault(): TSource? =
        lastOrNull()

inline fun <K, V> Map<K, V>.lastOrDefault(): Map.Entry<K, V>? =
        asSequence().lastOrNull()

inline fun <TSource> Array<TSource>.lastOrDefault(): TSource? =
        lastOrNull()

// lastOrDefault with predicate
inline fun <TSource> Sequence<TSource>.lastOrDefault(predicate: (TSource) -> Boolean): TSource? =
        lastOrNull(predicate)

inline fun <TSource> Iterable<TSource>.lastOrDefault(predicate: (TSource) -> Boolean): TSource? =
        lastOrNull(predicate)

inline fun <K, V> Map<K, V>.lastOrDefault(predicate: (Map.Entry<K, V>) -> Boolean): Map.Entry<K, V>? =
        asSequence().lastOrNull(predicate)

inline fun <TSource> Array<TSource>.lastOrDefault(predicate: (TSource) -> Boolean): TSource? =
        lastOrNull(predicate)
