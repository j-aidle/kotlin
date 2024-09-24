fun ordre_ascendent(array: IntArray) {
    //ordenem array
    val numeros = array.sorted()

    //resultat
    println("Array en ordre ascendent: $numeros")
}


fun main() {
    //demanem numero
    val numeros = IntArray(10) { readLine()!!.toInt() }
    //cridem funció
    ordre_ascendent(numeros)

}
