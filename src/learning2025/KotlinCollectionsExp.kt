package learning2025

interface BobsTeam{
    fun loadTruck() = println("This is the specific teams")
}

class SealTeam: BobsTeam {

}

fun main() {
    val bobsTeam = SealTeam()
    bobsTeam.loadTruck()
}