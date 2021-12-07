fun main(args: Array<String>) {
    var inputN: Int? = readLine()?.toIntOrNull()
    while (inputN == null || inputN <= 0) {
        println("Введите значение N > 0")
        inputN = readLine()?.toIntOrNull() //задание 6.6.1
    }
    val phoneNumbers = inputPhoneNumbers(inputN)
    val phoneNumbersFiltered = phoneNumbers.filter { it -> it.startsWith("+7") }
    println("Ниже перечислены те телефоны, которые начинаются на \"+7\":\n${phoneNumbersFiltered.joinToString("\n")}") //задание 6.6.5

    val convToSet = phoneNumbersFiltered.toSet()
    println("Количество уникальных телефонных номеров: ${convToSet.size}") //задание 6.6.6

    println("Сумма цифр всех уникальных номеров телефонов, начинающихся на \"+7\": ${convToSet.sumOf { it.length }}")// задание 6.6.7

    val mutMap = mutableMapOf<String, String>()
    for (i in convToSet.indices) {
        println("Введите имя человека номером телефона: ${convToSet.elementAt(i)}")
        mutMap[convToSet.elementAt(i)] = "${readLine()}" //Задание 6.6.8
    }

    for (i in mutMap.entries) {
        println("Абонент: ${i.value}. Номер телефона: ${i.key}") // Задание 6.6.9
    }

    val sortedMutMapByPhone = mutMap.toSortedMap()
    println("\nСортировка по телефону")
    for (i in sortedMutMapByPhone.entries) {
        println("Абонент: ${i.value}. Номер телефона: ${i.key}") // Задание 6.6.10
    }

    val sortedMutMapByPerson = mutMap.toList().sortedBy { it.second }.toMap()
    println("\nСортировка по имени")
    for (i in sortedMutMapByPerson.entries) {
        println("Абонент: ${i.value}. Номер телефона: ${i.key}") // Задание 6.6.11
    }

}

fun inputPhoneNumbers (a:Int): MutableList<String> {
    println ("Введите $a телефонных номеров. Желательно с приставкой \"+7\", чтобы отфильтровать потом подходящие номера")
    val a = MutableList<String>(a){ _ -> readLine().toString() }
    return a //задания 6.6.2 - 6.6.4
}