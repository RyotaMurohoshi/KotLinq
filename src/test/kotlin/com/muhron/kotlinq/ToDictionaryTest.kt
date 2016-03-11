package com.muhron.kotlinq

import org.junit.Assert
import org.junit.Test

class ToDictionaryTest {

    @Test
    fun simple0() {
        val result = sequenceOf(1, 2, 3).toDictionary { it }
        Assert.assertEquals(result, mapOf(1 to 1, 2 to 2, 3 to 3));
    }

    @Test
    fun simple1() {
        val result = sequenceOf(1, 2, 3).toDictionary({ it }, { it.toString() })
        Assert.assertEquals(result, mapOf(1 to "1", 2 to "2", 3 to "3"));
    }
}
