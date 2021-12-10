import kotlin.random.Random

object Channels {
    private val allChannels = mapOf(
        1 to "Первый канал", 2 to "Второй канал", 3 to "Третий канал",
        4 to "Четвертый канал", 5 to "Пятый канал", 6 to "Шестой канал", 7 to "Седьмой канал",
        8 to "Восьмой канал", 9 to "Девятый канал", 10 to "Десятый канал", 11 to "Одиннадцатый канал",
        12 to "Двенадцатый канал", 13 to "Тринадцатый канал", 14 to "Четырнадцатый канал",
        15 to "Пятнадцатый канал", 16 to "Шестнадцатый канал", 17 to "Семнадцатый канал",
        18 to "Восемнадцатый канал", 19 to "Девятнадцатый канал", 20 to "Двадцатый канал",
    )

    fun getRandomChannels(a:Int): MutableMap<Int, String> {
        val randChannels = allChannels.values.shuffled()
        var currentChannels = mutableMapOf<Int, String>()
        for (i in 1..a) {
            currentChannels[i] = randChannels.elementAt(i)
        }
        return currentChannels
    }


}