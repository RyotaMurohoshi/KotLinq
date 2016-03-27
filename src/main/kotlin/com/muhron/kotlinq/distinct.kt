package com.muhron.kotlinq

// Sequence has distinct method.

// Iterable<TSource> and Array<TSource> have distinct method in kotlin.collections, but their return type are not Sequence<TSource>.
// KotLinq redefines distinct methods..
fun <TSource> Iterable<TSource>.distinct(): Sequence<TSource> =
        asSequence().distinct()

fun <TSourceK, TSourceV> Map<TSourceK, TSourceV>.distinct(): Sequence<Map.Entry<TSourceK, TSourceV>> =
        asSequence().distinct()

fun <TSource> Array<TSource>.distinct(): Sequence<TSource> =
        asSequence().distinct()
