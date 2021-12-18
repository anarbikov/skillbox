open class CreditCard (override var balance:Int, var creditBalance:Int, var creditLimit:Int) : BankCard() {

    override fun topUp(number:Int) {
        if (number > 0) {
            when {
                creditBalance in 0 until creditLimit && number in 0 until  creditLimit - creditBalance -> creditBalance += number  // кредит в минусе и денег хватает только на оплату кредита
                creditBalance < creditLimit && number > creditLimit - creditBalance -> {
                    balance += number - (creditLimit - creditBalance)
                    creditBalance = creditLimit
                }  // Кредит в минусе, денег хватает на покрытие кредита и остается на увеличение баланса
                creditBalance == creditLimit -> balance += number //кредита нет, увеличиваем баланс
            }
            println("Вы пополнили баланс на $number")
            println("Баланс $balance")
            println("Кредитные средства $creditBalance")
        }
        else println("Введите сумму > 0")
    }

    override fun pay(number: Int): Boolean {
        if (number > 0) {
            when {
                number > balance+creditBalance -> {
                    println("Недостаточно средств")
                return false
            }
                creditBalance in 0 until creditLimit -> creditBalance -=number  // Баланс в минусе, расход кредитного баланса
                creditBalance == creditLimit && number in 0 .. balance -> balance -=number //  Расход баланса
                creditBalance == creditLimit && number > balance -> {
                    creditBalance -= (number - balance)
                    balance = 0
                }  //  Расход баланса, затем кредитного баланса
            }
            println("Вы оплатили $number")
            println("Баланс $balance")
            println("Кредитные средства $creditBalance")
            return true
        }
        else println("Введите сумму > 0")
        return false
    }

    override fun getBalanceInfo() {
        println("Собственные средства: $balance")
    }

    override fun availibleCashInfo() {
        println("Кредитные средства: $creditLimit\nСобственные средства: $balance")
    }

    override fun cardProperties() {
        println("Это кредитная карта без дополнительных свойств.")
    }
}