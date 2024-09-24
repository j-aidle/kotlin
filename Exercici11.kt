fun filtrarParells(numeros: IntArray): IntArray {
	//filtrem els parells
	return numeros.filter{ it % 2 == 0 }.toIntArray()
}

fun main(){
	//demanem 5 numeros
	val numeros =  IntArray(5) { readLine()!!.toInt() }
	//cridem la funció i guardem el resultat
	val numParells = filtrarParells(numeros)
	//mostrem resultat
	print("Números parells: ${numParells.joinToString(", ")}")    
}
