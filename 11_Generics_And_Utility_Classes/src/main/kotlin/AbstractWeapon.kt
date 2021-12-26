import kotlin.random.Random

abstract class AbstractWeapon {
    abstract var maxBulletsInMagazine: Int
    abstract var fireType: FireType
    abstract var magazine: Stack<Ammo>
    abstract var isEmpty: Boolean

    private fun createBullet(): Ammo {
        return when (Random.nextInt(1, 6)) {
            1 -> Ammo.ICESHOT
            2 -> Ammo.FIRESHOT
            3 -> Ammo.HOLYSHOT
            4 -> Ammo.LIGHTNINGSHOT
            else -> Ammo.EMPTYSHOT
        }
    }

    fun reload() {
        for (i in 0 until maxBulletsInMagazine)
            magazine.push(createBullet())
    }

    fun getBulletFromMagazine(): MutableList<Ammo> {
        val currentBullets = mutableListOf<Ammo>()
        for (i in 0 until fireType.shotsNumber) {
            if (magazine.isEmpty()) {
                println("Please, reload the magazine")
                break
            }
            else {
                currentBullets.add(magazine.stack[magazine.stack.lastIndex])
                magazine.pop()
                }
            }
        return currentBullets
    }
}