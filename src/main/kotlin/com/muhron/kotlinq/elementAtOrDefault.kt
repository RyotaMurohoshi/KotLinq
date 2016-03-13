package com.muhron.kotlinq

// elementAtOrDefault
fun <TSource> Sequence<TSource>.elementAtOrDefault(index: Int): TSource? =
        elementAtOrNull(index)

fun <TSource> Iterable<TSource>.elementAtOrDefault(index: Int): TSource? =
        elementAtOrNull(index)

fun <K, V> Map<K, V>.elementAtOrDefault(index: Int): Map.Entry<K, V>? =
        asSequence().elementAtOrNull(index)

fun <TSource> Array<TSource>.elementAtOrDefault(index: Int): TSource? =
        elementAtOrNull(index)
