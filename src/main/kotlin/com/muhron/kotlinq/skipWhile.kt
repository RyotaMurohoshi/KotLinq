package com.muhron.kotlinq

fun <TSource> Sequence<TSource>.skipWhile(predicate: (TSource) -> Boolean): Sequence<TSource> =
        dropWhile(predicate)

fun <TSource> Iterable<TSource>.skipWhile(predicate: (TSource) -> Boolean): Sequence<TSource> =
        asSequence().skipWhile(predicate)

fun <TSourceK, TSourceV> Map<TSourceK, TSourceV>.skipWhile(predicate: (Map.Entry<TSourceK, TSourceV>) -> Boolean): Sequence<Map.Entry<TSourceK, TSourceV>> =
        asSequence().skipWhile(predicate)

fun <TSource> Array<TSource>.skipWhile(predicate: (TSource) -> Boolean): Sequence<TSource> =
        asSequence().skipWhile(predicate)
