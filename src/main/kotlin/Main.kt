fun main() {
    println("Функция: y = -0.23x2 + x\nВведите значения минимума, максимума и шага: ")
    var min = readln().toDouble()
    val max = readln().toDouble()
    val shag = readln().toDouble()
    var y: Double
    while (min <= max) {
        y = -0.23 * min * min + min
        println("$min -> ${y / 5 / 2}")
        min += shag
    }
}