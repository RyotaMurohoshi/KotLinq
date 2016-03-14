package com.muhron.kotlinq

// for Sequence.
fun <TSource> Sequence<TSource>.union(second: Sequence<TSource>): Sequence<TSource> =
        plus(second).distinct()

fun <TSource> Sequence<TSource>.union(second: Iterable<TSource>): Sequence<TSource> =
        plus(second).distinct()

fun <TSource> Sequence<TSource>.union(second: Array<TSource>): Sequence<TSource> =
        plus(second).distinct()

fun <K, V> Sequence<Map.Entry<K, V>>.union(second: Map<K, V>): Sequence<Map.Entry<K, V>> =
        plus(second.asSequence()).distinct()

// for Iterable
fun <TSource> Iterable<TSource>.union(second: Sequence<TSource>): Sequence<TSource> =
        asSequence().union(second)

fun <TSource> Iterable<TSource>.union(second: Iterable<TSource>): Sequence<TSource> =
        asSequence().union(second)

fun <TSource> Iterable<TSource>.union(second: Array<TSource>): Sequence<TSource> =
        asSequence().union(second)

fun <K, V> Iterable<Map.Entry<K, V>>.union(second: Map<K, V>): Sequence<Map.Entry<K, V>> =
        asSequence().union(second)

// for Array
fun <TSource> Array<TSource>.union(second: Sequence<TSource>): Sequence<TSource> =
        asSequence().union(second)

fun <TSource> Array<TSource>.union(second: Iterable<TSource>): Sequence<TSource> =
        asSequence().union(second)

fun <TSource> Array<TSource>.union(second: Array<TSource>): Sequence<TSource> =
        asSequence().union(second)

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
