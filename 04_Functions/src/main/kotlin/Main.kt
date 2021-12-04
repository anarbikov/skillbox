fun main(args: Array<String>) {
    val finalString = """F2p)v"y233{0->c}ttelciFc"""
    val firstSplit = finalString.take((finalString.length / 2))
    val secondSplit = finalString.takeLast((finalString.length / 2))
    val sumString = {a: String,b:String -> a+b}
    println(sumString(firstHalfOfTheString(firstSplit),secondHalfOfTheString(secondSplit)))
}

fun firstHalfOfTheString(a: String): String {
    val shiftedStringTwo = shift(a, 1)
    val withS = shiftedStringTwo.replace("5", "s")
    val withU = withS.replace("4", "u")
    val shiftedStringThree = shift(withU, -3)
    return shiftedStringThree.replace("0", "o")
}

fun secondHalfOfTheString(a: String): String {
    val reversed = a.reversed()
    val shiftedString = shift(reversed, -4)
    return shiftedString.replace("_", " ")
}

fun shift(a: String, b: Int): String {
    return a.map { it -> it + b }.joinToString("")
}