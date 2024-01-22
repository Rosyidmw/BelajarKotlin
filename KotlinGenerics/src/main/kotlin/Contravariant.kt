//hanya boleh menerima input data baru (in)

class Contravariant<in T> {
    fun sayHello(cek: T){
        println("halo saya $cek")
    }
}

fun main() {
    val contravariantAny = Contravariant<Any>()
    val contravariantString: Contravariant<String> = contravariantAny

    contravariantString.sayHello("Rosyid")
}