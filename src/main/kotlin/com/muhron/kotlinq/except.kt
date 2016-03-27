package com.muhron.kotlinq

// for Sequence.
fun <TSource> Sequence<TSource>.except(second: Sequence<TSource>): Sequence<TSource> =
        distinct().minus(second)

fun <TSource> Sequence<TSource>.except(second: Iterable<TSource>): Sequence<TSource> =
        distinct().minus(second)

fun <TSource> Sequence<TSource>.except(second: Array<TSource>): Sequence<TSource> =
        distinct().minus(second)

fun <TSourceK, TSourceV> Sequence<Map.Entry<TSourceK, TSourceV>>.except(second: Map<TSourceK, TSourceV>): Sequence<Map.Entry<TSourceK, TSourceV>> =
        distinct().minus(second.asSequence())

// for Iterable
fun <TSource> Iterable<TSource>.except(second: Sequence<TSource>): Sequence<TSource> =
        asSequence().except(second)

fun <TSource> Iterable<TSource>.except(second: Iterable<TSource>): Sequence<TSource> =
        asSequence().except(second)

fun <TSource> Iterable<TSource>.except(second: Array<TSource>): Sequence<TSource> =
        asSequence().except(second)

fun <TSourceK, TSourceV> Iterable<Map.Entry<TSourceK, TSourceV>>.except(second: Map<TSourceK, TSourceV>): Sequence<Map.Entry<TSourceK, TSourceV>> =
        asSequence().except(second)

// for Array
fun <TSource> Array<TSource>.except(second: Sequence<TSource>): Sequence<TSource> =
        asSequence().except(second)

fun <TSource> Array<TSource>.except(second: Iterable<TSource>): Sequence<TSource> =
        asSequence().except(second)

fun <TSource> Array<TSource>.except(second: Array<TSource>): Sequence<TSource> =
        asSequence().plus(second).distinct()

fun <TSourceK, TSourceV> Array<Map.Entry<TSourceK, TSourceV>>.except(second: Map<TSourceK, TSourceV>): Sequence<Map.Entry<TSourceK, TSourceV>> =
        asSequence().except(second)

// for Map
fun <TSourceK, TSourceV> Map<TSourceK, TSourceV>.except(second: Sequence<Map.Entry<TSourceK, TSourceV>>): Sequence<Map.Entry<TSourceK, TSourceV>> =
        asSequence().except(second)

fun <TSourceK, TSourceV> Map<TSourceK, TSourceV>.except(second: Iterable<Map.Entry<TSourceK, TSourceV>>): Sequence<Map.Entry<TSourceK, TSourceV>> =
        asSequence().except(second)

fun <TSourceK, TSourceV> Map<TSourceK, TSourceV>.except(second: Array<Map.Entry<TSourceK, TSourceV>>): Sequence<Map.Entry<TSourceK, TSourceV>> =
        asSequence().except(second)

fun <TSourceK, TSourceV> Map<TSourceK, TSourceV>.except(second: Map<TSourceK, TSourceV>): Sequence<Map.Entry<TSourceK, TSourceV>> =
        asSequence().except(second)
