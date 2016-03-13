package com.muhron.kotlinq

// for Sequence
inline fun <TSource> Sequence<TSource>.aggregate(func: (TSource, TSource) -> TSource) : TSource
        = reduce(func)

inline fun <TSource, TAccumulate> Sequence<TSource>.aggregate(seed: TAccumulate, func: (TAccumulate, TSource) -> TAccumulate) : TAccumulate
        = fold(seed, func)

inline fun <TSource, TAccumulate, TResult> Sequence<TSource>.aggregate(seed: TAccumulate, func: (TAccumulate, TSource) -> TAccumulate, resultSelector: (TAccumulate) -> TResult) : TResult
        = resultSelector(fold(seed, func))

// for Iterable
inline fun <TSource> Iterable<TSource>.aggregate(func: (TSource, TSource) -> TSource) : TSource
        = reduce(func)

inline fun <TSource, TAccumulate> Iterable<TSource>.aggregate(seed: TAccumulate, func: (TAccumulate, TSource) -> TAccumulate) : TAccumulate
        = fold(seed, func)

inline fun <TSource, TAccumulate, TResult> Iterable<TSource>.aggregate(seed: TAccumulate, func: (TAccumulate, TSource) -> TAccumulate, resultSelector: (TAccumulate) -> TResult) : TResult
        = resultSelector(fold(seed, func))

// for Array
inline fun <TSource> Array<TSource>.aggregate(func: (TSource, TSource) -> TSource) : TSource
        = reduce(func)

inline fun <TSource, TAccumulate> Array<TSource>.aggregate(seed: TAccumulate, func: (TAccumulate, TSource) -> TAccumulate) : TAccumulate
        = fold(seed, func)

inline fun <TSource, TAccumulate, TResult> Array<TSource>.aggregate(seed: TAccumulate, func: (TAccumulate, TSource) -> TAccumulate, resultSelector: (TAccumulate) -> TResult) : TResult
        = resultSelector(fold(seed, func))

// for Map
inline fun <K, V> Map<K, V>.aggregate(func: (Map.Entry<K, V>, Map.Entry<K, V>) -> Map.Entry<K, V>) : Map.Entry<K, V>
        = asSequence().reduce(func)

inline fun <K, V, TAccumulate> Map<K, V>.aggregate(seed: TAccumulate, func: (seed: TAccumulate, Map.Entry<K, V>) -> TAccumulate) : TAccumulate
        = asSequence().fold(seed, func)

inline fun <K, V, TAccumulate, TResult> Map<K, V>.aggregate(seed: TAccumulate, func: (seed: TAccumulate, Map.Entry<K, V>) -> TAccumulate, resultSelector: (TAccumulate) -> TResult)
        = resultSelector(asSequence().fold(seed, func))
