package com.muhron.kotlinq

import org.junit.Assert
import org.junit.Test

class ToListTest {

    @Test
    fun test0() {
        val result = sequenceOf(1, 2, 3).toList()
        Assert.assertEquals(result, listOf(1, 2, 3));
    }
}
