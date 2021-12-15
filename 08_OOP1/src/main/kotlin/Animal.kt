import kotlin.random.Random

open class Animal (protected var energy: Int, protected var weight: Int, internal val maxAge: Int = 10, protected val name: String) {
    internal var currentAge: Int = 1
    private var isTooOld : Boolean = currentAge >= maxAge

    internal fun sleep () {
        if (!isTooOld) {
            energy += 5
            currentAge += 1
            println("$name спит")
        }
    }
    internal fun eat () {
        if (!isTooOld) {
            energy += 3
            weight += 1
            currentAge = tryIncrementAge(1)
            println("$name ест")
        }
    }
    internal open fun move () {
        if (energy-5 > 0 && weight-1 > 0 &&!isTooOld) {
        energy -=5
        weight -=1
        currentAge = tryIncrementAge(1)
        println("$name передвигается - ")
    }
    }

    private fun tryIncrementAge (a:Int): Int {
        currentAge = if (((currentAge + a) < maxAge) && (Random.nextBoolean())) currentAge + a else currentAge
        return currentAge
    }

    internal open fun birthNew (): Animal {
        val newBorn = Animal(energy = Random.nextInt(1,11), weight = Random.nextInt(1,6), name = name, maxAge = maxAge )
        println("Родилось новое животное $name энергия $energy, максимальный возраст $maxAge, вес $weight")
        return newBorn
    }
}