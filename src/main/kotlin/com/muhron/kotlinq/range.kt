package com.muhron.kotlinq

fun range(start: Int, count: Int): Sequence<Int> {

    notIndexOutOfBounds(count < 0) { "count must be 0 or positeve." }

    val lastInclusiveL: Long = 0L + start + count - 1
    notIndexOutOfBounds(lastInclusiveL > Int.MAX_VALUE) { "'start + count -1' must be equals or smaller Int.MAX_VALUE" }

    val lastInclusive = start + count - 1
    val isLastIsMaxValue = lastInclusive == Int.MAX_VALUE

    fun nextFunction(prevValue: Int): Int? {
        if (isLastIsMaxValue && prevValue == Int.MAX_VALUE) {
            return null
        }

        return if (prevValue + 1 <= lastInclusive) prevValue + 1 else null
    }

    return generateSequence(
            seedFunction = { if (start <= lastInclusive) start else null },
            nextFunction = { it -> nextFunction(it) }
    )
}
