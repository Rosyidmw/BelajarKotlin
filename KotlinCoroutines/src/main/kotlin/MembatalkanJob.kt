import kotlinx.coroutines.*

@InternalCoroutinesApi
fun main() = runBlocking {
    val job = launch {
        delay(5000)
        println("Start New Job!")
    }

    delay(2000)
    job.cancel(cause = CancellationException("Time is up!"))
    println("Cancelling job...")
    if (job.isCancelled) {
        println("Job Is Cancelled")
    }
}