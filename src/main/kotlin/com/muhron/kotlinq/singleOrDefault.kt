import com.muhron.kotlinq.where

// singleOrDefault
fun <TSource> Sequence<TSource>.singleOrDefault(): TSource? {
    val iterator = iterator()
    if (!iterator.hasNext()) {
        return null
    }
    val single = iterator.next()
    if (iterator.hasNext()) {
        throw IllegalArgumentException("Duplicate elements")
    }
    return single
}

fun <TSource> Iterable<TSource>.singleOrDefault(): TSource? =
        asSequence().singleOrDefault()

fun <TSourceK, TSourceV> Map<TSourceK, TSourceV>.singleOrDefault(): Map.Entry<TSourceK, TSourceV>? =
        asSequence().singleOrDefault()

fun <TSource> Array<TSource>.singleOrDefault(): TSource? =
        asSequence().singleOrDefault()

// singleOrDefault with predicate
fun <TSource> Sequence<TSource>.singleOrDefault(predicate: (TSource) -> Boolean): TSource? =
        where(predicate).singleOrDefault()

fun <TSource> Iterable<TSource>.singleOrDefault(predicate: (TSource) -> Boolean): TSource? =
        asSequence().singleOrDefault(predicate)

fun <TSourceK, TSourceV> Map<TSourceK, TSourceV>.singleOrDefault(predicate: (Map.Entry<TSourceK, TSourceV>) -> Boolean): Map.Entry<TSourceK, TSourceV>? =
        asSequence().singleOrDefault(predicate)

fun <TSource> Array<TSource>.singleOrDefault(predicate: (TSource) -> Boolean): TSource? =
        asSequence().singleOrDefault(predicate)
