package kotlinLearning.functions

fun foo(
        bar: Int = 0,
        baz:Int = 1,
        quex : () -> Unit
) {
    quex()
}

fun main() {
    foo(1) {println("values in first")}
    foo(quex = {println("In the second parameter")})
    foo{ println("This is so cool") }
}