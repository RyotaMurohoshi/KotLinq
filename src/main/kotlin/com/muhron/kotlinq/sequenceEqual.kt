package com.muhron.kotlinq

fun <T> Sequence<T>.sequenceEqual(second: Sequence<T>): Boolean {
    if (this === second) {
        return true
    }

    val firstIterator = this.iterator()
    val secondIterator = second.iterator()

    while (true) {
        val firstHasNext = firstIterator.hasNext()
        val secondHasNext = secondIterator.hasNext()

        if (firstHasNext && !secondHasNext || !firstHasNext && secondHasNext) {
            return false
        } else if (!firstHasNext && !secondHasNext) {
            break
        }

        val firstElement = firstIterator.next()
        val secondElement = secondIterator.next()

        if (firstElement != secondElement) {
            return false
        }
    }

    return true
}

fun <T> Sequence<T>.sequenceEqual(second: Iterable<T>): Boolean =
        sequenceEqual(second.asSequence())

fun <T> Sequence<T>.sequenceEqual(second: Array<T>): Boolean =
        sequenceEqual(second.asSequence())

fun <TSourceK, TSourceV> Sequence<Map.Entry<TSourceK, TSourceV>>.sequenceEqual(second: Map<TSourceK, TSourceV>): Boolean =
        sequenceEqual(second.asSequence())


fun <T> Iterable<T>.sequenceEqual(second: Sequence<T>): Boolean =
        asSequence().sequenceEqual(second.asSequence())

fun <T> Iterable<T>.sequenceEqual(second: Iterable<T>): Boolean =
        asSequence().sequenceEqual(second.asSequence())

fun <T> Iterable<T>.sequenceEqual(second: Array<T>): Boolean =
        asSequence().sequenceEqual(second.asSequence())

fun <TSourceK, TSourceV> Iterable<Map.Entry<TSourceK, TSourceV>>.sequenceEqual(second: Map<TSourceK, TSourceV>): Boolean =
        asSequence().sequenceEqual(second.asSequence())

fun <T> Array<T>.sequenceEqual(second: Sequence<T>): Boolean =
        asSequence().sequenceEqual(second.asSequence())

fun <T> Array<T>.sequenceEqual(second: Iterable<T>): Boolean =
        asSequence().sequenceEqual(second.asSequence())

fun <T> Array<T>.sequenceEqual(second: Array<T>): Boolean =
        sequenceEqual(second.asSequence())

fun <TSourceK, TSourceV> Array<Map.Entry<TSourceK, TSourceV>>.sequenceEqual(second: Map<TSourceK, TSourceV>): Boolean =
        asSequence().sequenceEqual(second.asSequence())

fun <TSourceK, TSourceV> Map<TSourceK, TSourceV>.sequenceEqual(second: Sequence<Map.Entry<TSourceK, TSourceV>>): Boolean =
        asSequence().sequenceEqual(second.asSequence())

fun <TSourceK, TSourceV> Map<TSourceK, TSourceV>.sequenceEqual(second: Iterable<Map.Entry<TSourceK, TSourceV>>): Boolean =
        asSequence().sequenceEqual(second.asSequence())

fun <TSourceK, TSourceV> Map<TSourceK, TSourceV>.sequenceEqual(second: Array<Map.Entry<TSourceK, TSourceV>>): Boolean =
        asSequence().sequenceEqual(second.asSequence())

fun <TSourceK, TSourceV> Map<TSourceK, TSourceV>.sequenceEqual(second: Map<TSourceK, TSourceV>): Boolean =
        asSequence().sequenceEqual(second.asSequence())
