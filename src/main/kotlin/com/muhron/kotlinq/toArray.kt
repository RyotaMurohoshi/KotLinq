package com.muhron.kotlinq

// Others have toArray method.

inline fun <reified T> Sequence<T>.toArray(): Array<T> =
        toList().toTypedArray()

inline fun <reified T> Iterable<T>.toArray(): Array<T> =
        toList().toTypedArray()

fun <T> Array<T>.toArray(): Array<T> =
        this

inline fun <reified K, reified V> Map<K, V>.toArray(): Array<Map.Entry<K, V>> =
        asSequence().toArray()
