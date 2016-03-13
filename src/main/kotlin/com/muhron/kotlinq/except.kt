package com.muhron.kotlinq

// for Sequence.
inline fun <TSource> Sequence<TSource>.except(second: Sequence<TSource>): Sequence<TSource> =
        distinct().minus(second)

inline fun <TSource> Sequence<TSource>.except(second: Iterable<TSource>): Sequence<TSource> =
        distinct().minus(second)

inline fun <TSource> Sequence<TSource>.except(second: Array<TSource>): Sequence<TSource> =
        distinct().minus(second)

inline fun <K, V> Sequence<Map.Entry<K, V>>.except(second: Map<K, V>): Sequence<Map.Entry<K, V>> =
        distinct().minus(second.asSequence())

// for Iterable
inline fun <TSource> Iterable<TSource>.except(second: Sequence<TSource>): Sequence<TSource> =
        asSequence().except(second)

inline fun <TSource> Iterable<TSource>.except(second: Iterable<TSource>): Sequence<TSource> =
        asSequence().except(second)

inline fun <TSource> Iterable<TSource>.except(second: Array<TSource>): Sequence<TSource> =
        asSequence().except(second)

inline fun <K, V> Iterable<Map.Entry<K, V>>.except(second: Map<K, V>): Sequence<Map.Entry<K, V>> =
        asSequence().except(second)

// for Array
inline fun <TSource> Array<TSource>.except(second: Sequence<TSource>): Sequence<TSource> =
        asSequence().except(second)

inline fun <TSource> Array<TSource>.except(second: Iterable<TSource>): Sequence<TSource> =
        asSequence().except(second)

inline fun <TSource> Array<TSource>.except(second: Array<TSource>): Sequence<TSource> =
        asSequence().plus(second).distinct()

inline fun <K, V> Array<Map.Entry<K, V>>.except(second: Map<K, V>): Sequence<Map.Entry<K, V>> =
        asSequence().except(second)

// for Map
inline fun <K, V> Map<K, V>.except(second: Sequence<Map.Entry<K, V>>): Sequence<Map.Entry<K, V>> =
        asSequence().except(second)

inline fun <K, V> Map<K, V>.except(second: Iterable<Map.Entry<K, V>>): Sequence<Map.Entry<K, V>> =
        asSequence().except(second)

inline fun <K, V> Map<K, V>.except(second: Array<Map.Entry<K, V>>): Sequence<Map.Entry<K, V>> =
        asSequence().except(second)

inline fun <K, V> Map<K, V>.except(second: Map<K, V>): Sequence<Map.Entry<K, V>> =
        asSequence().except(second)
