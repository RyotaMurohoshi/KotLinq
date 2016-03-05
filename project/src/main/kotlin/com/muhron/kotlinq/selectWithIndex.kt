package com.muhron.kotlinq

fun <T, R> Sequence<T>.selectWithIndex(selector: (T, Int) -> R): Sequence<R> =
        mapIndexed { i, t -> selector(t, i) }

fun <T, R> Iterable<T>.selectWithIndex(selector: (T, Int) -> R): Sequence<R> =
        asSequence().selectWithIndex(selector)

fun <K, V, R> Map<K, V>.selectWithIndex(selector: (Map.Entry<K, V>, Int) -> R): Sequence<R> =
        asSequence().selectWithIndex(selector)

fun <T, R> Array<T>.selectWithIndex(selector: (T, Int) -> R): Sequence<R> =
        asSequence().selectWithIndex(selector)
