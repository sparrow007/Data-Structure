package kotlingenerics

fun main() {
    val authors = listOf("Dmitry", "Svetlana", "Skydoves")
    val readers = listOf("ankit", "suman", "Dmitry")
    val process = Process<String>()
    process.process(9.0f)
    val names = listOf<String>("Ankit", "Sam")
}

fun <T> List<T>.filter(predicate: (T) -> Boolean ): List<T> {
    val updatedList = mutableListOf<T>()
    this.forEach {
        if (predicate(it)) {
            updatedList.add(it)
        }
    }
    return updatedList
}

fun <T: Comparable<T>> findMaximum(first: T, second: T): T {
   return if (first > second) first else second
}

class Process<T: Any> {
    fun <M> process(value: M) {
        println(value)
    }

}