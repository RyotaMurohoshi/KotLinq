package com.muhron.kotlinq

import org.junit.Assert
import org.junit.Test

class ReverseTest {
    @Test
    fun test0() {
        val result = sequenceOf(0, 1, 2).reverse().toList()
        Assert.assertEquals(result, listOf(2, 1, 0))
    }

    @Test
    fun test1() {
        val result = emptySequence<Int>().reverse().toList()
        Assert.assertEquals(result, emptyList<Int>())
    }
}