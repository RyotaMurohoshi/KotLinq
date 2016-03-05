package com.muhron.kotlinq

import org.junit.Assert.assertEquals
import org.junit.Test

class WhereWithIndexTest {

    @Test
    fun simple(){
        val result = sequenceOf(1, 2, 3, 4, 5).whereWithIndex { it, index -> index % 2 == 0 }.toList()
        assertEquals(result, listOf(1, 3, 5));
    }
}
