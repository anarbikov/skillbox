import kotlinx.coroutines.*

suspend fun main() {
    runBlocking {
        launch {
            val game1 = Game(4,2)
            game1.generalInformation()
            game1.gameStart()
        }
    }
}

