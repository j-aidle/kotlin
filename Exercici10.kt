fun comptarVocals(text: String): Int {
    var vocals = "aeiouAEIOU"
    return text.count{it in vocals}
}

fun main(){
    val text = readLine()!!.toString()
    val numVocals = comptarVocals(text)

    print("El numero vocals és: $numVocals")    
}
