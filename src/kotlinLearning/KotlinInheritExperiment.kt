package kotlinLearning

fun main() {

    val bird : Sparrow = Sparrow()

    bird.callMeAnimal()
    bird.callMeSparrow()


}

open class Bird {

    fun callMeAnimal() {
        println("Yes you have call me ")
    }

}

class Sparrow : Bird() {

    fun callMeSparrow() {
        println("Yes you call the sparrow")
    }


}


