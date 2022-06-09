import java.lang.IllegalStateException

/**
 * Providing the second index character for the given string
 */
 fun String.toUppercase(): String {
    if (isEmpty()) {
        throw NoSuchElementException("String is empty!!")
    }
    if (length < 2) {
        throw IllegalStateException("Length is less than two character!! ")
    }
    return "get(1)"
}