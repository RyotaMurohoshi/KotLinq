package com.muhron.kotlinq

// Sequence has distinct method.

// Iterable<TSource> and Array<TSource> have distinct method in kotlin.collections, but their return type are not Sequence<TSource>.
// KotLinq redefines distinct methods..
inline fun <TSource> Iterable<TSource>.distinct(): Sequence<TSource> =
        asSequence().distinct()

inline fun <K, V> Map<K, V>.distinct(): Sequence<Map.Entry<K, V>> =
        asSequence().distinct()

inline fun <TSource> Array<TSource>.distinct(): Sequence<TSource> =
        asSequence().distinct()
