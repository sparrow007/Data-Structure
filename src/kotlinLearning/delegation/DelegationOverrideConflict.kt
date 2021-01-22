package kotlinLearning.delegation

private interface BaseOv {
    val value : String
    fun print()
}

private class BaseOvImple(val x : Int) : BaseOv {
    override val value: String
        get() = "Base Implementation = $x"

    override fun print() {
        println(value)
    }

}

private class DerivedOv (b : BaseOv) : BaseOv by b {
    override val value: String
        get() = "Yes this could be good"
}

fun main() {
    val b = BaseOvImple(10)
    DerivedOv(b).print()
}