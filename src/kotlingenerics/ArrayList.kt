package kotlingenerics



//This is how we can create an inteface with generics class and interface and use it as in the body of it's interface
interface List<T> {
    fun playCool(value: T)
}

class MyClass<T> {


    fun addValue(value: T) {

    }

}

/*
*
* If you implement or extend a generics class you need to provide the type to the base
 */

//This class using the specific type parameter
class StringList: List<String> {
    override fun playCool(value: String) {
        TODO("Not yet implemented")
    }
}
/*
This class uses another type parameter
 */
class ArrayList<T>: List<T> {
    override fun playCool(value: T) {
        TODO("Not yet implemented")
    }
}