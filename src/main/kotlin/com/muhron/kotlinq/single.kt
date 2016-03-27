package com.muhron.kotlinq

fun <TSourceK, TSourceV> Map<TSourceK, TSourceV>.single(): Map.Entry<TSourceK, TSourceV> =
        asSequence().single()

inline fun <TSourceK, TSourceV> Map<TSourceK, TSourceV>.single(predicate: (Map.Entry<TSourceK, TSourceV>) -> Boolean): Map.Entry<TSourceK, TSourceV> =
        asSequence().single(predicate)
