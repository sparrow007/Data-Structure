class Derived : Base {

    constructor(p : Int) : super(p) {
        println("Dreived secondary constructor = " + p)
    }

    constructor(name : String) : this(40) {
        println("Dreived secondary constructor = " + name)
    }

    //Drieved class can't have the same type because it's not override by it's super clss
    //In order to make it work you need to make parent class methods for inheritance by add prefeix as
    //open so that overriding can be possible.
    override fun fill() {
        println("Yes this is a fun method in derived class")
    }

    internal var b = 0

    fun read() {
        println("The value of b is ${b}")
    }

}