import kotlinx.coroutines.*
suspend fun main():Unit = runBlocking {
    val a = launch { println("${Fibonacci.take(5)} - Fibo(5)") }
    val b = launch { println("${Fibonacci.take(10)} - Fibo(10)") }
    val c = launch { println("${Fibonacci.take(15)} - Fibo(15)") }
    val d = launch { println("${Fibonacci.take(25)} - Fibo(25)") }
    val e = launch { println("${Fibonacci.take(20)} - Fibo(20)") }
    val f = launch {
        for (i in 4..20) {
            if (i == 8) this.cancel()
            else {
                println("${Fibonacci.take(i)} - Fibo($i)")
            }
        }
    }
    val g = launch { println("${Fibonacci.take(300)} - Fibo(300)") }
    val h = launch {
        try {
            withTimeout(2000) {
                println("Fibo(999999) - ${Fibonacci.take(999999)}")  //TimeoutCancellationException
            }
        } catch (e: TimeoutCancellationException) {
            println("Skipped too long coroutine (2 second)")
        }
    }
    val ii = launch { println("${Fibonacci.take(120)} - Fibo(120)") }

    val allJobs: MutableList<Job> = mutableListOf(a, b, c, d, e, f, g, h, ii)
    var activeJobs = 0
    launch {
        delay(20)
        for (iteration in 0 until 100000){
        for (i in 0 until allJobs.size) {
            if (allJobs[i].isActive) {
                activeJobs += 1
            }
        }
        if (activeJobs > 0) print(".") else break
        delay(50)
        activeJobs = 0
    }
    }
}

