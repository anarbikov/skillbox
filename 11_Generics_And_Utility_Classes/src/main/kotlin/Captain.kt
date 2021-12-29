class Captain(
    override var maxHealthPoints: Int = 70,
    override var evasionChance: Int = 20,
    override val accuracyChance: Int = 70,
    override val weapon: AbstractWeapon = Weapons.uzi,
    override var currentHealthPoints: Int =70,
    override var isKilled: Boolean = false
) :AbstractWarrior() {
}