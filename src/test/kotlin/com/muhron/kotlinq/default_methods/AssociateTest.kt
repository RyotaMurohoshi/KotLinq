package com.muhron.kotlinq.default_methods

import org.junit.Assert
import org.junit.Test

class AssociateTest {

    data class Person(val id: Long, val name: String, val teamId: Long)

    val person000 = Person(id = 0L, name = "Taro", teamId = 0L)
    val person001 = Person(id = 1L, name = "Jiro", teamId = 0L)
    val person002 = Person(id = 2L, name = "Saburo", teamId = 0L)
    val person003 = Person(id = 3L, name = "Matsuko", teamId = 1L)
    val person004 = Person(id = 4L, name = "Takeko", teamId = 1L)
    val person005 = Person(id = 5L, name = "Umeko", teamId = 1L)
    val person006 = Person(id = 6L, name = "Hanako", teamId = 2L)

    val personList = listOf(
            person000,
            person001,
            person002,
            person003,
            person004,
            person005,
            person006
    )

    @Test
    fun test0() {
        val result = listOf(1, 2, 3).associateBy { it }
        Assert.assertEquals(result, mapOf(1 to 1, 2 to 2, 3 to 3));
    }

    @Test
    fun test1() {
        val result = listOf(1, 2, 3, 1).associateBy { it }
        Assert.assertEquals(result, mapOf(1 to 1, 2 to 2, 3 to 3));
    }

    @Test
    fun test2() {
        val result = personList.associateBy { it.id }
        val expected = mapOf(
                0L to person000,
                1L to person001,
                2L to person002,
                3L to person003,
                4L to person004,
                5L to person005,
                6L to person006
        )
        Assert.assertEquals(expected, result)
    }

    @Test
    fun test3() {
        val result = personList.associateBy { it.teamId }
        val expected = mapOf(
                0L to person002,
                1L to person005,
                2L to person006
        )
        Assert.assertEquals(expected, result)
    }
}
