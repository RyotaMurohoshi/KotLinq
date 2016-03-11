package com.muhron.kotlinq

import org.junit.Assert
import org.junit.Test

class AggregateTest {
    @Test
    fun simple0() {
        val result = range(1, 5).aggregate { a, b -> a * b }

        Assert.assertEquals(result, 120)
    }

    @Test
    fun simple1() {
        val result = range(1, 5).aggregate("", { a, b -> a + b })

        Assert.assertEquals(result, "12345");
    }

    @Test
    fun simple2() {
        val result = range(1, 5).aggregate(0, { a, b -> a + b }, { it.toString() })
        Assert.assertEquals(result, "15");
    }
}
