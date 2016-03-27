package com.muhron.kotlinq

fun <TSource> Sequence<TSource>.defaultIfEmpty(defaultValue: TSource): Sequence<TSource> {
    return Sequence {
        if (any()) {
            this.iterator()
        } else {
            sequenceOf(defaultValue).iterator()
        }
    }
}

fun <TSource> Array<TSource>.defaultIfEmpty(defaultValue: TSource): Sequence<TSource> =
        asSequence().defaultIfEmpty(defaultValue)

fun <TSource> Iterable<TSource>.defaultIfEmpty(defaultValue: TSource): Sequence<TSource> =
        asSequence().defaultIfEmpty(defaultValue)

fun <TSourceK, TSourceV> Map<TSourceK, TSourceV>.defaultIfEmpty(defaultValue: Map.Entry<TSourceK, TSourceV>): Sequence<Map.Entry<TSourceK, TSourceV>> =
        asSequence().defaultIfEmpty(defaultValue)

fun <TSource> Sequence<TSource?>.defaultIfEmpty(): Sequence<TSource?> {
    return Sequence {
        if (any()) {
            this.iterator()
        } else {
            sequenceOf(null).iterator()
        }
    }
}

fun <TSource> Array<TSource?>.defaultIfEmpty(): Sequence<TSource?> =
        asSequence().defaultIfEmpty()

fun <TSource> Iterable<TSource?>.defaultIfEmpty(): Sequence<TSource?> =
        asSequence().defaultIfEmpty()

fun <TSourceK, TSourceV> Map<TSourceK, TSourceV>.defaultIfEmpty(): Sequence<Map.Entry<TSourceK, TSourceV>?> =
        asSequence().defaultIfEmpty()
