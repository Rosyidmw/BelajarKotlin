fun main(){
    val fullAddress = getFullAddress(number = 25, streetName = "Jl. Margonda")
    print(fullAddress)
}

fun getFullAddress(streetName: String = "Jl. Malioboro", number: Int = 50): String {
    return "I live in $streetName No. $number"
}
