package com.muhron.kotlinq

import org.junit.Assert
import org.junit.Test

class CastTest {

    @Test(expected = IllegalArgumentException::class)
    fun catch0() {
        val super0 = Super()
        val super1 = Super()
        val super2 = Super()

        sequenceOf(super0, super1, super2).cast<Sub>().toList()
    }


    @Test(expected = IllegalArgumentException::class)
    fun catch1() {
        val super0 = Super()
        val super1 = Super()
        val sub0 = Sub()
        val sub1 = Sub()

        sequenceOf(super0, sub0, super1, sub1).cast<Sub>().toList()
    }

    @Test
    fun test() {
        val super0 = Super()
        val super1 = Super()
        val super2 = Super()
        val sub0 = Sub()
        val sub1 = Sub()
        val sub2 = Sub()

        Assert.assertEquals(
                sequenceOf(super0, super1, super2).cast<Super>().toList(),
                listOf(super0, super1, super2)
        )

        Assert.assertEquals(
                sequenceOf(super0, sub0, super1, sub1).cast<Super>().toList(),
                listOf(super0, sub0, super1, sub1)
        )

        Assert.assertEquals(
                sequenceOf(sub0, sub1, sub2).cast<Super>().toList(),
                listOf(sub0, sub1, sub2)
        )

        Assert.assertEquals(
                sequenceOf(sub0, sub1, sub2).cast<Sub>().toList(),
                listOf(sub0, sub1, sub2)
        )
    }

    @Test(expected = IllegalArgumentException::class)
    fun catch2() {
        sequenceOf(A(), A(), A()).cast<B>().toList()
    }

    @Test(expected = IllegalArgumentException::class)
    fun catch3() {
        sequenceOf(A(), B(), A(), B()).cast<B>().toList()
    }

    @Test(expected = IllegalArgumentException::class)
    fun catch4() {
        sequenceOf(A(), B(), A(), B()).cast<A>().toList()
    }

    @Test(expected = IllegalArgumentException::class)
    fun catch5() {
        sequenceOf(B(), B(), B()).cast<A>().toList()
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
                sequenceOf(a0, a1, a2).cast<A>().toList(),
                listOf(a0, a1, a2)
        )

        Assert.assertEquals(
                sequenceOf(b0, b1, b2).cast<B>().toList(),
                listOf(b0, b1, b2)
        )
    }

    @Test
    fun testTakeWith() {
        val a0 = A()
        val a1 = A()
        val a2 = A()
        val b0 = B()
        val b1 = B()
        val b2 = B()

        Assert.assertEquals(
                sequenceOf(a0, a1, a2, b0).cast<A>().take(3).toList(),
                listOf(a0, a1, a2)
        )

        Assert.assertEquals(
                sequenceOf(b0, b1, b2, a0).cast<B>().take(3).toList(),
                listOf(b0, b1, b2)
        )
    }
}
