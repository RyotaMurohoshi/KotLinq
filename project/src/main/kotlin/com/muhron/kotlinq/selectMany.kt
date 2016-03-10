package com.muhron.kotlinq

// for Sequence
fun <TSource, TResult> Sequence<TSource>.selectMany(selector: (TSource) -> Sequence<TResult>): Sequence<TResult> =
        flatMap(selector)

fun <TSource, TResult> Sequence<TSource>.selectMany(selector: (TSource, Int) -> Sequence<TResult>): Sequence<TResult> =
        withIndex().flatMap { selector(it.value, it.index) }

fun <TSource, TCollection, TResult> Sequence<TSource>.selectMany(
        collectionSelector: (TSource) -> Sequence<TCollection>,
        resultSelector: (TSource, TCollection) -> TResult): Sequence<TResult> =
        flatMap { source -> collectionSelector(source).map { collection -> resultSelector(source, collection) } }

fun <TSource, TCollection, TResult> Sequence<TSource>.selectMany(
        collectionSelector: (TSource, Int) -> Sequence<TCollection>,
        resultSelector: (TSource, TCollection) -> TResult): Sequence<TResult> =
        withIndex().flatMap { source -> collectionSelector(source.value, source.index).map { collection -> resultSelector(source.value, collection) } }

// for Iterable
fun <TSource, TResult> Iterable<TSource>.selectMany(selector: (TSource) -> Sequence<TResult>): Sequence<TResult> =
        asSequence().selectMany(selector)

fun <TSource, TResult> Iterable<TSource>.selectMany(selector: (TSource, Int) -> Sequence<TResult>): Sequence<TResult> =
        asSequence().selectMany(selector)

fun <TSource, TCollection, TResult> Iterable<TSource>.selectMany(
        collectionSelector: (TSource) -> Sequence<TCollection>,
        resultSelector: (TSource, TCollection) -> TResult): Sequence<TResult> =
        asSequence().selectMany(collectionSelector, resultSelector)

fun <TSource, TCollection, TResult> Iterable<TSource>.selectMany(
        collectionSelector: (TSource, Int) -> Sequence<TCollection>,
        resultSelector: (TSource, TCollection) -> TResult): Sequence<TResult> =
        asSequence().selectMany(collectionSelector, resultSelector)

// for Array
fun <TSource, TResult> Array<TSource>.selectMany(selector: (TSource) -> Sequence<TResult>): Sequence<TResult> =
        asSequence().selectMany(selector)

fun <TSource, TResult> Array<TSource>.selectMany(selector: (TSource, Int) -> Sequence<TResult>): Sequence<TResult> =
        asSequence().selectMany(selector)

fun <TSource, TCollection, TResult> Array<TSource>.selectMany(
        collectionSelector: (TSource) -> Sequence<TCollection>,
        resultSelector: (TSource, TCollection) -> TResult): Sequence<TResult> =
        asSequence().selectMany(collectionSelector, resultSelector)

fun <TSource, TCollection, TResult> Array<TSource>.selectMany(
        collectionSelector: (TSource, Int) -> Sequence<TCollection>,
        resultSelector: (TSource, TCollection) -> TResult): Sequence<TResult> =
        asSequence().selectMany(collectionSelector, resultSelector)

// for Array

fun <TKey, TValue, TResult> Map<TKey, TValue>.selectMany(selector: (Map.Entry<TKey, TValue>) -> Sequence<TResult>): Sequence<TResult> =
        asSequence().selectMany (selector)

fun <TKey, TValue, TResult> Map<TKey, TValue>.selectMany(selector: (Map.Entry<TKey, TValue>, Int) -> Sequence<TResult>): Sequence<TResult> =
        asSequence().selectMany(selector)

fun <TKey, TValue, TCollection, TResult> Map<TKey, TValue>.selectMany(
        collectionSelector: (Map.Entry<TKey, TValue>) -> Sequence<TCollection>,
        resultSelector: (Map.Entry<TKey, TValue>, TCollection) -> TResult): Sequence<TResult> =
        asSequence().selectMany(collectionSelector, resultSelector)

fun <TKey, TValue, TCollection, TResult> Map<TKey, TValue>.selectMany(
        collectionSelector: (Map.Entry<TKey, TValue>, Int) -> Sequence<TCollection>,
        resultSelector: (Map.Entry<TKey, TValue>, TCollection) -> TResult): Sequence<TResult> =
        asSequence().selectMany(collectionSelector, resultSelector)
