class CompteBancari(val numeroCompte: String, var saldo: Double) {
    fun ingressar(diners: Double) {
        saldo += diners
    }

    fun retirar(diners: Double) {
        if (diners <= saldo) {
            saldo -= diners
        } else {
            println("Saldo insuficient")
        }
    }

    fun mostrarSaldo() {
        println("Saldo: $saldo")
    }
}

fun main() {
    val compte = CompteBancari("123456789", 1000.0)
    compte.ingressar(500.0)
    compte.retirar(200.0)
    compte.mostrarSaldo()
}
