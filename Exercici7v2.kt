fun main() {
    //creem variable tipus array de 5 posicions	
    val numeros = DoubleArray(5) 
    //bucle on demanem valor i l'assignem a l'array
    for (i in numeros.indices) {
        numeros[i] = readLine()!!.toDouble() 
    }
    //sumem els valors
    val suma = numeros.sum()
    //mostrem resultat
    println("La suma és: $suma")
}
