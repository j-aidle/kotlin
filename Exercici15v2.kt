class compteBancari(val numCompte: Int,val saldo: Int){
	fun retirarDiners(){
		println("Indica la quantitat que vols retirar")
    		val dinersRetirats= readLine()!!.toInt()
    		if (dinersRetirats <= saldo) {
        		val saldoActual = saldo - dinersRetirats
        		println("Saldo Actual: $saldoActual")
    		} else {
        		println("Saldo insuficient")
    		}
	}
	
	fun ingresarDiners(){
    		println("Indica la quantitat que vols ingresar")
	    	val dinersIngresats= readLine()!!.toInt()
    		val saldoActual = saldo + dinersIngresats
    		println("Saldo Actual: $saldoActual")
	}
}
fun main(){
	val operacion = compteBancari(44235235, 50)
	println("1 - RETIRAR")
	println("2 - INGRESAR")
	val opcio: Int = readLine()!!.toInt()
	if (opcio ==1){
		operacion.retirarDiners()
	}
	if (opcio ==2){
		operacion.ingresarDiners()
	}
}
