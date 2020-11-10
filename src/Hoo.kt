fun main() {
    val day = Day.TUESDAY.ordinal

    val protocol = ProtocolHopes.WAITING.signal()

    print(day)
}

enum class Day {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    FRIDAY,
    THURSDAY,
    SATURDAY
}

enum class ProtocolHopes {

    WAITING {
        override fun signal() {
            println("Yes call the signal annonymous class")
        }

    };

    abstract fun signal()
}
