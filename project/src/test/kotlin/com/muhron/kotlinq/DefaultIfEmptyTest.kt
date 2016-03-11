package com.muhron.kotlinq

import org.junit.Assert
import org.junit.Test

class DefaultIfEmptyTest {
    @Test
    fun simple0() {
        val result = sequenceOf(1, 2, 3).defaultIfEmpty(0).toList()
        Assert.assertEquals(result, listOf(1, 2, 3))
    }

    @Test
    fun simple1() {
        val result = emptySequence<Int>().defaultIfEmpty(0).toList()
        Assert.assertEquals(result, listOf(0))
    }

    @Test
    fun simple2() {
        val result = sequenceOf(1, 2, 3).defaultIfEmpty().toList()
        Assert.assertEquals(result, listOf(1, 2, 3))
    }

    @Test
    fun simple3() {
        val result = emptySequence<Int?>().defaultIfEmpty().toList()
        Assert.assertEquals(result, listOf(null))
    }
}
