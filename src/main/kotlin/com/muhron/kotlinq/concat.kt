package com.muhron.kotlinq

// for Sequence
fun <TSource> Sequence<TSource>.concat(second: Sequence<TSource>) =
        plus(second)

fun <TSource> Sequence<TSource>.concat(second: Iterable<TSource>) =
        plus(second.asSequence())

fun <TSource> Sequence<TSource>.concat(second: Array<TSource>) =
        plus(second.asSequence())

fun <TSourceK, TSourceV> Sequence<Map.Entry<TSourceK, TSourceV>>.concat(second: Map<TSourceK, TSourceV>) =
        plus(second.asSequence())

// for Iterable
fun <TSource> Iterable<TSource>.concat(second: Sequence<TSource>) =
        asSequence().concat(second)

fun <TSource> Iterable<TSource>.concat(second: Iterable<TSource>) =
        asSequence().concat(second)

fun <TSource> Iterable<TSource>.concat(second: Array<TSource>) =
        asSequence().concat(second)

fun <TSourceK, TSourceV> Iterable<Map.Entry<TSourceK, TSourceV>>.concat(second: Map<TSourceK, TSourceV>) =
        asSequence().concat(second)

// for Array
fun <TSource> Array<TSource>.concat(second: Sequence<TSource>) =
        asSequence().concat(second)

fun <TSource> Array<TSource>.concat(second: Iterable<TSource>) =
        asSequence().concat(second)

fun <TSource> Array<TSource>.concat(second: Array<TSource>) =
        asSequence().concat(second)

fun <TSourceK, TSourceV> Array<Map.Entry<TSourceK, TSourceV>>.concat(second: Map<TSourceK, TSourceV>) =
        asSequence().concat(second)

// for Map
fun <TSourceK, TSourceV> Map<TSourceK, TSourceV>.concat(second: Sequence<Map.Entry<TSourceK, TSourceV>>) =
        asSequence().concat(second)

fun <TSourceK, TSourceV> Map<TSourceK, TSourceV>.concat(second: Iterable<Map.Entry<TSourceK, TSourceV>>) =
        asSequence().concat(second)

fun <TSourceK, TSourceV> Map<TSourceK, TSourceV>.concat(second: Array<Map.Entry<TSourceK, TSourceV>>) =
        asSequence().concat(second)

fun <TSourceK, TSourceV> Map<TSourceK, TSourceV>.concat(second: Map<TSourceK, TSourceV>) =
        asSequence().concat(second)
