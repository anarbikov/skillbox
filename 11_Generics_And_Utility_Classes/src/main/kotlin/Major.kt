class Major(
    override var maxHealthPoints: Int = 80,
    override var evasionChance: Int = 25,
    override val accuracyChance: Int = 80,
    override val weapon: AbstractWeapon = Weapons.ak47,
    override var currentHealthPoints: Int = 80,
    override var isKilled: Boolean = false
) : AbstractWarrior() {
}