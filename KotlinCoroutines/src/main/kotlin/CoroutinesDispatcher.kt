import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
//    Single Thread Context
//    val dispatcher = newSingleThreadContext("myThread")

//    Thread Pool
    val dispatcher = newFixedThreadPoolContext(3, "myPool")
    launch(dispatcher) {
        println("Starting in ${Thread.currentThread().name}")
        delay(1000)
        println("Resuming in ${Thread.currentThread().name}")
    }.start()

}