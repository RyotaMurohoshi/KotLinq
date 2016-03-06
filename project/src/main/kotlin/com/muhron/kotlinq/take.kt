package com.muhron.kotlinq

// Sequence has take method.

fun <T> Iterable<T>.take(count: Int): Sequence<T> =
        asSequence().take(count)

fun <K, V> Map<K, V>.take(count: Int): Sequence<Map.Entry<K, V>> =
        asSequence().take(count)

fun <T> Array<T>.take(count: Int): Sequence<T> =
        asSequence().take(count)
