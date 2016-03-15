package com.muhron.kotlinq

import org.junit.Assert
import org.junit.Test

class SkipTest {

    @Test
    fun test() {
        val result = sequenceOf(1, 2, 3, 4, 5).skip(3).toList()
        Assert.assertEquals(result, listOf(4, 5))
    }
}
