package com.muhron.kotlinq

inline fun <TSource> Sequence<TSource>.contains(value: TSource): Boolean = contains(element = value)

inline fun <TSource> Array<TSource>.contains(value: TSource): Boolean = contains(element = value)

inline fun <TSource> Iterable<TSource>.contains(value: TSource): Boolean = contains(element = value)

inline fun <K, V> Map<K, V>.contains(value: Map.Entry<K, V>): Boolean = asSequence().contains(element = value)
