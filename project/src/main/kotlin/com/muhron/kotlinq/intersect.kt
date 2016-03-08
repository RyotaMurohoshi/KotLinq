package com.muhron.kotlinq

// for Sequence.
fun <T> Sequence<T>.intersect(second: Sequence<T>): Sequence<T> =
        Sequence {
            val set = second.toMutableSet()
            filter { set.remove(it) }.iterator()
        }

fun <T> Sequence<T>.intersect(second: Iterable<T>): Sequence<T> =
        Sequence {
            val set = second.toMutableSet()
            filter { set.remove(it) }.iterator()
        }

fun <T> Sequence<T>.intersect(second: Array<T>): Sequence<T> =
        Sequence {
            val set = second.toMutableSet()
            filter { set.remove(it) }.iterator()
        }

fun <K, V> Sequence<Map.Entry<K, V>>.intersect(second: Map<K, V>): Sequence<Map.Entry<K, V>> =
        Sequence {
            val set: MutableSet<Map.Entry<K, V>> = second.asSequence().toMutableSet()
            filter { set.remove(it) }.iterator()
        }

// for Iterable.
fun <T> Iterable<T>.intersect(second: Sequence<T>): Sequence<T> =
        Sequence {
            val set = second.toMutableSet()
            filter { set.remove(it) }.iterator()
        }

fun <T> Iterable<T>.intersect(second: Iterable<T>): Sequence<T> =
        Sequence {
            val set = second.toMutableSet()
            filter { set.remove(it) }.iterator()
        }

fun <T> Iterable<T>.intersect(second: Array<T>): Sequence<T> =
        Sequence {
            val set = second.toMutableSet()
            filter { set.remove(it) }.iterator()
        }

fun <K, V> Iterable<Map.Entry<K, V>>.intersect(second: Map<K, V>): Sequence<Map.Entry<K, V>> =
        Sequence {
            val set: MutableSet<Map.Entry<K, V>> = second.asSequence().toMutableSet()
            filter { set.remove(it) }.iterator()
        }

// for Array.
fun <T> Array<T>.intersect(second: Sequence<T>): Sequence<T> =
        Sequence {
            val set = second.toMutableSet()
            filter { set.remove(it) }.iterator()
        }

fun <T> Array<T>.intersect(second: Iterable<T>): Sequence<T> =
        Sequence {
            val set = second.toMutableSet()
            filter { set.remove(it) }.iterator()
        }

fun <T> Array<T>.intersect(second: Array<T>): Sequence<T> =
        Sequence {
            val set = second.toMutableSet()
            filter { set.remove(it) }.iterator()
        }

fun <K, V> Array<Map.Entry<K, V>>.intersect(second: Map<K, V>): Sequence<Map.Entry<K, V>> =
        Sequence {
            val set: MutableSet<Map.Entry<K, V>> = second.asSequence().toMutableSet()
            filter { set.remove(it) }.iterator()
        }

// for Map
fun <K, V> Map<K, V>.intersect(second: Sequence<Map.Entry<K, V>>): Sequence<Map.Entry<K, V>> =
        Sequence {
            val set = second.toMutableSet()
            filter { set.remove(it) }.iterator()
        }

fun <K, V> Map<K, V>.intersect(second: Iterable<Map.Entry<K, V>>): Sequence<Map.Entry<K, V>> =
        Sequence {
            val set = second.toMutableSet()
            filter { set.remove(it) }.iterator()
        }

fun <K, V> Map<K, V>.intersect(second: Array<Map.Entry<K, V>>): Sequence<Map.Entry<K, V>> =
        Sequence {
            val set = second.toMutableSet()
            filter { set.remove(it) }.iterator()
        }

fun <K, V> Map<K, V>.intersect(second: Map<K, V>): Sequence<Map.Entry<K, V>> =
        Sequence {
            val set: MutableSet<Map.Entry<K, V>> = second.asSequence().toMutableSet()
            filter { set.remove(it) }.iterator()
        }
