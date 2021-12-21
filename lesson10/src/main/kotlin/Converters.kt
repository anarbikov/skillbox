object Converters {
    fun get (currencyCode:String, qty:Int) {
        when (currencyCode) {
            "USD" -> {
                val a = UsdRubConverter()
                a.convertToRub(qty)
            }
            "EUR" -> {
                val a = EurRubConverter()
                a.convertToRub(qty)
            }
            "CNY" -> {
                val a = CnyRubConverter()
                a.convertToRub(qty)
            }
            "THB" -> {
                val a = object:CurrencyConverter {
                    override val currencyCode: String = "THB"
                    override val rate: Int = 2
                    override fun convertToRub(qty: Int) {
                        println("За $qty $currencyCode ${qty * rate} рублей")
                    }
                }
                a.convertToRub(qty)
            }
            else -> println("Такой валюты нет в конвертере")


        }
    }






}