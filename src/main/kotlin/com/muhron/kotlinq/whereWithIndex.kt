package com.muhron.kotlinq

fun <TSource> Sequence<TSource>.whereWithIndex(predicate: (TSource, Int) -> Boolean): Sequence<TSource> =
        filterIndexed { i, t -> predicate(t, i) }

fun <TSource> Iterable<TSource>.whereWithIndex(predicate: (TSource, Int) -> Boolean): Sequence<TSource> =
        asSequence().whereWithIndex(predicate)

fun <K, V> Map<K, V>.whereWithIndex(predicate: (Map.Entry<K, V>, Int) -> Boolean): Sequence<Map.Entry<K, V>> =
        asSequence().whereWithIndex(predicate)

fun <TSource> Array<TSource>.whereWithIndex(predicate: (TSource, Int) -> Boolean): Sequence<TSource> =
        asSequence().whereWithIndex(predicate)
