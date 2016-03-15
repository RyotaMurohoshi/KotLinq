package com.muhron.kotlinq

import org.junit.Assert
import org.junit.Test
import java.util.*

class LastTest {

    @Test
    fun test0() {
        val result = sequenceOf(1, 2, 3, 4, 5).last()
        Assert.assertEquals(result, 5)
    }

    @Test(expected = NoSuchElementException::class)
    fun test1() {
        emptySequence<Int>().last()
    }

    @Test
    fun test2() {
        val result = sequenceOf(1, 2, 3, 4, 5).last{it > 3}
        Assert.assertEquals(result, 5);
    }

    @Test(expected = NoSuchElementException::class)
    fun test3() {
        emptySequence<Int>().last{ it > 3}
    }
}
