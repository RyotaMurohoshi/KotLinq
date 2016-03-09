package com.muhron.kotlinq

inline fun <reified TResult> Sequence<*>.cast(): Sequence<TResult> = Sequence {
    map {
        require(it is TResult) { "cast faield." }
        it as TResult
    }.iterator()
}

inline fun <reified TResult> Iterable<*>.cast(): Sequence<TResult>
        = asSequence().cast<TResult>()

inline fun <reified TResult> Array<*>.cast(): Sequence<TResult>
        = asSequence().cast<TResult>()

inline fun <reified TResult> Map<*, *>.cast(): Sequence<TResult>
        = asSequence().cast<TResult>()
