package com.muhron.kotlinq

// lastOrDefault
fun <T> Sequence<T>.lastOrDefault(): T? =
        lastOrNull()

fun <T> Iterable<T>.lastOrDefault(): T? =
        lastOrNull()

fun <K, V> Map<K, V>.lastOrDefault(): Map.Entry<K, V>? =
        asSequence().lastOrNull()

fun <T> Array<T>.lastOrDefault(): T? =
        lastOrNull()

// lastOrDefault with predicate
fun <T> Sequence<T>.lastOrDefault(predicate: (T) -> Boolean): T? =
        lastOrNull(predicate)

fun <T> Iterable<T>.lastOrDefault(predicate: (T) -> Boolean): T? =
        lastOrNull(predicate)

fun <K, V> Map<K, V>.lastOrDefault(predicate: (Map.Entry<K, V>) -> Boolean): Map.Entry<K, V>? =
        asSequence().lastOrNull(predicate)

fun <T> Array<T>.lastOrDefault(predicate: (T) -> Boolean): T? =
        lastOrNull(predicate)
