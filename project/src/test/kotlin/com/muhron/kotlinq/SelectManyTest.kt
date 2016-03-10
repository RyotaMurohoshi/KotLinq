package com.muhron.kotlinq

import org.junit.Assert
import org.junit.Test

class SelectManyTest {

    @Test
    fun simple0() {
        val result = sequenceOf(1, 2, 3).selectMany { num -> repeat(num, 3) }.toList()
        Assert.assertEquals(result, listOf(1, 1, 1, 2, 2, 2, 3, 3, 3));
    }

    @Test
    fun simple1() {
        val result = sequenceOf(1, 2, 3, 4, 5).selectMany { num, index -> repeat(num, index + 1) }.toList()
        Assert.assertEquals(result, listOf(1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5));
    }

    @Test
    fun simple2() {
        val result = sequenceOf(1, 2, 3).selectMany({ s -> range(1, s) }, { s, c -> s to c }).toList()
        Assert.assertEquals(result, listOf(
                1 to 1,
                2 to 1, 2 to 2,
                3 to 1, 3 to 2, 3 to 3));
    }

    @Test
    fun simple3() {
        val result = sequenceOf(1, 2, 3).selectMany({ s, i -> repeat(s, i + 1) }, { s, c -> s to c }).toList()
        Assert.assertEquals(result, listOf(
                1 to 1,
                2 to 2, 2 to 2,
                3 to 3, 3 to 3, 3 to 3));
    }
}
