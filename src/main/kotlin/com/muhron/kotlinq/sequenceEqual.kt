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

fun <K, V> Sequence<Map.Entry<K, V>>.sequenceEqual(second: Map<K, V>): Boolean =
        sequenceEqual(second.asSequence())


fun <T> Iterable<T>.sequenceEqual(second: Sequence<T>): Boolean =
        sequenceEqual(second.asSequence())

fun <T> Iterable<T>.sequenceEqual(second: Iterable<T>): Boolean =
        sequenceEqual(second.asSequence())

fun <T> Iterable<T>.sequenceEqual(second: Array<T>): Boolean =
        sequenceEqual(second.asSequence())

fun <K, V> Iterable<Map.Entry<K, V>>.sequenceEqual(second: Map<K, V>): Boolean =
        sequenceEqual(second.asSequence())

fun <T> Array<T>.sequenceEqual(second: Sequence<T>): Boolean =
        sequenceEqual(second.asSequence())

fun <T> Array<T>.sequenceEqual(second: Iterable<T>): Boolean =
        sequenceEqual(second.asSequence())

fun <T> Array<T>.sequenceEqual(second: Array<T>): Boolean =
        sequenceEqual(second.asSequence())

fun <K, V> Array<Map.Entry<K, V>>.sequenceEqual(second: Map<K, V>): Boolean =
        sequenceEqual(second.asSequence())

fun <K, V> Map<K, V>.sequenceEqual(second: Sequence<Map.Entry<K, V>>): Boolean =
        sequenceEqual(second.asSequence())

fun <K, V> Map<K, V>.sequenceEqual(second: Iterable<Map.Entry<K, V>>): Boolean =
        sequenceEqual(second.asSequence())

fun <K, V> Map<K, V>.sequenceEqual(second: Array<Map.Entry<K, V>>): Boolean =
        sequenceEqual(second.asSequence())

fun <K, V> Map<K, V>.sequenceEqual(second: Map<K, V>): Boolean =
        sequenceEqual(second.asSequence())
