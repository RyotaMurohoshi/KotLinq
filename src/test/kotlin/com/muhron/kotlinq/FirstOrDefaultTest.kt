package com.muhron.kotlinq

import org.junit.Assert
import org.junit.Test

class FirstOrDefaultTest {

    @Test
    fun test0() {
        val result = sequenceOf(1, 2, 3, 4, 5).firstOrDefault()
        Assert.assertEquals(result, 1)
    }

    @Test
    fun test1() {
        val result = emptySequence<Int>().firstOrDefault()
        Assert.assertEquals(result, null)
    }

    @Test
    fun test2() {
        val result = sequenceOf(1, 2, 3, 4, 5).firstOrDefault { it > 3 }
        Assert.assertEquals(result, 4);
    }

    @Test
    fun test3() {
        val result = sequenceOf(1, 2, 3, 4, 5).firstOrDefault { it > 5 }
        Assert.assertEquals(result, null)
    }
}
