package com.muhron.kotlinq

// elementAtOrDefault
inline fun <TSource> Sequence<TSource>.elementAtOrDefault(index: Int): TSource? =
        elementAtOrNull(index)

inline fun <TSource> Iterable<TSource>.elementAtOrDefault(index: Int): TSource? =
        elementAtOrNull(index)

inline fun <K, V> Map<K, V>.elementAtOrDefault(index: Int): Map.Entry<K, V>? =
        asSequence().elementAtOrNull(index)

inline fun <TSource> Array<TSource>.elementAtOrDefault(index: Int): TSource? =
        elementAtOrNull(index)
