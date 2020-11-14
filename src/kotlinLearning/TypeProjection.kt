package kotlinLearning

import java.lang.Exception

fun main() {

    val invalule : KotlinConsumer<Number> = KotlinConsumer();

    val copyOFValue : KotlinConsumer<Int> = invalule

    if(copyOFValue is KotlinConsumer<Int>) {
        print(copyOFValue.toString())
    }

}

class KotlinConsumer<in T> {
    fun toString(value : T) :  String {
        return value.toString()
    }
}

sealed class Result<out R> {
    data class  Success<out T> (val data : T) : Result<T>()
    data class Error(val exception: Exception) : Result<Nothing>()
    object loading : Result<Nothing>()
}

val Result<*>.succeeded
get() = this is Result.Success && data != null