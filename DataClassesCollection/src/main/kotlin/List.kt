fun main() {
    val dataAngka = listOf(1,2,3,4,5)
    val dataHuruf = listOf('a', 'b', 'c')
    val dataCampur = mutableListOf('a', "Rosyid", 5, true)

//    anyList.add('d') // menambah item di akhir list
//    anyList.add(1, "love") // menambah item pada indeks ke-1
//    anyList[3] = false // mengubah nilai item pada indeks ke-3
//    anyList.removeAt(0) // menghapus item pada indeks ke-0
    dataCampur.add('r')
    dataCampur.add(4, 'i')
    dataCampur[3] = false
    dataCampur.removeAt(0)
    dataCampur.add(0,"Isma")
    println(dataCampur)
}