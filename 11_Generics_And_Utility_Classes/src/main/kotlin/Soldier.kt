class Soldier(
    override var maxHealthPoints:Int = 60,
    override var evasionChance: Int = 15,
    override val accuracyChance: Int = 60,
    override val weapon: AbstractWeapon = Weapons.pistol,
    override var currentHealthPoints: Int = 60,
    override var isKilled: Boolean = false
) :AbstractWarrior() {
}