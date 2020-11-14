package kotlinLearning

fun main() {

    //compiler intancetitiate for us and make it singleton
    Singleton.callMe()

    //Calling the object from the class
    OuterClass.My.callUs()
}

//Can't call the property of outer class from the innner object (you can't use the inner)
class OuterClass {
    val value : Int = 0
    object My {
        fun callUs() {
            println("Yes the calling pattern is used")
        }
    }

}