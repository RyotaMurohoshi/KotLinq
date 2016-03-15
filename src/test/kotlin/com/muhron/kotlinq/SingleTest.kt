package com.muhron.kotlinq

import org.junit.Assert
import org.junit.Test
import java.util.*

class SingleTest {
    @Test
    fun test0() {
        val result = sequenceOf(1).single()
        Assert.assertEquals(result, 1)
    }

    @Test(expected = IllegalArgumentException::class)
    fun test1() {
        sequenceOf(1, 2).single()
    }

    @Test(expected = NoSuchElementException::class)
    fun test2() {
        emptySequence<Int>().single()
    }

    @Test
    fun test3() {
        val result = sequenceOf(1).single { it > 0 }
        Assert.assertEquals(result, 1)
    }

    @Test
    fun test4() {
        val result = sequenceOf(-1, 0, 1).single { it > 0 }
        Assert.assertEquals(result, 1)
    }

    @Test(expected = IllegalArgumentException::class)
    fun test5() {
        sequenceOf(1, 2).single { it > 0 }
    }

    @Test(expected = NoSuchElementException::class)
    fun test6() {
        emptySequence<Int>().single { it > 0 }
    }
}
