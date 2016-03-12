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
