package kotlinLearning.delegation

private interface BaseDelgatin {
    fun printMe()
    fun printMessage()
}

private class BaseDelgationImpl : BaseDelgatin {
    override fun printMe() {
        println("Yes Base is called")
    }

    override fun printMessage() {
        println("Print Message in the base yes!!")
    }

}

private class DelegationBaseImple constructor(b : BaseDelgatin) : BaseDelgatin by b {
    override fun printMe() {
        println("Yes you called the delegation method implementation ")
    }
}

fun main() {
    val b = BaseDelgationImpl()
   val d =  DelegationBaseImple(b)
    d.printMe()
    d.printMessage()

}

