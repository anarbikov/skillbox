sealed class FireType(open var shotsNumber: Int) {
    internal class SingleShot(override var shotsNumber: Int) : FireType(shotsNumber)
    internal object HealingShot : FireType(shotsNumber = 1)
    internal data class MultiShot (override var shotsNumber:Int) : FireType (shotsNumber)



}

