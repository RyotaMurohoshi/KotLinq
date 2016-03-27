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

fun <TOuter, TOuterK, TOuterV, TKey, TResult> Sequence<TOuter>.groupJoin(
        inner: Map<TOuterK, TOuterV>,
        outerKeySelector: (TOuter) -> TKey,
        innerKeySelector: (Map.Entry<TOuterK, TOuterV>) -> TKey,
        resultSelector: (TOuter, Sequence<Map.Entry<TOuterK, TOuterV>>) -> TResult): Sequence<TResult> =
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

fun <TOuter, TOuterK, TOuterV, TKey, TResult> Iterable<TOuter>.groupJoin(
        inner: Map<TOuterK, TOuterV>,
        outerKeySelector: (TOuter) -> TKey,
        innerKeySelector: (Map.Entry<TOuterK, TOuterV>) -> TKey,
        resultSelector: (TOuter, Sequence<Map.Entry<TOuterK, TOuterV>>) -> TResult): Sequence<TResult> =
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

fun <TOuter, TOuterK, TOuterV, TKey, TResult> Array<TOuter>.groupJoin(
        inner: Map<TOuterK, TOuterV>,
        outerKeySelector: (TOuter) -> TKey,
        innerKeySelector: (Map.Entry<TOuterK, TOuterV>) -> TKey,
        resultSelector: (TOuter, Sequence<Map.Entry<TOuterK, TOuterV>>) -> TResult): Sequence<TResult> =
        asSequence().groupJoin(inner, outerKeySelector, innerKeySelector, resultSelector)

// for Map
fun <TOuterK, TOuterV, TInner, TKey, TResult> Map<TOuterK, TOuterV>.groupJoin(
        inner: Sequence<TInner>,
        outerKeySelector: (Map.Entry<TOuterK, TOuterV>) -> TKey,
        innerKeySelector: (TInner) -> TKey,
        resultSelector: (Map.Entry<TOuterK, TOuterV>, Sequence<TInner>) -> TResult): Sequence<TResult> =
        asSequence().groupJoin(inner, outerKeySelector, innerKeySelector, resultSelector)

fun <TOuterK, TOuterV, TInner, TKey, TResult> Map<TOuterK, TOuterV>.groupJoin(
        inner: Iterable<TInner>,
        outerKeySelector: (Map.Entry<TOuterK, TOuterV>) -> TKey,
        innerKeySelector: (TInner) -> TKey,
        resultSelector: (Map.Entry<TOuterK, TOuterV>, Sequence<TInner>) -> TResult): Sequence<TResult> =
        asSequence().groupJoin(inner, outerKeySelector, innerKeySelector, resultSelector)

fun <TOuterK, TOuterV, TInner, TKey, TResult> Map<TOuterK, TOuterV>.groupJoin(
        inner: Array<TInner>,
        outerKeySelector: (Map.Entry<TOuterK, TOuterV>) -> TKey,
        innerKeySelector: (TInner) -> TKey,
        resultSelector: (Map.Entry<TOuterK, TOuterV>, Sequence<TInner>) -> TResult): Sequence<TResult> =
        asSequence().groupJoin(inner, outerKeySelector, innerKeySelector, resultSelector)

fun <TOuterK, TOuterV, TInnerK, TInnerV, TKey, TResult> Map<TOuterK, TOuterV>.groupJoin(
        inner: Map<TInnerK, TInnerV>,
        outerKeySelector: (Map.Entry<TOuterK, TOuterV>) -> TKey,
        innerKeySelector: (Map.Entry<TInnerK, TInnerV>) -> TKey,
        resultSelector: (Map.Entry<TOuterK, TOuterV>, Sequence<Map.Entry<TInnerK, TInnerV>>) -> TResult): Sequence<TResult> =
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

