fun main() {
    val total = listOf(1,2,3,4,5,6,5,2,7)
    val index = listOf(2,3,4,7)
//    val slice = total.slice(3..6)
    val slice = total.slice(3..6 step 2)
    val cek = total.slice(index)
    val distinct = total.distinct()
//    distinctBy() untuk membandingkan nilai yang sama jika data string

    println(cek)
    println(slice)
    println(distinct)
}