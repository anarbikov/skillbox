internal interface CurrencyConverter {
    val currencyCode:String
    val rate:Int
    fun convertToRub (qty:Int)
}