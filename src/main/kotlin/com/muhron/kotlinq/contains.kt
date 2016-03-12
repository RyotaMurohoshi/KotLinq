package com.muhron.kotlinq

fun <T> Sequence<T>.contains(value: T): Boolean = contains(element = value)

fun <T> Array<T>.contains(value: T): Boolean = contains(element = value)

fun <T> Iterable<T>.contains(value: T): Boolean = contains(element = value)

fun <K, V> Map<K, V>.contains(value: Map.Entry<K, V>): Boolean = asSequence().contains(element = value)
