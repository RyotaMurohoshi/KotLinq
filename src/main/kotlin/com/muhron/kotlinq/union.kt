package com.muhron.kotlinq

// for Sequence.
fun <TSource> Sequence<TSource>.union(second: Sequence<TSource>): Sequence<TSource> =
        plus(second).distinct()

fun <TSource> Sequence<TSource>.union(second: Iterable<TSource>): Sequence<TSource> =
        plus(second).distinct()

fun <TSource> Sequence<TSource>.union(second: Array<TSource>): Sequence<TSource> =
        plus(second).distinct()

fun <TSourceK, TSourceV> Sequence<Map.Entry<TSourceK, TSourceV>>.union(second: Map<TSourceK, TSourceV>): Sequence<Map.Entry<TSourceK, TSourceV>> =
        plus(second.asSequence()).distinct()

// for Iterable
fun <TSource> Iterable<TSource>.union(second: Sequence<TSource>): Sequence<TSource> =
        asSequence().union(second)

fun <TSource> Iterable<TSource>.union(second: Iterable<TSource>): Sequence<TSource> =
        asSequence().union(second)

fun <TSource> Iterable<TSource>.union(second: Array<TSource>): Sequence<TSource> =
        asSequence().union(second)

fun <TSourceK, TSourceV> Iterable<Map.Entry<TSourceK, TSourceV>>.union(second: Map<TSourceK, TSourceV>): Sequence<Map.Entry<TSourceK, TSourceV>> =
        asSequence().union(second)

// for Array
fun <TSource> Array<TSource>.union(second: Sequence<TSource>): Sequence<TSource> =
        asSequence().union(second)

fun <TSource> Array<TSource>.union(second: Iterable<TSource>): Sequence<TSource> =
        asSequence().union(second)

fun <TSource> Array<TSource>.union(second: Array<TSource>): Sequence<TSource> =
        asSequence().union(second)

fun <TSourceK, TSourceV> Array<Map.Entry<TSourceK, TSourceV>>.union(second: Map<TSourceK, TSourceV>): Sequence<Map.Entry<TSourceK, TSourceV>> =
        asSequence().union(second)

// for Map
fun <TSourceK, TSourceV> Map<TSourceK, TSourceV>.union(second: Sequence<Map.Entry<TSourceK, TSourceV>>): Sequence<Map.Entry<TSourceK, TSourceV>> =
        asSequence().union(second)

fun <TSourceK, TSourceV> Map<TSourceK, TSourceV>.union(second: Iterable<Map.Entry<TSourceK, TSourceV>>): Sequence<Map.Entry<TSourceK, TSourceV>> =
        asSequence().union(second)

fun <TSourceK, TSourceV> Map<TSourceK, TSourceV>.union(second: Array<Map.Entry<TSourceK, TSourceV>>): Sequence<Map.Entry<TSourceK, TSourceV>> =
        asSequence().union(second)

fun <TSourceK, TSourceV> Map<TSourceK, TSourceV>.union(second: Map<TSourceK, TSourceV>): Sequence<Map.Entry<TSourceK, TSourceV>> =
        asSequence().union(second)
