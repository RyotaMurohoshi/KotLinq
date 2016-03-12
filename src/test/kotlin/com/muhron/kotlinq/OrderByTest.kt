package com.muhron.kotlinq

import org.junit.Assert
import org.junit.Test

class OrderByTest {

    val list = listOf("Java", "Groovy", "Scala", "Kotlin", "Clojure", "Ceylon", "Xtend", "Gosu")

    @Test
    fun simple0() {
        val result = list.orderBy { it }.toList()
        Assert.assertEquals(result, listOf("Ceylon", "Clojure", "Gosu", "Groovy", "Java", "Kotlin", "Scala", "Xtend"))
    }

    @Test
    fun simple1() {
        val result = list.orderByDescending { it }.toList()
        Assert.assertEquals(result, listOf("Xtend", "Scala", "Kotlin", "Java", "Groovy", "Gosu", "Clojure", "Ceylon"))
    }

    @Test
    fun simple2() {
        val result = list.orderBy { it.length }.thenBy { it }.toList()
        Assert.assertEquals(result, listOf("Gosu", "Java", "Scala", "Xtend", "Ceylon", "Groovy", "Kotlin", "Clojure"))
    }

    @Test
    fun simple3() {
        val result = list.orderBy { it.length }.thenByDescending { it }.toList()
        Assert.assertEquals(result, listOf("Java", "Gosu", "Xtend", "Scala", "Kotlin", "Groovy", "Ceylon", "Clojure"))
    }
}
