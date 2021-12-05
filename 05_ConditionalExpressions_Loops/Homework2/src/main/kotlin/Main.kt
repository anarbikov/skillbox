fun main(args: Array<String>) {
    var n: Int? = readLine()?.toIntOrNull()
    while (n == null || n <= 0) {
        println("Введите число >0")
        n = readLine()?.toIntOrNull()
    }
    if (n in 1..93) println("Введенному число $n соответствует значение ${fiboCalc(n)} последовательности Фибоначчи")
    else fiboCalc(n)
}

fun fiboCalc (a:Int): Long {
    var b:Long = 1L
    var c:Long = 1L
    var sum:Long = 0L
    when (a) {
        1 -> sum = 0
        in 2..3 -> sum = 1
        in 4..93 -> {
            for (i in 4..a) {
                sum = b + c
                b = c
                c = sum
            }
        }
        else -> println("Не удается вычислить значение Фибоначчи, так как оно за пределами типа данных Long")
    }
    return sum
}
