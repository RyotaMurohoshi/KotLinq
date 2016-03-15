package com.muhron.kotlinq

fun <TSource> Sequence<TSource>.defaultIfEmpty(defaultValue: TSource): Sequence<TSource> {
    return Sequence {
        if(any()) {
            this.iterator()
        } else{
            sequenceOf(defaultValue).iterator()
        }
    }
}

fun <TSource> Array<TSource>.defaultIfEmpty(defaultValue: TSource): Sequence<TSource> =
        asSequence().defaultIfEmpty(defaultValue)

fun <TSource> Iterable<TSource>.defaultIfEmpty(defaultValue: TSource): Sequence<TSource> =
        asSequence().defaultIfEmpty(defaultValue)

fun <K, V> Map<K, V>.defaultIfEmpty(defaultValue: Map.Entry<K, V>): Sequence<Map.Entry<K, V>> =
        asSequence().defaultIfEmpty(defaultValue)

fun <TSource> Sequence<TSource?>.defaultIfEmpty(): Sequence<TSource?> {
    return Sequence {
        if(any()) {
            this.iterator()
        } else{
            sequenceOf(null).iterator()
        }
    }
}

fun <TSource> Array<TSource?>.defaultIfEmpty(): Sequence<TSource?> =
        asSequence().defaultIfEmpty()

fun <TSource> Iterable<TSource?>.defaultIfEmpty(): Sequence<TSource?> =
        asSequence().defaultIfEmpty()

fun <K, V> Map<K, V>.defaultIfEmpty(): Sequence<Map.Entry<K, V>?> =
        asSequence().defaultIfEmpty()
