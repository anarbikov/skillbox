interface Warrior {
    val isKilled:Boolean
    val evasionChance:Int

    fun attack (attacker:AbstractWarrior,defender: AbstractWarrior){}
    fun getDamage (damage:Int) {}
}