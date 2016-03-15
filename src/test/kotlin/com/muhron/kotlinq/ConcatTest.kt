package com.muhron.kotlinq

import org.junit.Assert
import org.junit.Test

class ConcatTest {
    @Test
    fun test() {
        val result = sequenceOf(1, 2, 3).concat(sequenceOf(4, 5, 6)).toList()

        Assert.assertEquals(result, listOf(1, 2, 3, 4, 5, 6))
    }

    @Test
    fun testNoThrownException0() {
        exceptionSequence<Int>().concat(sequenceOf(1, 2, 3))
    }

    @Test
    fun testNoThrownException1() {
        sequenceOf(1, 2, 3).concat(exceptionSequence<Int>())
    }
}
