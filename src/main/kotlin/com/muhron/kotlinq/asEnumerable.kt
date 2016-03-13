package com.muhron.kotlinq

fun <TSource> Sequence<TSource>.asEnumerable(): Sequence<TSource> = asSequence()

fun <TSource> Array<TSource>.asEnumerable(): Sequence<TSource> = asSequence().asEnumerable()

fun <TSource> Iterable<TSource>.asEnumerable(): Sequence<TSource> = asSequence().asEnumerable()

fun <K, V> Map<K, V>.asEnumerable(): Sequence<Map.Entry<K, V>> = asSequence().asEnumerable()
