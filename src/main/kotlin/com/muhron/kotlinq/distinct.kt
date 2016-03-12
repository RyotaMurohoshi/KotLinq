package com.muhron.kotlinq

// Sequence has distinct method.

// Iterable<T> and Array<T> have distinct method in kotlin.collections, but their return type are not Sequence<T>.
// KotLinq redefines distinct methods..
fun <T> Iterable<T>.distinct(): Sequence<T> =
        asSequence().distinct()

fun <K, V> Map<K, V>.distinct(): Sequence<Map.Entry<K, V>> =
        asSequence().distinct()

fun <T> Array<T>.distinct(): Sequence<T> =
        asSequence().distinct()
