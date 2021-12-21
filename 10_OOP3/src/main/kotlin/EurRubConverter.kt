internal class EurRubConverter:CurrencyConverter {
    override val currencyCode: String = "EUR"
    override val rate: Int = 85

    override fun convertToRub(qty: Int) {
        println("За $qty $currencyCode ${qty * rate} рублей")
    }
}