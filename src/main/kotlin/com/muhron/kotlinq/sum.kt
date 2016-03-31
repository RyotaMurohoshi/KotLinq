package com.muhron.kotlinq

import com.muhron.kotlinq.inner.Calculator

@JvmName("sumOfByte")
fun Sequence<Byte>.sum(): Int {

    return Calculator.sum(this)
}

@JvmName("sumOfShort")
fun Sequence<Short>.sum(): Int {

    return Calculator.sum(this)
}

@JvmName("sumOfInt")
fun Sequence<Int>.sum(): Int {

    return Calculator.sum(this)
}

@JvmName("sumOfLong")
fun Sequence<Long>.sum(): Long {

    return Calculator.sum(this)
}

@JvmName("sumOfFloat")
fun Sequence<Float>.sum(): Float {

    return Calculator.sum(this)
}

@JvmName("sumOfDouble")
fun Sequence<Double>.sum(): Double {

    return Calculator.sum(this)
}

@JvmName("sumOfByte")
fun Iterable<Byte>.sum(): Int {

    return Calculator.sum(this)
}

@JvmName("sumOfShort")
fun Iterable<Short>.sum(): Int {

    return Calculator.sum(this)
}

@JvmName("sumOfInt")
fun Iterable<Int>.sum(): Int {

    return Calculator.sum(this)
}

@JvmName("sumOfLong")
fun Iterable<Long>.sum(): Long {

    return Calculator.sum(this)
}

@JvmName("sumOfFloat")
fun Iterable<Float>.sum(): Float {

    return Calculator.sum(this)
}

@JvmName("sumOfDouble")
fun Iterable<Double>.sum(): Double {

    return Calculator.sum(this)
}

@JvmName("sumOfByte")
fun Array<Byte>.sum(): Int {

    return Calculator.sum(this)
}

@JvmName("sumOfShort")
fun Array<Short>.sum(): Int {

    return Calculator.sum(this)
}

@JvmName("sumOfInt")
fun Array<Int>.sum(): Int {

    return Calculator.sum(this)
}

@JvmName("sumOfLong")
fun Array<Long>.sum(): Long {

    return Calculator.sum(this)
}

@JvmName("sumOfFloat")
fun Array<Float>.sum(): Float {

    return Calculator.sum(this)
}

@JvmName("sumOfDouble")
fun Array<Double>.sum(): Double {

    return Calculator.sum(this)
}

fun ByteArray.sum(): Int {
    require(any()) { "empty." }
    return Calculator.sum(this)
}

fun ShortArray.sum(): Int {
    require(any()) { "empty." }
    return Calculator.sum(this)
}

fun IntArray.sum(): Int {
    require(any()) { "empty." }
    return Calculator.sum(this)
}

fun LongArray.sum(): Long {
    require(any()) { "empty." }
    return Calculator.sum(this)
}

fun FloatArray.sum(): Float {
    require(any()) { "empty." }
    return Calculator.sum(this)
}

fun DoubleArray.sum(): Double {
    require(any()) { "empty." }
    return Calculator.sum(this)
}

@JvmName("sumOfByte")
fun <T> Sequence<T>.sum(selector: (T) -> Byte): Int = map(selector).sum()

@JvmName("sumOfShort")
fun <T> Sequence<T>.sum(selector: (T) -> Short): Int = map(selector).sum()

@JvmName("sumOfInt")
fun <T> Sequence<T>.sum(selector: (T) -> Int): Int = map(selector).sum()

@JvmName("sumOfLong")
fun <T> Sequence<T>.sum(selector: (T) -> Long): Long = map(selector).sum()

@JvmName("sumOfFloat")
fun <T> Sequence<T>.sum(selector: (T) -> Float): Float = map(selector).sum()

@JvmName("sumOfDouble")
fun <T> Sequence<T>.sum(selector: (T) -> Double): Double = map(selector).sum()

@JvmName("sumOfByte")
fun <T> Iterable<T>.sum(selector: (T) -> Byte): Int = map(selector).sum()

@JvmName("sumOfShort")
fun <T> Iterable<T>.sum(selector: (T) -> Short): Int = map(selector).sum()

@JvmName("sumOfInt")
fun <T> Iterable<T>.sum(selector: (T) -> Int): Int = map(selector).sum()

@JvmName("sumOfLong")
fun <T> Iterable<T>.sum(selector: (T) -> Long): Long = map(selector).sum()

@JvmName("sumOfFloat")
fun <T> Iterable<T>.sum(selector: (T) -> Float): Float = map(selector).sum()

@JvmName("sumOfDouble")
fun <T> Iterable<T>.sum(selector: (T) -> Double): Double = map(selector).sum()

@JvmName("sumOfByte")
fun <T> Array<T>.sum(selector: (T) -> Byte): Int = map(selector).sum()

@JvmName("sumOfShort")
fun <T> Array<T>.sum(selector: (T) -> Short): Int = map(selector).sum()

@JvmName("sumOfInt")
fun <T> Array<T>.sum(selector: (T) -> Int): Int = map(selector).sum()

@JvmName("sumOfLong")
fun <T> Array<T>.sum(selector: (T) -> Long): Long = map(selector).sum()

@JvmName("sumOfFloat")
fun <T> Array<T>.sum(selector: (T) -> Float): Float = map(selector).sum()

@JvmName("sumOfDouble")
fun <T> Array<T>.sum(selector: (T) -> Double): Double = map(selector).sum()

@JvmName("sumOfByte")
fun ByteArray.sum(selector: (Byte) -> Byte): Int = map(selector).sum()

@JvmName("sumOfShort")
fun ByteArray.sum(selector: (Byte) -> Short): Int = map(selector).sum()

@JvmName("sumOfInt")
fun ByteArray.sum(selector: (Byte) -> Int): Int = map(selector).sum()

@JvmName("sumOfLong")
fun ByteArray.sum(selector: (Byte) -> Long): Long = map(selector).sum()

@JvmName("sumOfFloat")
fun ByteArray.sum(selector: (Byte) -> Float): Float = map(selector).sum()

@JvmName("sumOfDouble")
fun ByteArray.sum(selector: (Byte) -> Double): Double = map(selector).sum()

@JvmName("sumOfByte")
fun ShortArray.sum(selector: (Short) -> Byte): Int = map(selector).sum()

@JvmName("sumOfShort")
fun ShortArray.sum(selector: (Short) -> Short): Int = map(selector).sum()

@JvmName("sumOfInt")
fun ShortArray.sum(selector: (Short) -> Int): Int = map(selector).sum()

@JvmName("sumOfLong")
fun ShortArray.sum(selector: (Short) -> Long): Long = map(selector).sum()

@JvmName("sumOfFloat")
fun ShortArray.sum(selector: (Short) -> Float): Float = map(selector).sum()

@JvmName("sumOfDouble")
fun ShortArray.sum(selector: (Short) -> Double): Double = map(selector).sum()

@JvmName("sumOfByte")
fun IntArray.sum(selector: (Int) -> Byte): Int = map(selector).sum()

@JvmName("sumOfShort")
fun IntArray.sum(selector: (Int) -> Short): Int = map(selector).sum()

@JvmName("sumOfInt")
fun IntArray.sum(selector: (Int) -> Int): Int = map(selector).sum()

@JvmName("sumOfLong")
fun IntArray.sum(selector: (Int) -> Long): Long = map(selector).sum()

@JvmName("sumOfFloat")
fun IntArray.sum(selector: (Int) -> Float): Float = map(selector).sum()

@JvmName("sumOfDouble")
fun IntArray.sum(selector: (Int) -> Double): Double = map(selector).sum()

@JvmName("sumOfByte")
fun LongArray.sum(selector: (Long) -> Byte): Int = map(selector).sum()

@JvmName("sumOfShort")
fun LongArray.sum(selector: (Long) -> Short): Int = map(selector).sum()

@JvmName("sumOfInt")
fun LongArray.sum(selector: (Long) -> Int): Int = map(selector).sum()

@JvmName("sumOfLong")
fun LongArray.sum(selector: (Long) -> Long): Long = map(selector).sum()

@JvmName("sumOfFloat")
fun LongArray.sum(selector: (Long) -> Float): Float = map(selector).sum()

@JvmName("sumOfDouble")
fun LongArray.sum(selector: (Long) -> Double): Double = map(selector).sum()

@JvmName("sumOfByte")
fun FloatArray.sum(selector: (Float) -> Byte): Int = map(selector).sum()

@JvmName("sumOfShort")
fun FloatArray.sum(selector: (Float) -> Short): Int = map(selector).sum()

@JvmName("sumOfInt")
fun FloatArray.sum(selector: (Float) -> Int): Int = map(selector).sum()

@JvmName("sumOfLong")
fun FloatArray.sum(selector: (Float) -> Long): Long = map(selector).sum()

@JvmName("sumOfFloat")
fun FloatArray.sum(selector: (Float) -> Float): Float = map(selector).sum()

@JvmName("sumOfDouble")
fun FloatArray.sum(selector: (Float) -> Double): Double = map(selector).sum()

@JvmName("sumOfByte")
fun DoubleArray.sum(selector: (Double) -> Byte): Int = map(selector).sum()

@JvmName("sumOfShort")
fun DoubleArray.sum(selector: (Double) -> Short): Int = map(selector).sum()

@JvmName("sumOfInt")
fun DoubleArray.sum(selector: (Double) -> Int): Int = map(selector).sum()

@JvmName("sumOfLong")
fun DoubleArray.sum(selector: (Double) -> Long): Long = map(selector).sum()

@JvmName("sumOfFloat")
fun DoubleArray.sum(selector: (Double) -> Float): Float = map(selector).sum()

@JvmName("sumOfDouble")
fun DoubleArray.sum(selector: (Double) -> Double): Double = map(selector).sum()

@JvmName("sumOfByte")
fun <TSourceK, TSourceV> Map<TSourceK, TSourceV>.sum(selector: (Map.Entry<TSourceK, TSourceV>) -> Byte): Int = map(selector).sum()

@JvmName("sumOfShort")
fun <TSourceK, TSourceV> Map<TSourceK, TSourceV>.sum(selector: (Map.Entry<TSourceK, TSourceV>) -> Short): Int = map(selector).sum()

@JvmName("sumOfInt")
fun <TSourceK, TSourceV> Map<TSourceK, TSourceV>.sum(selector: (Map.Entry<TSourceK, TSourceV>) -> Int): Int = map(selector).sum()

@JvmName("sumOfLong")
fun <TSourceK, TSourceV> Map<TSourceK, TSourceV>.sum(selector: (Map.Entry<TSourceK, TSourceV>) -> Long): Long = map(selector).sum()

@JvmName("sumOfFloat")
fun <TSourceK, TSourceV> Map<TSourceK, TSourceV>.sum(selector: (Map.Entry<TSourceK, TSourceV>) -> Float): Float = map(selector).sum()

@JvmName("sumOfDouble")
fun <TSourceK, TSourceV> Map<TSourceK, TSourceV>.sum(selector: (Map.Entry<TSourceK, TSourceV>) -> Double): Double = map(selector).sum()
