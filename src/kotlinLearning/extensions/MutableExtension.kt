package kotlinLearning.extensions

fun MutableList<Int>.swap(index: Int, index2: Int) {
    val temp = this[index]
    this[index] = this[index2]
    this[index2] = temp
}

fun <T> MutableList<T>.swap2(index : Int, index2 : Int) {
    val temp = this[index]
    this[index] = this[index2]
    this[index2] = temp
}

fun main() {
    val list = mutableListOf(1.0, 2.0, 3)

    println(list)

    //currently swap function is only for the int values
    //Now we can make this for the float and then for this things
    //Generics would be the best things so that we can actually do that
    list.swap2(0,1)

    print(list)
}