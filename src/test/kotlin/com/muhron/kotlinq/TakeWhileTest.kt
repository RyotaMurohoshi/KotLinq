package com.muhron.kotlinq

import org.junit.Assert
import org.junit.Test

class TakeWhileTest {

    @Test
    fun test() {
        val result = sequenceOf(1, 2, 3, 4, 5).takeWhile { it <= 3 }.toList()
        Assert.assertEquals(result, listOf(1, 2, 3))
    }

    @Test
    fun testNoThrownException() {
        exceptionSequence<Int>().takeWhile { true }
    }
}
