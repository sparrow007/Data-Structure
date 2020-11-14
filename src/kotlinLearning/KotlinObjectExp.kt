package kotlinLearning

import java.io.Writer

fun main() {

    //compiler intancetitiate for us and make it singleton
    Singleton.callMe()

    //Calling the object from the class
    OuterClass.My.callUs()

    val runnable = object : Runnable {
        override fun run() {
            println("You are running a another thread")
            Thread.sleep(4000)
            println("You have called me afer the 4sec ")
        }

    }

    //Object can be used a anonymous classes
    Thread(runnable).run()

    //You can also extends the class and implement interface with object in all the 3 situations

    val writer = object : Writer() {
        override fun write(cbuf: CharArray, off: Int, len: Int) {
            TODO("Not yet implemented")
        }

        override fun flush() {
            TODO("Not yet implemented")
        }

        override fun close() {
            TODO("Not yet implemented")
        }

    }


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