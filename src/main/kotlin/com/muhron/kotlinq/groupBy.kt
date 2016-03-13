package com.muhron.kotlinq

// only key selector
fun <TSource, TKey> Sequence<TSource>.groupBy(keySelector: (TSource) -> TKey): Sequence<Grouping<TKey, TSource>> =
        Sequence { toLookup(keySelector).iterator() }

fun <TSource, TKey> Iterable<TSource>.groupBy(keySelector: (TSource) -> TKey): Sequence<Grouping<TKey, TSource>> =
        asSequence().groupBy(keySelector)

fun <TSource, TKey> Array<TSource>.groupBy(keySelector: (TSource) -> TKey): Sequence<Grouping<TKey, TSource>> =
        asSequence().groupBy(keySelector)

fun <K, V, TKey> Map<K, V>.groupBy(keySelector: (Map.Entry<K, V>) -> TKey): Sequence<Grouping<TKey, Map.Entry<K, V>>> =
        asSequence().groupBy(keySelector)

// key selector and element selector
fun <TSource, TKey, TElement> Sequence<TSource>.groupBy(keySelector: (TSource) -> TKey, elementSelector: (TSource) -> TElement): Sequence<Grouping<TKey, TElement>> =
        Sequence { toLookup(keySelector, elementSelector).iterator() }

fun <TSource, TKey, TElement> Iterable<TSource>.groupBy(keySelector: (TSource) -> TKey, elementSelector: (TSource) -> TElement): Sequence<Grouping<TKey, TElement>> =
        Sequence { toLookup(keySelector, elementSelector).iterator() }

fun <TSource, TKey, TElement> Array<TSource>.groupBy(keySelector: (TSource) -> TKey, elementSelector: (TSource) -> TElement): Sequence<Grouping<TKey, TElement>> =
        Sequence { toLookup(keySelector, elementSelector).iterator() }

fun <K, V, TKey, TElement> Map<K, V>.groupBy(keySelector: (Map.Entry<K, V>) -> TKey, elementSelector: (Map.Entry<K, V>) -> TElement): Sequence<Grouping<TKey, TElement>> =
        asSequence().groupBy(keySelector, elementSelector)

// key selector and result selector
fun <TSource, TKey, TResult> Sequence<TSource>.groupBy(keySelector: (TSource) -> TKey, resultSelector: (TKey, Sequence<TSource>) -> TResult): Sequence<TResult> =
        Sequence { toLookup(keySelector).map { resultSelector(it.key, it) }.iterator() }

fun <TSource, TKey, TResult> Iterable<TSource>.groupBy(keySelector: (TSource) -> TKey, resultSelector: (TKey, Sequence<TSource>) -> TResult): Sequence<TResult> =
        asSequence().groupBy(keySelector, resultSelector)

fun <TSource, TKey, TResult> Array<TSource>.groupBy(keySelector: (TSource) -> TKey, resultSelector: (TKey, Sequence<TSource>) -> TResult): Sequence<TResult> =
        asSequence().groupBy(keySelector, resultSelector)

fun <K, V, TKey, TResult> Map<K, V>.groupBy(keySelector: (Map.Entry<K, V>) -> TKey, resultSelector: (TKey, Sequence<Map.Entry<K, V>>) -> TResult): Sequence<TResult> =
        asSequence().groupBy(keySelector, resultSelector)

// key selector, element selector and result selector
fun <TSource, TKey, TElement, TResult> Sequence<TSource>.groupBy(keySelector: (TSource) -> TKey, elementSelector: (TSource) -> TElement, resultSelector: (TKey, Sequence<TElement>) -> TResult): Sequence<TResult> =
        Sequence { toLookup(keySelector, elementSelector).map { resultSelector(it.key, it) }.iterator() }

fun <TSource, TKey, TElement, TResult> Iterable<TSource>.groupBy(keySelector: (TSource) -> TKey, elementSelector: (TSource) -> TElement, resultSelector: (TKey, Sequence<TElement>) -> TResult): Sequence<TResult> =
        asSequence().groupBy(keySelector, elementSelector, resultSelector)

fun <TSource, TKey, TElement, TResult> Array<TSource>.groupBy(keySelector: (TSource) -> TKey, elementSelector: (TSource) -> TElement, resultSelector: (TKey, Sequence<TElement>) -> TResult): Sequence<TResult> =
        asSequence().groupBy(keySelector, elementSelector, resultSelector)

fun <K, V, TKey, TElement, TResult> Map<K, V>.groupBy(keySelector: (Map.Entry<K, V>) -> TKey, elementSelector: (Map.Entry<K, V>) -> TElement, resultSelector: (TKey, Sequence<TElement>) -> TResult): Sequence<TResult> =
        asSequence().groupBy(keySelector, elementSelector, resultSelector)
