import kotlinx.coroutines.*

suspend fun main() {
    runBlocking {
        launch { println("${Fibonacci.take(5)} - Fibo(5)") }
        launch { println("${Fibonacci.take(10)} - Fibo(10)") }
        launch { println("${Fibonacci.take(15)} - Fibo(15)") }
        launch { println("${Fibonacci.take(25)} - Fibo(25)") }
        launch { println("${Fibonacci.take(20)} - Fibo(20)") }
        launch {
            for (i in 4..20) {
                if (i == 8) this.cancel()
                else {
                    println("${Fibonacci.take(i)} - Fibo($i)")
                }
            }
        }
        launch {
//        delay(300)
            launch { println("${Fibonacci.take(300)} - Fibo(300)") }
        }



        withTimeout(1000) {
                launch {
                    try {
                    println(Fibonacci.take(999999))
                } catch (e:TimeoutCancellationException) {println("Fibo(999999) is cancelled - Timed out")}
            }
        }
        launch { println("${Fibonacci.take(120)} - Fibo(120)") }


    }
}
