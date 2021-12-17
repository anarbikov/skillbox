import kotlin.random.Random

class Dog (energy: Int, weight: Int, maxAge:Int, name:String) : Animal (energy, weight, maxAge, name ) {
    override fun move() {
        if (energy-5 > 0 && weight-1 > 0) {
            super.move()
            println("бежит")
        }
    }

    override fun birthNew(): Dog {
        val newBorn = Dog(energy = Random.nextInt(1,10), weight = Random.nextInt(1,5), name = name, maxAge = maxAge )
        println("Родилось новое животное ${newBorn.name}, энергия ${newBorn.energy}, максимальный возраст ${newBorn.maxAge}, вес ${newBorn.weight}")
        return newBorn
    }
}