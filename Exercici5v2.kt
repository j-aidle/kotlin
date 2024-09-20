fun main() {
    //declarem variables
    var num1 = readLine()!!.toInt()

    //comparació
    when (num1) {
        1 -> println("Gener")
        2 -> println("Febrer")
        3 -> println("Març")
        4 -> println("Abril")
        5 -> println("Maig")
        6 -> println("Juny")
        7 -> println("Juliol")
        8 -> println("Agost")
        9 -> println("Setembre")
        10 -> println("Octubre")
        11 -> println("Novembre")
        12 -> println("Desembre")
        else -> println("Número de mes invàlid")
    }

}
