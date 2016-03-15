package com.muhron.kotlinq

import org.junit.Assert
import org.junit.Test

class LastOrDefaultTest {

    @Test
    fun test0() {
        val result = sequenceOf(1, 2, 3, 4, 5).lastOrDefault()
        Assert.assertEquals(result, 5)
    }

    @Test
    fun test1() {
        val result = emptySequence<Int>().lastOrDefault()
        Assert.assertEquals(result, null)
    }

    @Test
    fun test2() {
        val result = sequenceOf(1, 2, 3, 4, 5).lastOrDefault { it > 3 }
        Assert.assertEquals(result, 5);
    }

    @Test
    fun test3() {
        val result = sequenceOf(1, 2, 3, 4, 5).lastOrDefault { it > 5 }
        Assert.assertEquals(result, null)
    }
}
