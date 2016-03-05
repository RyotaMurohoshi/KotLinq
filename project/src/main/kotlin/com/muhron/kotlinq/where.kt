package com.muhron.kotlinq

fun <T> Sequence<T>.where(predicate: (T) -> Boolean): Sequence<T> =
        filter(predicate)

fun <T> Iterable<T>.where(predicate: (T) -> Boolean): Sequence<T> =
        asSequence().filter(predicate)

fun <K, V> Map<K, V>.where(predicate: (Map.Entry<K, V>) -> Boolean): Sequence<Map.Entry<K, V>> =
        asSequence().where(predicate)

fun <T> Array<T>.where(predicate: (T) -> Boolean): Sequence<T> =
        asSequence().filter(predicate)

