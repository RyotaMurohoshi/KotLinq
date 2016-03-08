package com.muhron.kotlinq

fun <TOuter, TInner, TKey, TResult> Sequence<TOuter>.groupJoin(
        inner: Sequence<TInner>,
        outerKeySelector: (TOuter) -> TKey,
        innerKeySelector: (TInner) -> TKey,
        resultSelector: (TOuter, Sequence<TInner>) -> TResult): Sequence<TResult> =
        groupJoin(this, inner, outerKeySelector, innerKeySelector, resultSelector)

fun <TOuter, TInner, TKey, TResult> Iterable<TOuter>.groupJoin(
        inner: Sequence<TInner>,
        outerKeySelector: (TOuter) -> TKey,
        innerKeySelector: (TInner) -> TKey,
        resultSelector: (TOuter, Sequence<TInner>) -> TResult): Sequence<TResult> =
        asSequence().groupJoin(inner, outerKeySelector, innerKeySelector, resultSelector)

fun <TOuter, TInner, TKey, TResult> Array<TOuter>.groupJoin(
        inner: Sequence<TInner>,
        outerKeySelector: (TOuter) -> TKey,
        innerKeySelector: (TInner) -> TKey,
        resultSelector: (TOuter, Sequence<TInner>) -> TResult): Sequence<TResult> =
        asSequence().groupJoin(inner, outerKeySelector, innerKeySelector, resultSelector)

fun <K, V, TInner, TKey, TResult> Map<K, V>.groupJoin(
        inner: Sequence<TInner>,
        outerKeySelector: (Map.Entry<K, V>) -> TKey,
        innerKeySelector: (TInner) -> TKey,
        resultSelector: (Map.Entry<K, V>, Sequence<TInner>) -> TResult): Sequence<TResult> =
        asSequence().groupJoin(inner, outerKeySelector, innerKeySelector, resultSelector)
