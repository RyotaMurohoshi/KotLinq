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

    @Test(expected = IllegalArgumentException::class)
    fun repeatTestStart0CountNegative() {
        repeat(0, -1).toList();
    }
}
