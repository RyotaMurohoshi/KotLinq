package com.muhron.kotlinq

// Sequence has take method.

fun <T> Iterable<T>.takeWhile(predicate: (T) -> Boolean): Sequence<T> =
        asSequence().takeWhile(predicate)

fun <K, V> Map<K, V>.take(predicate: (Map.Entry<K, V>) -> Boolean): Sequence<Map.Entry<K, V>> =
        asSequence().takeWhile(predicate)

fun <T> Array<T>.takeWhile(predicate: (T) -> Boolean): Sequence<T> =
        asSequence().takeWhile(predicate)
