package com.muhron.kotlinq.inner

internal object Zipper {
    fun <TFirst, TSecond, TResult> zip(first: Sequence<TFirst>, second: Sequence<TSecond>, resultSelector: (TFirst, TSecond) -> TResult): Sequence<TResult>
            = first.zip(second, resultSelector)
}