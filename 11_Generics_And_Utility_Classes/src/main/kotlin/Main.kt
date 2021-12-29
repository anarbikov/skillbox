import kotlin.random.Random

fun main() {
    val a = Battle(5,5)
    println(a.team1[0].weapon)
    println(a.team1[1].weapon)
    println(a.team1[2].weapon)
    println(a.team1[3].weapon)
    println(a.team1[4].weapon)


    a.troopsProperties()
    for (i in 1 until 50) {
        if (!a.battleEnded) println("ROUND $i")
        a.attackIteration()
    }



















}
fun Int.chance (chanceRate:Int):Boolean {
    return Random.nextInt(0,100) in 0 until chanceRate
}
