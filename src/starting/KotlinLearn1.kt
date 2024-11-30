package starting

import java.lang.StringBuilder

fun main() {
    print("why thiis is working fine")
    val set = hashSetOf(1, 9, 9)

    val list = listOf("first", "second")
    val map = hashMapOf(1 to "two", 2 to "three")
    println(list.javaClass)
    println(map.javaClass)

    val joinedNames = joinToString(list, ",", "(",")")
    println(joinedNames)
}

fun <T> joinToString (
        collecetion: Collection<T>,
        separator: String,
        prefix: String,
        postfix: String
): String {
    val result = StringBuilder(prefix)
    for ((index, element) in collecetion.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }
    return result.append(postfix).toString()
}