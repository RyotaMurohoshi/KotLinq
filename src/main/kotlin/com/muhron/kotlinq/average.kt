package com.muhron.kotlinq

import com.muhron.kotlinq.inner.Calculator

@JvmName("averageOfByte")
fun Sequence<Byte>.average(): Double {
    require(any()) { "empty." }
    return Calculator.average(this)
}

@JvmName("averageOfShort")
fun Sequence<Short>.average(): Double {
    require(any()) { "empty." }
    return Calculator.average(this)
}

@JvmName("averageOfInt")
fun Sequence<Int>.average(): Double {
    require(any()) { "empty." }
    return Calculator.average(this)
}

@JvmName("averageOfLong")
fun Sequence<Long>.average(): Double {
    require(any()) { "empty." }
    return Calculator.average(this)
}

@JvmName("averageOfFloat")
fun Sequence<Float>.average(): Double {
    require(any()) { "empty." }
    return Calculator.average(this)
}

@JvmName("averageOfDouble")
fun Sequence<Double>.average(): Double {
    require(any()) { "empty." }
    return Calculator.average(this)
}

@JvmName("averageOfByte")
fun Iterable<Byte>.average(): Double {
    require(any()) { "empty." }
    return Calculator.average(this)
}

@JvmName("averageOfShort")
fun Iterable<Short>.average(): Double {
    require(any()) { "empty." }
    return Calculator.average(this)
}

@JvmName("averageOfInt")
fun Iterable<Int>.average(): Double {
    require(any()) { "empty." }
    return Calculator.average(this)
}

@JvmName("averageOfLong")
fun Iterable<Long>.average(): Double {
    require(any()) { "empty." }
    return Calculator.average(this)
}

@JvmName("averageOfFloat")
fun Iterable<Float>.average(): Double {
    require(any()) { "empty." }
    return Calculator.average(this)
}

@JvmName("averageOfDouble")
fun Iterable<Double>.average(): Double {
    require(any()) { "empty." }
    return Calculator.average(this)
}

@JvmName("averageOfByte")
fun Array<Byte>.average(): Double {
    require(any()) { "empty." }
    return Calculator.average(this)
}

@JvmName("averageOfShort")
fun Array<Short>.average(): Double {
    require(any()) { "empty." }
    return Calculator.average(this)
}

@JvmName("averageOfInt")
fun Array<Int>.average(): Double {
    require(any()) { "empty." }
    return Calculator.average(this)
}

@JvmName("averageOfLong")
fun Array<Long>.average(): Double {
    require(any()) { "empty." }
    return Calculator.average(this)
}

@JvmName("averageOfFloat")
fun Array<Float>.average(): Double {
    require(any()) { "empty." }
    return Calculator.average(this)
}

@JvmName("averageOfDouble")
fun Array<Double>.average(): Double {
    require(any()) { "empty." }
    return Calculator.average(this)
}

fun ByteArray.average(): Double {
    require(any()) { "empty." }
    return Calculator.average(this)
}

fun ShortArray.average(): Double {
    require(any()) { "empty." }
    return Calculator.average(this)
}

fun IntArray.average(): Double {
    require(any()) { "empty." }
    return Calculator.average(this)
}

fun LongArray.average(): Double {
    require(any()) { "empty." }
    return Calculator.average(this)
}

fun FloatArray.average(): Double {
    require(any()) { "empty." }
    return Calculator.average(this)
}

fun DoubleArray.average(): Double {
    require(any()) { "empty." }
    return Calculator.average(this)
}

@JvmName("averageOfByte")
fun <T> Sequence<T>.average(selector: (T) -> Byte): Double = map(selector).average()

@JvmName("averageOfShort")
fun <T> Sequence<T>.average(selector: (T) -> Short): Double = map(selector).average()

@JvmName("averageOfInt")
fun <T> Sequence<T>.average(selector: (T) -> Int): Double = map(selector).average()

@JvmName("averageOfLong")
fun <T> Sequence<T>.average(selector: (T) -> Long): Double = map(selector).average()

@JvmName("averageOfFloat")
fun <T> Sequence<T>.average(selector: (T) -> Float): Double = map(selector).average()

@JvmName("averageOfDouble")
fun <T> Sequence<T>.average(selector: (T) -> Double): Double = map(selector).average()

@JvmName("averageOfByte")
fun <T> Iterable<T>.average(selector: (T) -> Byte): Double = map(selector).average()

@JvmName("averageOfShort")
fun <T> Iterable<T>.average(selector: (T) -> Short): Double = map(selector).average()

@JvmName("averageOfInt")
fun <T> Iterable<T>.average(selector: (T) -> Int): Double = map(selector).average()

@JvmName("averageOfLong")
fun <T> Iterable<T>.average(selector: (T) -> Long): Double = map(selector).average()

@JvmName("averageOfFloat")
fun <T> Iterable<T>.average(selector: (T) -> Float): Double = map(selector).average()

@JvmName("averageOfDouble")
fun <T> Iterable<T>.average(selector: (T) -> Double): Double = map(selector).average()

@JvmName("averageOfByte")
fun <T> Array<T>.average(selector: (T) -> Byte): Double = map(selector).average()

@JvmName("averageOfShort")
fun <T> Array<T>.average(selector: (T) -> Short): Double = map(selector).average()

@JvmName("averageOfInt")
fun <T> Array<T>.average(selector: (T) -> Int): Double = map(selector).average()

@JvmName("averageOfLong")
fun <T> Array<T>.average(selector: (T) -> Long): Double = map(selector).average()

@JvmName("averageOfFloat")
fun <T> Array<T>.average(selector: (T) -> Float): Double = map(selector).average()

@JvmName("averageOfDouble")
fun <T> Array<T>.average(selector: (T) -> Double): Double = map(selector).average()

@JvmName("averageOfByte")
fun ByteArray.average(selector: (Byte) -> Byte): Double = map(selector).average()

@JvmName("averageOfShort")
fun ByteArray.average(selector: (Byte) -> Short): Double = map(selector).average()

@JvmName("averageOfInt")
fun ByteArray.average(selector: (Byte) -> Int): Double = map(selector).average()

@JvmName("averageOfLong")
fun ByteArray.average(selector: (Byte) -> Long): Double = map(selector).average()

@JvmName("averageOfFloat")
fun ByteArray.average(selector: (Byte) -> Float): Double = map(selector).average()

@JvmName("averageOfDouble")
fun ByteArray.average(selector: (Byte) -> Double): Double = map(selector).average()

@JvmName("averageOfByte")
fun ShortArray.average(selector: (Short) -> Byte): Double = map(selector).average()

@JvmName("averageOfShort")
fun ShortArray.average(selector: (Short) -> Short): Double = map(selector).average()

@JvmName("averageOfInt")
fun ShortArray.average(selector: (Short) -> Int): Double = map(selector).average()

@JvmName("averageOfLong")
fun ShortArray.average(selector: (Short) -> Long): Double = map(selector).average()

@JvmName("averageOfFloat")
fun ShortArray.average(selector: (Short) -> Float): Double = map(selector).average()

@JvmName("averageOfDouble")
fun ShortArray.average(selector: (Short) -> Double): Double = map(selector).average()

@JvmName("averageOfByte")
fun IntArray.average(selector: (Int) -> Byte): Double = map(selector).average()

@JvmName("averageOfShort")
fun IntArray.average(selector: (Int) -> Short): Double = map(selector).average()

@JvmName("averageOfInt")
fun IntArray.average(selector: (Int) -> Int): Double = map(selector).average()

@JvmName("averageOfLong")
fun IntArray.average(selector: (Int) -> Long): Double = map(selector).average()

@JvmName("averageOfFloat")
fun IntArray.average(selector: (Int) -> Float): Double = map(selector).average()

@JvmName("averageOfDouble")
fun IntArray.average(selector: (Int) -> Double): Double = map(selector).average()

@JvmName("averageOfByte")
fun LongArray.average(selector: (Long) -> Byte): Double = map(selector).average()

@JvmName("averageOfShort")
fun LongArray.average(selector: (Long) -> Short): Double = map(selector).average()

@JvmName("averageOfInt")
fun LongArray.average(selector: (Long) -> Int): Double = map(selector).average()

@JvmName("averageOfLong")
fun LongArray.average(selector: (Long) -> Long): Double = map(selector).average()

@JvmName("averageOfFloat")
fun LongArray.average(selector: (Long) -> Float): Double = map(selector).average()

@JvmName("averageOfDouble")
fun LongArray.average(selector: (Long) -> Double): Double = map(selector).average()

@JvmName("averageOfByte")
fun FloatArray.average(selector: (Float) -> Byte): Double = map(selector).average()

@JvmName("averageOfShort")
fun FloatArray.average(selector: (Float) -> Short): Double = map(selector).average()

@JvmName("averageOfInt")
fun FloatArray.average(selector: (Float) -> Int): Double = map(selector).average()

@JvmName("averageOfLong")
fun FloatArray.average(selector: (Float) -> Long): Double = map(selector).average()

@JvmName("averageOfFloat")
fun FloatArray.average(selector: (Float) -> Float): Double = map(selector).average()

@JvmName("averageOfDouble")
fun FloatArray.average(selector: (Float) -> Double): Double = map(selector).average()

@JvmName("averageOfByte")
fun DoubleArray.average(selector: (Double) -> Byte): Double = map(selector).average()

@JvmName("averageOfShort")
fun DoubleArray.average(selector: (Double) -> Short): Double = map(selector).average()

@JvmName("averageOfInt")
fun DoubleArray.average(selector: (Double) -> Int): Double = map(selector).average()

@JvmName("averageOfLong")
fun DoubleArray.average(selector: (Double) -> Long): Double = map(selector).average()

@JvmName("averageOfFloat")
fun DoubleArray.average(selector: (Double) -> Float): Double = map(selector).average()

@JvmName("averageOfDouble")
fun DoubleArray.average(selector: (Double) -> Double): Double = map(selector).average()

@JvmName("averageOfByte")
fun <TSourceK, TSourceV> Map<TSourceK, TSourceV>.average(selector: (Map.Entry<TSourceK, TSourceV>) -> Byte): Double = map(selector).average()

@JvmName("averageOfShort")
fun <TSourceK, TSourceV> Map<TSourceK, TSourceV>.average(selector: (Map.Entry<TSourceK, TSourceV>) -> Short): Double = map(selector).average()

@JvmName("averageOfInt")
fun <TSourceK, TSourceV> Map<TSourceK, TSourceV>.average(selector: (Map.Entry<TSourceK, TSourceV>) -> Int): Double = map(selector).average()

@JvmName("averageOfLong")
fun <TSourceK, TSourceV> Map<TSourceK, TSourceV>.average(selector: (Map.Entry<TSourceK, TSourceV>) -> Long): Double = map(selector).average()

@JvmName("averageOfFloat")
fun <TSourceK, TSourceV> Map<TSourceK, TSourceV>.average(selector: (Map.Entry<TSourceK, TSourceV>) -> Float): Double = map(selector).average()

@JvmName("averageOfDouble")
fun <TSourceK, TSourceV> Map<TSourceK, TSourceV>.average(selector: (Map.Entry<TSourceK, TSourceV>) -> Double): Double = map(selector).average()
