package com.muhron.kotlinq

// for Sequence
inline fun <TSource> Sequence<TSource>.longCount(): Long =
        fold(0L, { num: Long, source: TSource -> num + 1L })

inline fun <TSource> Iterable<TSource>.longCount(): Long =
        asSequence().longCount()

inline fun <TSource> Array<TSource>.longCount(): Long =
        asSequence().longCount()

inline fun <K, V> Map<K, V>.longCount(): Long =
        asSequence().longCount()
