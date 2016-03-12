package com.muhron.kotlinq

import org.junit.Assert
import org.junit.Test

class RangeTest {
    @Test
    fun simple0() {
        val result = range(0, 5).toList()
        Assert.assertEquals(result, listOf(0, 1, 2, 3, 4))
    }

    @Test
    fun simple1() {
        val result = range(3, 5).toList()
        Assert.assertEquals(result, listOf(3, 4, 5, 6, 7))
    }

    @Test
    fun simple2() {
        val result = range(0, 0).toList()
        Assert.assertEquals(result, emptyList<String>())
    }

    @Test
    fun simple3() {
        val result = range(-5, 5).toList()
        Assert.assertEquals(result, listOf(-5, -4, -3, -2, -1))
    }

    @Test
    fun simple4() {
        val result = range(Int.MIN_VALUE, 3).toList()
        Assert.assertEquals(result, listOf(Int.MIN_VALUE, Int.MIN_VALUE + 1, Int.MIN_VALUE + 2))
    }

    @Test
    fun simple5() {
        val result = range(Int.MAX_VALUE - 2, 3).toList()
        Assert.assertEquals(result, listOf(Int.MAX_VALUE - 2, Int.MAX_VALUE - 1, Int.MAX_VALUE))
    }

    @Test(expected = IndexOutOfBoundsException::class)
    fun simple6() {
        range(3, -1).toList()
    }

    @Test(expected = IndexOutOfBoundsException::class)
    fun simple7() {
        range(Int.MAX_VALUE, 3).toList()
    }
}