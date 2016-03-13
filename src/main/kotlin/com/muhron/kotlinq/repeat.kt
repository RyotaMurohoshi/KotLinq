package com.muhron.kotlinq

fun<TResult> repeat(element: TResult, count: Int): Sequence<TResult> {
    notIndexOutOfBounds(count < 0) { "count must be 0 or positeve." }

    return range(0, count).map { element }
}
