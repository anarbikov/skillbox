fun main(args: Array<String>) {
    val finalString = """F2p)v"y233{0->c}ttelciFc"""
    val sumString = {a: String,b:String -> a+b}
    println(sumString(firstHalfOfTheString(finalString),secondHalfOfTheString(finalString)))
}

fun firstHalfOfTheString(a: String): String {
    val firstSplit = a.take((a.length / 2))
    val shiftedStringTwo = shift(firstSplit, 1)
    val withS = shiftedStringTwo.replace("5", "s")
    val withU = withS.replace("4", "u")
    val shiftedStringThree = shift(withU, -3)
    return shiftedStringThree.replace("0", "o")
}

fun secondHalfOfTheString(a: String): String {
    var secondSplit = a.takeLast((a.length / 2))
    secondSplit = secondSplit.reversed()
    val shiftedString = shift(secondSplit, -4)
    return shiftedString.replace("_", " ")
}

fun shift(a: String, b: Int): String {
    return a.map { it -> it + b }.joinToString("")
}