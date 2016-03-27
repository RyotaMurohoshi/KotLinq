package com.muhron.kotlinq

import com.muhron.kotlinq.inner.Zipper

// for Sequence
fun <TFirst, TSecond, TResult> Sequence<TFirst>.zip(second: Sequence<TSecond>, resultSelector: (TFirst, TSecond) -> TResult): Sequence<TResult> =
        Zipper.zip(this, second, resultSelector)

fun <TFirst, TSecond, TResult> Sequence<TFirst>.zip(second: Iterable<TSecond>, resultSelector: (TFirst, TSecond) -> TResult): Sequence<TResult> =
        Zipper.zip(this, second.asSequence(), resultSelector)

fun <TFirst, TSecond, TResult> Sequence<TFirst>.zip(second: Array<TSecond>, resultSelector: (TFirst, TSecond) -> TResult): Sequence<TResult> =
        Zipper.zip(this, second.asSequence(), resultSelector)

fun <TFirst, TSourceK, TSourceV, TResult> Sequence<TFirst>.zip(second: Map<TSourceK, TSourceV>, resultSelector: (TFirst, Map.Entry<TSourceK, TSourceV>) -> TResult): Sequence<TResult> =
        Zipper.zip(this, second.asSequence(), resultSelector)

// for Iterable
fun <TFirst, TSecond, TResult> Iterable<TFirst>.zip(second: Sequence<TSecond>, resultSelector: (TFirst, TSecond) -> TResult): Sequence<TResult> =
        asSequence().zip(second, resultSelector)

fun <TFirst, TSecond, TResult> Iterable<TFirst>.zip(second: Iterable<TSecond>, resultSelector: (TFirst, TSecond) -> TResult): Sequence<TResult> =
        asSequence().zip(second, resultSelector)

fun <TFirst, TSecond, TResult> Iterable<TFirst>.zip(second: Array<TSecond>, resultSelector: (TFirst, TSecond) -> TResult): Sequence<TResult> =
        asSequence().zip(second, resultSelector)

fun <TFirst, TSourceK, TSourceV, TResult> Iterable<TFirst>.zip(second: Map<TSourceK, TSourceV>, resultSelector: (TFirst, Map.Entry<TSourceK, TSourceV>) -> TResult): Sequence<TResult> =
        asSequence().zip(second, resultSelector)

// for Array
fun <TFirst, TSecond, TResult> Array<TFirst>.zip(second: Sequence<TSecond>, resultSelector: (TFirst, TSecond) -> TResult): Sequence<TResult> =
        asSequence().zip(second, resultSelector)

fun <TFirst, TSecond, TResult> Array<TFirst>.zip(second: Iterable<TSecond>, resultSelector: (TFirst, TSecond) -> TResult): Sequence<TResult> =
        asSequence().zip(second, resultSelector)

fun <TFirst, TSecond, TResult> Array<TFirst>.zip(second: Array<TSecond>, resultSelector: (TFirst, TSecond) -> TResult): Sequence<TResult> =
        asSequence().zip(second, resultSelector)

fun <TFirst, TSourceK, TSourceV, TResult> Array<TFirst>.zip(second: Map<TSourceK, TSourceV>, resultSelector: (TFirst, Map.Entry<TSourceK, TSourceV>) -> TResult): Sequence<TResult> =
        asSequence().zip(second, resultSelector)

// for Map
fun <TSourceK, TSourceV, TSecond, TResult> Map<TSourceK, TSourceV>.zip(second: Sequence<TSecond>, resultSelector: (Map.Entry<TSourceK, TSourceV>, TSecond) -> TResult): Sequence<TResult> =
        asSequence().zip(second, resultSelector)

fun <TSourceK, TSourceV, TSecond, TResult> Map<TSourceK, TSourceV>.zip(second: Iterable<TSecond>, resultSelector: (Map.Entry<TSourceK, TSourceV>, TSecond) -> TResult): Sequence<TResult> =
        asSequence().zip(second, resultSelector)

fun <TSourceK, TSourceV, TSecond, TResult> Map<TSourceK, TSourceV>.zip(second: Array<TSecond>, resultSelector: (Map.Entry<TSourceK, TSourceV>, TSecond) -> TResult): Sequence<TResult> =
        asSequence().zip(second, resultSelector)

fun <TFirstK, TFirstV, TSecondK, TSecondV, TResult> Map<TFirstK, TFirstV>.zip(second: Map<TSecondK, TSecondV>, resultSelector: (Map.Entry<TFirstK, TFirstV>, Map.Entry<TSecondK, TSecondV>) -> TResult): Sequence<TResult> =
        asSequence().zip(second, resultSelector)

