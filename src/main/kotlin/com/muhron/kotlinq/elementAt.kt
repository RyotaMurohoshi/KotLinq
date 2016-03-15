package com.muhron.kotlinq

// elementAt() methods are implemented in kotlin.collections or kotlin.sequences
// without Map<K, V>.

fun <K, V> Map<K, V>.elementAt(index: Int): Map.Entry<K, V> = asSequence().elementAt(index)
