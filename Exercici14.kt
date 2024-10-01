//llibreria data
import java.time.LocalDate
//llibreria calendar
import java.util.*

//Creem objecte
class Cotxe (val nom: String, val model: String, val any: Int) {
    //creem funcio
    fun mostrarInfo() {
        //val edat = 2024 - any
        //val anyActual = LocalDate.now().year
        val calendar = Calendar.getInstance()
        val anyActual = calendar.get(Calendar.YEAR)
        val edat = anyActual - any
        println("L'edat del cotxe és: $edat")
    }
}

//funcio principal
fun main() {
    //instanciem objecte
    val cotxe = Cotxe("Volkswagen","Golf R", 2020)
    //mostrem resultat
    cotxe.mostrarInfo()
}
