package com.muhron.kotlinq

// lastOrDefault
fun <TSource> Sequence<TSource>.lastOrDefault(): TSource? =
        lastOrNull()

fun <TSource> Iterable<TSource>.lastOrDefault(): TSource? =
        lastOrNull()

fun <K, V> Map<K, V>.lastOrDefault(): Map.Entry<K, V>? =
        asSequence().lastOrNull()

fun <TSource> Array<TSource>.lastOrDefault(): TSource? =
        lastOrNull()

// lastOrDefault with predicate
fun <TSource> Sequence<TSource>.lastOrDefault(predicate: (TSource) -> Boolean): TSource? =
        lastOrNull(predicate)

fun <TSource> Iterable<TSource>.lastOrDefault(predicate: (TSource) -> Boolean): TSource? =
        lastOrNull(predicate)

fun <K, V> Map<K, V>.lastOrDefault(predicate: (Map.Entry<K, V>) -> Boolean): Map.Entry<K, V>? =
        asSequence().lastOrNull(predicate)

fun <TSource> Array<TSource>.lastOrDefault(predicate: (TSource) -> Boolean): TSource? =
        lastOrNull(predicate)
