class Estudiant(val nom: String, val edat: Int, var notaMitjana: Double) {
    //comprovem aprovat
    fun haAprovat(): Boolean {
        return notaMitjana >= 5
    }
    
    //mostrem info
    fun mostrarInfo() {
       println("Nom: $nom, Edat: $edat, Nota Mitjana: $notaMitjana, Aprovat: ${haAprovat()}")
    }
}

fun main() {
    //demanem a l'usuari la nota
    var notaMitjana: Double = readLine()!!.toDouble()
    //instanciem
    val estudiant = Estudiant("Joan", 20, notaMitjana)
    //mostrem resultat
    estudiant.mostrarInfo()
}
