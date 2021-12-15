import kotlin.random.Random

class NatureReserve {
    private val bird1 = Bird(weight = 10, maxAge = 2, energy = 10, name = "Птица")
    private val dog1 = Dog(weight = 10, maxAge = 2, energy = 10, name = "Собака")
    private val fish1 = Fish(weight = 10, maxAge = 2, energy = 10, name = "Рыба")
    private val animal1 = Animal(weight = 10, maxAge = 2, energy = 10, name = "Животное")

    private val birds = mutableListOf(bird1.birthNew(), bird1.birthNew(), bird1.birthNew(), bird1.birthNew(), bird1.birthNew())
    private val fishes = mutableListOf(fish1.birthNew(), fish1.birthNew(), fish1.birthNew())
    private val dogs = mutableListOf(dog1.birthNew(), dog1.birthNew())
    private val animals = mutableListOf(animal1.birthNew(), animal1.birthNew(), animal1.birthNew())

    internal fun qtyOfAllAnimals() = println("\nСейчас в зоопарке птиц: ${birds.size}, рыб: ${fishes.size}, собак: ${dogs.size}, " +
            "других животных: ${animals.size}.")

    internal fun zooLifeCycle(n: Int) {
        for (i in 0..n) {
            if (birds.size==0 && fishes.size==0 && dogs.size==0 && animals.size==0){
                println("Животных в зоопарке не осталось - все погибли от старости: и птицы и рыбы и собаки и другие " +
                        "животные. В связи с этим имеется вероятность, что всему миру пришел конец...")
                break
            }
            for (a in 0 until birds.size) {
                when (Random.nextInt(1, 5)) {
                    1 -> birds[a].sleep()
                    2 -> birds[a].eat()
                    3 -> birds[a].move()
                    4 -> birds.add(birds[a].birthNew())
                }
            }
            for (a in 0 until fishes.size) {
                when (Random.nextInt(1, 5)) {
                    1 -> fishes[a].sleep()
                    2 -> fishes[a].eat()
                    3 -> fishes[a].move()
                    4 -> fishes.add(fishes[a].birthNew())
                }
            }
            for (a in 0 until dogs.size) {
                when (Random.nextInt(1, 5)) {
                    1 -> dogs[a].sleep()
                    2 -> dogs[a].eat()
                    3 -> dogs[a].move()
                    4 -> dogs.add(dogs[a].birthNew())
                }
            }
            for (a in 0 until animals.size) {
                when (Random.nextInt(1, 5)) {
                    1 -> animals[a].sleep()
                    2 -> animals[a].eat()
                    3 -> animals[a].move()
                    4 -> animals.add(animals[a].birthNew())
                }
            }

            println("Данные обитатели зоопарка состарились и будут уничтожены:" +
                    "\nПтицы: ${birds.sumOf {(if(it.currentAge >= it.maxAge )1 else 0).toInt()}}"+
                    "\nРыбы: ${fishes.sumOf {(if(it.currentAge >= it.maxAge )1 else 0).toInt()}}"+
                    "\nСобаки: ${dogs.sumOf {(if(it.currentAge >= it.maxAge )1 else 0).toInt()}}"+
                    "\nПрочие животные: ${animals.sumOf {(if(it.currentAge >= it.maxAge )1 else 0).toInt()}}")
            println("<<<...УТИЛИЗАЦИЯ...>>>")
            birds.removeAll{it.currentAge >= it.maxAge}
            fishes.removeAll{it.currentAge >= it.maxAge}
            dogs.removeAll{it.currentAge >= it.maxAge}
            animals.removeAll{it.currentAge >= it.maxAge}
            println("Оставшиеся в живых обитатели зоопарка: \nПтицы: ${birds.size}\nРыбы: ${fishes.size}\nСобаки: ${dogs.size}\nПрочие животные: ${animals.size}")

        }
    }
}