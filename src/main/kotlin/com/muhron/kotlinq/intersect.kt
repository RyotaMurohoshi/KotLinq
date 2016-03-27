package com.muhron.kotlinq

// for Sequence.
fun <TSource> Sequence<TSource>.intersect(second: Sequence<TSource>): Sequence<TSource> =
        Sequence {
            val set = second.toMutableSet()
            filter { set.remove(it) }.iterator()
        }

fun <TSource> Sequence<TSource>.intersect(second: Iterable<TSource>): Sequence<TSource> =
        intersect(second.asSequence())

fun <TSource> Sequence<TSource>.intersect(second: Array<TSource>): Sequence<TSource> =
        intersect(second.asSequence())

fun <TSourceK, TSourceV> Sequence<Map.Entry<TSourceK, TSourceV>>.intersect(second: Map<TSourceK, TSourceV>): Sequence<Map.Entry<TSourceK, TSourceV>> =
        intersect(second.asSequence())

// for Iterable.
fun <TSource> Iterable<TSource>.intersect(second: Sequence<TSource>): Sequence<TSource> =
        asSequence().intersect(second)

fun <TSource> Iterable<TSource>.intersect(second: Iterable<TSource>): Sequence<TSource> =
        asSequence().intersect(second)


fun <TSource> Iterable<TSource>.intersect(second: Array<TSource>): Sequence<TSource> =
        asSequence().intersect(second)

fun <TSourceK, TSourceV> Iterable<Map.Entry<TSourceK, TSourceV>>.intersect(second: Map<TSourceK, TSourceV>): Sequence<Map.Entry<TSourceK, TSourceV>> =
        asSequence().intersect(second)

// for Array.
fun <TSource> Array<TSource>.intersect(second: Sequence<TSource>): Sequence<TSource> =
        asSequence().intersect(second)

fun <TSource> Array<TSource>.intersect(second: Iterable<TSource>): Sequence<TSource> =
        asSequence().intersect(second)

fun <TSource> Array<TSource>.intersect(second: Array<TSource>): Sequence<TSource> =
        asSequence().intersect(second)

fun <TSourceK, TSourceV> Array<Map.Entry<TSourceK, TSourceV>>.intersect(second: Map<TSourceK, TSourceV>): Sequence<Map.Entry<TSourceK, TSourceV>> =
        asSequence().intersect(second)

// for Map
fun <TSourceK, TSourceV> Map<TSourceK, TSourceV>.intersect(second: Sequence<Map.Entry<TSourceK, TSourceV>>): Sequence<Map.Entry<TSourceK, TSourceV>> =
        asSequence().intersect(second)


fun <TSourceK, TSourceV> Map<TSourceK, TSourceV>.intersect(second: Iterable<Map.Entry<TSourceK, TSourceV>>): Sequence<Map.Entry<TSourceK, TSourceV>> =
        asSequence().intersect(second)

fun <TSourceK, TSourceV> Map<TSourceK, TSourceV>.intersect(second: Array<Map.Entry<TSourceK, TSourceV>>): Sequence<Map.Entry<TSourceK, TSourceV>> =
        asSequence().intersect(second)

fun <TSourceK, TSourceV> Map<TSourceK, TSourceV>.intersect(second: Map<TSourceK, TSourceV>): Sequence<Map.Entry<TSourceK, TSourceV>> =
        asSequence().intersect(second)
