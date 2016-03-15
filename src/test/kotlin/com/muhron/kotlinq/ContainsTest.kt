package com.muhron.kotlinq

import org.junit.Assert
import org.junit.Test

class ContainsTest {
    @Test
    fun test0() {
        val result = sequenceOf(1, 2, 3).contains(1)

        Assert.assertTrue(result)
    }

    @Test
    fun test1() {
        val result = sequenceOf(1, 2, 3).contains(4)

        Assert.assertFalse(result)
    }

    @Test
    fun test2() {
        val result = emptySequence<Int>().contains(4)

        Assert.assertFalse(result)
    }
}
