import kotlin.random.Random

fun main() {
    val a = Battle(5,5)
    a.troopsProperties()
    for (i in 1 until 50) {
        if (!a.battleEnded) println("ROUND $i")
        a.attackIteration()
    }



















}
fun Int.chance (chanceRate:Int):Boolean {
    return Random.nextInt(0,100) in 0 until chanceRate
}
