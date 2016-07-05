package com.muhron.kotlinq.default_methods

import org.junit.Assert
import org.junit.Test

class AverageTest {

    @Test
    fun test0() {
        val result = listOf(1, 2, 3).average()
        Assert.assertTrue(result == 2.0)
    }

    @Test
    fun test1() {
        val result = emptyList<Int>().average()
        Assert.assertTrue(result == 0.0)
    }
}
