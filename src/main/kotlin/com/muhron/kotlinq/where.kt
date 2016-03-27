package com.muhron.kotlinq

fun <TSource> Sequence<TSource>.where(predicate: (TSource) -> Boolean): Sequence<TSource> =
        filter(predicate)

fun <TSource> Iterable<TSource>.where(predicate: (TSource) -> Boolean): Sequence<TSource> =
        asSequence().filter(predicate)

fun <TSourceK, TSourceV> Map<TSourceK, TSourceV>.where(predicate: (Map.Entry<TSourceK, TSourceV>) -> Boolean): Sequence<Map.Entry<TSourceK, TSourceV>> =
        asSequence().where(predicate)

fun <TSource> Array<TSource>.where(predicate: (TSource) -> Boolean): Sequence<TSource> =
        asSequence().filter(predicate)

