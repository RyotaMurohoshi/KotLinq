package com.muhron.kotlinq

fun <T> Sequence<T>.skip(count: Int): Sequence<T> =
        drop(count)

fun <T> Iterable<T>.skip(count: Int): Sequence<T> =
        asSequence().skip(count)

fun <K, V> Map<K, V>.skip(count: Int): Sequence<Map.Entry<K, V>> =
        asSequence().skip(count)

fun <T> Array<T>.skip(count: Int): Sequence<T> =
        asSequence().skip(count)
