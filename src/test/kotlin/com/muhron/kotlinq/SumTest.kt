package com.muhron.kotlinq

import org.junit.Assert
import org.junit.Test

class SumTest {

    @Test
    fun test0() {
        val result = sequenceOf(1, 2, 3, 4, 5).sum()
        Assert.assertEquals(result, 15)
    }

    @Test
    fun test1() {
        val result = emptySequence<Int>().sum()
        Assert.assertEquals(result, 0)
    }
}