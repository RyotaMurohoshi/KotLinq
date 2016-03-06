package com.muhron.kotlinq

interface IGrouping<K, E> : Sequence<E> {
    val key: K
}

interface ILookup<K, E> : Sequence<IGrouping<K, E>> {
    val count: Int
    operator fun get(key: K): Sequence<E>
    fun contains(key: K): Boolean
}
