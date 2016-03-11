package com.muhron.kotlinq

// for Sequence.
fun <T> Sequence<T>.except(second: Sequence<T>): Sequence<T> =
        distinct().minus(second)

fun <T> Sequence<T>.except(second: Iterable<T>): Sequence<T> =
        distinct().minus(second)

fun <T> Sequence<T>.except(second: Array<T>): Sequence<T> =
        distinct().minus(second)

fun <K, V> Sequence<Map.Entry<K, V>>.except(second: Map<K, V>): Sequence<Map.Entry<K, V>> =
        distinct().minus(second.asSequence())

// for Iterable
fun <T> Iterable<T>.except(second: Sequence<T>): Sequence<T> =
        asSequence().except(second)

fun <T> Iterable<T>.except(second: Iterable<T>): Sequence<T> =
        asSequence().except(second)

fun <T> Iterable<T>.except(second: Array<T>): Sequence<T> =
        asSequence().except(second)

fun <K, V> Iterable<Map.Entry<K, V>>.except(second: Map<K, V>): Sequence<Map.Entry<K, V>> =
        asSequence().except(second)

// for Array
fun <T> Array<T>.except(second: Sequence<T>): Sequence<T> =
        asSequence().except(second)

fun <T> Array<T>.except(second: Iterable<T>): Sequence<T> =
        asSequence().except(second)

fun <T> Array<T>.except(second: Array<T>): Sequence<T> =
        asSequence().plus(second).distinct()

fun <K, V> Array<Map.Entry<K, V>>.except(second: Map<K, V>): Sequence<Map.Entry<K, V>> =
        asSequence().except(second)

// for Map
fun <K, V> Map<K, V>.except(second: Sequence<Map.Entry<K, V>>): Sequence<Map.Entry<K, V>> =
        asSequence().except(second)

fun <K, V> Map<K, V>.except(second: Iterable<Map.Entry<K, V>>): Sequence<Map.Entry<K, V>> =
        asSequence().except(second)

fun <K, V> Map<K, V>.except(second: Array<Map.Entry<K, V>>): Sequence<Map.Entry<K, V>> =
        asSequence().except(second)

fun <K, V> Map<K, V>.except(second: Map<K, V>): Sequence<Map.Entry<K, V>> =
        asSequence().except(second)
