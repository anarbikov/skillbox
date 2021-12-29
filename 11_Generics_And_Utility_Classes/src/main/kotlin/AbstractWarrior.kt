abstract class AbstractWarrior:Warrior {
    abstract var maxHealthPoints:Int
    abstract override var evasionChance:Int
    abstract val accuracyChance:Int
    abstract val weapon:AbstractWeapon
    abstract var currentHealthPoints:Int
    abstract override var isKilled: Boolean

     override fun attack(attacker: AbstractWarrior, defender:AbstractWarrior) {
         var damageDone = 0
         if (attacker.weapon.magazine.isEmpty()) {
             attacker.weapon.reload()
             println("<${attacker.javaClass.simpleName} is reloading the weapon>")
         }
         else {
             val bullets:MutableList<Ammo> = attacker.weapon.getBulletFromMagazine()
             for (i in 0 until bullets.size){
                 if (attacker.accuracyChance.chance(attacker.accuracyChance) && !defender.evasionChance.chance(defender.evasionChance)) {
                     damageDone += bullets[i].getDamagePerShot(bullets[i])
                 }
             }
             defender.getDamage(damageDone)
             bullets.clear()
         }
     }

    override fun getDamage(damage: Int) {
        if (currentHealthPoints > damage && !isKilled){
            currentHealthPoints -= damage
            println("Damage: $damage, remaining enemy health: $currentHealthPoints")
            println()
        }
        else {
            currentHealthPoints = 0
            println("Enemy dead")
            isKilled = true
        }
    }





}