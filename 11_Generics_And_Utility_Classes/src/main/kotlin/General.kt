class General(
    override var maxHealthPoints: Int =100,
    override var evasionChance: Int = 30,
    override val accuracyChance: Int = 90,
    override val weapon: AbstractWeapon = Weapons.createWeapon(30,FireType.MultiShot(6)),
    override var currentHealthPoints: Int = 100,
    override var isKilled: Boolean = false
) : AbstractWarrior() {
}