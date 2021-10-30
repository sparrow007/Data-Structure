package programs.basic

fun main() {
    //call the function
    1 shl 5
}

//infix notation
infix fun Int.shl(a: Int) {
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