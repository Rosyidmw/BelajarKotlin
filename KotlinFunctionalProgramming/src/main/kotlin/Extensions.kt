fun String.hello(): String = "hello $this"

fun main() {
    val name = "Rosyid"

    println(name.hello())
}