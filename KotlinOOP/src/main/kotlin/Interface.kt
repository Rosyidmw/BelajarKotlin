interface IFly {
    fun fly()
    val jumlahSayap: Int
}

fun terbang(burung: IFly) {
    burung.fly()
}

fun main() {
    terbang(object : IFly {
        override fun fly() {
            if (jumlahSayap > 0) println("Terbang dengan $jumlahSayap sayap")
            else println("Terbang tanpa sayap")
        }

        override val jumlahSayap: Int
            get() = 2
    })
}