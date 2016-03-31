package com.muhron.kotlinq

import org.junit.Assert
import org.junit.Test

class MinTest {

    @Test
    fun test0() {
        val result = sequenceOf(1, 2, 3, 4, 5).min()
        Assert.assertTrue(result == 1)
    }

    @Test(expected = IllegalArgumentException::class)
    fun test1() {
        emptySequence<Int>().min()
    }
}