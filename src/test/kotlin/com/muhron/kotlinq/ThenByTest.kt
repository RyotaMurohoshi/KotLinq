package com.muhron.kotlinq

import org.junit.Assert
import org.junit.Test

class ThenByTest {

    @Test
    fun test() {
        val result = sequenceOf("Java", "Ceylon", "Xtend", "JRuby", "Kotlin", "Jython", "Groovy", "Scala", "Gosu")
                .orderBy { it -> it.length }
                .thenBy { it }
                .toList()

        Assert.assertEquals(
                result,
                listOf("Gosu", "Java", "JRuby", "Scala", "Xtend", "Ceylon", "Groovy", "Jython", "Kotlin")
        )
    }
}
