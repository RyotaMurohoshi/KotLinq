package com.muhron.kotlinq

// elementAt() methods are implemented in kotlin.collections or kotlin.sequences
// without Map<TSourceK,  TSourceV>.

fun <TSourceK, TSourceV> Map<TSourceK, TSourceV>.elementAt(index: Int): Map.Entry<TSourceK, TSourceV> = asSequence().elementAt(index)
