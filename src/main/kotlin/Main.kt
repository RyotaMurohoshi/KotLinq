import kotlinx.coroutines.generate

fun main(args: Array<String>) {
    println(sequenceOf(1, 2, 3, 4, 5, 6)
            .where {  it % 2 == 0 }
            .select { it  * it }
            .joinToString(","))
}

fun <T, S> Sequence<T>.select(selector: (T) -> S) : Sequence<S> = generate {
    for(it in this@select){
        yield(selector(it))
    }
}

fun <T> Sequence<T>.where(predicate: (T) -> Boolean) : Sequence<T> = generate {
    for(it in this@where){
        if(predicate(it)) {
            yield(it)
        }
    }
}
