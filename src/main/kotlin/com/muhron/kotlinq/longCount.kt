package com.muhron.kotlinq

// for Sequence
fun <TSource> Sequence<TSource>.longCount(): Long =
        fold(0L, { num: Long, source: TSource -> num + 1L })

fun <TSource> Iterable<TSource>.longCount(): Long =
        asSequence().longCount()

fun <TSource> Array<TSource>.longCount(): Long =
        asSequence().longCount()

fun <K, V> Map<K, V>.longCount(): Long =
        asSequence().longCount()
