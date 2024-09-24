fun main() {
    //demanem cadena
    val text = readLine()!!.toString()
    //creem contador
    var count =0
    //busquem vocals al text
    for (char in text) {
        //comparem i afegim
        if (char.lowercaseChar() in listOf('a','e','i','o','u')) {
            count++
        }
    }

    //mostrem resultat
    println("La frase ( $text ) té $count vocals!")

}
