package com.muhron.kotlinq

import com.muhron.kotlinq.inner.Calculator

@JvmName("minOfByte")
fun Sequence<Byte>.min(): Byte {
    require(any()) { "empty." }
    return Calculator.min(this)
}

@JvmName("minOfShort")
fun Sequence<Short>.min(): Short {
    require(any()) { "empty." }
    return Calculator.min(this)
}

@JvmName("minOfInt")
fun Sequence<Int>.min(): Int {
    require(any()) { "empty." }
    return Calculator.min(this)
}

@JvmName("minOfLong")
fun Sequence<Long>.min(): Long {
    require(any()) { "empty." }
    return Calculator.min(this)
}

@JvmName("minOfFloat")
fun Sequence<Float>.min(): Float {
    require(any()) { "empty." }
    return Calculator.min(this)
}

@JvmName("minOfDouble")
fun Sequence<Double>.min(): Double {
    require(any()) { "empty." }
    return Calculator.min(this)
}

@JvmName("minOfByte")
fun Iterable<Byte>.min(): Byte {
    require(any()) { "empty." }
    return Calculator.min(this)
}

@JvmName("minOfShort")
fun Iterable<Short>.min(): Short {
    require(any()) { "empty." }
    return Calculator.min(this)
}

@JvmName("minOfInt")
fun Iterable<Int>.min(): Int {
    require(any()) { "empty." }
    return Calculator.min(this)
}

@JvmName("minOfLong")
fun Iterable<Long>.min(): Long {
    require(any()) { "empty." }
    return Calculator.min(this)
}

@JvmName("minOfFloat")
fun Iterable<Float>.min(): Float {
    require(any()) { "empty." }
    return Calculator.min(this)
}

@JvmName("minOfDouble")
fun Iterable<Double>.min(): Double {
    require(any()) { "empty." }
    return Calculator.min(this)
}

@JvmName("minOfByte")
fun Array<Byte>.min(): Byte {
    require(any()) { "empty." }
    return Calculator.min(this)
}

@JvmName("minOfShort")
fun Array<Short>.min(): Short {
    require(any()) { "empty." }
    return Calculator.min(this)
}

@JvmName("minOfInt")
fun Array<Int>.min(): Int {
    require(any()) { "empty." }
    return Calculator.min(this)
}

@JvmName("minOfLong")
fun Array<Long>.min(): Long {
    require(any()) { "empty." }
    return Calculator.min(this)
}

@JvmName("minOfFloat")
fun Array<Float>.min(): Float {
    require(any()) { "empty." }
    return Calculator.min(this)
}

@JvmName("minOfDouble")
fun Array<Double>.min(): Double {
    require(any()) { "empty." }
    return Calculator.min(this)
}

fun ByteArray.min(): Byte {
    require(any()) { "empty." }
    return Calculator.min(this)
}

fun ShortArray.min(): Short {
    require(any()) { "empty." }
    return Calculator.min(this)
}

fun IntArray.min(): Int {
    require(any()) { "empty." }
    return Calculator.min(this)
}

fun LongArray.min(): Long {
    require(any()) { "empty." }
    return Calculator.min(this)
}

fun FloatArray.min(): Float {
    require(any()) { "empty." }
    return Calculator.min(this)
}

fun DoubleArray.min(): Double {
    require(any()) { "empty." }
    return Calculator.min(this)
}

fun <T : Comparable<T>> Sequence<T>.min(): T {
    require(any()) { "empty" }
    return Calculator.min(this)
}

fun <T : Comparable<T>> Iterable<T>.min(): T {
    require(any()) { "empty" }
    return Calculator.min(this)
}

fun <T : Comparable<T>> Array<T>.min(): T {
    require(any()) { "empty" }
    return Calculator.min(this)
}

@JvmName("minOfByte")
fun <T> Sequence<T>.min(selector: (T) -> Byte): Byte = map(selector).min()

@JvmName("minOfShort")
fun <T> Sequence<T>.min(selector: (T) -> Short): Short = map(selector).min()

@JvmName("minOfInt")
fun <T> Sequence<T>.min(selector: (T) -> Int): Int = map(selector).min()

@JvmName("minOfLong")
fun <T> Sequence<T>.min(selector: (T) -> Long): Long = map(selector).min()

@JvmName("minOfFloat")
fun <T> Sequence<T>.min(selector: (T) -> Float): Float = map(selector).min()

@JvmName("minOfDouble")
fun <T> Sequence<T>.min(selector: (T) -> Double): Double = map(selector).min()

@JvmName("minOfByte")
fun <T> Iterable<T>.min(selector: (T) -> Byte): Byte = map(selector).min()

@JvmName("minOfShort")
fun <T> Iterable<T>.min(selector: (T) -> Short): Short = map(selector).min()

@JvmName("minOfInt")
fun <T> Iterable<T>.min(selector: (T) -> Int): Int = map(selector).min()

@JvmName("minOfLong")
fun <T> Iterable<T>.min(selector: (T) -> Long): Long = map(selector).min()

@JvmName("minOfFloat")
fun <T> Iterable<T>.min(selector: (T) -> Float): Float = map(selector).min()

@JvmName("minOfDouble")
fun <T> Iterable<T>.min(selector: (T) -> Double): Double = map(selector).min()

@JvmName("minOfByte")
fun <T> Array<T>.min(selector: (T) -> Byte): Byte = map(selector).min()

@JvmName("minOfShort")
fun <T> Array<T>.min(selector: (T) -> Short): Short = map(selector).min()

@JvmName("minOfInt")
fun <T> Array<T>.min(selector: (T) -> Int): Int = map(selector).min()

@JvmName("minOfLong")
fun <T> Array<T>.min(selector: (T) -> Long): Long = map(selector).min()

@JvmName("minOfFloat")
fun <T> Array<T>.min(selector: (T) -> Float): Float = map(selector).min()

@JvmName("minOfDouble")
fun <T> Array<T>.min(selector: (T) -> Double): Double = map(selector).min()

@JvmName("minOfByte")
fun ByteArray.min(selector: (Byte) -> Byte): Byte = map(selector).min()

@JvmName("minOfShort")
fun ByteArray.min(selector: (Byte) -> Short): Short = map(selector).min()

@JvmName("minOfInt")
fun ByteArray.min(selector: (Byte) -> Int): Int = map(selector).min()

@JvmName("minOfLong")
fun ByteArray.min(selector: (Byte) -> Long): Long = map(selector).min()

@JvmName("minOfFloat")
fun ByteArray.min(selector: (Byte) -> Float): Float = map(selector).min()

@JvmName("minOfDouble")
fun ByteArray.min(selector: (Byte) -> Double): Double = map(selector).min()

@JvmName("minOfByte")
fun ShortArray.min(selector: (Short) -> Byte): Byte = map(selector).min()

@JvmName("minOfShort")
fun ShortArray.min(selector: (Short) -> Short): Short = map(selector).min()

@JvmName("minOfInt")
fun ShortArray.min(selector: (Short) -> Int): Int = map(selector).min()

@JvmName("minOfLong")
fun ShortArray.min(selector: (Short) -> Long): Long = map(selector).min()

@JvmName("minOfFloat")
fun ShortArray.min(selector: (Short) -> Float): Float = map(selector).min()

@JvmName("minOfDouble")
fun ShortArray.min(selector: (Short) -> Double): Double = map(selector).min()

@JvmName("minOfByte")
fun IntArray.min(selector: (Int) -> Byte): Byte = map(selector).min()

@JvmName("minOfShort")
fun IntArray.min(selector: (Int) -> Short): Short = map(selector).min()

@JvmName("minOfInt")
fun IntArray.min(selector: (Int) -> Int): Int = map(selector).min()

@JvmName("minOfLong")
fun IntArray.min(selector: (Int) -> Long): Long = map(selector).min()

@JvmName("minOfFloat")
fun IntArray.min(selector: (Int) -> Float): Float = map(selector).min()

@JvmName("minOfDouble")
fun IntArray.min(selector: (Int) -> Double): Double = map(selector).min()

@JvmName("minOfByte")
fun LongArray.min(selector: (Long) -> Byte): Byte = map(selector).min()

@JvmName("minOfShort")
fun LongArray.min(selector: (Long) -> Short): Short = map(selector).min()

@JvmName("minOfInt")
fun LongArray.min(selector: (Long) -> Int): Int = map(selector).min()

@JvmName("minOfLong")
fun LongArray.min(selector: (Long) -> Long): Long = map(selector).min()

@JvmName("minOfFloat")
fun LongArray.min(selector: (Long) -> Float): Float = map(selector).min()

@JvmName("minOfDouble")
fun LongArray.min(selector: (Long) -> Double): Double = map(selector).min()

@JvmName("minOfByte")
fun FloatArray.min(selector: (Float) -> Byte): Byte = map(selector).min()

@JvmName("minOfShort")
fun FloatArray.min(selector: (Float) -> Short): Short = map(selector).min()

@JvmName("minOfInt")
fun FloatArray.min(selector: (Float) -> Int): Int = map(selector).min()

@JvmName("minOfLong")
fun FloatArray.min(selector: (Float) -> Long): Long = map(selector).min()

@JvmName("minOfFloat")
fun FloatArray.min(selector: (Float) -> Float): Float = map(selector).min()

@JvmName("minOfDouble")
fun FloatArray.min(selector: (Float) -> Double): Double = map(selector).min()

@JvmName("minOfByte")
fun DoubleArray.min(selector: (Double) -> Byte): Byte = map(selector).min()

@JvmName("minOfShort")
fun DoubleArray.min(selector: (Double) -> Short): Short = map(selector).min()

@JvmName("minOfInt")
fun DoubleArray.min(selector: (Double) -> Int): Int = map(selector).min()

@JvmName("minOfLong")
fun DoubleArray.min(selector: (Double) -> Long): Long = map(selector).min()

@JvmName("minOfFloat")
fun DoubleArray.min(selector: (Double) -> Float): Float = map(selector).min()

@JvmName("minOfDouble")
fun DoubleArray.min(selector: (Double) -> Double): Double = map(selector).min()

@JvmName("minOfByte")
fun <TSourceK, TSourceV> Map<TSourceK, TSourceV>.min(selector: (Map.Entry<TSourceK, TSourceV>) -> Byte): Byte = map(selector).min()

@JvmName("minOfShort")
fun <TSourceK, TSourceV> Map<TSourceK, TSourceV>.min(selector: (Map.Entry<TSourceK, TSourceV>) -> Short): Short = map(selector).min()

@JvmName("minOfInt")
fun <TSourceK, TSourceV> Map<TSourceK, TSourceV>.min(selector: (Map.Entry<TSourceK, TSourceV>) -> Int): Int = map(selector).min()

@JvmName("minOfLong")
fun <TSourceK, TSourceV> Map<TSourceK, TSourceV>.min(selector: (Map.Entry<TSourceK, TSourceV>) -> Long): Long = map(selector).min()

@JvmName("minOfFloat")
fun <TSourceK, TSourceV> Map<TSourceK, TSourceV>.min(selector: (Map.Entry<TSourceK, TSourceV>) -> Float): Float = map(selector).min()

@JvmName("minOfDouble")
fun <TSourceK, TSourceV> Map<TSourceK, TSourceV>.min(selector: (Map.Entry<TSourceK, TSourceV>) -> Double): Double = map(selector).min()
