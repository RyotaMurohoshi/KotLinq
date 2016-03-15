package com.muhron.kotlinq

import org.junit.Assert
import org.junit.Test

class SelectWithIndexTest {

    @Test
    fun test() {
        val result = sequenceOf(1, 2, 3, 4, 5).selectWithIndex { it, index -> it * index }.toList()
        Assert.assertEquals(result, listOf(0, 2, 6, 12, 20));
    }

    @Test
    fun testNoThrownException() {
        exceptionSequence<Int>().selectWithIndex { it, index -> it }
    }
}
