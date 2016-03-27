package com.muhron.kotlinq

fun <TSource> Sequence<TSource>.asEnumerable(): Sequence<TSource> = asSequence()

fun <TSource> Array<TSource>.asEnumerable(): Sequence<TSource> = asSequence().asEnumerable()

fun <TSource> Iterable<TSource>.asEnumerable(): Sequence<TSource> = asSequence().asEnumerable()

fun <TSourceK, TSourceV> Map<TSourceK, TSourceV>.asEnumerable(): Sequence<Map.Entry<TSourceK, TSourceV>> = asSequence().asEnumerable()
