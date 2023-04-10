package kotlingenerics

fun main() {
    val authors = listOf("Dmitry", "Svetlana", "Skydoves")
    val readers = listOf("ankit", "suman", "Dmitry")
    print(readers.filter { it !in authors })
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