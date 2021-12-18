open class DebitCard(override var balance: Int) : BankCard() {
    override fun topUp(number: Int) {
        if (number > 0) {
            balance += number
            println("Вы пополнили $number")
            println("Баланс $balance")
        }
            else println("Введите сумму > 0")
    }

    override fun pay(number: Int): Boolean {
        if (number > 0) {
            if (balance >= number) {
                balance -= number
                println("Вы оплатили $number")
                println("Баланс $balance")
                return true
            }
            else
                println("Недостаточно средства на счете")
                return false
        }
        else {
            println("Введите сумму > 0")
            return false
        }
    }

    override fun getBalanceInfo() {
        println("Текущий баланс счета: $balance")
    }

    override fun availibleCashInfo() {}

    override fun cardProperties() {
        println("Это обычная дебетовая карта")
    }
}