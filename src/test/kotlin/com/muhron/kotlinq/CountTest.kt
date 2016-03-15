package com.muhron.kotlinq

import org.junit.Assert
import org.junit.Test

class CountTest {
    @Test
    fun test0() {
        val result = sequenceOf(1, 2, 3).count { it % 2 == 0 }

        Assert.assertEquals(result, 1)
    }

    @Test
    fun test1() {
        val result = sequenceOf(1, 2, 3).count { it > 5 }

        Assert.assertEquals(result, 0)
    }

    @Test
    fun test2() {
        val result = emptySequence<Int>().count { it % 2 == 0 }

        Assert.assertEquals(result, 0)
    }
}
