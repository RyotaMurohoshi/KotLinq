package com.muhron.kotlinq

// only key selector
fun <T, K> Sequence<T>.groupBy(keySelector: (T) -> K): Sequence<IGrouping<K, T>> =
        Sequence { toLookup(keySelector).iterator() }

fun <T, K> Iterable<T>.groupBy(keySelector: (T) -> K): Sequence<IGrouping<K, T>> =
        asSequence().groupBy(keySelector)

fun <T, K> Array<T>.groupBy(keySelector: (T) -> K): Sequence<IGrouping<K, T>> =
        asSequence().groupBy(keySelector)

fun <K0, K1, V> Map<K0, V>.groupBy(keySelector: (Map.Entry<K0, V>) -> K1): Sequence<IGrouping<K1, Map.Entry<K0, V>>> =
        asSequence().groupBy(keySelector)

// key selector and element selector
fun <T, K, E> Sequence<T>.groupBy(keySelector: (T) -> K, elementSelector: (T) -> E): Sequence<IGrouping<K, E>> =
        Sequence { toLookup(keySelector, elementSelector).iterator() }

fun <T, K, E> Iterable<T>.groupBy(keySelector: (T) -> K, elementSelector: (T) -> E): Sequence<IGrouping<K, E>> =
        Sequence { toLookup(keySelector, elementSelector).iterator() }

fun <T, K, E> Array<T>.groupBy(keySelector: (T) -> K, elementSelector: (T) -> E): Sequence<IGrouping<K, E>> =
        Sequence { toLookup(keySelector, elementSelector).iterator() }

fun <K0, K1, V0, V1> Map<K0, V0>.groupBy(keySelector: (Map.Entry<K0, V0>) -> K1, elementSelector: (Map.Entry<K0, V0>) -> V1): Sequence<IGrouping<K1, V1>> =
        asSequence().groupBy(keySelector, elementSelector)

// key selector and result selector
fun <T, K, R> Sequence<T>.groupBy(keySelector: (T) -> K, resultSelector: (K, Sequence<T>) -> R): Sequence<R> =
        Sequence { toLookup(keySelector).map { resultSelector(it.key, it) }.iterator() }

fun <T, K, R> Iterable<T>.groupBy(keySelector: (T) -> K, resultSelector: (K, Sequence<T>) -> R): Sequence<R> =
        asSequence().groupBy(keySelector, resultSelector)

fun <T, K, R> Array<T>.groupBy(keySelector: (T) -> K, resultSelector: (K, Sequence<T>) -> R): Sequence<R> =
        asSequence().groupBy(keySelector, resultSelector)

fun <K0, K1, V, R> Map<K0, V>.groupBy(keySelector: (Map.Entry<K0, V>) -> K1, resultSelector: (K1, Sequence<Map.Entry<K0, V>>) -> R): Sequence<R> =
        asSequence().groupBy(keySelector, resultSelector)

// key selector, element selector and result selector
fun <T, K, E, R> Sequence<T>.groupBy(keySelector: (T) -> K, elementSelector: (T) -> E, resultSelector: (K, Sequence<E>) -> R): Sequence<R> =
        Sequence { toLookup(keySelector, elementSelector).map { resultSelector(it.key, it) }.iterator() }

fun <T, K, E, R> Iterable<T>.groupBy(keySelector: (T) -> K, elementSelector: (T) -> E, resultSelector: (K, Sequence<E>) -> R): Sequence<R> =
        asSequence().groupBy(keySelector, elementSelector, resultSelector)

fun <T, K, E, R> Array<T>.groupBy(keySelector: (T) -> K, elementSelector: (T) -> E, resultSelector: (K, Sequence<E>) -> R): Sequence<R> =
        asSequence().groupBy(keySelector, elementSelector, resultSelector)

fun <K0, K1, V0, V1, R> Map<K0, V0>.groupBy(keySelector: (Map.Entry<K0, V0>) -> K1, elementSelector: (Map.Entry<K0, V0>) -> V1, resultSelector: (K1, Sequence<V1>) -> R): Sequence<R> =
        asSequence().groupBy(keySelector, elementSelector, resultSelector)
