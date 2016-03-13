package com.muhron.kotlinq

// elementAt() methods are implemented in kotlin.collections or kotlin.sequences
// without Map<K, V>.

inline fun <K, V> Map<K, V>.elementAt(index:Int) = asSequence().elementAt(index)
