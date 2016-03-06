package com.muhron.kotlinq

import org.junit.Assert
import org.junit.Test

class ToLookupTest {

    @Test
    fun simpleA() {
        val result = sequenceOf(1, 2, 3, 4, 5, 1, 2, 3, 1).toLookup { it }
        Assert.assertEquals(result.count, 5);
        Assert.assertEquals(result[1].toList(), listOf(1, 1, 1));
        Assert.assertEquals(result[2].toList(), listOf(2, 2));
        Assert.assertEquals(result[3].toList(), listOf(3, 3));
        Assert.assertEquals(result[4].toList(), listOf(4));
        Assert.assertEquals(result[5].toList(), listOf(5));
        Assert.assertEquals(result[6].toList(), emptyList<Int>());

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
    fun simpleB() {
        val result = sequenceOf(1, 2, 3, 4, 5, 1, 2, 3, 1).toLookup ({ it }, { it.toString() })

        Assert.assertEquals(result.count, 5);
        Assert.assertEquals(result[1].toList(), listOf("1", "1", "1"));
        Assert.assertEquals(result[2].toList(), listOf("2", "2"));
        Assert.assertEquals(result[3].toList(), listOf("3", "3"));
        Assert.assertEquals(result[4].toList(), listOf("4"));
        Assert.assertEquals(result[5].toList(), listOf("5"));
        Assert.assertEquals(result[6].toList(), emptyList<Int>());

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
}
