package com.muhron.kotlinq

// Sequence has distinct method.

// Iterable<TSource> and Array<TSource> have distinct method in kotlin.collections, but their return type are not Sequence<TSource>.
// KotLinq redefines distinct methods..
fun <TSource> Iterable<TSource>.distinct(): Sequence<TSource> =
        asSequence().distinct()

fun <K, V> Map<K, V>.distinct(): Sequence<Map.Entry<K, V>> =
        asSequence().distinct()

fun <TSource> Array<TSource>.distinct(): Sequence<TSource> =
        asSequence().distinct()
