fun factorial(numero: Int): Int {
    var resultat = 1 
    
    for (i in 1..numero){
        resultat*=i
    }
    
    return resultat
}

//factorial recursiu
fun factorialRecursiu(numero: Int): Int {
    return if (numero == 0) 1 else numero * factorialRecursiu(numero-1)
}


fun main() {
    //demanem numero
    val numero = readLine()!!.toInt()
    
    //resultat
    println("El factorial de $numero és: ${factorial(numero)}")
    //resultat
    println("El factorial de $numero és: ${factorialRecursiu(numero)}")
    
}
