fun main() {
    //creem variable tipus array de 5 posicions i li assignem directament els valors	
    val numeros = DoubleArray(5) { readLine()!!.toDouble() }
    //mostrem el resultat de la suma
    println("La suma dels números és: ${numeros.sum()}")
}
