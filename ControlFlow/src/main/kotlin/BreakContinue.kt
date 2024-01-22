fun main() {
    val data = listOf(1,2,3,null,5,null,7)
//    for (i in data) {
//        print(i)
//    }

    for (i in data) {
        if (i == null) break
        print(i)
    }

    loop@ for (i in 1..10) {
        println("Outside Loop")

        for (j in 1..10) {
            println("Inside Loop")
            if (j > 5) break@loop
        }
    }
}