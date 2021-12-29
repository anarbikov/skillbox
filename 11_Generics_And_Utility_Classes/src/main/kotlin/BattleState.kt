sealed class BattleState {
    protected var victoryTeam1 = false
    protected var victoryTeam2 = false
    protected var draw = false
    protected var progress = false
    protected var totalHealthTeam1 = 0
    protected var totalHealthTeam2 = 0
    protected var aliveQtyTeam1 = mutableListOf<AbstractWarrior>()
    protected var aliveQtyTeam2 = mutableListOf<AbstractWarrior>()

    protected fun currentProgress() {
        println("\nCurrent total health points of team1: $totalHealthTeam1\n" +
                "Current total health points of team2: $totalHealthTeam2\n" +
                "\nAlive troops of team1: ${aliveQtyTeam1.size} ")
        for (i in 0 until aliveQtyTeam1.size) println (aliveQtyTeam1[i].javaClass.simpleName)
        println("\nAlive troops of team2: ${aliveQtyTeam2.size} ")
        for (i in 0 until aliveQtyTeam2.size) println (aliveQtyTeam2[i].javaClass.simpleName)
        println(" ")
    }



}
