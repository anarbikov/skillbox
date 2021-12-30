object Weapons {
    fun createWeapon(maxBulletsInMagazine: Int, fireType: FireType): AbstractWeapon {
        return object : AbstractWeapon() {
            override var maxBulletsInMagazine: Int = maxBulletsInMagazine
            override var fireType: FireType = fireType
            override var magazine: Stack<Ammo> = Stack()
            override var isEmpty: Boolean = magazine.isEmpty()
        }
    }
}