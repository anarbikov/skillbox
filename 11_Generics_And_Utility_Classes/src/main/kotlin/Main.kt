import kotlin.concurrent.thread
import kotlin.random.Random

fun main(args: Array<String>) {
    var a=Team()
    var b = a.createTeam(5)
    for (i in 0 until b.size)
    println(b[i])
    var c = a.createTeam(6)
    println(c[0].currentHealthPoints)
    b[0].attack(c[0])
    b[0].attack(c[0])
    b[0].attack(c[0])
    b[0].attack(c[0])
    b[0].attack(c[0])
    b[0].attack(c[0])
    b[0].attack(c[0])
    b[0].attack(c[0])
    b[0].attack(c[0])
    b[0].attack(c[0])
    b[0].attack(c[0])
    b[0].attack(c[0])
    b[0].attack(c[0])
    b[0].attack(c[0])
    b[0].attack(c[0])
    b[0].attack(c[0])
    b[0].attack(c[0])
    b[0].attack(c[0])
    b[0].attack(c[0])
    b[0].attack(c[0])
    b[0].attack(c[0])
    b[0].attack(c[0])
    b[0].attack(c[0])
    b[0].attack(c[0])
    b[0].attack(c[0])
    b[0].attack(c[0])
    b[0].attack(c[0])
    b[0].attack(c[0])
    b[0].attack(c[0])
    b[0].attack(c[0])







    println(c[0].currentHealthPoints)
    println(b[0])
    println(c[0])
















}
fun Int.chance (chanceRate:Int):Boolean {
    return Random.nextInt(0,100) in 0 until chanceRate
}
