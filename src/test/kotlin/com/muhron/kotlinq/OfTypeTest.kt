package com.muhron.kotlinq

import org.junit.Assert
import org.junit.Test

class OfTypeTest {

    @Test
    fun test() {
        val super0 = Super()
        val super1 = Super()
        val super2 = Super()
        val sub0 = Sub()
        val sub1 = Sub()
        val sub2 = Sub()

        Assert.assertEquals(
                sequenceOf(super0, super1, super2).ofType<Super>().toList(),
                listOf(super0, super1, super2)
        )

        Assert.assertEquals(
                sequenceOf(super0, super1, super2).ofType<Sub>().toList(),
                emptyList<Sub>()
        )

        Assert.assertEquals(
                sequenceOf(super0, sub0, super1, sub1).ofType<Sub>().toList(),
                listOf(sub0, sub1)
        )

        Assert.assertEquals(
                sequenceOf(super0, sub0, super1, sub1).ofType<Super>().toList(),
                listOf(super0, sub0, super1, sub1)
        )

        Assert.assertEquals(
                sequenceOf(sub0, sub1, sub2).ofType<Super>().toList(),
                listOf(sub0, sub1, sub2)
        )

        Assert.assertEquals(
                sequenceOf(sub0, sub1, sub2).ofType<Sub>().toList(),
                listOf(sub0, sub1, sub2)
        )
    }

    @Test
    fun testB() {
        val a0 = A()
        val a1 = A()
        val a2 = A()
        val b0 = B()
        val b1 = B()
        val b2 = B()

        Assert.assertEquals(
                sequenceOf(a0, a1, a2).ofType<A>().toList(),
                listOf(a0, a1, a2)
        )

        Assert.assertEquals(
                sequenceOf(a0, a1, a2).ofType<B>().toList(),
                emptyList<B>()
        )

        Assert.assertEquals(
                sequenceOf(a0, b0, a1, b1).ofType<B>().toList(),
                listOf(b0, b1)
        )

        Assert.assertEquals(
                sequenceOf(a0, b0, a1, b1).ofType<A>().toList(),
                listOf(a0, a1)
        )

        Assert.assertEquals(
                sequenceOf(b0, b1, b2).ofType<A>().toList(),
                emptyList<A>()
        )

        Assert.assertEquals(
                sequenceOf(b0, b1, b2).ofType<B>().toList(),
                listOf(b0, b1, b2)
        )
    }

    @Test
    fun testNoThrownException() {
        exceptionSequence<Int>().ofType<Any>()
    }
}
