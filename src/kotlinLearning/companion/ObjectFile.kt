package kotlinLearning.companion

class A {
    companion object {
        fun create() {}
    }
}

val f = A

interface Facotry<T> {
    fun create() : T
}

open class MyClass {
    companion object : Facotry <MyClass> {
        override fun create() = MyClass()
    }
}

val instance : Facotry<MyClass> = MyClass


fun main() {
    f.create()

}

class C {
    // Private function, so the return type is the anonymous object type
    private fun foo() = object {
        val x: String = "x"
    }

    // Public function, so the return type is Any
    fun publicFoo() = object {
        val x: String = "x"
    }

   private val a  = object {
        var x = "name"
    }

    fun bar() {
        val x1 = foo().x        // Works
        

        // ERROR: Unresolved reference 'x'
    }
}