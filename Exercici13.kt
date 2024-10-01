//Creem objecte
class Persona (val nom: String, val edat: Int, val pais: String) {
    //creem funcio
    fun mostrarInfo() {
        println("Nom: $nom, Edat: $edat, País: $pais")
    }
}

//funcio principal
fun main() {
    //instanciem objecte
    val persona = Persona("Pepe", 25, "Espanya")
    //mostrem resultat
    persona.mostrarInfo()
}
