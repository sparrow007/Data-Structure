package kotlinLearning

import java.util.*

fun main() {

    val items = listOf(1, 2,3, 5)
    items.fold(0, {
        acc: Int, nextElement: Int ->
        println("acc $acc , i = $nextElement, ")
        val result = acc + 1
        println("result = $result")
        result
    })

    val joinToString = items.fold("Elements : ", {acc, i -> acc + " 0" + i})

    println(joinToString)

}


//you can create a fucntion inside of another function

fun <T, R> Collection<T>.fold(initial : R,
             combine : (acc : R, nextElement : T) -> R)  : R {
    var accumulator : R = initial

    for (element : T in this) {
        accumulator = combine(accumulator, element)
    }

    return accumulator
}

