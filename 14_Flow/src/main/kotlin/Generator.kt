import kotlinx.coroutines.*
import kotlinx.coroutines.flow.flow

internal object Generator {
        val generatedFlow = flow {
            val numbers = mutableListOf<Int>()
            for (i in 1..90) numbers.add(i)
            numbers.shuffle()
            for (i in 0..89) {
                    emit(numbers[i])
                    delay(100)
                }
                numbers.clear()
        }
    }

