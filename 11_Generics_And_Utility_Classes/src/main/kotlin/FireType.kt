sealed class FireType(open var shotsNumber: Int) {
    object SingleShot : FireType(shotsNumber=1)
    object HealingShot : FireType(shotsNumber = 1)
    public data class MultiShot (override var shotsNumber:Int) : FireType (shotsNumber)



}

