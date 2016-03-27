package com.muhron.kotlinq

fun <TSource, TResult> Sequence<TSource>.selectWithIndex(selector: (TSource, Int) -> TResult): Sequence<TResult> =
        mapIndexed { i, t -> selector(t, i) }

fun <TSource, TResult> Iterable<TSource>.selectWithIndex(selector: (TSource, Int) -> TResult): Sequence<TResult> =
        asSequence().selectWithIndex(selector)

fun <TSourceK, TSourceV, TResult> Map<TSourceK, TSourceV>.selectWithIndex(selector: (Map.Entry<TSourceK, TSourceV>, Int) -> TResult): Sequence<TResult> =
        asSequence().selectWithIndex(selector)

fun <TSource, TResult> Array<TSource>.selectWithIndex(selector: (TSource, Int) -> TResult): Sequence<TResult> =
        asSequence().selectWithIndex(selector)
