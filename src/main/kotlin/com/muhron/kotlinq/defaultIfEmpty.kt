package com.muhron.kotlinq

inline fun <TSource> Sequence<TSource>.defaultIfEmpty(defaultValue: TSource): Sequence<TSource> {
    if (any()) {
        return this
    } else {
        return sequenceOf(defaultValue)
    }
}

inline fun <TSource> Array<TSource>.defaultIfEmpty(defaultValue: TSource): Sequence<TSource> =
        asSequence().defaultIfEmpty(defaultValue)

inline fun <TSource> Iterable<TSource>.defaultIfEmpty(defaultValue: TSource): Sequence<TSource> =
        asSequence().defaultIfEmpty(defaultValue)

inline fun <K, V> Map<K, V>.defaultIfEmpty(defaultValue: Map.Entry<K, V>): Sequence<Map.Entry<K, V>> =
        asSequence().defaultIfEmpty(defaultValue)

inline fun <TSource> Sequence<TSource?>.defaultIfEmpty(): Sequence<TSource?> {
    if (any()) {
        return this
    } else {
        return sequenceOf(null)
    }
}

inline fun <TSource> Array<TSource?>.defaultIfEmpty(): Sequence<TSource?> =
        asSequence().defaultIfEmpty()

inline fun <TSource> Iterable<TSource?>.defaultIfEmpty(): Sequence<TSource?> =
        asSequence().defaultIfEmpty()
