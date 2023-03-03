package kotlinlambdas

fun main() {
    val personsList = listOf(Person("ankit", 24), Person("suman", 25))
    val oldest = personsList.maxBy(Person::age)
    print(oldest)
}

data class Person(val name: String, val age: Int)