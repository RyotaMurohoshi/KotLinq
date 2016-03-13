package com.muhron.kotlinq

fun <TSource> Sequence<TSource>.skip(count: Int): Sequence<TSource> =
        drop(count)

fun <TSource> Iterable<TSource>.skip(count: Int): Sequence<TSource> =
        asSequence().skip(count)

fun <K, V> Map<K, V>.skip(count: Int): Sequence<Map.Entry<K, V>> =
        asSequence().skip(count)

fun <TSource> Array<TSource>.skip(count: Int): Sequence<TSource> =
        asSequence().skip(count)
