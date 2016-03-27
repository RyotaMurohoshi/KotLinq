package com.muhron.kotlinq

// Sequence has take method.

fun <TSource> Iterable<TSource>.take(count: Int): Sequence<TSource> =
        asSequence().take(count)

fun <TSourceK, TSourceV> Map<TSourceK, TSourceV>.take(count: Int): Sequence<Map.Entry<TSourceK, TSourceV>> =
        asSequence().take(count)

fun <TSource> Array<TSource>.take(count: Int): Sequence<TSource> =
        asSequence().take(count)
