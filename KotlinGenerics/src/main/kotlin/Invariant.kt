class Invariant<T>(val data: T)

fun main() {
    val invariantString = Invariant("String")
//    val invariantAny: Invariant<Any> = invariantString
//    invariantAny.data = 100
    println(invariantString.data)
}
