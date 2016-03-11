package com.muhron.kotlinq

inline fun <reified TResult> Sequence<*>.ofType(): Sequence<TResult>
        = filterIsInstance<TResult>()

inline fun <reified TResult> Iterable<*>.ofType(): Sequence<TResult>
        = asSequence().ofType<TResult>()

inline fun <reified TResult> Array<*>.ofType(): Sequence<TResult>
        = asSequence().ofType<TResult>()

inline fun <reified TResult> Map<*, *>.ofType(): Sequence<TResult>
        = asSequence().ofType<TResult>()
