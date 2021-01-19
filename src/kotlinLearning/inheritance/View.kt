package kotlinLearning.inheritance

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper


open class MV (p : Int){
    init {
        val c = p
    }
    constructor(p: Int, name : String) : this (p){

    }
    constructor(p : Int, size : Int) : this(p, "hello") {

    }
}

class S : MV {
    constructor(p : Int, clss : String) : super(p) {

    }

    constructor(p : Int, values: String, name: StringNameHelper) : super(p, values) {

    }
}


var firstName : String  //backing field generated
    get() = firstName
    set(value) {firstName = value}

fun main() {
    var v :String ?= "hello"
    v = null


    print(v)
}

open class Shape {
    open fun draw() { /*...*/ }
    fun fill() { /*...*/ }
}

class Circle() : Shape() {
    override fun draw() { /*...*/ }
}

