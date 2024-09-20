fun main() {
    //declaració variables	
    val array = IntArray(5)
    var suma = 0
    
    //bucle
    for (i in array.indices) {
        //demanem numero a cada iteració
	println("Introdueix un número:")
        array[i] = readLine()!!.toInt()
	//sumem el valor demanat
        suma += array[i]
    }
    //mostrem resultat
    println("La suma dels números és: $suma")
}
