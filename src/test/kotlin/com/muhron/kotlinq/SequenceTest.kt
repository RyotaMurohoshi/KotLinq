package com.muhron.kotlinq

import org.junit.Assert
import org.junit.Test

class SequenceTest {
    @Test
    fun simple0() {
        println(sequenceOf(1, 2, 3, 4, 5).sequenceEqual(sequenceOf(1, 2, 3, 4, 5)))
        Assert.assertTrue(sequenceOf(1, 2, 3, 4, 5).sequenceEqual(sequenceOf(1, 2, 3, 4, 5)))
    }

    @Test
    fun simple1() {
        Assert.assertFalse(sequenceOf(1, 2, 3, 4, 5).sequenceEqual(sequenceOf(1, 2, 3, 4)))
    }

    @Test
    fun simple2() {
        Assert.assertFalse(sequenceOf(1, 2, 3, 4, 5).sequenceEqual(emptySequence()))
    }

    @Test
    fun simple3() {
        Assert.assertFalse(emptySequence<Int>().sequenceEqual(sequenceOf(1, 2, 3, 4, 5)))
    }

    @Test
    fun simple4() {
        Assert.assertTrue(emptySequence<Int>().sequenceEqual(emptySequence()))
    }

    @Test
    fun simple5() {
        Assert.assertFalse(sequenceOf(1, 2, 3, 4, 5).sequenceEqual(sequenceOf(3, 1, 2, 3, 4)))
    }
}
