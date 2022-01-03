class Wheel {
    var currentPressure:Double = 0.0

    fun pumpUp(requiredPressure:Double) {
        try {
            if (requiredPressure in 0.0..10.0) {
                currentPressure = requiredPressure
                println("Current wheel pressure is $currentPressure atm.")
            }
            else throw IncorrectPressure()
        }catch (e:IncorrectPressure) {println("Incorrect pressure. Correct pressure is 0 - 10 atm.")}
    }

    fun checkCurrentPressure() {
        try {
            when (currentPressure) {
                in 1.6..2.5 -> println("Current pressure is OK, you can use the wheel")
                in 0.0..1.6 -> throw TooLowPressure()
                in 2.5..10.0 -> throw TooHighPressure()
                else -> throw IncorrectPressure()
            }
        }
        catch (e:TooLowPressure) {println("Too low pressure. Current pressure is $currentPressure atm. You need the pressure in range 1.6-2.5 to use the wheel")}
        catch (e:TooHighPressure) {println("Too high pressure. Current pressure is $currentPressure atm. You need the pressure in range 1.6-2.5 to use the wheel")}
    }
}