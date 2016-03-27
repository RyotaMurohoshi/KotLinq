package com.muhron.kotlinq

// Sequence has take method.

fun <TSource> Iterable<TSource>.takeWhile(predicate: (TSource) -> Boolean): Sequence<TSource> =
        asSequence().takeWhile(predicate)

fun <TSourceK, TSourceV> Map<TSourceK, TSourceV>.take(predicate: (Map.Entry<TSourceK, TSourceV>) -> Boolean): Sequence<Map.Entry<TSourceK, TSourceV>> =
        asSequence().takeWhile(predicate)

fun <TSource> Array<TSource>.takeWhile(predicate: (TSource) -> Boolean): Sequence<TSource> =
        asSequence().takeWhile(predicate)
