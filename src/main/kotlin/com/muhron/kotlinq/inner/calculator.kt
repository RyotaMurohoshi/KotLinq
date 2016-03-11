package com.muhron.kotlinq.inner

internal object Calculator {
    @JvmName("averageOfByte")
    fun average(sequence: Sequence<Byte>): Double = sequence.average()

    @JvmName("averageOfShort")
    fun average(sequence: Sequence<Short>): Double = sequence.average()

    @JvmName("averageOfInt")
    fun average(sequence: Sequence<Int>): Double = sequence.average()

    @JvmName("averageOfLong")
    fun average(sequence: Sequence<Long>): Double = sequence.average()

    @JvmName("averageOfFloat")
    fun average(sequence: Sequence<Float>): Double = sequence.average()

    @JvmName("averageOfDouble")
    fun average(sequence: Sequence<Double>): Double = sequence.average()

    @JvmName("averageOfByte")
    fun average(iterable: Iterable<Byte>): Double = iterable.average()

    @JvmName("averageOfShort")
    fun average(iterable: Iterable<Short>): Double = iterable.average()

    @JvmName("averageOfInt")
    fun average(iterable: Iterable<Int>): Double = iterable.average()

    @JvmName("averageOfLong")
    fun average(iterable: Iterable<Long>): Double = iterable.average()

    @JvmName("averageOfFloat")
    fun average(iterable: Iterable<Float>): Double = iterable.average()

    @JvmName("averageOfDouble")
    fun average(iterable: Iterable<Double>): Double = iterable.average()

    @JvmName("averageOfByte")
    fun average(array: Array<Byte>): Double = array.average()

    @JvmName("averageOfShort")
    fun average(array: Array<Short>): Double = array.average()

    @JvmName("averageOfInt")
    fun average(array: Array<Int>): Double = array.average()

    @JvmName("averageOfLong")
    fun average(array: Array<Long>): Double = array.average()

    @JvmName("averageOfFloat")
    fun average(array: Array<Float>): Double = array.average()

    @JvmName("averageOfDouble")
    fun average(array: Array<Double>): Double = array.average()

    @JvmName("minOfByte")
    fun min(sequence: Sequence<Byte>): Byte = sequence.min()!!

    @JvmName("minOfShort")
    fun min(sequence: Sequence<Short>): Short = sequence.min()!!

    @JvmName("minOfInt")
    fun min(sequence: Sequence<Int>): Int = sequence.min()!!

    @JvmName("minOfLong")
    fun min(sequence: Sequence<Long>): Long = sequence.min()!!

    @JvmName("minOfFloat")
    fun min(sequence: Sequence<Float>): Float = sequence.min()!!

    @JvmName("minOfDouble")
    fun min(sequence: Sequence<Double>): Double = sequence.min()!!

    @JvmName("minOfByte")
    fun min(iterable: Iterable<Byte>): Byte = iterable.min()!!

    @JvmName("minOfShort")
    fun min(iterable: Iterable<Short>): Short = iterable.min()!!

    @JvmName("minOfInt")
    fun min(iterable: Iterable<Int>): Int = iterable.min()!!

    @JvmName("minOfLong")
    fun min(iterable: Iterable<Long>): Long = iterable.min()!!

    @JvmName("minOfFloat")
    fun min(iterable: Iterable<Float>): Float = iterable.min()!!

    @JvmName("minOfDouble")
    fun min(iterable: Iterable<Double>): Double = iterable.min()!!

    @JvmName("minOfByte")
    fun min(array: Array<Byte>): Byte = array.min()!!

    @JvmName("minOfShort")
    fun min(array: Array<Short>): Short = array.min()!!

    @JvmName("minOfInt")
    fun min(array: Array<Int>): Int = array.min()!!

    @JvmName("minOfLong")
    fun min(array: Array<Long>): Long = array.min()!!

    @JvmName("minOfFloat")
    fun min(array: Array<Float>): Float = array.min()!!

    @JvmName("minOfDouble")
    fun min(array: Array<Double>): Double = array.min()!!

    @JvmName("maxOfByte")
    fun max(sequence: Sequence<Byte>): Byte = sequence.max()!!

    @JvmName("maxOfShort")
    fun max(sequence: Sequence<Short>): Short = sequence.max()!!

    @JvmName("maxOfInt")
    fun max(sequence: Sequence<Int>): Int = sequence.max()!!

    @JvmName("maxOfLong")
    fun max(sequence: Sequence<Long>): Long = sequence.max()!!

    @JvmName("maxOfFloat")
    fun max(sequence: Sequence<Float>): Float = sequence.max()!!

    @JvmName("maxOfDouble")
    fun max(sequence: Sequence<Double>): Double = sequence.max()!!

    @JvmName("maxOfByte")
    fun max(iterable: Iterable<Byte>): Byte = iterable.max()!!

    @JvmName("maxOfShort")
    fun max(iterable: Iterable<Short>): Short = iterable.max()!!

    @JvmName("maxOfInt")
    fun max(iterable: Iterable<Int>): Int = iterable.max()!!

    @JvmName("maxOfLong")
    fun max(iterable: Iterable<Long>): Long = iterable.max()!!

    @JvmName("maxOfFloat")
    fun max(iterable: Iterable<Float>): Float = iterable.max()!!

    @JvmName("maxOfDouble")
    fun max(iterable: Iterable<Double>): Double = iterable.max()!!

    @JvmName("maxOfByte")
    fun max(array: Array<Byte>): Byte = array.max()!!

    @JvmName("maxOfShort")
    fun max(array: Array<Short>): Short = array.max()!!

    @JvmName("maxOfInt")
    fun max(array: Array<Int>): Int = array.max()!!

    @JvmName("maxOfLong")
    fun max(array: Array<Long>): Long = array.max()!!

    @JvmName("maxOfFloat")
    fun max(array: Array<Float>): Float = array.max()!!

    @JvmName("maxOfDouble")
    fun max(array: Array<Double>): Double = array.max()!!

    @JvmName("sumOfByte")
    fun sum(sequence: Sequence<Byte>): Int = sequence.sum()

    @JvmName("sumOfShort")
    fun sum(sequence: Sequence<Short>): Int = sequence.sum()

    @JvmName("sumOfInt")
    fun sum(sequence: Sequence<Int>): Int = sequence.sum()

    @JvmName("sumOfLong")
    fun sum(sequence: Sequence<Long>): Long = sequence.sum()

    @JvmName("sumOfFloat")
    fun sum(sequence: Sequence<Float>): Float = sequence.sum()

    @JvmName("sumOfDouble")
    fun sum(sequence: Sequence<Double>): Double = sequence.sum()

    @JvmName("sumOfByte")
    fun sum(iterable: Iterable<Byte>): Int = iterable.sum()

    @JvmName("sumOfShort")
    fun sum(iterable: Iterable<Short>): Int = iterable.sum()

    @JvmName("sumOfInt")
    fun sum(iterable: Iterable<Int>): Int = iterable.sum()

    @JvmName("sumOfLong")
    fun sum(iterable: Iterable<Long>): Long = iterable.sum()

    @JvmName("sumOfFloat")
    fun sum(iterable: Iterable<Float>): Float = iterable.sum()

    @JvmName("sumOfDouble")
    fun sum(iterable: Iterable<Double>): Double = iterable.sum()

    @JvmName("sumOfByte")
    fun sum(array: Array<Byte>): Int = array.sum()

    @JvmName("sumOfShort")
    fun sum(array: Array<Short>): Int = array.sum()

    @JvmName("sumOfInt")
    fun sum(array: Array<Int>): Int = array.sum()

    @JvmName("sumOfLong")
    fun sum(array: Array<Long>): Long = array.sum()

    @JvmName("sumOfFloat")
    fun sum(array: Array<Float>): Float = array.sum()

    @JvmName("sumOfDouble")
    fun sum(array: Array<Double>): Double = array.sum()

    fun average(byteArray: ByteArray): Double = byteArray.average()

    fun average(shortArray: ShortArray): Double = shortArray.average()

    fun average(intArray: IntArray): Double = intArray.average()

    fun average(longArray: LongArray): Double = longArray.average()

    fun average(floatArray: FloatArray): Double = floatArray.average()

    fun average(doubleArray: DoubleArray): Double = doubleArray.average()

    fun min(byteArray: ByteArray): Byte = byteArray.min()!!

    fun min(shortArray: ShortArray): Short = shortArray.min()!!

    fun min(intArray: IntArray): Int = intArray.min()!!

    fun min(longArray: LongArray): Long = longArray.min()!!

    fun min(floatArray: FloatArray): Float = floatArray.min()!!

    fun min(doubleArray: DoubleArray): Double = doubleArray.min()!!

    fun max(byteArray: ByteArray): Byte = byteArray.max()!!

    fun max(shortArray: ShortArray): Short = shortArray.max()!!

    fun max(intArray: IntArray): Int = intArray.max()!!

    fun max(longArray: LongArray): Long = longArray.max()!!

    fun max(floatArray: FloatArray): Float = floatArray.max()!!

    fun max(doubleArray: DoubleArray): Double = doubleArray.max()!!

    fun sum(byteArray: ByteArray): Int = byteArray.sum()

    fun sum(shortArray: ShortArray): Int = shortArray.sum()

    fun sum(intArray: IntArray): Int = intArray.sum()

    fun sum(longArray: LongArray): Long = longArray.sum()

    fun sum(floatArray: FloatArray): Float = floatArray.sum()

    fun sum(doubleArray: DoubleArray): Double = doubleArray.sum()

    fun <T : Comparable<T>> min(sequence: Sequence<T>): T = sequence.min()!!

    fun <T : Comparable<T>> min(iterable: Iterable<T>): T = iterable.min()!!

    fun <T : Comparable<T>> min(array: Array<T>): T = array.min()!!

    fun <T : Comparable<T>> max(sequence: Sequence<T>): T = sequence.max()!!

    fun <T : Comparable<T>> max(iterable: Iterable<T>): T = iterable.max()!!

    fun <T : Comparable<T>> max(array: Array<T>): T = array.max()!!
}
