fun main() {
    //declarem variables
    var suma = 0
    var num: Int

    //bucle mentre el numero demanat no sigui zero
    do {
	//a cada iteració demanem el numero a l'usuari
        println("Introdueix el numero zero per acabar!")
        num = readLine()!!.toInt()
	//sumem el resultat
        suma += num
        
    } while (num !=0)
    
    //resultat
    println("La suma es: $suma")

}
