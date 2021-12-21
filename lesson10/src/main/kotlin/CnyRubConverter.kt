internal class CnyRubConverter:CurrencyConverter {
    override val currencyCode: String = "CNY"
    override val rate: Int = 12

    override fun convertToRub(qty: Int) {
        println("За $qty $currencyCode ${qty * rate} рублей")
    }
}