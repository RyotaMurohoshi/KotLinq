package com.muhron.kotlinq

fun <TSource> Sequence<TSource>.reverse(): Sequence<TSource> =
        toList().reversed().asSequence()

fun <TSource> Iterable<TSource>.reverse() =
        asSequence().reverse()

fun <TSource> Array<TSource>.reverse() =
        asSequence().reverse()

fun <K, V> Map<K, V>.reverse() =
        asSequence().reverse()
