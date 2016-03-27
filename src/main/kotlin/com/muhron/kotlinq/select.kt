package com.muhron.kotlinq

fun <TSource, TResult> Sequence<TSource>.select(selector: (TSource) -> TResult): Sequence<TResult> =
        map(selector)

fun <TSource, TResult> Iterable<TSource>.select(selector: (TSource) -> TResult): Sequence<TResult> =
        asSequence().select(selector)

fun <TSourceK, TSourceV, TResult> Map<TSourceK, TSourceV>.select(selector: (Map.Entry<TSourceK, TSourceV>) -> TResult): Sequence<TResult> =
        asSequence().select(selector)

fun <TSource, TResult> Array<TSource>.select(selector: (TSource) -> TResult): Sequence<TResult> =
        asSequence().select(selector)
