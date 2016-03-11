package com.muhron.kotlinq

fun <T> Sequence<T>.whereWithIndex(predicate: (T, Int) -> Boolean): Sequence<T> =
        filterIndexed { i, t -> predicate(t, i) }

fun <T> Iterable<T>.whereWithIndex(predicate: (T, Int) -> Boolean): Sequence<T> =
        asSequence().whereWithIndex(predicate)

fun <K, V> Map<K, V>.whereWithIndex(predicate: (Map.Entry<K, V>, Int) -> Boolean): Sequence<Map.Entry<K, V>> =
        asSequence().whereWithIndex(predicate)

fun <T> Array<T>.whereWithIndex(predicate: (T, Int) -> Boolean): Sequence<T> =
        asSequence().whereWithIndex(predicate)
