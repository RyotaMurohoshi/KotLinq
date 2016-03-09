package com.muhron.kotlinq.inner

import java.io.File

fun main(args: Array<String>) {
    val calculatorPrefix = """package com.muhron.kotlinq.inner

object Calculator {"""

    val calculatorPostfix = """
}
"""
    val extensionsPrefix = """package com.muhron.kotlinq

import com.muhron.kotlinq.inner.Calculator
"""

    val collectionTypes = listOf("Sequence", "Iterable", "Array")
    val numberTypes = listOf("Byte", "Short", "Int", "Long", "Float", "Double")
    val typeDefs = combination(collectionTypes, numberTypes).map { TypeDef(it.first, it.second) }

    val calculatorMethods = typeDefs.map { createCalculatorAverage(it) } +
            combination(listOf("min", "max"), typeDefs).map { createCalculatorMinMax(it.second, it.first) } +
            numberTypes.map { createCalculatorAverageArray(it) } +
            combination(listOf("min", "max"), numberTypes).map { createCalculatorMinMaxArray(it.second, it.first) }

    val calculatorSource = calculatorMethods.joinToString(separator = "\n", prefix = calculatorPrefix, postfix = calculatorPostfix)
    File("src/main/kotlin/com/muhron/kotlinq/inner/calculator.kt").writeText(calculatorSource)

    val averageMethods = typeDefs.map { createAverageExtension(it) } + numberTypes.map { createAverageArrayExtension(it) }
    val averageMethodsSource = averageMethods.joinToString (separator = "\n", prefix = extensionsPrefix, postfix = "\n")
    File("src/main/kotlin/com/muhron/kotlinq/average.kt").writeText(averageMethodsSource)

    val minMethods = typeDefs.map { createMinMaxExtension(it, "min") } + numberTypes.map { createMinMaxArrayExtension(it, "min") }
    val minMethodsSource = minMethods.joinToString (separator = "\n", prefix = extensionsPrefix, postfix = "\n")
    File("src/main/kotlin/com/muhron/kotlinq/min.kt").writeText(minMethodsSource)

    val maxMethods = typeDefs.map { createMinMaxExtension(it, "max") } + numberTypes.map { createMinMaxArrayExtension(it, "max") }
    val maxMethodsSource = maxMethods.joinToString (separator = "\n", prefix = extensionsPrefix, postfix = "\n")
    File("src/main/kotlin/com/muhron/kotlinq/max.kt").writeText(maxMethodsSource)
}

data class TypeDef(val collectionTypeName: String, val numberTypeName: String)

// Calcluators template
fun createCalculatorAverage(typeDef: TypeDef) = """
    @JvmName("averageOf${typeDef.numberTypeName}")
    fun average(${typeDef.collectionTypeName.toLowerCase()}: ${typeDef.collectionTypeName}<${typeDef.numberTypeName}>): Double = ${typeDef.collectionTypeName.toLowerCase()}.average()"""

fun createCalculatorAverageArray(numberTypeName: String) = """
    fun average(${numberTypeName.toLowerCase()}Array: ${numberTypeName}Array): Double = ${numberTypeName.toLowerCase()}Array.average()"""

fun createCalculatorMinMax(typeDef: TypeDef, methodName: String) = """
    @JvmName("${methodName}Of${typeDef.numberTypeName}")
    fun $methodName(${typeDef.collectionTypeName.toLowerCase()}: ${typeDef.collectionTypeName}<${typeDef.numberTypeName}>): ${typeDef.numberTypeName} = ${typeDef.collectionTypeName.toLowerCase()}.$methodName()!!"""

fun createCalculatorMinMaxArray(numberTypeName: String, methodName: String) = """
    fun $methodName(${numberTypeName.toLowerCase()}Array: ${numberTypeName}Array): $numberTypeName = ${numberTypeName.toLowerCase()}Array.$methodName()!!"""

// Extensions template
fun createAverageExtension(typeDef: TypeDef) = """
@JvmName("averageOf${typeDef.numberTypeName}")
fun ${typeDef.collectionTypeName}<${typeDef.numberTypeName}>.average(): Double {
    require(any()) { "empty." }
    return Calculator.average(this)
}"""

fun createMinMaxExtension(typeDef: TypeDef, methodName: String) = """
@JvmName("${methodName}Of${typeDef.numberTypeName}")
fun ${typeDef.collectionTypeName}<${typeDef.numberTypeName}>.$methodName(): ${typeDef.numberTypeName} {
    require(any()) { "empty." }
    return Calculator.$methodName(this)
}"""

fun createAverageArrayExtension(numberTypeName: String) = """
fun ${numberTypeName}Array.average(): Double {
    require(any()) { "empty." }
    return Calculator.average(this)
}"""

fun createMinMaxArrayExtension(numberTypeName: String, methodName: String) = """
fun ${numberTypeName}Array.$methodName(): $numberTypeName {
    require(any()) { "empty." }
    return Calculator.$methodName(this)
}"""

fun <T1, T2> combination(list1: List<T1>, list2: List<T2>): List<Pair<T1, T2>> =
        list1.flatMap { t1 -> list2.map { t2 -> t1 to t2 } }
