package com.muhron.kotlinq

import com.muhron.kotlinq.inner.Calculator

@JvmName("maxOfByte")
fun Sequence<Byte>.max(): Byte {
    require(any()) { "empty." }
    return Calculator.max(this)
}

@JvmName("maxOfShort")
fun Sequence<Short>.max(): Short {
    require(any()) { "empty." }
    return Calculator.max(this)
}

@JvmName("maxOfInt")
fun Sequence<Int>.max(): Int {
    require(any()) { "empty." }
    return Calculator.max(this)
}

@JvmName("maxOfLong")
fun Sequence<Long>.max(): Long {
    require(any()) { "empty." }
    return Calculator.max(this)
}

@JvmName("maxOfFloat")
fun Sequence<Float>.max(): Float {
    require(any()) { "empty." }
    return Calculator.max(this)
}

@JvmName("maxOfDouble")
fun Sequence<Double>.max(): Double {
    require(any()) { "empty." }
    return Calculator.max(this)
}

@JvmName("maxOfByte")
fun Iterable<Byte>.max(): Byte {
    require(any()) { "empty." }
    return Calculator.max(this)
}

@JvmName("maxOfShort")
fun Iterable<Short>.max(): Short {
    require(any()) { "empty." }
    return Calculator.max(this)
}

@JvmName("maxOfInt")
fun Iterable<Int>.max(): Int {
    require(any()) { "empty." }
    return Calculator.max(this)
}

@JvmName("maxOfLong")
fun Iterable<Long>.max(): Long {
    require(any()) { "empty." }
    return Calculator.max(this)
}

@JvmName("maxOfFloat")
fun Iterable<Float>.max(): Float {
    require(any()) { "empty." }
    return Calculator.max(this)
}

@JvmName("maxOfDouble")
fun Iterable<Double>.max(): Double {
    require(any()) { "empty." }
    return Calculator.max(this)
}

@JvmName("maxOfByte")
fun Array<Byte>.max(): Byte {
    require(any()) { "empty." }
    return Calculator.max(this)
}

@JvmName("maxOfShort")
fun Array<Short>.max(): Short {
    require(any()) { "empty." }
    return Calculator.max(this)
}

@JvmName("maxOfInt")
fun Array<Int>.max(): Int {
    require(any()) { "empty." }
    return Calculator.max(this)
}

@JvmName("maxOfLong")
fun Array<Long>.max(): Long {
    require(any()) { "empty." }
    return Calculator.max(this)
}

@JvmName("maxOfFloat")
fun Array<Float>.max(): Float {
    require(any()) { "empty." }
    return Calculator.max(this)
}

@JvmName("maxOfDouble")
fun Array<Double>.max(): Double {
    require(any()) { "empty." }
    return Calculator.max(this)
}

fun ByteArray.max(): Byte {
    require(any()) { "empty." }
    return Calculator.max(this)
}

fun ShortArray.max(): Short {
    require(any()) { "empty." }
    return Calculator.max(this)
}

fun IntArray.max(): Int {
    require(any()) { "empty." }
    return Calculator.max(this)
}

fun LongArray.max(): Long {
    require(any()) { "empty." }
    return Calculator.max(this)
}

fun FloatArray.max(): Float {
    require(any()) { "empty." }
    return Calculator.max(this)
}

fun DoubleArray.max(): Double {
    require(any()) { "empty." }
    return Calculator.max(this)
}

fun <T : Comparable<T>> Sequence<T>.max(): T {
    require(any()) { "empty" }
    return Calculator.max(this)
}

fun <T : Comparable<T>> Iterable<T>.max(): T {
    require(any()) { "empty" }
    return Calculator.max(this)
}

fun <T : Comparable<T>> Array<T>.max(): T {
    require(any()) { "empty" }
    return Calculator.max(this)
}

@JvmName("maxOfByte")
fun <T> Sequence<T>.max(selector: (T) -> Byte): Byte = map(selector).max()

@JvmName("maxOfShort")
fun <T> Sequence<T>.max(selector: (T) -> Short): Short = map(selector).max()

@JvmName("maxOfInt")
fun <T> Sequence<T>.max(selector: (T) -> Int): Int = map(selector).max()

@JvmName("maxOfLong")
fun <T> Sequence<T>.max(selector: (T) -> Long): Long = map(selector).max()

@JvmName("maxOfFloat")
fun <T> Sequence<T>.max(selector: (T) -> Float): Float = map(selector).max()

@JvmName("maxOfDouble")
fun <T> Sequence<T>.max(selector: (T) -> Double): Double = map(selector).max()

@JvmName("maxOfByte")
fun <T> Iterable<T>.max(selector: (T) -> Byte): Byte = map(selector).max()

@JvmName("maxOfShort")
fun <T> Iterable<T>.max(selector: (T) -> Short): Short = map(selector).max()

@JvmName("maxOfInt")
fun <T> Iterable<T>.max(selector: (T) -> Int): Int = map(selector).max()

@JvmName("maxOfLong")
fun <T> Iterable<T>.max(selector: (T) -> Long): Long = map(selector).max()

@JvmName("maxOfFloat")
fun <T> Iterable<T>.max(selector: (T) -> Float): Float = map(selector).max()

@JvmName("maxOfDouble")
fun <T> Iterable<T>.max(selector: (T) -> Double): Double = map(selector).max()

@JvmName("maxOfByte")
fun <T> Array<T>.max(selector: (T) -> Byte): Byte = map(selector).max()

@JvmName("maxOfShort")
fun <T> Array<T>.max(selector: (T) -> Short): Short = map(selector).max()

@JvmName("maxOfInt")
fun <T> Array<T>.max(selector: (T) -> Int): Int = map(selector).max()

@JvmName("maxOfLong")
fun <T> Array<T>.max(selector: (T) -> Long): Long = map(selector).max()

@JvmName("maxOfFloat")
fun <T> Array<T>.max(selector: (T) -> Float): Float = map(selector).max()

@JvmName("maxOfDouble")
fun <T> Array<T>.max(selector: (T) -> Double): Double = map(selector).max()

@JvmName("maxOfByte")
fun ByteArray.max(selector: (Byte) -> Byte): Byte = map(selector).max()

@JvmName("maxOfShort")
fun ByteArray.max(selector: (Byte) -> Short): Short = map(selector).max()

@JvmName("maxOfInt")
fun ByteArray.max(selector: (Byte) -> Int): Int = map(selector).max()

@JvmName("maxOfLong")
fun ByteArray.max(selector: (Byte) -> Long): Long = map(selector).max()

@JvmName("maxOfFloat")
fun ByteArray.max(selector: (Byte) -> Float): Float = map(selector).max()

@JvmName("maxOfDouble")
fun ByteArray.max(selector: (Byte) -> Double): Double = map(selector).max()

@JvmName("maxOfByte")
fun ShortArray.max(selector: (Short) -> Byte): Byte = map(selector).max()

@JvmName("maxOfShort")
fun ShortArray.max(selector: (Short) -> Short): Short = map(selector).max()

@JvmName("maxOfInt")
fun ShortArray.max(selector: (Short) -> Int): Int = map(selector).max()

@JvmName("maxOfLong")
fun ShortArray.max(selector: (Short) -> Long): Long = map(selector).max()

@JvmName("maxOfFloat")
fun ShortArray.max(selector: (Short) -> Float): Float = map(selector).max()

@JvmName("maxOfDouble")
fun ShortArray.max(selector: (Short) -> Double): Double = map(selector).max()

@JvmName("maxOfByte")
fun IntArray.max(selector: (Int) -> Byte): Byte = map(selector).max()

@JvmName("maxOfShort")
fun IntArray.max(selector: (Int) -> Short): Short = map(selector).max()

@JvmName("maxOfInt")
fun IntArray.max(selector: (Int) -> Int): Int = map(selector).max()

@JvmName("maxOfLong")
fun IntArray.max(selector: (Int) -> Long): Long = map(selector).max()

@JvmName("maxOfFloat")
fun IntArray.max(selector: (Int) -> Float): Float = map(selector).max()

@JvmName("maxOfDouble")
fun IntArray.max(selector: (Int) -> Double): Double = map(selector).max()

@JvmName("maxOfByte")
fun LongArray.max(selector: (Long) -> Byte): Byte = map(selector).max()

@JvmName("maxOfShort")
fun LongArray.max(selector: (Long) -> Short): Short = map(selector).max()

@JvmName("maxOfInt")
fun LongArray.max(selector: (Long) -> Int): Int = map(selector).max()

@JvmName("maxOfLong")
fun LongArray.max(selector: (Long) -> Long): Long = map(selector).max()

@JvmName("maxOfFloat")
fun LongArray.max(selector: (Long) -> Float): Float = map(selector).max()

@JvmName("maxOfDouble")
fun LongArray.max(selector: (Long) -> Double): Double = map(selector).max()

@JvmName("maxOfByte")
fun FloatArray.max(selector: (Float) -> Byte): Byte = map(selector).max()

@JvmName("maxOfShort")
fun FloatArray.max(selector: (Float) -> Short): Short = map(selector).max()

@JvmName("maxOfInt")
fun FloatArray.max(selector: (Float) -> Int): Int = map(selector).max()

@JvmName("maxOfLong")
fun FloatArray.max(selector: (Float) -> Long): Long = map(selector).max()

@JvmName("maxOfFloat")
fun FloatArray.max(selector: (Float) -> Float): Float = map(selector).max()

@JvmName("maxOfDouble")
fun FloatArray.max(selector: (Float) -> Double): Double = map(selector).max()

@JvmName("maxOfByte")
fun DoubleArray.max(selector: (Double) -> Byte): Byte = map(selector).max()

@JvmName("maxOfShort")
fun DoubleArray.max(selector: (Double) -> Short): Short = map(selector).max()

@JvmName("maxOfInt")
fun DoubleArray.max(selector: (Double) -> Int): Int = map(selector).max()

@JvmName("maxOfLong")
fun DoubleArray.max(selector: (Double) -> Long): Long = map(selector).max()

@JvmName("maxOfFloat")
fun DoubleArray.max(selector: (Double) -> Float): Float = map(selector).max()

@JvmName("maxOfDouble")
fun DoubleArray.max(selector: (Double) -> Double): Double = map(selector).max()

@JvmName("maxOfByte")
fun <TSourceK, TSourceV> Map<TSourceK, TSourceV>.max(selector: (Map.Entry<TSourceK, TSourceV>) -> Byte): Byte = map(selector).max()

@JvmName("maxOfShort")
fun <TSourceK, TSourceV> Map<TSourceK, TSourceV>.max(selector: (Map.Entry<TSourceK, TSourceV>) -> Short): Short = map(selector).max()

@JvmName("maxOfInt")
fun <TSourceK, TSourceV> Map<TSourceK, TSourceV>.max(selector: (Map.Entry<TSourceK, TSourceV>) -> Int): Int = map(selector).max()

@JvmName("maxOfLong")
fun <TSourceK, TSourceV> Map<TSourceK, TSourceV>.max(selector: (Map.Entry<TSourceK, TSourceV>) -> Long): Long = map(selector).max()

@JvmName("maxOfFloat")
fun <TSourceK, TSourceV> Map<TSourceK, TSourceV>.max(selector: (Map.Entry<TSourceK, TSourceV>) -> Float): Float = map(selector).max()

@JvmName("maxOfDouble")
fun <TSourceK, TSourceV> Map<TSourceK, TSourceV>.max(selector: (Map.Entry<TSourceK, TSourceV>) -> Double): Double = map(selector).max()
