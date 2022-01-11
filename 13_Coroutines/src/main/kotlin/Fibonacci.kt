import kotlinx.coroutines.withTimeout
import kotlinx.coroutines.yield
import java.math.BigInteger

object Fibonacci {
    suspend fun take(sequenceNumber:Int):BigInteger {

        var b = 1.toBigInteger()
        var c = 1.toBigInteger()
        var sum = 0.toBigInteger()
        when (sequenceNumber) {
            1 -> sum = 0.toBigInteger()
            in 2..3 -> sum = 1.toBigInteger()
            in 4..sequenceNumber -> {
                for (i in 4..sequenceNumber) {
                    yield()
                    sum = b + c
                    b = c
                    c = sum
                }
            }
        }
        return sum
    }
}