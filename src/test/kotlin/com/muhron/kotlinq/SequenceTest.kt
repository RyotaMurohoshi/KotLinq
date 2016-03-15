package com.muhron.kotlinq

import org.junit.Assert
import org.junit.Test

class SequenceTest {
    @Test
    fun test0() {
        println(sequenceOf(1, 2, 3, 4, 5).sequenceEqual(sequenceOf(1, 2, 3, 4, 5)))
        Assert.assertTrue(sequenceOf(1, 2, 3, 4, 5).sequenceEqual(sequenceOf(1, 2, 3, 4, 5)))
    }

    @Test
    fun test1() {
        Assert.assertFalse(sequenceOf(1, 2, 3, 4, 5).sequenceEqual(sequenceOf(1, 2, 3, 4)))
    }

    @Test
    fun test2() {
        Assert.assertFalse(sequenceOf(1, 2, 3, 4, 5).sequenceEqual(emptySequence()))
    }

    @Test
    fun test3() {
        Assert.assertFalse(emptySequence<Int>().sequenceEqual(sequenceOf(1, 2, 3, 4, 5)))
    }

    @Test
    fun test4() {
        Assert.assertTrue(emptySequence<Int>().sequenceEqual(emptySequence()))
    }

    @Test
    fun test5() {
        Assert.assertFalse(sequenceOf(1, 2, 3, 4, 5).sequenceEqual(sequenceOf(3, 1, 2, 3, 4)))
    }
}
