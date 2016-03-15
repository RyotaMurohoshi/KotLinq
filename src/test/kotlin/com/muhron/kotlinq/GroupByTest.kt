package com.muhron.kotlinq

import org.junit.Assert
import org.junit.Test

class GroupByTest {

    @Test
    fun testA() {
        val result = sequenceOf(1, 2, 3, 4, 5, 1, 2, 3, 1).groupBy { it }.toList()
        Assert.assertEquals(result.size, 5);
        Assert.assertEquals(result.elementAt(0).key, 1);
        Assert.assertEquals(result.elementAt(0).asSequence().toList(), listOf(1, 1, 1));
        Assert.assertEquals(result.elementAt(1).key, 2);
        Assert.assertEquals(result.elementAt(1).asSequence().toList(), listOf(2, 2));
        Assert.assertEquals(result.elementAt(2).key, 3);
        Assert.assertEquals(result.elementAt(2).asSequence().toList(), listOf(3, 3));
        Assert.assertEquals(result.elementAt(3).key, 4);
        Assert.assertEquals(result.elementAt(3).asSequence().toList(), listOf(4));
        Assert.assertEquals(result.elementAt(4).key, 5);
        Assert.assertEquals(result.elementAt(4).asSequence().toList(), listOf(5));
    }

    @Test
    fun testB() {
        val result = sequenceOf(1, 2, 3, 4, 5, 1, 2, 3, 1)
                .groupBy(keySelector = { it }, elementSelector = { it.toString() })
                .toList()

        Assert.assertEquals(result.size, 5);
        Assert.assertEquals(result.elementAt(0).key, 1);
        Assert.assertEquals(result.elementAt(0).asSequence().toList(), listOf("1", "1", "1"));
        Assert.assertEquals(result.elementAt(1).key, 2);
        Assert.assertEquals(result.elementAt(1).asSequence().toList(), listOf("2", "2"));
        Assert.assertEquals(result.elementAt(2).key, 3);
        Assert.assertEquals(result.elementAt(2).asSequence().toList(), listOf("3", "3"));
        Assert.assertEquals(result.elementAt(3).key, 4);
        Assert.assertEquals(result.elementAt(3).asSequence().toList(), listOf("4"));
        Assert.assertEquals(result.elementAt(4).key, 5);
        Assert.assertEquals(result.elementAt(4).asSequence().toList(), listOf("5"));
    }

    @Test
    fun testC() {
        val result = sequenceOf(1, 2, 3, 4, 5, 1, 2, 3, 1)
                .groupBy(keySelector = { it }, resultSelector = { key, sequences -> sequences.sum() })
                .toList()

        Assert.assertEquals(result.size, 5);
        Assert.assertEquals(result, listOf(3, 4, 6, 4, 5))
    }

    @Test
    fun testD() {
        val result = sequenceOf(1, 2, 3, 4, 5, 1, 2, 3, 1)
                .groupBy(keySelector = { it }, elementSelector = { it.toString() }, resultSelector = { key, sequences -> sequences.joinToString() })
                .toList()

        Assert.assertEquals(result.size, 5);
        Assert.assertEquals(result, listOf("1, 1, 1", "2, 2", "3, 3", "4", "5"))
    }
}
