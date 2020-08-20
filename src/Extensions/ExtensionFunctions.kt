package Extensions

fun main(args : Array<String>) {

  val list = mutableListOf<Int>(2, 4, 8, 9)


}

fun MutableList<Int>.swap(index1 : Int, index2 : Int) {
    val tmp = this[index1]//this repersents the list
    this[index1] = this[index2]
    this[index2] = tmp
}