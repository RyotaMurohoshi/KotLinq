package com.muhron.kotlinq

inline fun <TSource> Sequence<TSource>.skip(count: Int): Sequence<TSource> =
        drop(count)

inline fun <TSource> Iterable<TSource>.skip(count: Int): Sequence<TSource> =
        asSequence().skip(count)

inline fun <K, V> Map<K, V>.skip(count: Int): Sequence<Map.Entry<K, V>> =
        asSequence().skip(count)

inline fun <TSource> Array<TSource>.skip(count: Int): Sequence<TSource> =
        asSequence().skip(count)
