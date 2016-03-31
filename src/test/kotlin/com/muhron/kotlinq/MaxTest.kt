package com.muhron.kotlinq

import org.junit.Assert
import org.junit.Test

class MaxTest {

    @Test
    fun test0() {
        val result = sequenceOf(1, 2, 3, 4, 5).max()
        Assert.assertTrue(result == 5)
    }

    @Test(expected = IllegalArgumentException::class)
    fun test1() {
        emptySequence<Int>().max()
    }
}