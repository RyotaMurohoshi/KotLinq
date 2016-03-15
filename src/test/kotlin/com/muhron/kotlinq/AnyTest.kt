package com.muhron.kotlinq

import org.junit.Assert
import org.junit.Test

class AnyTest {

    @Test
    fun test0() {
        val result = sequenceOf(1, 2, 3).any()
        Assert.assertTrue(result)
    }

    @Test
    fun test1() {
        val result = emptySequence<Int>().any()
        Assert.assertFalse(result)
    }

    @Test
    fun test2() {
        val result = sequenceOf(1, 2, 3).any { it < 5 }
        Assert.assertTrue(result)
    }

    @Test
    fun test3() {
        val result = sequenceOf(1, 2, 3).any { it > 5 }
        Assert.assertFalse(result)
    }

    @Test
    fun test4() {
        val result = emptySequence<Int>().any { it > 5 }
        Assert.assertFalse(result)
    }
}
