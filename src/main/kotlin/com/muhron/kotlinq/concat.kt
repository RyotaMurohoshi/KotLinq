package com.muhron.kotlinq

// for Sequence
fun <TSource> Sequence<TSource>.concat(second: Sequence<TSource>) =
        plus(second)

fun <TSource> Sequence<TSource>.concat(second: Iterable<TSource>) =
        plus(second.asSequence())

fun <TSource> Sequence<TSource>.concat(second: Array<TSource>) =
        plus(second.asSequence())

fun <K, V> Sequence<Map.Entry<K, V>>.concat(second: Map<K, V>) =
        plus(second.asSequence())

// for Iterable
fun <TSource> Iterable<TSource>.concat(second: Sequence<TSource>) =
        asSequence().concat(second)

fun <TSource> Iterable<TSource>.concat(second: Iterable<TSource>) =
        asSequence().concat(second)

fun <TSource> Iterable<TSource>.concat(second: Array<TSource>) =
        asSequence().concat(second)

fun <K, V> Iterable<Map.Entry<K, V>>.concat(second: Map<K, V>) =
        asSequence().concat(second)

// for Array
fun <TSource> Array<TSource>.concat(second: Sequence<TSource>) =
        asSequence().concat(second)

fun <TSource> Array<TSource>.concat(second: Iterable<TSource>) =
        asSequence().concat(second)

fun <TSource> Array<TSource>.concat(second: Array<TSource>) =
        asSequence().concat(second)

fun <K, V> Array<Map.Entry<K, V>>.concat(second: Map<K, V>) =
        asSequence().concat(second)

// for Map
fun <K, V> Map<K, V>.concat(second: Sequence<Map.Entry<K, V>>) =
        asSequence().concat(second)

fun <K, V> Map<K, V>.concat(second: Iterable<Map.Entry<K, V>>) =
        asSequence().concat(second)

fun <K, V> Map<K, V>.concat(second: Array<Map.Entry<K, V>>) =
        asSequence().concat(second)

fun <K, V> Map<K, V>.concat(second: Map<K, V>) =
        asSequence().concat(second)
