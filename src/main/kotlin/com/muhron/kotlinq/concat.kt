package com.muhron.kotlinq

inline fun <TSource> Sequence<TSource>.concat(second: Sequence<TSource>) =
        plus(second)

inline fun <TSource> Array<TSource>.concat(second: Sequence<TSource>) =
        asSequence().plus(second.asSequence())

inline fun <TSource> Iterable<TSource>.concat(second: Sequence<TSource>) =
        plus(second)

inline fun <K, V> Map<K, V>.concat(second: Map<K, V>) =
        asSequence().concat(second.asSequence())
