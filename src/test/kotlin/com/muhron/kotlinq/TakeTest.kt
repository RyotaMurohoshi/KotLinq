package com.muhron.kotlinq

import org.junit.Assert
import org.junit.Test

class TakeTest {

    @Test
    fun simple() {
        val result:Sequence<Int> = arrayOf(1, 2, 3, 4, 5).take(3)
        Assert.assertEquals(result.toList(), listOf(1, 2, 3));
    }
}
