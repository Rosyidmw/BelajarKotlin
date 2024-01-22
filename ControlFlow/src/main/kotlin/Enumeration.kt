fun main() {
    var color: Color = Color.RED

    when(color) {
        Color.RED -> print("Color is Red")
    }
}

enum class Color(val value: Int) {
    RED(0xFF0000),
}