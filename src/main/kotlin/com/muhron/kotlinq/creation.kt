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

fun range(start: Int, count: Int): Sequence<Int> {
    require(count >= 0, { "count value must be positive or 0." })

    val lastInclusive = start + count - 1

    return generateSequence(
            seedFunction = { if (start <= lastInclusive) start else null },
            nextFunction = { n -> if (n + 1 <= lastInclusive) n + 1 else null }
    )
}

fun<T> repeat(element: T, count: Int): Sequence<T> {
    require(count >= 0, { "count value must be positive or 0." })

    return range(0, count).map { element }
}
