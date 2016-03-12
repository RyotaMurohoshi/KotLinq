package com.muhron.kotlinq

internal inline fun notIndexOutOfBounds(value: Boolean, lazyMessage: () -> Any): Unit {
    if (value) {
        val message = lazyMessage()
        throw IndexOutOfBoundsException(message.toString())
    }
}
