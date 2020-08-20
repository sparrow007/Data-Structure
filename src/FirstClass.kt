class FirstClass {

    init {
        print("Hi this first init blocks")
    }

    val age = 10.also(::println)

    constructor(name : String, age : Int){
        println("Name in the secondary constructor is ${name}")
    }

    init {
        print("Hi this second init blocks")
    }

}