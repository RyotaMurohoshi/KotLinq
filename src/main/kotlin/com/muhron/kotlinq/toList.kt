package com.muhron.kotlinq

// Others have toList method.

fun <TSourceK, TSourceV> Map<TSourceK, TSourceV>.toList(): List<Map.Entry<TSourceK, TSourceV>> =
        asSequence().toList()
