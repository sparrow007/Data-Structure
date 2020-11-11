package kotlinLearning

fun main() {


    //Spider and the dog are the subtype of the animal
  val dog = Dog()

    val spider = Spider()

    val animal : Animal = dog
    val another : Animal = spider

}

abstract class Animal(val size : Int)

class Dog : Animal(20)
class Spider : Animal(40)