package com.muhron.kotlinq

import org.junit.Assert
import org.junit.Test

class EmptyTest {
    @Test
    fun test() {
        Assert.assertEquals(empty<Int>(), emptySequence<Int>())
    }
}
