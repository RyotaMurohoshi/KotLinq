package com.muhron.kotlinq

// for Sequence
inline fun <TSource> Sequence<TSource>.aggregate(func: (TSource, TSource) -> TSource): TSource
        = reduce(func)

inline fun <TSource, TAccumulate> Sequence<TSource>.aggregate(seed: TAccumulate, func: (TAccumulate, TSource) -> TAccumulate): TAccumulate
        = fold(seed, func)

inline fun <TSource, TAccumulate, TResult> Sequence<TSource>.aggregate(seed: TAccumulate, func: (TAccumulate, TSource) -> TAccumulate, resultSelector: (TAccumulate) -> TResult): TResult
        = resultSelector(fold(seed, func))

// for Iterable
inline fun <TSource> Iterable<TSource>.aggregate(func: (TSource, TSource) -> TSource): TSource
        = asSequence().aggregate(func)

inline fun <TSource, TAccumulate> Iterable<TSource>.aggregate(seed: TAccumulate, func: (TAccumulate, TSource) -> TAccumulate): TAccumulate
        = asSequence().aggregate(seed, func)

inline fun <TSource, TAccumulate, TResult> Iterable<TSource>.aggregate(seed: TAccumulate, func: (TAccumulate, TSource) -> TAccumulate, resultSelector: (TAccumulate) -> TResult): TResult
        = asSequence().aggregate(seed, func, resultSelector)

// for Array
inline fun <TSource> Array<TSource>.aggregate(func: (TSource, TSource) -> TSource): TSource
        = asSequence().aggregate(func)

inline fun <TSource, TAccumulate> Array<TSource>.aggregate(seed: TAccumulate, func: (TAccumulate, TSource) -> TAccumulate): TAccumulate
        = asSequence().aggregate(seed, func)

inline fun <TSource, TAccumulate, TResult> Array<TSource>.aggregate(seed: TAccumulate, func: (TAccumulate, TSource) -> TAccumulate, resultSelector: (TAccumulate) -> TResult): TResult
        = asSequence().aggregate(seed, func, resultSelector)

// for Map
inline fun <TSourceK, TSourceV> Map<TSourceK, TSourceV>.aggregate(func: (Map.Entry<TSourceK, TSourceV>, Map.Entry<TSourceK, TSourceV>) -> Map.Entry<TSourceK, TSourceV>): Map.Entry<TSourceK, TSourceV>
        = asSequence().aggregate(func)

inline fun <TSourceK, TSourceV, TAccumulate> Map<TSourceK, TSourceV>.aggregate(seed: TAccumulate, func: (seed: TAccumulate, Map.Entry<TSourceK, TSourceV>) -> TAccumulate): TAccumulate
        = asSequence().aggregate(seed, func)

inline fun <TSourceK, TSourceV, TAccumulate, TResult> Map<TSourceK, TSourceV>.aggregate(seed: TAccumulate, func: (seed: TAccumulate, Map.Entry<TSourceK, TSourceV>) -> TAccumulate, resultSelector: (TAccumulate) -> TResult)
        = asSequence().aggregate(seed, func, resultSelector)
