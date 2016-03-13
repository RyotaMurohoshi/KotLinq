package com.muhron.kotlinq

// Others have toList method.

inline fun <K, V> Map<K, V>.toList(): List<Map.Entry<K, V>> =
        asSequence().toList()
