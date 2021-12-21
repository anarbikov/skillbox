fun main() {
    val a = Converters
    a.get("USD", 3)
    a.get("EUR", 3)
    a.get("CNY", 3)
    a.get("THB",3)  // через анонимный объект в Converters

    val chf = object:CurrencyConverter {  //  через анонимный объект в Main
        override val currencyCode: String = "CHF"
        override val rate: Int = 80
        override fun convertToRub(qty: Int) {
            println("За $qty $currencyCode ${qty * rate} рублей")
        }
    }
    chf.convertToRub(3)


}

