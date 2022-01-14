internal class Player (private val ticketsQty: Int) {
    var hasWon = false
    private val ticketsList = cards()
    val ticketsNumbers = createTicketsNumbers()
    val ticketsWithView = createTicketsWithView()

    private fun cards(): MutableList<PlayingCard> {  // Создаем столько экземпляров PlayingCard, сколько билетов у каждого игрока и возвращаем их список
        val tickets = mutableListOf<PlayingCard>()
        for (i in 0 until  ticketsQty) {
            tickets.add(PlayingCard())
        }
        return tickets
        }

    private fun createTicketsWithView (): MutableList<String> {  // Создаем список билетов в форме билета и возвращаем, он для вывода в консоль
        val tickets = mutableListOf<String>()
        for (i in 0 until ticketsQty) {
            tickets.add(ticketsList[i].ticketView)
        }
        return tickets
    }
    private fun createTicketsNumbers(): MutableList<MutableList<Int>> {
        val ticketsNumbers = mutableListOf<MutableList<Int>>()  // Создаем список билетов в форме цифр билетов и возвращаем, он для расчетов
        for (i in 0 until  ticketsQty){
            ticketsNumbers.add(ticketsList[i].ticketNumbers as MutableList<Int>)
        }
        return ticketsNumbers
    }
}
