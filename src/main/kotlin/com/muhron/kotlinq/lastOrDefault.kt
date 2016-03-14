package com.muhron.kotlinq

// lastOrDefault
fun <TSource> Sequence<TSource>.lastOrDefault(): TSource? =
        lastOrNull()

fun <TSource> Iterable<TSource>.lastOrDefault(): TSource? =
        asSequence().lastOrDefault()

fun <K, V> Map<K, V>.lastOrDefault(): Map.Entry<K, V>? =
        asSequence().lastOrDefault()

fun <TSource> Array<TSource>.lastOrDefault(): TSource? =
        asSequence().lastOrDefault()

// lastOrDefault with predicate
inline fun <TSource> Sequence<TSource>.lastOrDefault(predicate: (TSource) -> Boolean): TSource? =
        lastOrNull(predicate)

inline fun <TSource> Iterable<TSource>.lastOrDefault(predicate: (TSource) -> Boolean): TSource? =
        asSequence().lastOrDefault(predicate)

inline fun <K, V> Map<K, V>.lastOrDefault(predicate: (Map.Entry<K, V>) -> Boolean): Map.Entry<K, V>? =
        asSequence().lastOrDefault(predicate)

inline fun <TSource> Array<TSource>.lastOrDefault(predicate: (TSource) -> Boolean): TSource? =
        asSequence().lastOrDefault(predicate)
