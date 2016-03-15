package com.muhron.kotlinq

import org.junit.Assert
import org.junit.Test

class IntersectTest {

    @Test
    fun test() {
        Assert.assertEquals(
                sequenceOf(1, 2, 3, 4, 5).intersect(sequenceOf(1, 2, 3, 4, 5)).toList(),
                listOf(1, 2, 3, 4, 5)
        )

        Assert.assertEquals(
                sequenceOf(1, 1, 2, 3, 2, 4, 5, 3).intersect(sequenceOf(4, 6, 7)).toList(),
                listOf(4)
        )

        Assert.assertEquals(
                sequenceOf(1, 1, 2, 3, 2, 4, 5, 3).intersect(sequenceOf(4, 6, 7, 7, 5, 3, 1)).toList(),
                listOf(1, 3, 4, 5)
        )

        Assert.assertEquals(
                sequenceOf(1, 2, 3).intersect(sequenceOf()).toList(),
                emptyList<Int>()
        )

        Assert.assertEquals(
                emptySequence<Int>().intersect(sequenceOf(1, 2, 3)).toList(),
                emptyList<Int>()
        )

        Assert.assertEquals(
                emptySequence<Int>().intersect(sequenceOf()).toList(),
                emptyList<Int>()
        )
    }
}
