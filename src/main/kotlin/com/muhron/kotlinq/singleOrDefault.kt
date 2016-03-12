import com.muhron.kotlinq.where

// singleOrDefault
fun <T> Sequence<T>.singleOrDefault(): T? {
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

fun <T> Iterable<T>.singleOrDefault(): T? =
        asSequence().singleOrDefault()

fun <K, V> Map<K, V>.singleOrDefault(): Map.Entry<K, V>? =
        asSequence().singleOrDefault()

fun <T> Array<T>.singleOrDefault(): T? =
        asSequence().singleOrDefault()

// singleOrDefault with predicate
fun <T> Sequence<T>.singleOrDefault(predicate: (T) -> Boolean): T? =
        where(predicate).singleOrDefault()

fun <T> Iterable<T>.singleOrDefault(predicate: (T) -> Boolean): T? =
        asSequence().singleOrDefault(predicate)

fun <K, V> Map<K, V>.singleOrDefault(predicate: (Map.Entry<K, V>) -> Boolean): Map.Entry<K, V>? =
        asSequence().singleOrDefault(predicate)

fun <T> Array<T>.singleOrDefault(predicate: (T) -> Boolean): T? =
        asSequence().singleOrDefault(predicate)
