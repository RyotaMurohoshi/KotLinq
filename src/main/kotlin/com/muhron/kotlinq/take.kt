package com.muhron.kotlinq

// Sequence has take method.

fun <TSource> Iterable<TSource>.take(count: Int): Sequence<TSource> =
        asSequence().take(count)

fun <K, V> Map<K, V>.take(count: Int): Sequence<Map.Entry<K, V>> =
        asSequence().take(count)

fun <TSource> Array<TSource>.take(count: Int): Sequence<TSource> =
        asSequence().take(count)
