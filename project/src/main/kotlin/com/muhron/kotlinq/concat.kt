package com.muhron.kotlinq

fun <TSource> Sequence<TSource>.concat(second: Sequence<TSource>) =
        plus(second)

fun <TSource> Array<TSource>.concat(second: Sequence<TSource>) =
        asSequence().plus(second.asSequence())

fun <TSource> Iterable<TSource>.concat(second: Sequence<TSource>) =
        plus(second)

fun <K, V> Map<K, V>.concat(second: Map<K, V>) =
        asSequence().concat(second.asSequence())
