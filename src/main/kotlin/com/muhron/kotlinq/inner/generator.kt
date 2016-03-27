package com.muhron.kotlinq.inner

import java.io.File

fun main(args: Array<String>) {
    val calculatorPrefix = """package com.muhron.kotlinq.inner

internal object Calculator {"""

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
            typeDefs.map { createCalculatorSum(it) } +
            numberTypes.map { createCalculatorAverageArray(it) } +
            combination(listOf("min", "max"), numberTypes).map { createCalculatorMinMaxArray(it.second, it.first) } +
            numberTypes.map { createCalculatorSumArray(it) } +
            combination(listOf("min", "max"), collectionTypes).map { createCalculatorMinMaxT(it.second, it.first) }

    val calculatorSource = calculatorMethods.joinToString(separator = "\n", prefix = calculatorPrefix, postfix = calculatorPostfix)
    File("src/main/kotlin/com/muhron/kotlinq/inner/calculator.kt").writeText(calculatorSource)

    val averageMethods = typeDefs.map { createAverageExtension(it) } +
            numberTypes.map { createAverageArrayExtension(it) } +
            typeDefs.map { createSelectorAverage(it.collectionTypeName, it.numberTypeName) } +
            combination(numberTypes, numberTypes).map { createSelectorAverageArray(it.first, it.second) } +
            numberTypes.map { createSelectorAverageMap(it) }
    val averageMethodsSource = averageMethods.joinToString (separator = "\n", prefix = extensionsPrefix, postfix = "\n")
    File("src/main/kotlin/com/muhron/kotlinq/average.kt").writeText(averageMethodsSource)

    val minMethods = typeDefs.map { createMinMaxExtension(it, "min") } +
            numberTypes.map { createMinMaxArrayExtension(it, "min") } +
            collectionTypes.map { createExtensionMinMaxT(it, "min") } +
            typeDefs.map { createSelectorMinMax(it.collectionTypeName, it.numberTypeName, "min") } +
            combination(numberTypes, numberTypes).map { createSelectorMinMaxArray(it.first, it.second, "min") } +
            numberTypes.map { createSelectorMinMaxMap(it, "min") }
    val minMethodsSource = minMethods.joinToString (separator = "\n", prefix = extensionsPrefix, postfix = "\n")
    File("src/main/kotlin/com/muhron/kotlinq/min.kt").writeText(minMethodsSource)

    val maxMethods = typeDefs.map { createMinMaxExtension(it, "max") } +
            numberTypes.map { createMinMaxArrayExtension(it, "max") } +
            collectionTypes.map { createExtensionMinMaxT(it, "max") } +
            typeDefs.map { createSelectorMinMax(it.collectionTypeName, it.numberTypeName, "max") } +
            combination(numberTypes, numberTypes).map { createSelectorMinMaxArray(it.first, it.second, "max") } +
            numberTypes.map { createSelectorMinMaxMap(it, "max") }
    val maxMethodsSource = maxMethods.joinToString (separator = "\n", prefix = extensionsPrefix, postfix = "\n")
    File("src/main/kotlin/com/muhron/kotlinq/max.kt").writeText(maxMethodsSource)

    val sumMethods = typeDefs.map { createSumExtension(it) } +
            numberTypes.map { createSumArrayExtension(it) } +
            typeDefs.map { createSelectorSum(it.collectionTypeName, it.numberTypeName) } +
            combination(numberTypes, numberTypes).map { createSelectorSumArray(it.first, it.second) } +
            numberTypes.map { createSelectorSumMap(it) }
    val sumMethodsSource = sumMethods.joinToString (separator = "\n", prefix = extensionsPrefix, postfix = "\n")
    File("src/main/kotlin/com/muhron/kotlinq/sum.kt").writeText(sumMethodsSource)
}

data class TypeDef(val collectionTypeName: String, val numberTypeName: String)

// calcluator method
fun createCalculatorAverage(typeDef: TypeDef) =
        createCalculator(typeDef, "Double", "average")

fun createCalculatorMinMax(typeDef: TypeDef, methodName: String) =
        createCalculator(typeDef, typeDef.numberTypeName, methodName, "!!")

fun createCalculatorSum(typeDef: TypeDef) =
        createCalculator(typeDef, toSumReturnType(typeDef.numberTypeName), "sum")

fun createCalculator(typeDef: TypeDef, returnType: String, methodName: String, methodSuffix: String = "") = """
    @JvmName("${methodName}Of${typeDef.numberTypeName}")
    fun $methodName(${typeDef.collectionTypeName.toLowerCase()}: ${typeDef.collectionTypeName}<${typeDef.numberTypeName}>): $returnType = ${typeDef.collectionTypeName.toLowerCase()}.$methodName()$methodSuffix"""

// calculator method with Array
fun createCalculatorAverageArray(numberTypeName: String) =
        createCalculatorArray(numberTypeName, "Double", "average")

fun createCalculatorMinMaxArray(numberTypeName: String, methodName: String) =
        createCalculatorArray(numberTypeName, numberTypeName, methodName, "!!")

fun createCalculatorSumArray(numberTypeName: String) =
        createCalculatorArray(numberTypeName, toSumReturnType(numberTypeName), "sum")

fun createCalculatorArray(numberTypeName: String, retunTypeName: String, methodName: String, methodSuffix: String = "") = """
    fun $methodName(${numberTypeName.toLowerCase()}Array: ${numberTypeName}Array): $retunTypeName = ${numberTypeName.toLowerCase()}Array.$methodName()$methodSuffix"""

// Extensions template
fun createAverageExtension(typeDef: TypeDef) =
        createExtension(typeDef, "Double", "average")

fun createMinMaxExtension(typeDef: TypeDef, methodName: String) =
        createExtension(typeDef, typeDef.numberTypeName, methodName)

fun createSumExtension(typeDef: TypeDef) =
        createExtension(typeDef, toSumReturnType(typeDef.numberTypeName), "sum")

fun createExtension(typeDef: TypeDef, returnType: String, methodName: String) = """
@JvmName("${methodName}Of${typeDef.numberTypeName}")
fun ${typeDef.collectionTypeName}<${typeDef.numberTypeName}>.$methodName(): $returnType {
    require(any()) { "empty." }
    return Calculator.$methodName(this)
}"""

// methods for Array
fun createAverageArrayExtension(numberType: String) =
        createArrayExtension(numberType, "Double", "average")

fun createMinMaxArrayExtension(numberType: String, methodName: String) =
        createArrayExtension(numberType, numberType, methodName)

fun createSumArrayExtension(numberType: String) =
        createArrayExtension(numberType, toSumReturnType(numberType), "sum")

fun createArrayExtension(numberType: String, returnType: String, methodName: String) = """
fun ${numberType}Array.$methodName(): $returnType {
    require(any()) { "empty." }
    return Calculator.$methodName(this)
}"""

// min and max for <T : Comparable<T>> xxx<T>
fun createCalculatorMinMaxT(collectionTypeName: String, methodName: String) = """
    fun <T : Comparable<T>> $methodName(${collectionTypeName.toLowerCase()}: $collectionTypeName<T>): T = ${collectionTypeName.toLowerCase()}.$methodName()!!"""

fun createExtensionMinMaxT(collectionTypeName: String, methodName: String): String = """
fun <T : Comparable<T>> $collectionTypeName<T>.$methodName(): T {
    require(any()) { "empty" }
    return Calculator.$methodName(this)
}"""

// methods with selector
fun createSelectorAverage(collectionType: String, numberType: String) =
        createSelector(collectionType, numberType, "Double", "average")

fun createSelectorMinMax(collectionType: String, numberType: String, methodName: String) =
        createSelector(collectionType, numberType, numberType, methodName)

fun createSelectorSum(collectionType: String, numberType: String) =
        createSelector(collectionType, numberType, toSumReturnType(numberType), "sum")

fun createSelector(collectionType: String, numberType: String, returnType: String, methodName: String) = """
@JvmName("${methodName}Of$numberType")
fun <T> $collectionType<T>.$methodName(selector: (T) -> $numberType): $returnType = map(selector).$methodName()"""

// methods with selector for Array
fun createSelectorAverageArray(arrayNumberType: String, selectorNumberType: String) =
        createSelectorArray(arrayNumberType, selectorNumberType, "Double", "average")

fun createSelectorMinMaxArray(arrayNumberType: String, selectorNumberType: String, methodName: String) =
        createSelectorArray(arrayNumberType, selectorNumberType, selectorNumberType, methodName)

fun createSelectorSumArray(arrayNumberType: String, selectorNumberType: String) =
        createSelectorArray(arrayNumberType, selectorNumberType, toSumReturnType(selectorNumberType), "sum")

fun createSelectorArray(arrayNumberType: String, selectorNumberType: String, returnType: String, methodName: String) = """
@JvmName("${methodName}Of$selectorNumberType")
fun ${arrayNumberType}Array.$methodName(selector: ($arrayNumberType) -> $selectorNumberType): $returnType = map(selector).$methodName()"""

// methods with selector for Map
fun createSelectorAverageMap(numberTypeName: String) = createSelectorMap(numberTypeName, "Double", "average")

fun createSelectorMinMaxMap(numberTypeName: String, methodName: String) = createSelectorMap(numberTypeName, numberTypeName, methodName)

fun createSelectorSumMap(numberTypeName: String): String = createSelectorMap(numberTypeName, toSumReturnType(numberTypeName), "sum")

fun createSelectorMap(numberTypeName: String, returnTypeName: String, methodName: String) = """
@JvmName("${methodName}Of$numberTypeName")
fun <TSourceK, TSourceV> Map<TSourceK, TSourceV>.$methodName(selector: (Map.Entry<TSourceK, TSourceV>) -> $numberTypeName): $returnTypeName = map(selector).$methodName()"""

fun toSumReturnType(numberTypeName: String): String = when (numberTypeName) {
    "Int" -> "Int"
    "Byte" -> "Int"
    "Short" -> "Int"
    "Long" -> "Long"
    "Float" -> "Float"
    "Double" -> "Double"
    else -> throw Exception()
}

fun <T1, T2> combination(list1: List<T1>, list2: List<T2>): List<Pair<T1, T2>> =
        list1.flatMap { t1 -> list2.map { t2 -> t1 to t2 } }
