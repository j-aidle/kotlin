fun numeros(array: IntArray) {
    var positius = mutableListOf<Int>() 
    var negatius = mutableListOf<Int>() 
    var zeros = mutableListOf<Int>() 

    for (i in array) {
        if (i > 0) {
            positius.add(i)
        } else if (i < 0) {
            negatius.add(i)
        } else {
            zeros.add(i)
        }
    }

    println("Números positius: ${positius.size} (${positius.joinToString(", ")})")
    println("Números negatius: ${negatius.size} (${negatius.joinToString(", ")})")
    println("Número de zeros: ${zeros.size} (${zeros.joinToString(", ")})")
}

fun main() {
    val numeros = IntArray(5) { readLine()!!.toInt() }
    numeros(numeros)
}
