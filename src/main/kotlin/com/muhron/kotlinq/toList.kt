package com.muhron.kotlinq

// Others have toList method.

fun <K, V> Map<K, V>.toList(): List<Map.Entry<K, V>> =
        asSequence().toList()
