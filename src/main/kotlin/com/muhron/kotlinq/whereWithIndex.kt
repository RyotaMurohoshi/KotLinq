package com.muhron.kotlinq

fun <TSource> Sequence<TSource>.whereWithIndex(predicate: (TSource, Int) -> Boolean): Sequence<TSource> =
        filterIndexed { i, t -> predicate(t, i) }

fun <TSource> Iterable<TSource>.whereWithIndex(predicate: (TSource, Int) -> Boolean): Sequence<TSource> =
        asSequence().whereWithIndex(predicate)

fun <TSourceK, TSourceV> Map<TSourceK, TSourceV>.whereWithIndex(predicate: (Map.Entry<TSourceK, TSourceV>, Int) -> Boolean): Sequence<Map.Entry<TSourceK, TSourceV>> =
        asSequence().whereWithIndex(predicate)

fun <TSource> Array<TSource>.whereWithIndex(predicate: (TSource, Int) -> Boolean): Sequence<TSource> =
        asSequence().whereWithIndex(predicate)
