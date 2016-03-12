package com.muhron.kotlinq

// TODO consider remove asEnumerable

fun <T> Sequence<T>.asEnumerable() = asSequence()

fun <T> Array<T>.asEnumerable() = asSequence()

fun <T> Iterable<T>.asEnumerable() = asSequence()

fun <K, V> Map<K, V>.asEnumerable() = asSequence()
