fun main() {
    val a = Wheel()
    println(a.currentPressure)
    a.checkCurrentPressure()
    a.pumpUp(11.0)
    println(a.currentPressure)
    a.pumpUp(-1.0)
    println(a.currentPressure)
    a.pumpUp(0.0)
    a.pumpUp(1.0)
    a.checkCurrentPressure()
    a.pumpUp(1.6)
    a.checkCurrentPressure()
    a.pumpUp(10.0)
    println(a.currentPressure)
    a.checkCurrentPressure()

}