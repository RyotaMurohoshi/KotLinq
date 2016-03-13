package com.muhron.kotlinq

fun <TSource> Sequence<TSource>.skipWhile(predicate: (TSource) -> Boolean): Sequence<TSource> =
        dropWhile(predicate)

fun <TSource> Iterable<TSource>.skipWhile(predicate: (TSource) -> Boolean): Sequence<TSource> =
        asSequence().skipWhile(predicate)

fun <K, V> Map<K, V>.skipWhile(predicate: (Map.Entry<K, V>) -> Boolean): Sequence<Map.Entry<K, V>> =
        asSequence().skipWhile(predicate)

fun <TSource> Array<TSource>.skipWhile(predicate: (TSource) -> Boolean): Sequence<TSource> =
        asSequence().skipWhile(predicate)
