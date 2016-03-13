package com.muhron.kotlinq

// Sequence has take method.

fun <TSource> Iterable<TSource>.takeWhile(predicate: (TSource) -> Boolean): Sequence<TSource> =
        asSequence().takeWhile(predicate)

fun <K, V> Map<K, V>.take(predicate: (Map.Entry<K, V>) -> Boolean): Sequence<Map.Entry<K, V>> =
        asSequence().takeWhile(predicate)

fun <TSource> Array<TSource>.takeWhile(predicate: (TSource) -> Boolean): Sequence<TSource> =
        asSequence().takeWhile(predicate)
