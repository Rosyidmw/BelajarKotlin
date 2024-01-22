//fun main(args: Array<String>) {
//    println("Hello World!")
//
//    // Try adding program arguments via Run/Debug configuration.
//    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
//    println("Program arguments: ${args.joinToString()}")
//}

import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

fun main() = runBlocking{
//    launch {
//        delay(1000L)
//        println("Coroutines!")
//    }
//    println("Hello,")
//    delay(2000L)

//    cara normal
    val timeOne = measureTimeMillis {
        val capital = getCapital()
        val income = getIncome()
        println("Your profit is ${income - capital}")
    }

//    cara async
    val timeTwo = measureTimeMillis {
        val capital = async { getCapital() }
        val income = async { getIncome() }
        println("Your profit is ${income.await() - capital.await()}")
    }

    println("Completed in $timeOne ms vs $timeTwo ms")
}

suspend fun getCapital() : Int {
    delay(1000L)
    return 50000
}

suspend fun getIncome() : Int {
    delay(1000L)
    return 75000
}