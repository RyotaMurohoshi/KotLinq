package com.muhron.kotlinq

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

