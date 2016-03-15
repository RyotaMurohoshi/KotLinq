package com.muhron.kotlinq

import org.junit.Assert
import org.junit.Test

class ElementAtTest {

    @Test
    fun test0() {
        val result = sequenceOf(1, 2, 3).elementAt(0)
        Assert.assertEquals(result, 1)
    }

    @Test(expected = IndexOutOfBoundsException::class)
    fun test1() {
        sequenceOf(1, 2, 3).elementAt(3)
    }

    @Test(expected = IndexOutOfBoundsException::class)
    fun test2() {
        emptySequence<Int>().elementAt(0)
    }
}
