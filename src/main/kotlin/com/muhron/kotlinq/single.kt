package com.muhron.kotlinq

inline fun <K, V> Map<K, V>.single(): Map.Entry<K, V> =
        asSequence().single()

inline fun <K, V> Map<K, V>.single(predicate: (Map.Entry<K, V>) -> Boolean): Map.Entry<K, V> =
        asSequence().single(predicate)
