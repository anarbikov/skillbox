abstract class AbstractWarrior:Warrior {
    abstract var maxHealthPoints:Int
    abstract override var evasionChance:Int
    abstract val accuracyChance:Int
    abstract val weapon:AbstractWeapon
    abstract var currentHealthPoints:Int
    abstract override var isKilled: Boolean

     override fun attack(Warrior: Warrior) {
         var damageDone:Int = 0
         if (weapon.magazine.isEmpty()) weapon.reload()
         else if (!weapon.magazine.isEmpty()) {
             var bullets:MutableList<Ammo> = weapon.getBulletFromMagazine()
             for (i in 0 until bullets.size){
                 if (accuracyChance.chance(accuracyChance) && evasionChance.chance(evasionChance)) {
                     damageDone += bullets[i].getDamage(bullets[i])
                 }
             }
             Warrior.getDamage(damageDone)
             bullets.removeAll(Ammo.values())
         }
     }

    override fun getDamage(damage: Int) {
        if (currentHealthPoints > damage){
            currentHealthPoints -= damage
            println("Damage: $damage, remaining enemy health: $currentHealthPoints")
        }
        else {
            currentHealthPoints = 0
            println("Enemy dead")
            isKilled = true
        }
    }





}