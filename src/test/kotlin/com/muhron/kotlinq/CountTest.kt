package com.muhron.kotlinq

import org.junit.Assert
import org.junit.Test

class CountTest {
    @Test
    fun simple0() {
        val result = sequenceOf(1, 2, 3).count { it % 2 == 0 }

        Assert.assertEquals(result, 1)
    }

    @Test
    fun simple1() {
        val result = sequenceOf(1, 2, 3).count { it > 5 }

        Assert.assertEquals(result, 0)
    }

    @Test
    fun simple2() {
        val result = emptySequence<Int>().count { it % 2 == 0 }

        Assert.assertEquals(result, 0)
    }
}
