package kotlinlambdas

fun main() {
    val personsList = listOf(Person("ankit", 24), Person("suman", 25))
}

data class Person(val name: String, val age: Int)