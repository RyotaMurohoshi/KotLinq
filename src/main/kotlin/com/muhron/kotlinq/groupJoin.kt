package com.muhron.kotlinq

// for Sequence
fun <TOuter, TInner, TKey, TResult> Sequence<TOuter>.groupJoin(
        inner: Sequence<TInner>,
        outerKeySelector: (TOuter) -> TKey,
        innerKeySelector: (TInner) -> TKey,
        resultSelector: (TOuter, Sequence<TInner>) -> TResult): Sequence<TResult> =
        groupJoin(this, inner, outerKeySelector, innerKeySelector, resultSelector)

fun <TOuter, TInner, TKey, TResult> Sequence<TOuter>.groupJoin(
        inner: Iterable<TInner>,
        outerKeySelector: (TOuter) -> TKey,
        innerKeySelector: (TInner) -> TKey,
        resultSelector: (TOuter, Sequence<TInner>) -> TResult): Sequence<TResult> =
        groupJoin(this, inner.asSequence(), outerKeySelector, innerKeySelector, resultSelector)

fun <TOuter, TInner, TKey, TResult> Sequence<TOuter>.groupJoin(
        inner: Array<TInner>,
        outerKeySelector: (TOuter) -> TKey,
        innerKeySelector: (TInner) -> TKey,
        resultSelector: (TOuter, Sequence<TInner>) -> TResult): Sequence<TResult> =
        groupJoin(this, inner.asSequence(), outerKeySelector, innerKeySelector, resultSelector)

fun <TOuter, K, V, TKey, TResult> Sequence<TOuter>.groupJoin(
        inner: Map<K, V>,
        outerKeySelector: (TOuter) -> TKey,
        innerKeySelector: (Map.Entry<K, V>) -> TKey,
        resultSelector: (TOuter, Sequence<Map.Entry<K, V>>) -> TResult): Sequence<TResult> =
        groupJoin(this, inner.asSequence(), outerKeySelector, innerKeySelector, resultSelector)

// for Iterable
fun <TOuter, TInner, TKey, TResult> Iterable<TOuter>.groupJoin(
        inner: Sequence<TInner>,
        outerKeySelector: (TOuter) -> TKey,
        innerKeySelector: (TInner) -> TKey,
        resultSelector: (TOuter, Sequence<TInner>) -> TResult): Sequence<TResult> =
        asSequence().groupJoin(inner, outerKeySelector, innerKeySelector, resultSelector)

fun <TOuter, TInner, TKey, TResult> Iterable<TOuter>.groupJoin(
        inner: Iterable<TInner>,
        outerKeySelector: (TOuter) -> TKey,
        innerKeySelector: (TInner) -> TKey,
        resultSelector: (TOuter, Sequence<TInner>) -> TResult): Sequence<TResult> =
        asSequence().groupJoin(inner, outerKeySelector, innerKeySelector, resultSelector)

fun <TOuter, TInner, TKey, TResult> Iterable<TOuter>.groupJoin(
        inner: Array<TInner>,
        outerKeySelector: (TOuter) -> TKey,
        innerKeySelector: (TInner) -> TKey,
        resultSelector: (TOuter, Sequence<TInner>) -> TResult): Sequence<TResult> =
        asSequence().groupJoin(inner, outerKeySelector, innerKeySelector, resultSelector)

fun <TOuter, K, V, TKey, TResult> Iterable<TOuter>.groupJoin(
        inner: Map<K, V>,
        outerKeySelector: (TOuter) -> TKey,
        innerKeySelector: (Map.Entry<K, V>) -> TKey,
        resultSelector: (TOuter, Sequence<Map.Entry<K, V>>) -> TResult): Sequence<TResult> =
        asSequence().groupJoin(inner, outerKeySelector, innerKeySelector, resultSelector)

// for Array
fun <TOuter, TInner, TKey, TResult> Array<TOuter>.groupJoin(
        inner: Sequence<TInner>,
        outerKeySelector: (TOuter) -> TKey,
        innerKeySelector: (TInner) -> TKey,
        resultSelector: (TOuter, Sequence<TInner>) -> TResult): Sequence<TResult> =
        asSequence().groupJoin(inner, outerKeySelector, innerKeySelector, resultSelector)

fun <TOuter, TInner, TKey, TResult> Array<TOuter>.groupJoin(
        inner: Iterable<TInner>,
        outerKeySelector: (TOuter) -> TKey,
        innerKeySelector: (TInner) -> TKey,
        resultSelector: (TOuter, Sequence<TInner>) -> TResult): Sequence<TResult> =
        asSequence().groupJoin(inner, outerKeySelector, innerKeySelector, resultSelector)

fun <TOuter, TInner, TKey, TResult> Array<TOuter>.groupJoin(
        inner: Array<TInner>,
        outerKeySelector: (TOuter) -> TKey,
        innerKeySelector: (TInner) -> TKey,
        resultSelector: (TOuter, Sequence<TInner>) -> TResult): Sequence<TResult> =
        asSequence().groupJoin(inner, outerKeySelector, innerKeySelector, resultSelector)

fun <TOuter, K, V, TKey, TResult> Array<TOuter>.groupJoin(
        inner: Map<K, V>,
        outerKeySelector: (TOuter) -> TKey,
        innerKeySelector: (Map.Entry<K, V>) -> TKey,
        resultSelector: (TOuter, Sequence<Map.Entry<K, V>>) -> TResult): Sequence<TResult> =
        asSequence().groupJoin(inner, outerKeySelector, innerKeySelector, resultSelector)

// for Map
fun <K, V, TInner, TKey, TResult> Map<K, V>.groupJoin(
        inner: Sequence<TInner>,
        outerKeySelector: (Map.Entry<K, V>) -> TKey,
        innerKeySelector: (TInner) -> TKey,
        resultSelector: (Map.Entry<K, V>, Sequence<TInner>) -> TResult): Sequence<TResult> =
        asSequence().groupJoin(inner, outerKeySelector, innerKeySelector, resultSelector)

fun <K, V, TInner, TKey, TResult> Map<K, V>.groupJoin(
        inner: Iterable<TInner>,
        outerKeySelector: (Map.Entry<K, V>) -> TKey,
        innerKeySelector: (TInner) -> TKey,
        resultSelector: (Map.Entry<K, V>, Sequence<TInner>) -> TResult): Sequence<TResult> =
        asSequence().groupJoin(inner, outerKeySelector, innerKeySelector, resultSelector)

fun <K, V, TInner, TKey, TResult> Map<K, V>.groupJoin(
        inner: Array<TInner>,
        outerKeySelector: (Map.Entry<K, V>) -> TKey,
        innerKeySelector: (TInner) -> TKey,
        resultSelector: (Map.Entry<K, V>, Sequence<TInner>) -> TResult): Sequence<TResult> =
        asSequence().groupJoin(inner, outerKeySelector, innerKeySelector, resultSelector)

fun <K0, V0, K1, V1, TKey, TResult> Map<K0, V0>.groupJoin(
        inner: Map<K1, V1>,
        outerKeySelector: (Map.Entry<K0, V0>) -> TKey,
        innerKeySelector: (Map.Entry<K1, V1>) -> TKey,
        resultSelector: (Map.Entry<K0, V0>, Sequence<Map.Entry<K1, V1>>) -> TResult): Sequence<TResult> =
        asSequence().groupJoin(inner, outerKeySelector, innerKeySelector, resultSelector)

@JvmName("groupJoins")
fun <TOuter, TInner, TKey, TResult> groupJoin(
        outer: Sequence<TOuter>,
        inner: Sequence<TInner>,
        outerKeySelector: (TOuter) -> TKey,
        innerKeySelector: (TInner) -> TKey,
        resultSelector: (TOuter, Sequence<TInner>) -> TResult): Sequence<TResult> {
    return Sequence {
        val innerLookup = inner.toLookup(innerKeySelector)
        outer.map { outerElement ->
            val key = outerKeySelector(outerElement)
            val innerElements = innerLookup[key]

            resultSelector(outerElement, innerElements)
        }.iterator()
    }
}

