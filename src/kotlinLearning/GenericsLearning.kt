package kotlinLearning

fun main() {
    val obj = Gen<Int>(1)
    print(obj.value)
}
class Gen<T>(t : T) {
    val value = t
}

