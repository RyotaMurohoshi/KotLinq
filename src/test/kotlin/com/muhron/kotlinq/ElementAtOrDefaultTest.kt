package com.muhron.kotlinq

import org.junit.Assert
import org.junit.Test

class ElementAtOrDefaultTest {
    @Test
    fun test0() {
        val result = sequenceOf(1, 2, 3).elementAtOrDefault(0)
        Assert.assertEquals(result, 1)
    }

    @Test
    fun test1() {
        val result = sequenceOf(1, 2, 3).elementAtOrDefault(3)
        Assert.assertEquals(result, null)
    }

    @Test
    fun test2() {
        val result =  emptySequence<Int>().elementAtOrDefault(0)
        Assert.assertEquals(result, null)
    }
}