package com.muhron.kotlinq

fun <TSource> Sequence<TSource>.reverse(): Sequence<TSource> =
        Sequence { toList().reversed().iterator() }

fun <TSource> Iterable<TSource>.reverse(): Sequence<TSource> =
        asSequence().reverse()

fun <TSource> Array<TSource>.reverse(): Sequence<TSource> =
        asSequence().reverse()

fun <TSourceK, TSourceV> Map<TSourceK, TSourceV>.reverse(): Sequence<Map.Entry<TSourceK, TSourceV>> =
        asSequence().reverse()
