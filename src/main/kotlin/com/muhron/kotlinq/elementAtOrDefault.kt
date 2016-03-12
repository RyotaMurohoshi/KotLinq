package com.muhron.kotlinq

// elementAtOrDefault
fun <T> Sequence<T>.elementAtOrDefault(index: Int): T? =
        elementAtOrNull(index)

fun <T> Iterable<T>.elementAtOrDefault(index: Int): T? =
        elementAtOrNull(index)

fun <K, V> Map<K, V>.elementAtOrDefault(index: Int): Map.Entry<K, V>? =
        asSequence().elementAtOrNull(index)

fun <T> Array<T>.elementAtOrDefault(index: Int): T? =
        elementAtOrNull(index)
