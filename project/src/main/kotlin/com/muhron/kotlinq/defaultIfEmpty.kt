package com.muhron.kotlinq

fun <TSource> Sequence<TSource>.defaultIfEmpty(defaultValue: TSource): Sequence<TSource> {
    if (any()) {
        return this
    } else {
        return sequenceOf(defaultValue)
    }
}

fun <TSource> Array<TSource>.defaultIfEmpty(defaultValue: TSource): Sequence<TSource> =
        asSequence().defaultIfEmpty(defaultValue)

fun <TSource> Iterable<TSource>.defaultIfEmpty(defaultValue: TSource): Sequence<TSource> =
        asSequence().defaultIfEmpty(defaultValue)

fun <K, V> Map<K, V>.defaultIfEmpty(defaultValue: Map.Entry<K, V>): Sequence<Map.Entry<K, V>> =
        asSequence().defaultIfEmpty(defaultValue)

fun <TSource> Sequence<TSource?>.defaultIfEmpty(): Sequence<TSource?> {
    if (any()) {
        return this
    } else {
        return sequenceOf(null)
    }
}

fun <TSource> Array<TSource?>.defaultIfEmpty(): Sequence<TSource?> =
        asSequence().defaultIfEmpty()

fun <TSource> Iterable<TSource?>.defaultIfEmpty(): Sequence<TSource?> =
        asSequence().defaultIfEmpty()
