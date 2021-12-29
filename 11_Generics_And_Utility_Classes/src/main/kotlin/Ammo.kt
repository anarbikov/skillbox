enum class Ammo (private var damage:Int, private val critMultiplier:Int, private val critChance:Int) {
    ICESHOT(5,3,25),
    FIRESHOT(6,3,25),
    HOLYSHOT(4,3,30),
    LIGHTNINGSHOT(7,3,20),
    EMPTYSHOT (0,0,0);


internal fun getDamagePerShot(a:Ammo): Int {
       val dmg: Int = if (a.critChance.chance(critChance)) {
           a.damage * a.critMultiplier
       } else a.damage
       return dmg
    }


}