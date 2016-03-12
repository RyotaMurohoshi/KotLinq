package com.muhron.kotlinq

fun<T> repeat(element: T, count: Int): Sequence<T> {
    notIndexOutOfBounds(count < 0) { "count must be 0 or positeve." }

    return range(0, count).map { element }
}
