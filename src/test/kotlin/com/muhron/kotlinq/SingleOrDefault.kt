package com.muhron.kotlinq

import org.junit.Assert
import org.junit.Test
import singleOrDefault
import java.util.*

class SingleOrDefault {
    @Test
    fun test0() {
        val result = sequenceOf(1).singleOrDefault()
        Assert.assertEquals(result, 1)
    }

    @Test
    fun test1() {
        val result = emptySequence<Int>().singleOrDefault()
        Assert.assertEquals(result, null)
    }


    @Test(expected = IllegalArgumentException::class)
    fun test2() {
        sequenceOf(1, 2).singleOrDefault()
    }

    @Test
    fun test3() {
        val result = sequenceOf(1).singleOrDefault { it > 0 }
        Assert.assertEquals(result, 1)
    }

    @Test
    fun test4() {
        val result = sequenceOf(-1, 0, 1).singleOrDefault { it > 0 }
        Assert.assertEquals(result, 1)
    }

    @Test(expected = IllegalArgumentException::class)
    fun test5() {
        sequenceOf(1, 2).singleOrDefault { it > 0 }
    }

    @Test
    fun test6() {
        val result = sequenceOf(-1, 0, 1).singleOrDefault { it > 1 }
        Assert.assertEquals(result, null)
    }

    @Test
    fun test7() {
        val result = emptySequence<Int>().singleOrDefault { it > 1 }
        Assert.assertEquals(result, null)
    }
}
