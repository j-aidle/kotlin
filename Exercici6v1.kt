fun main() {
    var suma = 0
    var numero: Int
    while (true) {
        numero = readLine()!!.toInt()
        if (numero == 0) {
            println("Has introduït un zero, programa acabat.")
            break
        }
        suma += numero
    }
    println("La suma dels números és: $suma")
}
