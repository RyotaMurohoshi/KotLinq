package com.muhron.kotlinq

import org.junit.Assert
import org.junit.Test
import java.util.*

class SingleTest {
    @Test
    fun simple0() {
        val result = sequenceOf(1).single()
        Assert.assertEquals(result, 1)
    }

    @Test(expected = IllegalArgumentException::class)
    fun simple1() {
        sequenceOf(1, 2).single()
    }

    @Test(expected = NoSuchElementException::class)
    fun simple2() {
        emptySequence<Int>().single()
    }

    @Test
    fun simple3() {
        val result = sequenceOf(1).single { it > 0 }
        Assert.assertEquals(result, 1)
    }

    @Test
    fun simple4() {
        val result = sequenceOf(-1, 0, 1).single { it > 0 }
        Assert.assertEquals(result, 1)
    }

    @Test(expected = IllegalArgumentException::class)
    fun simple5() {
        sequenceOf(1, 2).single { it > 0 }
    }

    @Test(expected = NoSuchElementException::class)
    fun simple6() {
        emptySequence<Int>().single { it > 0 }
    }
}
