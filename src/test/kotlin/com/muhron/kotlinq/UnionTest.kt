package com.muhron.kotlinq

import org.junit.Assert
import org.junit.Test

class UnionTest {

    @Test
    fun test() {
        Assert.assertEquals(
                sequenceOf(1, 2, 3, 4, 5).union(sequenceOf(1, 2, 3, 4, 5)).toList(),
                listOf(1, 2, 3, 4, 5)
        )

        Assert.assertEquals(
                sequenceOf(1, 1, 2, 3, 2, 4, 5, 3).union(sequenceOf(4, 6, 7)).toList(),
                listOf(1, 2, 3, 4, 5, 6, 7)
        )

        Assert.assertEquals(
                sequenceOf(1, 1, 2, 3, 2, 4, 5, 3).union(sequenceOf(4, 6, 7, 7, 5, 3, 1)).toList(),
                listOf(1, 2, 3, 4, 5, 6, 7)
        )

        Assert.assertEquals(
                sequenceOf(1, 2, 3).union(sequenceOf()).toList(),
                listOf(1, 2, 3)
        )

        Assert.assertEquals(
                emptySequence<Int>().union(sequenceOf(1, 2, 3)).toList(),
                listOf(1, 2, 3)
        )

        Assert.assertEquals(
                emptySequence<Int>().union(sequenceOf()).toList(),
                emptyList<Int>()
        )
    }

    @Test
    fun testNoThrownException1() {
        exceptionSequence<Int>().union(sequenceOf(1, 2, 3))
        exceptionSequence<Int>().union(exceptionSequence())
        sequenceOf(1, 2, 3).union(exceptionSequence())
    }
}
