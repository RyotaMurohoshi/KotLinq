package com.muhron.kotlinq


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
