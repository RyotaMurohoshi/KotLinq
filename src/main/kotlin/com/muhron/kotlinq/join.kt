package com.muhron.kotlinq

// TODO added second multi type
// for Sequence
fun <TOuter, TInner, TKey, TResult> Sequence<TOuter>.join(
        inner: Sequence<TInner>,
        outerKeySelector: (TOuter) -> TKey,
        innerKeySelector: (TInner) -> TKey,
        resultSelector: (TOuter, TInner) -> TResult): Sequence<TResult> =
        join(this, inner, outerKeySelector, innerKeySelector, resultSelector)

fun <TOuter, TInner, TKey, TResult> Sequence<TOuter>.join(
        inner: Iterable<TInner>,
        outerKeySelector: (TOuter) -> TKey,
        innerKeySelector: (TInner) -> TKey,
        resultSelector: (TOuter, TInner) -> TResult): Sequence<TResult> =
        join(this, inner.asSequence(), outerKeySelector, innerKeySelector, resultSelector)

fun <TOuter, TInner, TKey, TResult> Sequence<TOuter>.join(
        inner: Array<TInner>,
        outerKeySelector: (TOuter) -> TKey,
        innerKeySelector: (TInner) -> TKey,
        resultSelector: (TOuter, TInner) -> TResult): Sequence<TResult> =
        join(this, inner.asSequence(), outerKeySelector, innerKeySelector, resultSelector)

fun <TOuter, K, V, TKey, TResult> Sequence<TOuter>.join(
        inner: Map<K, V>,
        outerKeySelector: (TOuter) -> TKey,
        innerKeySelector: (Map.Entry<K, V>) -> TKey,
        resultSelector: (TOuter, Map.Entry<K, V>) -> TResult): Sequence<TResult> =
        join(this, inner.asSequence(), outerKeySelector, innerKeySelector, resultSelector)

// for Iterable
fun <TOuter, TInner, TKey, TResult> Iterable<TOuter>.join(
        inner: Sequence<TInner>,
        outerKeySelector: (TOuter) -> TKey,
        innerKeySelector: (TInner) -> TKey,
        resultSelector: (TOuter, TInner) -> TResult): Sequence<TResult> =
        asSequence().join(inner, outerKeySelector, innerKeySelector, resultSelector)

fun <TOuter, TInner, TKey, TResult> Iterable<TOuter>.join(
        inner: Iterable<TInner>,
        outerKeySelector: (TOuter) -> TKey,
        innerKeySelector: (TInner) -> TKey,
        resultSelector: (TOuter, TInner) -> TResult): Sequence<TResult> =
        asSequence().join(inner, outerKeySelector, innerKeySelector, resultSelector)

fun <TOuter, TInner, TKey, TResult> Iterable<TOuter>.join(
        inner: Array<TInner>,
        outerKeySelector: (TOuter) -> TKey,
        innerKeySelector: (TInner) -> TKey,
        resultSelector: (TOuter, TInner) -> TResult): Sequence<TResult> =
        asSequence().join(inner, outerKeySelector, innerKeySelector, resultSelector)

fun <TOuter, K, V, TKey, TResult> Iterable<TOuter>.join(
        inner: Map<K, V>,
        outerKeySelector: (TOuter) -> TKey,
        innerKeySelector: (Map.Entry<K, V>) -> TKey,
        resultSelector: (TOuter, Map.Entry<K, V>) -> TResult): Sequence<TResult> =
        asSequence().join(inner, outerKeySelector, innerKeySelector, resultSelector)

// for Array
fun <TOuter, TInner, TKey, TResult> Array<TOuter>.join(
        inner: Sequence<TInner>,
        outerKeySelector: (TOuter) -> TKey,
        innerKeySelector: (TInner) -> TKey,
        resultSelector: (TOuter, TInner) -> TResult): Sequence<TResult> =
        asSequence().join(inner, outerKeySelector, innerKeySelector, resultSelector)

fun <TOuter, TInner, TKey, TResult> Array<TOuter>.join(
        inner: Iterable<TInner>,
        outerKeySelector: (TOuter) -> TKey,
        innerKeySelector: (TInner) -> TKey,
        resultSelector: (TOuter, TInner) -> TResult): Sequence<TResult> =
        asSequence().join(inner, outerKeySelector, innerKeySelector, resultSelector)

fun <TOuter, TInner, TKey, TResult> Array<TOuter>.join(
        inner: Array<TInner>,
        outerKeySelector: (TOuter) -> TKey,
        innerKeySelector: (TInner) -> TKey,
        resultSelector: (TOuter, TInner) -> TResult): Sequence<TResult> =
        asSequence().join(inner, outerKeySelector, innerKeySelector, resultSelector)

fun <TOuter, K, V, TKey, TResult> Array<TOuter>.join(
        inner: Map<K, V>,
        outerKeySelector: (TOuter) -> TKey,
        innerKeySelector: (Map.Entry<K, V>) -> TKey,
        resultSelector: (TOuter, Map.Entry<K, V>) -> TResult): Sequence<TResult> =
        asSequence().join(inner, outerKeySelector, innerKeySelector, resultSelector)

// for Map
fun <K, V, TInner, TKey, TResult> Map<K, V>.join(
        inner: Sequence<TInner>,
        outerKeySelector: (Map.Entry<K, V>) -> TKey,
        innerKeySelector: (TInner) -> TKey,
        resultSelector: (Map.Entry<K, V>, TInner) -> TResult): Sequence<TResult> =
        asSequence().join(inner, outerKeySelector, innerKeySelector, resultSelector)

fun <K, V, TInner, TKey, TResult> Map<K, V>.join(
        inner: Iterable<TInner>,
        outerKeySelector: (Map.Entry<K, V>) -> TKey,
        innerKeySelector: (TInner) -> TKey,
        resultSelector: (Map.Entry<K, V>, TInner) -> TResult): Sequence<TResult> =
        asSequence().join(inner, outerKeySelector, innerKeySelector, resultSelector)

fun <K, V, TInner, TKey, TResult> Map<K, V>.join(
        inner: Array<TInner>,
        outerKeySelector: (Map.Entry<K, V>) -> TKey,
        innerKeySelector: (TInner) -> TKey,
        resultSelector: (Map.Entry<K, V>, TInner) -> TResult): Sequence<TResult> =
        asSequence().join(inner, outerKeySelector, innerKeySelector, resultSelector)

fun <K0, V0, K1, V1, TKey, TResult> Map<K0, V0>.join(
        inner: Map<K1, V1>,
        outerKeySelector: (Map.Entry<K0, V0>) -> TKey,
        innerKeySelector: (Map.Entry<K1, V1>) -> TKey,
        resultSelector: (Map.Entry<K0, V0>, Map.Entry<K1, V1>) -> TResult): Sequence<TResult> =
        asSequence().join(inner, outerKeySelector, innerKeySelector, resultSelector)

@JvmName("joins")
fun <TOuter, TInner, TKey, TResult> join(
        outer: Sequence<TOuter>,
        inner: Sequence<TInner>,
        outerKeySelector: (TOuter) -> TKey,
        innerKeySelector: (TInner) -> TKey,
        resultSelector: (TOuter, TInner) -> TResult): Sequence<TResult> {
    return Sequence {
        val innerLookup = inner.toLookup(innerKeySelector)
        outer.flatMap { outerElement ->
            val key = outerKeySelector(outerElement)
            val innerElements = innerLookup[key]

            innerElements.map { innerElement -> resultSelector(outerElement, innerElement) }
        }.iterator()
    }
}
