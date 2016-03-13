package com.muhron.kotlinq

// for Sequence.
inline fun <TSource> Sequence<TSource>.intersect(second: Sequence<TSource>): Sequence<TSource> =
        Sequence {
            val set = second.toMutableSet()
            filter { set.remove(it) }.iterator()
        }

inline fun <TSource> Sequence<TSource>.intersect(second: Iterable<TSource>): Sequence<TSource> =
        Sequence {
            val set = second.toMutableSet()
            filter { set.remove(it) }.iterator()
        }

inline fun <TSource> Sequence<TSource>.intersect(second: Array<TSource>): Sequence<TSource> =
        Sequence {
            val set = second.toMutableSet()
            filter { set.remove(it) }.iterator()
        }

inline fun <K, V> Sequence<Map.Entry<K, V>>.intersect(second: Map<K, V>): Sequence<Map.Entry<K, V>> =
        Sequence {
            val set: MutableSet<Map.Entry<K, V>> = second.asSequence().toMutableSet()
            filter { set.remove(it) }.iterator()
        }

// for Iterable.
inline fun <TSource> Iterable<TSource>.intersect(second: Sequence<TSource>): Sequence<TSource> =
        Sequence {
            val set = second.toMutableSet()
            filter { set.remove(it) }.iterator()
        }

inline fun <TSource> Iterable<TSource>.intersect(second: Iterable<TSource>): Sequence<TSource> =
        Sequence {
            val set = second.toMutableSet()
            filter { set.remove(it) }.iterator()
        }

inline fun <TSource> Iterable<TSource>.intersect(second: Array<TSource>): Sequence<TSource> =
        Sequence {
            val set = second.toMutableSet()
            filter { set.remove(it) }.iterator()
        }

inline fun <K, V> Iterable<Map.Entry<K, V>>.intersect(second: Map<K, V>): Sequence<Map.Entry<K, V>> =
        Sequence {
            val set: MutableSet<Map.Entry<K, V>> = second.asSequence().toMutableSet()
            filter { set.remove(it) }.iterator()
        }

// for Array.
inline fun <TSource> Array<TSource>.intersect(second: Sequence<TSource>): Sequence<TSource> =
        Sequence {
            val set = second.toMutableSet()
            filter { set.remove(it) }.iterator()
        }

inline fun <TSource> Array<TSource>.intersect(second: Iterable<TSource>): Sequence<TSource> =
        Sequence {
            val set = second.toMutableSet()
            filter { set.remove(it) }.iterator()
        }

inline fun <TSource> Array<TSource>.intersect(second: Array<TSource>): Sequence<TSource> =
        Sequence {
            val set = second.toMutableSet()
            filter { set.remove(it) }.iterator()
        }

inline fun <K, V> Array<Map.Entry<K, V>>.intersect(second: Map<K, V>): Sequence<Map.Entry<K, V>> =
        Sequence {
            val set: MutableSet<Map.Entry<K, V>> = second.asSequence().toMutableSet()
            filter { set.remove(it) }.iterator()
        }

// for Map
inline fun <K, V> Map<K, V>.intersect(second: Sequence<Map.Entry<K, V>>): Sequence<Map.Entry<K, V>> =
        Sequence {
            val set = second.toMutableSet()
            filter { set.remove(it) }.iterator()
        }

inline fun <K, V> Map<K, V>.intersect(second: Iterable<Map.Entry<K, V>>): Sequence<Map.Entry<K, V>> =
        Sequence {
            val set = second.toMutableSet()
            filter { set.remove(it) }.iterator()
        }

inline fun <K, V> Map<K, V>.intersect(second: Array<Map.Entry<K, V>>): Sequence<Map.Entry<K, V>> =
        Sequence {
            val set = second.toMutableSet()
            filter { set.remove(it) }.iterator()
        }

inline fun <K, V> Map<K, V>.intersect(second: Map<K, V>): Sequence<Map.Entry<K, V>> =
        Sequence {
            val set: MutableSet<Map.Entry<K, V>> = second.asSequence().toMutableSet()
            filter { set.remove(it) }.iterator()
        }
