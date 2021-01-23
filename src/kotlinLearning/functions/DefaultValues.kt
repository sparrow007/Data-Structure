package kotlinLearning.functions

private open class A {
   open fun foo(data: Int = 9) {}
}

private class B : A (){
    override fun foo(data: Int) {
        println(data)
    }

}

fun main() {
    val b = B()
    b.foo()
}

