package com.muhron.kotlinq.example

import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class ExampleTest {
    @Test
    fun testWithAssertTrue() {
        assertTrue(Example.booleanValue);
    }

    @Test
    fun testWithAssertEquals() {
        assertEquals(0, Example.intValue);
    }
}
