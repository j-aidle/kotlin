fun main() {
    val numeros = IntArray(5) {readLine()!!.toInt()}
    var positius = 0
    var negatius = 0
    var zeros = 0
    for (i in numeros) {
        if (i > 0) {
            positius++
        } else if (i < 0) {
            negatius++
        } else if (i == 0) {
            zeros++
        }
    }
    println("Hi han $positius positius, $negatius negatius i $zeros zeros.")
}
