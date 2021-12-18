internal class CasbackDebitCard (override var balance: Int, var bonusBalance:Int) : DebitCard(balance=balance) {
    override fun pay(number:Int): Boolean {
        if (super.pay(number)) {
            println("За покупку начислено ${number/100} кешбека")
            topUp(number/100)
            return true
        }
        else return false
    }

    override fun topUp(number: Int) {
        super.topUp(number)
        bonusBalance += number/200
        if (number/200 >=1) {
            println("За пополнение карты начислено ${number / 200} бонусных баллов")
            println("Баланс бонусного счета: $bonusBalance")
        }
    }

    override fun availibleCashInfo() {
        println("Текущий баланс счета: $balance")
        println("Баланс бонусного счета: $bonusBalance")
    }

    override fun cardProperties() {
        println("Это дебетовая карта с кэшбеком при покупке 1%" +
                "\nТакже начисляется 1 бонусный балл за каждые 200 рублей при пополнении")
    }

}