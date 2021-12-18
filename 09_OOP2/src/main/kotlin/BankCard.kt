abstract class BankCard {
    abstract var balance:Int

    abstract fun topUp(number:Int)
    abstract fun pay(number: Int):Boolean
    abstract fun getBalanceInfo()
    abstract fun availibleCashInfo()
    abstract fun cardProperties()

}