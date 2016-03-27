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

fun <TOuter, TOuterK, TOuterV, TKey, TResult> Sequence<TOuter>.join(
        inner: Map<TOuterK, TOuterV>,
        outerKeySelector: (TOuter) -> TKey,
        innerKeySelector: (Map.Entry<TOuterK, TOuterV>) -> TKey,
        resultSelector: (TOuter, Map.Entry<TOuterK, TOuterV>) -> TResult): Sequence<TResult> =
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

fun <TOuter, TOuterK, TOuterV, TKey, TResult> Iterable<TOuter>.join(
        inner: Map<TOuterK, TOuterV>,
        outerKeySelector: (TOuter) -> TKey,
        innerKeySelector: (Map.Entry<TOuterK, TOuterV>) -> TKey,
        resultSelector: (TOuter, Map.Entry<TOuterK, TOuterV>) -> TResult): Sequence<TResult> =
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

fun <TOuter, TOuterK, TOuterV, TKey, TResult> Array<TOuter>.join(
        inner: Map<TOuterK, TOuterV>,
        outerKeySelector: (TOuter) -> TKey,
        innerKeySelector: (Map.Entry<TOuterK, TOuterV>) -> TKey,
        resultSelector: (TOuter, Map.Entry<TOuterK, TOuterV>) -> TResult): Sequence<TResult> =
        asSequence().join(inner, outerKeySelector, innerKeySelector, resultSelector)

// for Map
fun <TOuterK, TOuterV, TInner, TKey, TResult> Map<TOuterK, TOuterV>.join(
        inner: Sequence<TInner>,
        outerKeySelector: (Map.Entry<TOuterK, TOuterV>) -> TKey,
        innerKeySelector: (TInner) -> TKey,
        resultSelector: (Map.Entry<TOuterK, TOuterV>, TInner) -> TResult): Sequence<TResult> =
        asSequence().join(inner, outerKeySelector, innerKeySelector, resultSelector)

fun <TOuterK, TOuterV, TInner, TKey, TResult> Map<TOuterK, TOuterV>.join(
        inner: Iterable<TInner>,
        outerKeySelector: (Map.Entry<TOuterK, TOuterV>) -> TKey,
        innerKeySelector: (TInner) -> TKey,
        resultSelector: (Map.Entry<TOuterK, TOuterV>, TInner) -> TResult): Sequence<TResult> =
        asSequence().join(inner, outerKeySelector, innerKeySelector, resultSelector)

fun <TOuterK, TOuterV, TInner, TKey, TResult> Map<TOuterK, TOuterV>.join(
        inner: Array<TInner>,
        outerKeySelector: (Map.Entry<TOuterK, TOuterV>) -> TKey,
        innerKeySelector: (TInner) -> TKey,
        resultSelector: (Map.Entry<TOuterK, TOuterV>, TInner) -> TResult): Sequence<TResult> =
        asSequence().join(inner, outerKeySelector, innerKeySelector, resultSelector)

fun <TOuterK, TOuterV, TInnerK, TInnerV, TKey, TResult> Map<TOuterK, TOuterV>.join(
        inner: Map<TInnerK, TInnerV>,
        outerKeySelector: (Map.Entry<TOuterK, TOuterV>) -> TKey,
        innerKeySelector: (Map.Entry<TInnerK, TInnerV>) -> TKey,
        resultSelector: (Map.Entry<TOuterK, TOuterV>, Map.Entry<TInnerK, TInnerV>) -> TResult): Sequence<TResult> =
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
