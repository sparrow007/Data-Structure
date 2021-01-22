package kotlinLearning.nestedclasses

/**
 *
 * Nested classes can not used the members of the outer class
 * all the combinations of classes and interface can be easily be performed
 */
class A {
    var x = "class"
    interface Voomer
    class B {
        val name = "ankit"
        fun getValue() : String {
            return name
        }
    }
}

interface Good {
    class Simple
    interface CoolYes
}


/**
 * Inner class
 * inner classes can access the members of the outer classes and innner class is created with refernce
 * of the outer classes so inner class carry the reference of the outer class
 */

class C {
    var x = "this is awesome"
    inner class D {
        val cool = "yes i am cool"
        fun getValue() {
///            this@C.D().getValue()
            println(x + cool)
        }
    }

}

fun main() {
    val c = C().D().getValue()

}