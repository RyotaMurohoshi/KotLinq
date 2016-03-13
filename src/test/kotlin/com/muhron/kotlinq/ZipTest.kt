package com.muhron.kotlinq

import org.junit.Assert
import org.junit.Test


class ZipTest {

    @Test
    fun simple0() {
        val result = sequenceOf(1, 2, 3).zip(sequenceOf(3, 2, 1), { a, b -> a to b }).toList()
        Assert.assertEquals(result, listOf(1 to 3, 2 to 2, 3 to 1));
    }

    @Test
    fun simple1() {
        val result = sequenceOf(1, 2, 3, 4, 5).zip(sequenceOf(3, 2, 1), { a, b -> a to b }).toList()
        Assert.assertEquals(result, listOf(1 to 3, 2 to 2, 3 to 1));
    }
}