import java.util.*

enum class Ammo (var damage:Int, val critMultiplier:Int,val critChance:Int) {
    ICESHOT(5,3,25),
    FIRESHOT(6,3,25),
    HOLYSHOT(4,3,30),
    LIGHTNINGSHOT(7,3,20),
    EMPTYSHOT (0,0,0);


   fun getDamage(a:Ammo): Int {
       var dmg:Int = 0
       dmg = if (a.critChance.chance(critChance)) {
           a.damage * a.critMultiplier
       } else a.damage
       return dmg
    }


}