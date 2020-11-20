package kotlinLearning

fun main() {

    reformat(string = "name", isProvided = false, isComplete = true)

    foo(string = *arrayOf("1", "2", "4"))
}

fun reformat(string: String= "" ,
            isComplete : Boolean = false,
             isEmpty : Boolean = true,
             isProvided : Boolean = false,
             word : Char = '_') {

}

fun foo(vararg string: String) {
   for (  data in string) println(data)
}

open class A {
   open fun show(age : Int  = 9) {
        println("the value in the a class is  $age")
    }
}

class B : A() {
    override fun show(age: Int ) {
        println("the value of the age " + age)
    }
}