object Weapons {
     private fun createWeapon(maxBulletsInMagazine: Int, fireType: FireType): AbstractWeapon {
        return object : AbstractWeapon() {
            override var maxBulletsInMagazine: Int = maxBulletsInMagazine
            override var fireType: FireType = fireType
            override var magazine: Stack<Ammo> = Stack()
            override var isEmpty: Boolean = magazine.isEmpty()
        }
    }
    internal val pistol = object: AbstractWeapon() {
        override var maxBulletsInMagazine: Int = 6
        override var fireType: FireType = FireType.SingleShot(1)
        override var magazine: Stack<Ammo> = Stack()
        override var isEmpty: Boolean = magazine.isEmpty()
    }

    internal val ak47 = createWeapon(30,FireType.MultiShot(5))
    internal val uzi = createWeapon(22,FireType.MultiShot(3))
    internal val m16 = createWeapon(30,FireType.MultiShot(6))
}