package com.muhron.kotlinq

fun <T> Sequence<T>.skipWhile(predicate: (T) -> Boolean): Sequence<T> =
        dropWhile(predicate)

fun <T> Iterable<T>.skipWhile(predicate: (T) -> Boolean): Sequence<T> =
        asSequence().skipWhile(predicate)

fun <K, V> Map<K, V>.skipWhile(predicate: (Map.Entry<K, V>) -> Boolean): Sequence<Map.Entry<K, V>> =
        asSequence().skipWhile(predicate)

fun <T> Array<T>.skipWhile(predicate: (T) -> Boolean): Sequence<T> =
        asSequence().skipWhile(predicate)
