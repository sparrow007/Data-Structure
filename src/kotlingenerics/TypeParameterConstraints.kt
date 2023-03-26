package kotlingenerics

class OnlyNumber<T: Number> {

    fun sum(list: List<T>): T {
       val sum = 1;
        list.forEach {
            it += it
        }
    }
}