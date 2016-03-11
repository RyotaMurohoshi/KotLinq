package com.muhron.kotlinq

// for Sequence
fun <TSource> Sequence<TSource>.aggregate(func: (TSource, TSource) -> TSource) : TSource
        = reduce(func)

fun <TSource, TAccumulate> Sequence<TSource>.aggregate(seed: TAccumulate, func: (TAccumulate, TSource) -> TAccumulate) : TAccumulate
        = fold(seed, func)

fun <TSource, TAccumulate, TResult> Sequence<TSource>.aggregate(seed: TAccumulate, func: (TAccumulate, TSource) -> TAccumulate, resultSelector: (TAccumulate) -> TResult) : TResult
        = resultSelector(fold(seed, func))

// for Iterable
fun <TSource> Iterable<TSource>.aggregate(func: (TSource, TSource) -> TSource) : TSource
        = reduce(func)

fun <TSource, TAccumulate> Iterable<TSource>.aggregate(seed: TAccumulate, func: (TAccumulate, TSource) -> TAccumulate) : TAccumulate
        = fold(seed, func)

fun <TSource, TAccumulate, TResult> Iterable<TSource>.aggregate(seed: TAccumulate, func: (TAccumulate, TSource) -> TAccumulate, resultSelector: (TAccumulate) -> TResult) : TResult
        = resultSelector(fold(seed, func))

// for Array
fun <TSource> Array<TSource>.aggregate(func: (TSource, TSource) -> TSource) : TSource
        = reduce(func)

fun <TSource, TAccumulate> Array<TSource>.aggregate(seed: TAccumulate, func: (TAccumulate, TSource) -> TAccumulate) : TAccumulate
        = fold(seed, func)

fun <TSource, TAccumulate, TResult> Array<TSource>.aggregate(seed: TAccumulate, func: (TAccumulate, TSource) -> TAccumulate, resultSelector: (TAccumulate) -> TResult) : TResult
        = resultSelector(fold(seed, func))

// for Map
fun <K, V> Map<K, V>.aggregate(func: (Map.Entry<K, V>, Map.Entry<K, V>) -> Map.Entry<K, V>) : Map.Entry<K, V>
        = asSequence().reduce(func)

fun <K, V, TAccumulate> Map<K, V>.aggregate(seed: TAccumulate, func: (seed: TAccumulate, Map.Entry<K, V>) -> TAccumulate) : TAccumulate
        = asSequence().fold(seed, func)

fun <K, V, TAccumulate, TResult> Map<K, V>.aggregate(seed: TAccumulate, func: (seed: TAccumulate, Map.Entry<K, V>) -> TAccumulate, resultSelector: (TAccumulate) -> TResult)
        = resultSelector(asSequence().fold(seed, func))
