package com.muhron.kotlinq

import org.junit.Assert
import org.junit.Test

class AverageTest {

    @Test
    fun test0() {
        val result = sequenceOf(1, 2, 3, 4, 5).average()
        Assert.assertTrue(result == 3.0)
    }

    @Test(expected = IllegalArgumentException::class)
    fun test1() {
        emptySequence<Int>().average()
    }
}