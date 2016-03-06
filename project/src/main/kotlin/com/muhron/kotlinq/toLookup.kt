package com.muhron.kotlinq

fun <T, K> Sequence<T>.toLookup(keySelector: (T) -> K): ILookup<K, T>
        = Lookup(groupBy(keySelector).map { Grouping(it) })

fun <T, K> Iterable<T>.toLookup(keySelector: (T) -> K): ILookup<K, T>
        = asSequence().toLookup(keySelector)

fun <T, K> Array<T>.toLookup(keySelector: (T) -> K): ILookup<K, T>
        = asSequence().toLookup(keySelector)

fun <K0, K1, V> Map<K0, V>.toLookup(keySelector: (Map.Entry<K0, V>) -> K1): ILookup<K1, Map.Entry<K0, V>>
        = asSequence().toLookup(keySelector)

fun <T, K, E> Sequence<T>.toLookup(keySelector: (T) -> K, elementSelector: (T) -> E): ILookup<K, E>
        = Lookup(groupBy(keySelector, elementSelector).map { Grouping(it) })

fun <T, K, E> Iterable<T>.toLookup(keySelector: (T) -> K, elementSelector: (T) -> E): ILookup<K, E>
        = asSequence().toLookup(keySelector, elementSelector)

fun <T, K, E> Array<T>.toLookup(keySelector: (T) -> K, elementSelector: (T) -> E): ILookup<K, E>
        = asSequence().toLookup(keySelector, elementSelector)

fun <K0, K1, V0, V1> Map<K0, V0>.toLookup(keySelector: (Map.Entry<K0, V0>) -> K1, elementSelector: (Map.Entry<K0, V0>) -> V1): ILookup<K1, V1>
        = asSequence().toLookup(keySelector, elementSelector)

