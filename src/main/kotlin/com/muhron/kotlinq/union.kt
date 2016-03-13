package com.muhron.kotlinq

// for Sequence.
inline fun <TSource> Sequence<TSource>.union(second: Sequence<TSource>): Sequence<TSource> =
        plus(second).distinct()

inline fun <TSource> Sequence<TSource>.union(second: Iterable<TSource>): Sequence<TSource> =
        plus(second).distinct()

inline fun <TSource> Sequence<TSource>.union(second: Array<TSource>): Sequence<TSource> =
        plus(second).distinct()

inline fun <K, V> Sequence<Map.Entry<K, V>>.union(second: Map<K, V>): Sequence<Map.Entry<K, V>> =
        plus(second.asSequence()).distinct()

// for Iterable
inline fun <TSource> Iterable<TSource>.union(second: Sequence<TSource>): Sequence<TSource> =
        asSequence().union(second)

inline fun <TSource> Iterable<TSource>.union(second: Iterable<TSource>): Sequence<TSource> =
        asSequence().union(second)

inline fun <TSource> Iterable<TSource>.union(second: Array<TSource>): Sequence<TSource> =
        asSequence().union(second)

inline fun <K, V> Iterable<Map.Entry<K, V>>.union(second: Map<K, V>): Sequence<Map.Entry<K, V>> =
        asSequence().union(second)

// for Array
inline fun <TSource> Array<TSource>.union(second: Sequence<TSource>): Sequence<TSource> =
        asSequence().union(second)

inline fun <TSource> Array<TSource>.union(second: Iterable<TSource>): Sequence<TSource> =
        asSequence().union(second)

inline fun <TSource> Array<TSource>.union(second: Array<TSource>): Sequence<TSource> =
        asSequence().plus(second).distinct()

inline fun <K, V> Array<Map.Entry<K, V>>.union(second: Map<K, V>): Sequence<Map.Entry<K, V>> =
        asSequence().union(second)

// for Map
inline fun <K, V> Map<K, V>.union(second: Sequence<Map.Entry<K, V>>): Sequence<Map.Entry<K, V>> =
        asSequence().union(second)

inline fun <K, V> Map<K, V>.union(second: Iterable<Map.Entry<K, V>>): Sequence<Map.Entry<K, V>> =
        asSequence().union(second)

inline fun <K, V> Map<K, V>.union(second: Array<Map.Entry<K, V>>): Sequence<Map.Entry<K, V>> =
        asSequence().union(second)

inline fun <K, V> Map<K, V>.union(second: Map<K, V>): Sequence<Map.Entry<K, V>> =
        asSequence().union(second)
