package com.muhron.kotlinq

import org.junit.Assert
import org.junit.Test

class SelectTest {

    @Test
    fun simple() {
        val result = sequenceOf(1, 2, 3, 4, 5).select { it * it }.toList()
        Assert.assertEquals(result, listOf(1, 4, 9, 16, 25));
    }
}
