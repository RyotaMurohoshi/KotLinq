package com.muhron.kotlinq

fun <TSource> Sequence<TSource>.reverse(): Sequence<TSource> =
        Sequence { toList().reversed().iterator() }

fun <TSource> Iterable<TSource>.reverse(): Sequence<TSource> =
        asSequence().reverse()

fun <TSource> Array<TSource>.reverse(): Sequence<TSource> =
        asSequence().reverse()

fun <K, V> Map<K, V>.reverse(): Sequence<Map.Entry<K, V>> =
        asSequence().reverse()
