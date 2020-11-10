fun main() {
    val day = Day.TUESDAY

    println(day is Day)

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

