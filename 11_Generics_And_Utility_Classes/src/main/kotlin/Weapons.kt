object Weapons {
    private fun createWeapon(maxBulletsInMagazine:Int, fireType: FireType):AbstractWeapon {
        val createdWeapon:AbstractWeapon = object : AbstractWeapon() {
            override var maxBulletsInMagazine: Int = maxBulletsInMagazine
            override var fireType: FireType = fireType
            override var magazine: Stack<Ammo> = Stack()
            override var isEmpty: Boolean = magazine.isEmpty()
        }
        return createdWeapon
    }
    val pistol = createWeapon(6,FireType.SingleShot)
    val ak47 = createWeapon(30,FireType.MultiShot(5))
    val uzi = createWeapon(22,FireType.MultiShot(3))
    val m16 = createWeapon(30,FireType.MultiShot(6))
}