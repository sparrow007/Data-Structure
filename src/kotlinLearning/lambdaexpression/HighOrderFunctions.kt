package kotlinLearning.lambdaexpression


/**
 * Extension function for collection
 */
fun <T, R> Collection<T>.fold(
        initial: R,
        combine: (acc: R, nextElement: T) -> R
) : R {
    var accumulator : R = initial
    for (element : T in this) {
        accumulator = combine (accumulator, element)
    }
    return accumulator
}

//Calling the fold
fun main() {

    //Create an collection
    val items = listOf(1, 2, 3, 4)

    items.fold(0, {
        acc: Int, i: Int ->
        println("acc = $acc and nextElement = $i ")
        val result =  acc + i
        println("result = $result")
        result
    })

    //paramter type in lambda is optional
    items.fold(1, {
        acc, i ->
        val result = acc + i
        println("result = $result")
        result
    })

    val values = items.fold(1, Int::times)
    println("values = $values")

}
