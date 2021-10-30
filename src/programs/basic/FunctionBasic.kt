package programs.basic

fun main() {
    //call the function
    println(add("ankit ", "kumar"))
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