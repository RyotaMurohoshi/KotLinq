package com.muhron.kotlinq

import org.junit.Assert
import org.junit.Test

class EmptyTest {
    @Test
    fun simple() {
        Assert.assertEquals(empty<Int>(), emptySequence<Int>())
    }
}
