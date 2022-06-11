package kotlinLearning

sealed class Error {
    object SUCCESS: Error()
    data class FAILURE(val erro: Exception): Error()
}