package com.muhron.kotlinq

// firstOrDefault
fun <T> Sequence<T>.firstOrDefault(): T? =
        firstOrNull()

fun <T> Iterable<T>.firstOrDefault(): T? =
        firstOrNull()

fun <K, V> Map<K, V>.firstOrDefault(): Map.Entry<K, V>? =
        asSequence().firstOrNull()

fun <T> Array<T>.firstOrDefault(): T? =
        firstOrNull()

// firstOrDefault with predicate
fun <T> Sequence<T>.firstOrDefault(predicate: (T) -> Boolean): T? =
        firstOrNull(predicate)

fun <T> Iterable<T>.firstOrDefault(predicate: (T) -> Boolean): T? =
        firstOrNull(predicate)

fun <K, V> Map<K, V>.firstOrDefault(predicate: (Map.Entry<K, V>) -> Boolean): Map.Entry<K, V>? =
        asSequence().firstOrNull(predicate)

fun <T> Array<T>.firstOrDefault(predicate: (T) -> Boolean): T? =
        firstOrNull(predicate)
