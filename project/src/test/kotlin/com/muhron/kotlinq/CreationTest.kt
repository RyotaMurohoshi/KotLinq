package com.muhron.kotlinq

import org.junit.Assert
import org.junit.Test

class CreationTest {

    @Test
    fun repeatTestCount5() {
        val result = repeat("K", 5).toList();
        Assert.assertEquals(result, listOf("K", "K", "K", "K", "K"));
    }

    @Test
    fun repeatTestCount0() {
        val result = repeat("K", 0).toList();
        Assert.assertEquals(result, emptyList<String>());
    }

    @Test(expected = IllegalArgumentException::class)
    fun repeatTestCountNegative() {
        repeat("K", -1).toList();
    }

    @Test
    fun rangeTestStart0Count5() {
        val result = range(0, 5).toList();
        Assert.assertEquals(result, listOf(0, 1, 2, 3, 4));
    }

    @Test
    fun rangeTestStart3Count5() {
        val result = range(3, 5).toList();
        Assert.assertEquals(result, listOf(3, 4, 5, 6, 7));
    }

    @Test
    fun rangeTestStart0Count0() {
        val result = repeat(0, 0).toList();
        Assert.assertEquals(result, emptyList<String>());
    }

    @Test(expected = IllegalArgumentException::class)
    fun repeatTestStart0CountNegative() {
        repeat(0, -1).toList();
    }

    @Test
    fun emptyTest() {
        val result = empty<Int>().toList();
        Assert.assertEquals(result, listOf<Int>());
    }
}
