fun main() {
    val a = CasbackCreditCard(balance = 30000, creditBalance = 10000, creditLimit = 10000)
    a.cardProperties()
    Thread.sleep(3000)

    println("\nФунция вывода инфо обо всех счетах:")
    a.availibleCashInfo()
    Thread.sleep(3000)

    println("\nФунция вывода инфо только о собственных средствах:")
    a.getBalanceInfo()
    Thread.sleep(3000)

    println("\nПоследовательно тратим 0, 30000 5000, 5000, 5000")
    a.pay(0)
    Thread.sleep(3000)
    a.pay(30000)
    Thread.sleep(3000)
    a.pay(5000)
    Thread.sleep(3000)
    a.pay(5000)
    Thread.sleep(3000)
    a.pay(5000)
    Thread.sleep(3000)

    println("\nТеперь пополняем на 0, 5000, 5000, 5000, 5000")
    a.topUp(0)
    Thread.sleep(3000)
    a.topUp(5000)
    Thread.sleep(3000)
    a.topUp(5000)
    Thread.sleep(3000)
    a.topUp(5000)
    Thread.sleep(3000)
    a.topUp(5000)
    Thread.sleep(3000)

    val b = CasbackDebitCard(balance = 30000, bonusBalance = 0)
    b.cardProperties()
    Thread.sleep(3000)

    println("\nФунция вывода инфо обо всех счетах:")
    b.availibleCashInfo()
    Thread.sleep(3000)

    println("\nФунция вывода инфо только о собственных средствах:")
    b.getBalanceInfo()
    Thread.sleep(3000)

    println("\nПоследовательно тратим 0, 30000 5000")
    b.pay(0)
    Thread.sleep(3000)
    b.pay(30000)
    Thread.sleep(3000)
    b.pay(5000)
    Thread.sleep(3000)

    println("\nТеперь пополняем на 0, 5000, 5000, 5000, 5000")
    b.topUp(0)
    Thread.sleep(3000)
    b.topUp(5000)
    Thread.sleep(3000)
    b.topUp(5000)
    Thread.sleep(3000)







}