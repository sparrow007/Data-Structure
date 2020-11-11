package kotlinLearning

fun main() {

    //The type realtion between dog and animal is preserved
    //so list of dog can be assign to the animal (subtype)
    //

    val dogList : List<Dog> = listOf(Dog(), Dog())

    val animalList : List<Animal> = dogList

}