package com.muhron.kotlinq

import org.junit.Assert
import org.junit.Test

class SkipWhileTest {

    @Test
    fun test() {
        val result = sequenceOf(1, 2, 3, 4, 5).skipWhile { it < 3 }.toList()
        Assert.assertEquals(result, listOf(3, 4, 5))
    }
}
