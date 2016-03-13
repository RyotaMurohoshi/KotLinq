package com.muhron.kotlinq

fun <TSource, TResult> Sequence<TSource>.selectWithIndex(selector: (TSource, Int) -> TResult): Sequence<TResult> =
        mapIndexed { i, t -> selector(t, i) }

fun <TSource, TResult> Iterable<TSource>.selectWithIndex(selector: (TSource, Int) -> TResult): Sequence<TResult> =
        asSequence().selectWithIndex(selector)

fun <K, V, TResult> Map<K, V>.selectWithIndex(selector: (Map.Entry<K, V>, Int) -> TResult): Sequence<TResult> =
        asSequence().selectWithIndex(selector)

fun <TSource, TResult> Array<TSource>.selectWithIndex(selector: (TSource, Int) -> TResult): Sequence<TResult> =
        asSequence().selectWithIndex(selector)
