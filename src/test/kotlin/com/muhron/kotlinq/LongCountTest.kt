package com.muhron.kotlinq

import org.junit.Assert
import org.junit.Test

class LongCountTest {

    @Test
    fun test0() {
        val result = sequenceOf(1, 2, 3, 4, 5).longCount()
        Assert.assertEquals(result, 5);
    }
}
