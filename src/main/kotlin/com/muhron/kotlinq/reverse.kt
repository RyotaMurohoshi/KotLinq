package com.muhron.kotlinq

fun <T> Sequence<T>.reverse(): Sequence<T> =
        toList().reversed().asSequence()

fun <T> Iterable<T>.reverse() =
        asSequence().reverse()

fun <T> Array<T>.reverse() =
        asSequence().reverse()

fun <K, V> Map<K, V>.reverse() =
        asSequence().reverse()
