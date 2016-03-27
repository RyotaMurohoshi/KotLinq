package com.muhron.kotlinq

// elementAtOrDefault
fun <TSource> Sequence<TSource>.elementAtOrDefault(index: Int): TSource? =
        elementAtOrNull(index)

fun <TSource> Iterable<TSource>.elementAtOrDefault(index: Int): TSource? =
        asSequence().elementAtOrDefault(index)

fun <TSourceK, TSourceV> Map<TSourceK, TSourceV>.elementAtOrDefault(index: Int): Map.Entry<TSourceK, TSourceV>? =
        asSequence().elementAtOrDefault(index)

fun <TSource> Array<TSource>.elementAtOrDefault(index: Int): TSource? =
        asSequence().elementAtOrDefault(index)
