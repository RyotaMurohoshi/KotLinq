package com.muhron.kotlinq

import org.junit.Assert
import org.junit.Test


class ZipTest {

    @Test
    fun test0() {
        val result = sequenceOf(1, 2, 3).zip(sequenceOf(3, 2, 1), { a, b -> a to b }).toList()
        Assert.assertEquals(result, listOf(1 to 3, 2 to 2, 3 to 1));
    }

    @Test
    fun test1() {
        val result = sequenceOf(1, 2, 3, 4, 5).zip(sequenceOf(3, 2, 1), { a, b -> a to b }).toList()
        Assert.assertEquals(result, listOf(1 to 3, 2 to 2, 3 to 1));
    }

    @Test
    fun testNoThrownException() {
        exceptionSequence<Int>().zip(sequenceOf(1, 2, 3), { a, b -> a to b })
        exceptionSequence<Int>().zip(exceptionSequence<Int>(), { a, b -> a to b })
        sequenceOf(1, 2, 3).zip(exceptionSequence<Int>(), { a, b -> a to b })
    }
}
