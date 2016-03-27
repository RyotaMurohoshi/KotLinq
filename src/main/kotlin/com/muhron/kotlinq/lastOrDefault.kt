package com.muhron.kotlinq

// lastOrDefault
fun <TSource> Sequence<TSource>.lastOrDefault(): TSource? =
        lastOrNull()

fun <TSource> Iterable<TSource>.lastOrDefault(): TSource? =
        asSequence().lastOrDefault()

fun <TSourceK, TSourceV> Map<TSourceK, TSourceV>.lastOrDefault(): Map.Entry<TSourceK, TSourceV>? =
        asSequence().lastOrDefault()

fun <TSource> Array<TSource>.lastOrDefault(): TSource? =
        asSequence().lastOrDefault()

// lastOrDefault with predicate
inline fun <TSource> Sequence<TSource>.lastOrDefault(predicate: (TSource) -> Boolean): TSource? =
        lastOrNull(predicate)

inline fun <TSource> Iterable<TSource>.lastOrDefault(predicate: (TSource) -> Boolean): TSource? =
        asSequence().lastOrDefault(predicate)

inline fun <TSourceK, TSourceV> Map<TSourceK, TSourceV>.lastOrDefault(predicate: (Map.Entry<TSourceK, TSourceV>) -> Boolean): Map.Entry<TSourceK, TSourceV>? =
        asSequence().lastOrDefault(predicate)

inline fun <TSource> Array<TSource>.lastOrDefault(predicate: (TSource) -> Boolean): TSource? =
        asSequence().lastOrDefault(predicate)
