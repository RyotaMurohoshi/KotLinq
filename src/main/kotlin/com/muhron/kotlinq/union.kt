package com.muhron.kotlinq

// for Sequence.
fun <T> Sequence<T>.union(second: Sequence<T>): Sequence<T> =
        plus(second).distinct()

fun <T> Sequence<T>.union(second: Iterable<T>): Sequence<T> =
        plus(second).distinct()

fun <T> Sequence<T>.union(second: Array<T>): Sequence<T> =
        plus(second).distinct()

fun <K, V> Sequence<Map.Entry<K, V>>.union(second: Map<K, V>): Sequence<Map.Entry<K, V>> =
        plus(second.asSequence()).distinct()

// for Iterable
fun <T> Iterable<T>.union(second: Sequence<T>): Sequence<T> =
        asSequence().union(second)

fun <T> Iterable<T>.union(second: Iterable<T>): Sequence<T> =
        asSequence().union(second)

fun <T> Iterable<T>.union(second: Array<T>): Sequence<T> =
        asSequence().union(second)

fun <K, V> Iterable<Map.Entry<K, V>>.union(second: Map<K, V>): Sequence<Map.Entry<K, V>> =
        asSequence().union(second)

// for Array
fun <T> Array<T>.union(second: Sequence<T>): Sequence<T> =
        asSequence().union(second)

fun <T> Array<T>.union(second: Iterable<T>): Sequence<T> =
        asSequence().union(second)

fun <T> Array<T>.union(second: Array<T>): Sequence<T> =
        asSequence().plus(second).distinct()

fun <K, V> Array<Map.Entry<K, V>>.union(second: Map<K, V>): Sequence<Map.Entry<K, V>> =
        asSequence().union(second)

// for Map
fun <K, V> Map<K, V>.union(second: Sequence<Map.Entry<K, V>>): Sequence<Map.Entry<K, V>> =
        asSequence().union(second)

fun <K, V> Map<K, V>.union(second: Iterable<Map.Entry<K, V>>): Sequence<Map.Entry<K, V>> =
        asSequence().union(second)

fun <K, V> Map<K, V>.union(second: Array<Map.Entry<K, V>>): Sequence<Map.Entry<K, V>> =
        asSequence().union(second)

fun <K, V> Map<K, V>.union(second: Map<K, V>): Sequence<Map.Entry<K, V>> =
        asSequence().union(second)
