package com.muhron.kotlinq

import org.junit.Assert
import org.junit.Test
import java.util.*

class OrderByTest {

    val list = listOf("Java", "Groovy", "Scala", "Kotlin", "Clojure", "Ceylon", "Xtend", "Gosu")

    @Test
    fun test0() {
        val result = list.orderBy { it }.toList()
        Assert.assertEquals(result, listOf("Ceylon", "Clojure", "Gosu", "Groovy", "Java", "Kotlin", "Scala", "Xtend"))
    }

    @Test
    fun test1() {
        val result = list.orderByDescending { it }.toList()
        Assert.assertEquals(result, listOf("Xtend", "Scala", "Kotlin", "Java", "Groovy", "Gosu", "Clojure", "Ceylon"))
    }

    @Test
    fun test2() {
        val result = list.orderBy { it.length }.thenBy { it }.toList()
        Assert.assertEquals(result, listOf("Gosu", "Java", "Scala", "Xtend", "Ceylon", "Groovy", "Kotlin", "Clojure"))
    }

    @Test
    fun test3() {
        val result = list.orderBy { it.length }.thenByDescending { it }.toList()
        Assert.assertEquals(result, listOf("Java", "Gosu", "Xtend", "Scala", "Kotlin", "Groovy", "Ceylon", "Clojure"))
    }

    @Test
    fun testNoThrownException() {
        exceptionSequence<Int>().orderBy { it }
        exceptionSequence<Int>().orderByDescending { it }
        exceptionSequence<Int>().orderBy { it }.thenBy { it }
        exceptionSequence<Int>().orderBy { it }.thenByDescending { it }

        exceptionSequence<Int>().orderBy({ it }, Comparator.naturalOrder<Int>())
        exceptionSequence<Int>().orderByDescending ({ it }, Comparator.naturalOrder<Int>())
        exceptionSequence<Int>().orderBy { it }.thenBy({ it }, Comparator.naturalOrder<Int>())
        exceptionSequence<Int>().orderBy { it }.thenByDescending({ it }, Comparator.naturalOrder<Int>())
    }
}
