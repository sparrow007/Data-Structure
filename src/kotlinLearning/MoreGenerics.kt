package kotlinLearning

data class Course(val name : String)

class OddList<T>(val list : List<T>) {

    //Only has the odd index items in the list
    fun oddItems() : List<T> {
        return list.filterIndexed {index, t -> index % 2 == 1 }
    }

}

fun main() {

    val listofString = listOf("Ankit", "Suman", "Udit", "Manish", "Hariom")
    val resultString : OddList<String> = OddList(listofString)
    println(resultString.oddItems())

    val llistOfInts = listOf(3,5,7,43,2,4)
    val resultInt : OddList<Int> = OddList(llistOfInts)
    println(resultInt.oddItems())


    val course = listOf(Course("Kotlin"), Course("Java"), Course("C#"), Course("C++"))
    val resultCourse = OddList(course).oddItems()
    println(resultCourse)


}