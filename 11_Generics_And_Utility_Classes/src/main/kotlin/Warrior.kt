interface Warrior {
    val isKilled:Boolean
    val evasionChance:Int

    fun attack (Warrior:Warrior) {}
    fun getDamage (damage:Int) {}
}