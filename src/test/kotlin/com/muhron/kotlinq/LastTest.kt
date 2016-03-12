package com.muhron.kotlinq

import org.junit.Assert
import org.junit.Test
import java.util.*

class LastTest {

    @Test
    fun simple0() {
        val result = sequenceOf(1, 2, 3, 4, 5).last()
        Assert.assertEquals(result, 5)
    }

    @Test(expected = NoSuchElementException::class)
    fun simple1() {
        emptySequence<Int>().last()
    }

    @Test
    fun simple2() {
        val result = sequenceOf(1, 2, 3, 4, 5).last{it > 3}
        Assert.assertEquals(result, 5);
    }

    @Test(expected = NoSuchElementException::class)
    fun simple3() {
        emptySequence<Int>().last{ it > 3}
    }
}
