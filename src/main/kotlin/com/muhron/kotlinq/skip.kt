package com.muhron.kotlinq

fun <TSource> Sequence<TSource>.skip(count: Int): Sequence<TSource> =
        drop(count)

fun <TSource> Iterable<TSource>.skip(count: Int): Sequence<TSource> =
        asSequence().skip(count)

fun <TSourceK, TSourceV> Map<TSourceK, TSourceV>.skip(count: Int): Sequence<Map.Entry<TSourceK, TSourceV>> =
        asSequence().skip(count)

fun <TSource> Array<TSource>.skip(count: Int): Sequence<TSource> =
        asSequence().skip(count)
