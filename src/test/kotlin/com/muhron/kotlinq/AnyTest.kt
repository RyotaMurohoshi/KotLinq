package com.muhron.kotlinq

import org.junit.Assert
import org.junit.Test

class AnyTest {

    @Test
    fun simple0() {
        val result = sequenceOf(1, 2, 3).any()
        Assert.assertTrue(result)
    }

    @Test
    fun simple1() {
        val result = emptySequence<Int>().any()
        Assert.assertFalse(result)
    }

    @Test
    fun simple2() {
        val result = sequenceOf(1, 2, 3).any { it < 5 }
        Assert.assertTrue(result)
    }

    @Test
    fun simple3() {
        val result = sequenceOf(1, 2, 3).any { it > 5 }
        Assert.assertFalse(result)
    }

    @Test
    fun simple4() {
        val result = emptySequence<Int>().any { it > 5 }
        Assert.assertFalse(result)
    }
}
