package programs.basic

fun main() {
    //call the function
    val items = listOf(1, 2, 3, 4, 5)

    val data = items.fold(1, Int::minus)
    print(data)
}

fun <T, R> Collection<T>.fold(
        initial: R,
        combine: (acc: R, nextElement: T) -> R
): R {
    var accumulator: R = initial
    for (element: T in this) {
        accumulator = combine(accumulator, element)
    }
    return accumulator
}


//infix notation
infix fun Int.ank(a: Int) {
    println("I am getting call from the infix")
}

fun showVararg(name: String, vararg age: Int) {
    println(age)
}

fun add (a: Int, b: Int) = a + b

/**
 * Normal function
 */
fun add(a: String, b: String): String {
    return  a + b
}

open class A {
    open fun ten(i: Int = 0) {

    }
}

class B : A() {

    override fun ten(i: Int) {

    }

}