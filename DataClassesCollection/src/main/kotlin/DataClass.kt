class User(val name: String, val age: Int) {
    override fun toString(): String {
        return "User(name=$name, age=$age"
    }
}

data class DataUser(val nama: String, val umur: Int)

fun main() {
    val user = User("nrohmen", 17)
    val user2 = User("nrohmen", 17)
    val user3 = User("dimas", 24)
    val dataUser = DataUser("nrohmen", 17)
    val dataUser2 = DataUser("nrohmen", 17)
    val dataUser3 = DataUser("dimas", 24)
//    untuk copy data
    val dataUser4 = dataUser3.copy()
//    copy dan merubah data
    val dataUser5 = dataUser2.copy(umur= 19)

    println(user)
    println(dataUser)
    println(dataUser4)
    println(dataUser5)

    println(dataUser.equals(dataUser2))
    println(dataUser.equals(dataUser3))

    println(user.equals(user2))
}