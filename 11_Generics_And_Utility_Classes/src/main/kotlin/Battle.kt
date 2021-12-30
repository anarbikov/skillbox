class Battle(team1Size:Int,team2Size:Int):BattleState() {

    private val team = Team()
    private var team1 = team.createTeam(team1Size)
    private var team2 = team.createTeam(team2Size)
    internal var battleEnded = false

    private fun getProgress() {
    for (i in 0 until team1.size) totalHealthTeam1 += team1[i].currentHealthPoints  //  total HP team1
    for (i in 0 until team1.size) {
        if (!team1[i].isKilled) aliveQtyTeam1.add(team1[i])    //  alives team1
    }
    for (i in 0 until team2.size) totalHealthTeam2 += team2[i].currentHealthPoints  //  total HP team2
    for (i in 0 until team2.size) {
        if (!team2[i].isKilled) aliveQtyTeam2.add(team2[i])  //  alives team2
    }
    if (aliveQtyTeam1.size == 0 && aliveQtyTeam2.size == 0) draw = true
    else if (aliveQtyTeam1.size > 0 && aliveQtyTeam2.size == 0) victoryTeam1 = true
    else if (aliveQtyTeam1.size == 0 && aliveQtyTeam2.size > 0) victoryTeam2 = true
    else progress = true

    if (draw) {
        println("<<< DRAW >>>")
        battleEnded = true
    }
    else if (victoryTeam1){
        println("<<< VICTORY TEAM 1 !!! >>>")
        battleEnded = true
    }
    else if (victoryTeam2) {
        println("<<< VICTORY TEAM 2 !!! >>>")
        battleEnded = true
    }

    else {
        currentProgress()
    }
        draw = false
        victoryTeam1 = false
        victoryTeam2 = false
        progress = false
        aliveQtyTeam1.clear()
        aliveQtyTeam2.clear()
        totalHealthTeam1 = 0
        totalHealthTeam2 = 0
    }

    internal fun attackIteration() {
        if (!battleEnded) {
            println("Team 1 is attacking Team 2:")
            for (i in 0 until team1.size) {
                if (!team1[i].isKilled && !team2[i].isKilled ) {   //  Если оба живые, то атакуем
                    println("${team1[i].javaClass.simpleName} is attacking ${team2[i].javaClass.simpleName}:")
                    team1[i].attack(attacker = team1[i], defender =  team2[i] )
                }
            }
            println("Team 2 is attacking Team 1:")
            for (i in 0 until team2.size) {
                if (!team2[i].isKilled && !team1[i].isKilled) {
                    println("${team2[i].javaClass.simpleName} is attacking ${team1[i].javaClass.simpleName}:")
                    team2[i].attack(attacker = team2[i], defender = team1[i])
                }
            }
            getProgress()
            team1.shuffle()
            team2.shuffle()
        }
    }

    internal fun troopsProperties() {
        println("GENERAL INFORMATION ABOUT TEAM 1 AND TEAM 2:\nTeam 1 contains:")
        for (i in 0 until team1.size){
            println ("${team1[i].javaClass.simpleName}, Health: ${team1[i].maxHealthPoints}, " +
                    "Chance of Evasion: ${team1[i].evasionChance}%, Accuracy rate: ${team1[i].accuracyChance}%, " +
                    "Fire type: ${team1[i].weapon.fireType.shotsNumber} shots per move, " +
                    "Bullets in magazine: ${team1[i].weapon.maxBulletsInMagazine}")
        }
        println("\nTeam 2 contains:")
        for (i in 0 until team2.size){
            println ("${team2[i].javaClass.simpleName}, Health: ${team2[i].maxHealthPoints}, " +
                    "Chance of Evasion: ${team2[i].evasionChance}%, Accuracy rate: ${team2[i].accuracyChance}%, " +
                    "Fire type: ${team2[i].weapon.fireType.shotsNumber} shots per move, " +
                    "Bullets in magazine: ${team2[i].weapon.maxBulletsInMagazine}")
        }
    }
}