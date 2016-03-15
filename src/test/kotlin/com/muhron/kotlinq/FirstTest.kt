package com.muhron.kotlinq

import org.junit.Assert
import org.junit.Test
import java.util.*

class FirstTest {

    @Test
    fun test0() {
        val result = sequenceOf(1, 2, 3, 4, 5).first()
        Assert.assertEquals(result, 1)
    }

    @Test(expected = NoSuchElementException::class)
    fun test1() {
        emptySequence<Int>().first()
    }

    @Test
    fun test2() {
        val result = sequenceOf(1, 2, 3, 4, 5).first{it > 3}
        Assert.assertEquals(result, 4);
    }

    @Test(expected = NoSuchElementException::class)
    fun test3() {
        emptySequence<Int>().first{ it > 3}
    }
}
