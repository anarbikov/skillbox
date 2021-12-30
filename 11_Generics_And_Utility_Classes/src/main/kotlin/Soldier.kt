class Soldier(
    override var maxHealthPoints:Int = 60,
    override var evasionChance: Int = 15,
    override val accuracyChance: Int = 60,
    override val weapon: AbstractWeapon = Weapons.createWeapon(6,FireType.SingleShot(1)),
    override var currentHealthPoints: Int = 60,
    override var isKilled: Boolean = false
) :AbstractWarrior() {
}