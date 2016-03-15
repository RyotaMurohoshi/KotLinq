package com.muhron.kotlinq

import org.junit.Assert
import org.junit.Test

class WhereTest {

    @Test
    fun test(){
        val result = sequenceOf(1, 2, 3, 4, 5).where { it % 2 == 0 }.toList()
        Assert.assertEquals(result, listOf(2, 4));
    }
}
