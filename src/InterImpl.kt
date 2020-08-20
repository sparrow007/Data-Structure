class InterImpl : FirstInter {
    override val prop: Int
        get(){
            return 90
        }

    var name : String
         get() = "Ankit"
         set(value) {
             println("This is cool")
         }

    override fun boo() {
        println("Yes the boo has been implemented by the InterImpl class")
        foo()
    }

    fun checkProp() {

    }
}