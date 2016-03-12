package com.muhron.kotlinq

// singleOrDefault
fun <T> Sequence<T>.singleOrDefault(): T? =
        singleOrNull()

fun <T> Iterable<T>.singleOrDefault(): T? =
        singleOrNull()

fun <K, V> Map<K, V>.singleOrDefault(): Map.Entry<K, V>? =
        asSequence().singleOrNull()

fun <T> Array<T>.singleOrDefault(): T? =
        singleOrNull()

// singleOrDefault with predicate
fun <T> Sequence<T>.singleOrDefault(predicate: (T) -> Boolean): T? =
        singleOrNull(predicate)

fun <T> Iterable<T>.singleOrDefault(predicate: (T) -> Boolean): T? =
        singleOrNull(predicate)

fun <K, V> Map<K, V>.singleOrDefault(predicate: (Map.Entry<K, V>) -> Boolean): Map.Entry<K, V>? =
        asSequence().singleOrNull(predicate)

fun <T> Array<T>.singleOrDefault(predicate: (T) -> Boolean): T? =
        singleOrNull(predicate)
