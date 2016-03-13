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

fun <K, V> Map<K, V>.singleOrDefault(): Map.Entry<K, V>? =
        asSequence().singleOrDefault()

fun <TSource> Array<TSource>.singleOrDefault(): TSource? =
        asSequence().singleOrDefault()

// singleOrDefault with predicate
fun <TSource> Sequence<TSource>.singleOrDefault(predicate: (TSource) -> Boolean): TSource? =
        where(predicate).singleOrDefault()

fun <TSource> Iterable<TSource>.singleOrDefault(predicate: (TSource) -> Boolean): TSource? =
        asSequence().singleOrDefault(predicate)

fun <K, V> Map<K, V>.singleOrDefault(predicate: (Map.Entry<K, V>) -> Boolean): Map.Entry<K, V>? =
        asSequence().singleOrDefault(predicate)

fun <TSource> Array<TSource>.singleOrDefault(predicate: (TSource) -> Boolean): TSource? =
        asSequence().singleOrDefault(predicate)
