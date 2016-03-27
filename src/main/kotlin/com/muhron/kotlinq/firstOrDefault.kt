package com.muhron.kotlinq

// firstOrDefault
fun <TSource> Sequence<TSource>.firstOrDefault(): TSource? =
        firstOrNull()

fun <TSource> Iterable<TSource>.firstOrDefault(): TSource? =
        asSequence().firstOrDefault()

fun <TSourceK, TSourceV> Map<TSourceK, TSourceV>.firstOrDefault(): Map.Entry<TSourceK, TSourceV>? =
        asSequence().firstOrDefault()

fun <TSource> Array<TSource>.firstOrDefault(): TSource? =
        asSequence().firstOrDefault()

// firstOrDefault with predicate
inline fun <TSource> Sequence<TSource>.firstOrDefault(predicate: (TSource) -> Boolean): TSource? =
        firstOrNull(predicate)

inline fun <TSource> Iterable<TSource>.firstOrDefault(predicate: (TSource) -> Boolean): TSource? =
        asSequence().firstOrDefault(predicate)

inline fun <TSourceK, TSourceV> Map<TSourceK, TSourceV>.firstOrDefault(predicate: (Map.Entry<TSourceK, TSourceV>) -> Boolean): Map.Entry<TSourceK, TSourceV>? =
        asSequence().firstOrDefault(predicate)

inline fun <TSource> Array<TSource>.firstOrDefault(predicate: (TSource) -> Boolean): TSource? =
        asSequence().firstOrDefault(predicate)