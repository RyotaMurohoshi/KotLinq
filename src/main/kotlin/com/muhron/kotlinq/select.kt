package com.muhron.kotlinq

fun <TSource, TResult> Sequence<TSource>.select(selector: (TSource) -> TResult): Sequence<TResult> =
        map(selector)

fun <TSource, TResult> Iterable<TSource>.select(selector: (TSource) -> TResult): Sequence<TResult> =
        asSequence().select(selector)

fun <K, V, TResult> Map<K, V>.select(selector: (Map.Entry<K, V>) -> TResult): Sequence<TResult> =
        asSequence().select(selector)

fun <TSource, TResult> Array<TSource>.select(selector: (TSource) -> TResult): Sequence<TResult> =
        asSequence().select(selector)
