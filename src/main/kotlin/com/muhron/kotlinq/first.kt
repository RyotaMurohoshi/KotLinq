package com.muhron.kotlinq

// first() and <T> first(predicate : (T) -> Boolean) methods are implemented in kotlin.collections or kotlin.sequences
// without Map<K, V>.

inline fun <K, V> Map<K, V>.first() =
        asSequence().first()

inline fun <K, V> Map<K, V>.first(predicate: (Map.Entry<K, V>) -> Boolean) =
        asSequence().first(predicate)
