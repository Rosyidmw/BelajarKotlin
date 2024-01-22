fun main() {
    val setData = setOf(1,2,4,2,1,5,15)
    val setData2 = setOf(1,2,4,5)
    val setData3 = setOf(1,5,7)
    val union = setData.union(setData3)
    val intersect = setData.intersect(setData3)

    println(setData)
    println(setData == setData2)
    println(5 in setData)

    println(union)
    println(intersect)
}