package com.muhron.kotlinq

// first() and <T> first(predicate : (T) -> Boolean) methods are implemented in kotlin.collections or kotlin.sequences
// without Map<TSourceK,  TSourceV>.

fun <TSourceK, TSourceV> Map<TSourceK, TSourceV>.last() =
        asSequence().last()

inline fun <TSourceK, TSourceV> Map<TSourceK, TSourceV>.last(predicate: (Map.Entry<TSourceK, TSourceV>) -> Boolean) =
        asSequence().last(predicate)
