package com.muhron.kotlinq

// firstOrDefault
fun <TSource> Sequence<TSource>.firstOrDefault(): TSource? =
        firstOrNull()

fun <TSource> Iterable<TSource>.firstOrDefault(): TSource? =
        asSequence().firstOrDefault()

fun <K, V> Map<K, V>.firstOrDefault(): Map.Entry<K, V>? =
        asSequence().firstOrDefault()

fun <TSource> Array<TSource>.firstOrDefault(): TSource? =
        asSequence().firstOrDefault()

// firstOrDefault with predicate
inline fun <TSource> Sequence<TSource>.firstOrDefault(predicate: (TSource) -> Boolean): TSource? =
        firstOrNull(predicate)

inline fun <TSource> Iterable<TSource>.firstOrDefault(predicate: (TSource) -> Boolean): TSource? =
        asSequence().firstOrDefault(predicate)

inline fun <K, V> Map<K, V>.firstOrDefault(predicate: (Map.Entry<K, V>) -> Boolean): Map.Entry<K, V>? =
        asSequence().firstOrDefault(predicate)

inline fun <TSource> Array<TSource>.firstOrDefault(predicate: (TSource) -> Boolean): TSource? =
        asSequence().firstOrDefault(predicate)