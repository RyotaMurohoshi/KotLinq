package com.muhron.kotlinq

fun <T, R> Sequence<T>.select(selector: (T) -> R): Sequence<R> =
        map(selector)

fun <T, R> Iterable<T>.select(selector: (T) -> R): Sequence<R> =
        asSequence().select(selector)

fun <K, V, R> Map<K, V>.select(selector: (Map.Entry<K, V>) -> R): Sequence<R> =
        asSequence().select(selector)

fun <T, R> Array<T>.select(selector: (T) -> R): Sequence<R> =
        asSequence().select(selector)
