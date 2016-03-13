package com.muhron.kotlinq

// Others have toArray method.

inline fun <reified TSource> Sequence<TSource>.toArray(): Array<TSource> =
        toList().toTypedArray()

inline fun <reified TSource> Iterable<TSource>.toArray(): Array<TSource> =
        asSequence().toArray()

inline fun <reified TSource> Array<TSource>.toArray(): Array<TSource> =
        asSequence().toArray()

inline fun <reified K, reified V> Map<K, V>.toArray(): Array<Map.Entry<K, V>> =
        asSequence().toArray()
