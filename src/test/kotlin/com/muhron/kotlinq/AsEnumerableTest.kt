package com.muhron.kotlinq

import org.junit.Assert
import org.junit.Test

class AsEnumerableTest {

    @Test
    fun test0() {
        val result: List<Any> = sequenceOf(1, 2, 3).asEnumerable<Any>().toList()
        Assert.assertEquals(result, listOf<Any>(1, 2, 3))
    }

    @Test
    fun testNoThrownException() {
        exceptionSequence<Int>().asEnumerable<Any>()
    }
}
