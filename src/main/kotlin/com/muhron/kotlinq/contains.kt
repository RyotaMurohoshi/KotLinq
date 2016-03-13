package com.muhron.kotlinq

fun <TSource> Sequence<TSource>.contains(value: TSource): Boolean = contains(element = value)

fun <TSource> Array<TSource>.contains(value: TSource): Boolean = contains(element = value)

fun <TSource> Iterable<TSource>.contains(value: TSource): Boolean = contains(element = value)

fun <K, V> Map<K, V>.contains(value: Map.Entry<K, V>): Boolean = asSequence().contains(element = value)
