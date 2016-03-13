package com.muhron.kotlinq

inline fun <TSource> Sequence<TSource>.reverse(): Sequence<TSource> =
        toList().reversed().asSequence()

inline fun <TSource> Iterable<TSource>.reverse() =
        asSequence().reverse()

inline fun <TSource> Array<TSource>.reverse() =
        asSequence().reverse()

inline fun <K, V> Map<K, V>.reverse() =
        asSequence().reverse()
