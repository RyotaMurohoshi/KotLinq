package com.muhron.kotlinq

fun <TSource> Sequence<TSource>.where(predicate: (TSource) -> Boolean): Sequence<TSource> =
        filter(predicate)

fun <TSource> Iterable<TSource>.where(predicate: (TSource) -> Boolean): Sequence<TSource> =
        asSequence().filter(predicate)

fun <K, V> Map<K, V>.where(predicate: (Map.Entry<K, V>) -> Boolean): Sequence<Map.Entry<K, V>> =
        asSequence().where(predicate)

fun <TSource> Array<TSource>.where(predicate: (TSource) -> Boolean): Sequence<TSource> =
        asSequence().filter(predicate)

