fun main() {
    val numero = readLine()!!.toInt()
    
    val result = when (numero) {
      1 -> "Gener"
      2 -> "Febrer"
      3 -> "Març"
      4 -> "Abril"
      5 -> "Maig"
      6 -> "Juny"
      7 -> "Juliol"
      8 -> "Agost"
      9 -> "Setembre"
      10 -> "Octubre"
      11 -> "Novembre"
      12 -> "Desembre"
      else -> "Numero no es valid."
    }
    println(result)
}
