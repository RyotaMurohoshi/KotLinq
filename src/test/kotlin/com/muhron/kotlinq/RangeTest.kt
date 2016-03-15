package com.muhron.kotlinq

import org.junit.Assert
import org.junit.Test

class RangeTest {
    @Test
    fun test0() {
        val result = range(0, 5).toList()
        Assert.assertEquals(result, listOf(0, 1, 2, 3, 4))
    }

    @Test
    fun test1() {
        val result = range(3, 5).toList()
        Assert.assertEquals(result, listOf(3, 4, 5, 6, 7))
    }

    @Test
    fun test2() {
        val result = range(0, 0).toList()
        Assert.assertEquals(result, emptyList<String>())
    }

    @Test
    fun test3() {
        val result = range(-5, 5).toList()
        Assert.assertEquals(result, listOf(-5, -4, -3, -2, -1))
    }

    @Test
    fun test4() {
        val result = range(Int.MIN_VALUE, 3).toList()
        Assert.assertEquals(result, listOf(Int.MIN_VALUE, Int.MIN_VALUE + 1, Int.MIN_VALUE + 2))
    }

    @Test
    fun test5() {
        val result = range(Int.MAX_VALUE - 2, 3).toList()
        Assert.assertEquals(result, listOf(Int.MAX_VALUE - 2, Int.MAX_VALUE - 1, Int.MAX_VALUE))
    }

    @Test(expected = IndexOutOfBoundsException::class)
    fun test6() {
        range(3, -1).toList()
    }

    @Test(expected = IndexOutOfBoundsException::class)
    fun test7() {
        range(Int.MAX_VALUE, 3).toList()
    }
}