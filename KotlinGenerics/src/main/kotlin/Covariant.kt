//tidak boleh menerima input data baru

class Covariant <out T> (val data: T) {
    fun data(): T {
        return data
    }
}

fun main() {
    val covariantString = Covariant<String>("Rosyid")
    val covariantAny: Covariant<Any> = covariantString

    println(covariantAny.data())
}