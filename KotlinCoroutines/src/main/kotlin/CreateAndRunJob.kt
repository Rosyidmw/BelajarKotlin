import kotlinx.coroutines.*

////menggunakan launch
//fun main() = runBlocking() {
//    val job = launch {  }
//}
//
////menggunakan job
//fun main() = runBlocking {
//    val job = Job()
//}

//  Create dan Run Job
fun main() = runBlocking() {
    val job = launch(start = CoroutineStart.LAZY) {
        delay(1000L)
        println("Star new Job!")
    }

//    job.start()
    job.join()
    println("Other Task")
}



