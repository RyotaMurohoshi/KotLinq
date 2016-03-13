package com.muhron.kotlinq

inline fun <TSource> Sequence<TSource>.asEnumerable(): Sequence<TSource> = asSequence()

inline fun <TSource> Array<TSource>.asEnumerable(): Sequence<TSource> = asSequence().asEnumerable()

inline fun <TSource> Iterable<TSource>.asEnumerable(): Sequence<TSource> = asSequence().asEnumerable()

inline fun <K, V> Map<K, V>.asEnumerable(): Sequence<Map.Entry<K, V>> = asSequence().asEnumerable()
