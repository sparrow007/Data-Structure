package kotlinLearning.delegation

private interface Base {
    fun callMe()
}

 class BaseImpl : Base {
    override fun callMe() {
        println("Yes Base is gets called");
    }
}
private class Derived  constructor(b: Base) : Base by b

fun main() {
    val b = BaseImpl()
    Derived(b).callMe()
}