package com.muhron.kotlinq

// firstOrDefault
fun <TSource> Sequence<TSource>.firstOrDefault(): TSource? =
        firstOrNull()

fun <TSource> Iterable<TSource>.firstOrDefault(): TSource? =
        firstOrNull()

fun <K, V> Map<K, V>.firstOrDefault(): Map.Entry<K, V>? =
        asSequence().firstOrNull()

fun <TSource> Array<TSource>.firstOrDefault(): TSource? =
        firstOrNull()

// firstOrDefault with predicate
fun <TSource> Sequence<TSource>.firstOrDefault(predicate: (TSource) -> Boolean): TSource? =
        firstOrNull(predicate)

fun <TSource> Iterable<TSource>.firstOrDefault(predicate: (TSource) -> Boolean): TSource? =
        firstOrNull(predicate)

fun <K, V> Map<K, V>.firstOrDefault(predicate: (Map.Entry<K, V>) -> Boolean): Map.Entry<K, V>? =
        asSequence().firstOrNull(predicate)

fun <TSource> Array<TSource>.firstOrDefault(predicate: (TSource) -> Boolean): TSource? =
        firstOrNull(predicate)
