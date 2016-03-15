package com.muhron.kotlinq

import org.junit.Assert
import org.junit.Test

class AggregateTest {
    @Test
    fun test0() {
        val result = range(1, 5).aggregate { a, b -> a * b }

        Assert.assertEquals(result, 120)
    }

    @Test
    fun test1() {
        val result = range(1, 5).aggregate("", { a, b -> a + b })

        Assert.assertEquals(result, "12345");
    }

    @Test
    fun test2() {
        val result = range(1, 5).aggregate(0, { a, b -> a + b }, { it.toString() })
        Assert.assertEquals(result, "15");
    }
}
