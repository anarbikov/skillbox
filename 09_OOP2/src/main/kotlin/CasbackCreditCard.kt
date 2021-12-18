internal class CasbackCreditCard(override var balance:Int, creditBalance:Int, creditLimit:Int) :
    CreditCard(balance=balance, creditBalance = creditBalance, creditLimit=creditLimit) {
    private var totalCosts:Int = 0

    override fun pay(number: Int): Boolean {
        if (super.pay(number)) {
            totalCosts += number
            if (totalCosts >= 30000) {
                println("За покупку вам начислен кешбэк ${(number * 0.05).toInt()} (5%)")
                topUp((number * 0.05).toInt())
            }
            return true
            }
        return false
        }

    override fun cardProperties() {
        println("Это кредитная карта, по которой начисляется кэшбэк 5% за покупки при условии суммарных трат от 30.000")
    }










}