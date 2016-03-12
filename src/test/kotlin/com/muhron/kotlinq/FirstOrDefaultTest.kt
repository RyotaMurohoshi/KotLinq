package com.muhron.kotlinq

import org.junit.Assert
import org.junit.Test

class FirstOrDefaultTest {

    @Test
    fun simple0() {
        val result = sequenceOf(1, 2, 3, 4, 5).firstOrDefault()
        Assert.assertEquals(result, 1)
    }

    @Test
    fun simple1() {
        val result = emptySequence<Int>().firstOrDefault()
        Assert.assertEquals(result, null)
    }

    @Test
    fun simple2() {
        val result = sequenceOf(1, 2, 3, 4, 5).firstOrDefault { it > 3 }
        Assert.assertEquals(result, 4);
    }

    @Test
    fun simple3() {
        val result = sequenceOf(1, 2, 3, 4, 5).firstOrDefault { it > 5 }
        Assert.assertEquals(result, null)
    }
}
