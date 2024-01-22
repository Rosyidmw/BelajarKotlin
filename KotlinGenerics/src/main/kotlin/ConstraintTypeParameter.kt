import List

//fun main() {
//    val numbers = ListNumber<Long>()
//    val numbers2 = ListNumber<Int>()
////    val numbers3 = ListNumber<String>()
//}
//
//class ListNumber<T : Number> : List<T> {
//    override fun get(index: Int): T {
//
//    }
//}

//fun main() {
//    val numbers = listOf(1,2,3,4,5)
//    numbers.sumNumber()
//    val names = listOf("dicoding", "academy")
//    names.sumNumber()
//}
//
//fun <T : Number> List<T>.sumNumber() : T {
//
//}

//variance
abstract class Vehicle(wheel: Int)
class Car(speed: Int) : Vehicle(4)


fun main() {
    val carList = listOf(Car(100), Car(120))
    val vehicle = carList
}