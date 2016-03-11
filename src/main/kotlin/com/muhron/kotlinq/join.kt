package com.muhron.kotlinq

fun <TOuter, TInner, TKey, TResult> Sequence<TOuter>.join(
        inner: Sequence<TInner>,
        outerKeySelector: (TOuter) -> TKey,
        innerKeySelector: (TInner) -> TKey,
        resultSelector: (TOuter, TInner) -> TResult): Sequence<TResult> =
        join(this, inner, outerKeySelector, innerKeySelector, resultSelector)

fun <TOuter, TInner, TKey, TResult> Iterable<TOuter>.join(
        inner: Sequence<TInner>,
        outerKeySelector: (TOuter) -> TKey,
        innerKeySelector: (TInner) -> TKey,
        resultSelector: (TOuter, TInner) -> TResult): Sequence<TResult> =
        asSequence().join(inner, outerKeySelector, innerKeySelector, resultSelector)

fun <TOuter, TInner, TKey, TResult> Array<TOuter>.join(
        inner: Sequence<TInner>,
        outerKeySelector: (TOuter) -> TKey,
        innerKeySelector: (TInner) -> TKey,
        resultSelector: (TOuter, TInner) -> TResult): Sequence<TResult> =
        asSequence().join(inner, outerKeySelector, innerKeySelector, resultSelector)

fun <K, V, TInner, TKey, TResult> Map<K, V>.join(
        inner: Sequence<TInner>,
        outerKeySelector: (Map.Entry<K, V>) -> TKey,
        innerKeySelector: (TInner) -> TKey,
        resultSelector: (Map.Entry<K, V>, TInner) -> TResult): Sequence<TResult> =
        asSequence().join(inner, outerKeySelector, innerKeySelector, resultSelector)
