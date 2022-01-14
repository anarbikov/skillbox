import kotlinx.coroutines.flow.takeWhile

class Game (private val playersQty:Int, private val ticketsQtyForEachPlayer:Int) {
    private val currentPlayers = createPlayers()
    private val generatedNumbers = mutableListOf<Int>()
    var endOfTheGame:Boolean = false

    fun generalInformation() {
        print("This game contains $playersQty players. Each player has $ticketsQtyForEachPlayer Lotto tickets." +
                "\nThe game finishes as soon as one ticket has won. There are 3 winning combinations: all 5 numbers of first/second/third row.")
        for (p in 0 until playersQty) {
            println("\nPlayer ${p + 1} tickets:")
            for (t in 0 until ticketsQtyForEachPlayer) {
                println(currentPlayers[p].ticketsWithView[t])
            }
        }
    }

    private fun createPlayers(): MutableList<Player> {
        val players = mutableListOf<Player>()
        for (i in 1..playersQty) {
            players.add(Player(ticketsQtyForEachPlayer))
        }
        return players
    }

    suspend fun gameStart() {
        Generator.generatedFlow.takeWhile {!endOfTheGame}.collect {
            println("Generator gets number $it")
            generatedNumbers.add(it)
            for (p in 0 until playersQty) {
                for (t in 0 until ticketsQtyForEachPlayer) {
                    for (number in 0..14) {
                        if (it == currentPlayers[p].ticketsNumbers[t][number]) {
                            println("Player ${p + 1} has number $it in his ticket ${t + 1}")
                        }
                    }
                }
            }
            checkForWinners()
        }
    }

    private fun checkForWinners() {
        for (p in 0 until playersQty) {
            for (t in 0 until ticketsQtyForEachPlayer) {
                when {
                    currentPlayers[p].ticketsNumbers[t][0] in generatedNumbers &&
                    currentPlayers[p].ticketsNumbers[t][1] in generatedNumbers &&
                    currentPlayers[p].ticketsNumbers[t][2] in generatedNumbers &&
                    currentPlayers[p].ticketsNumbers[t][3] in generatedNumbers &&
                    currentPlayers[p].ticketsNumbers[t][4] in generatedNumbers -> {
                        println("Player ${p + 1} has winning combination in his ticket ${t + 1}: all 5 numbers of the first row\n" +
                                "Congratulations to the winner - Player ${p+1}!!!" +
                                "\nWinning ticket: \n${currentPlayers[p].ticketsWithView[t]}")
                        currentPlayers[p].hasWon = true
                        endOfTheGame = true
                    }
                    currentPlayers[p].ticketsNumbers[t][5] in generatedNumbers &&
                    currentPlayers[p].ticketsNumbers[t][6] in generatedNumbers &&
                    currentPlayers[p].ticketsNumbers[t][7] in generatedNumbers &&
                    currentPlayers[p].ticketsNumbers[t][8] in generatedNumbers &&
                    currentPlayers[p].ticketsNumbers[t][9] in generatedNumbers -> {
                        println("Player ${p + 1} has winning combination in his ticket ${t + 1}: all 5 numbers of the second row\n" +
                                "Congratulations to the winner - Player ${p+1}!!!" +
                                "\nWinning ticket: \n${currentPlayers[p].ticketsWithView[t]}")
                        currentPlayers[p].hasWon = true
                        endOfTheGame = true
                    }
                    currentPlayers[p].ticketsNumbers[t][10] in generatedNumbers &&
                    currentPlayers[p].ticketsNumbers[t][11] in generatedNumbers &&
                    currentPlayers[p].ticketsNumbers[t][12] in generatedNumbers &&
                    currentPlayers[p].ticketsNumbers[t][13] in generatedNumbers &&
                    currentPlayers[p].ticketsNumbers[t][14] in generatedNumbers -> {
                        println("Player ${p + 1} has winning combination in his ticket ${t + 1}: all 5 numbers of the third row\n" +
                                "Congratulations to the winner - Player ${p+1}!!!" +
                                "\nWinning ticket: \n${currentPlayers[p].ticketsWithView[t]}")
                        currentPlayers[p].hasWon = true
                        endOfTheGame = true
                    }
                }
            }
        }
    }
}