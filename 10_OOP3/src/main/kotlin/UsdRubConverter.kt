internal class UsdRubConverter:CurrencyConverter {
    override var currencyCode: String = "USD"
    override val rate: Int = 75

    override fun convertToRub(qty:Int){
        println("За $qty $currencyCode ${qty*rate} рублей")
    }
}