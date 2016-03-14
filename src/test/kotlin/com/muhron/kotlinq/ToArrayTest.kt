package com.muhron.kotlinq

import org.junit.Assert
import org.junit.Test

class ToArrayTest {

    @Test
    fun simple0() {
        val result = sequenceOf(1, 2, 3).toArray()
        Assert.assertArrayEquals(result, arrayOf(1, 2, 3))
    }
}
