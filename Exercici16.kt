class Llibre(val titol: String, val autor: String, var preu: Double) {
    //descompte en percentatge
    fun aplicarDescompte(descompte: Double) {
        preu -= preu * (descompte/100)
    }
    
    //mostrem info
    fun mostrarInfo() {
        println("Títol: $titol, Autor: $autor, Preu: $preu")
    }
}

fun main() {
    //instanciem
    val llibre = Llibre("El Hobbit", "Tolkien", 20.0)
    //apliquem descompte
    llibre.aplicarDescompte(10.0)
    //mostrem resultat
    llibre.mostrarInfo()
}
