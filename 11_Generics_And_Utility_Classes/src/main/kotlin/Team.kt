open class Team {
    private fun createUnit(): AbstractWarrior {
        return if (10.chance(10)) General()
        else if (20.chance(20)) Major()
        else if (30.chance(30)) Captain()
        else Soldier()
    }

    internal fun createTeam (teamSize:Int): MutableList<AbstractWarrior> {
        val team = mutableListOf<AbstractWarrior>()
        for (i in 0 until teamSize) team.add(createUnit())
        return team
    }



}