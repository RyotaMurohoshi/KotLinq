package com.muhron.kotlinq

// Sequence has distinct method.

fun <T> Iterable<T>.distinct(): Sequence<T> =
        asSequence().distinct()

fun <K, V> Map<K, V>.distinct(): Sequence<Map.Entry<K, V>> =
        asSequence().distinct()

fun <T> Array<T>.distinct(): Sequence<T> =
        asSequence().distinct()
