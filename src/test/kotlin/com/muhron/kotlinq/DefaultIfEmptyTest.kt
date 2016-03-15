package com.muhron.kotlinq

import org.junit.Assert
import org.junit.Test

class DefaultIfEmptyTest {
    @Test
    fun test0() {
        val result = sequenceOf(1, 2, 3).defaultIfEmpty(0).toList()
        Assert.assertEquals(result, listOf(1, 2, 3))
    }

    @Test
    fun test1() {
        val result = emptySequence<Int>().defaultIfEmpty(0).toList()
        Assert.assertEquals(result, listOf(0))
    }

    @Test
    fun test2() {
        val result = sequenceOf(1, 2, 3).defaultIfEmpty().toList()
        Assert.assertEquals(result, listOf(1, 2, 3))
    }

    @Test
    fun test3() {
        val result = emptySequence<Int?>().defaultIfEmpty().toList()
        Assert.assertEquals(result, listOf(null))
    }

    @Test
    fun testNoThrownException1() {
        exceptionSequence<Int>().defaultIfEmpty()
        exceptionSequence<Int>().defaultIfEmpty(1)
    }
}
