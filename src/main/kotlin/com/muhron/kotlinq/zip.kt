package com.muhron.kotlinq

import com.muhron.kotlinq.inner.Zipper

// for Sequence
fun <TFirst, TSecond, TResult> Sequence<TFirst>.zip(second: Sequence<TSecond>, resultSelector: (TFirst, TSecond) -> TResult): Sequence<TResult> =
        Zipper.zip(this, second, resultSelector)

fun <TFirst, TSecond, TResult> Sequence<TFirst>.zip(second: Iterable<TSecond>, resultSelector: (TFirst, TSecond) -> TResult): Sequence<TResult> =
        Zipper.zip(this, second.asSequence(), resultSelector)

fun <TFirst, TSecond, TResult> Sequence<TFirst>.zip(second: Array<TSecond>, resultSelector: (TFirst, TSecond) -> TResult): Sequence<TResult> =
        Zipper.zip(this, second.asSequence(), resultSelector)

fun <TFirst, K, V, TResult> Sequence<TFirst>.zip(second: Map<K, V>, resultSelector: (TFirst, Map.Entry<K, V>) -> TResult): Sequence<TResult> =
        Zipper.zip(this, second.asSequence(), resultSelector)

// for Iterable
fun <TFirst, TSecond, TResult> Iterable<TFirst>.zip(second: Sequence<TSecond>, resultSelector: (TFirst, TSecond) -> TResult): Sequence<TResult> =
        asSequence().zip(second, resultSelector)

fun <TFirst, TSecond, TResult> Iterable<TFirst>.zip(second: Iterable<TSecond>, resultSelector: (TFirst, TSecond) -> TResult): Sequence<TResult> =
        asSequence().zip(second, resultSelector)

fun <TFirst, TSecond, TResult> Iterable<TFirst>.zip(second: Array<TSecond>, resultSelector: (TFirst, TSecond) -> TResult): Sequence<TResult> =
        asSequence().zip(second, resultSelector)

fun <TFirst, K, V, TResult> Iterable<TFirst>.zip(second: Map<K, V>, resultSelector: (TFirst, Map.Entry<K, V>) -> TResult): Sequence<TResult> =
        asSequence().zip(second, resultSelector)

// for Array
fun <TFirst, TSecond, TResult> Array<TFirst>.zip(second: Sequence<TSecond>, resultSelector: (TFirst, TSecond) -> TResult): Sequence<TResult> =
        asSequence().zip(second, resultSelector)

fun <TFirst, TSecond, TResult> Array<TFirst>.zip(second: Iterable<TSecond>, resultSelector: (TFirst, TSecond) -> TResult): Sequence<TResult> =
        asSequence().zip(second, resultSelector)

fun <TFirst, TSecond, TResult> Array<TFirst>.zip(second: Array<TSecond>, resultSelector: (TFirst, TSecond) -> TResult): Sequence<TResult> =
        asSequence().zip(second, resultSelector)

fun <TFirst, K, V, TResult> Array<TFirst>.zip(second: Map<K, V>, resultSelector: (TFirst, Map.Entry<K, V>) -> TResult): Sequence<TResult> =
        asSequence().zip(second, resultSelector)

// for Map
fun <K, V, TSecond, TResult> Map<K, V>.zip(second: Sequence<TSecond>, resultSelector: (Map.Entry<K, V>, TSecond) -> TResult): Sequence<TResult> =
        asSequence().zip(second, resultSelector)

fun <K, V, TSecond, TResult> Map<K, V>.zip(second: Iterable<TSecond>, resultSelector: (Map.Entry<K, V>, TSecond) -> TResult): Sequence<TResult> =
        asSequence().zip(second, resultSelector)

fun <K, V, TSecond, TResult> Map<K, V>.zip(second: Array<TSecond>, resultSelector: (Map.Entry<K, V>, TSecond) -> TResult): Sequence<TResult> =
        asSequence().zip(second, resultSelector)

fun <K0, V0, K1, V1, TResult> Map<K0, V0>.zip(second: Map<K1, V1>, resultSelector: (Map.Entry<K0, V0>, Map.Entry<K1, V1>) -> TResult): Sequence<TResult> =
        asSequence().zip(second, resultSelector)

