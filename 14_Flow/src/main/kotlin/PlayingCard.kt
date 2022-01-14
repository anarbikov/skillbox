internal class PlayingCard {
    val ticketNumbers = createNumbers().sorted()
    val ticketView = "___________________________" +
            "\n      ${ticketNumbers[0]}   ${ticketNumbers[1]}  ${ticketNumbers[2]}   ${ticketNumbers[3]}  ${ticketNumbers[4]}" +
            "\n${ticketNumbers[5]}  ${ticketNumbers[6]}      ${ticketNumbers[7]}    ${ticketNumbers[8]}  ${ticketNumbers[9]}  " +
            "\n${ticketNumbers[10]}    ${ticketNumbers[11]}  ${ticketNumbers[12]}     ${ticketNumbers[13]}    ${ticketNumbers[14]}" +
            "\n___________________________"

    private fun createNumbers(): MutableList<Int> {
        val ticketNums = mutableListOf<Int>()
        val randNums = mutableListOf<Int>()
        for (n in 1..90) randNums.add(n)
        randNums.shuffle()
        for (i in 1..15) {
            ticketNums.add(randNums.last())
            randNums.removeLast()
        }
        return ticketNums
    }
}