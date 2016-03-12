package com.muhron.kotlinq

// first() and <T> first(predicate : (T) -> Boolean) methods are implemented in kotlin.collections or kotlin.sequences
// without Map<K, V>.

fun <K, V> Map<K, V>.last() = asSequence().last()

fun <K, V> Map<K, V>.last(predicate: (Map.Entry<K, V>) -> Boolean) = asSequence().last(predicate)
