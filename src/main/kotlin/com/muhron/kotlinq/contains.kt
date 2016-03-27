package com.muhron.kotlinq

fun <TSource> Sequence<TSource>.contains(value: TSource): Boolean =
        contains(element = value)

fun <TSource> Array<TSource>.contains(value: TSource): Boolean =
        asSequence().contains(value)

fun <TSource> Iterable<TSource>.contains(value: TSource): Boolean =
        asSequence().contains(value)

fun <TSourceK, TSourceV> Map<TSourceK, TSourceV>.contains(value: Map.Entry<TSourceK, TSourceV>): Boolean =
        asSequence().contains(value)
