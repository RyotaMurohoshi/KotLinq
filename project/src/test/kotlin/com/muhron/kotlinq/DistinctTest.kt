package com.muhron.kotlinq

import org.junit.Assert
import org.junit.Test

class DistinctTest {

    @Test
    fun simple() {
        Assert.assertEquals(
                sequenceOf(1, 2, 3, 4, 5).distinct().toList(),
                listOf(1, 2, 3, 4, 5)
        )

        Assert.assertEquals(
                sequenceOf(1, 1, 2, 3, 2, 4, 5, 3).distinct().toList(),
                listOf(1, 2, 3, 4, 5)
        )

        Assert.assertEquals(
                emptySequence<Int>().distinct().toList(),
                emptyList<Int>()
        )
    }
}
