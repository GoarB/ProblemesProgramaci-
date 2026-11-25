import java.util.Scanner

/*
Escriu un procediment anomenat “incrementarArray” que donat un array
d’enters i una quantitat, modifiqui cada posició de l’array que se li ha passat
com a paràmetre en la quantitat indicada. El procediment haurà de tenir la
següent capçalera:
fun incrementarArray (nums:Array&lt;Int&gt;, quantitat:Int)
 */

fun incrementarArray (nums:Array<Int>, quantitat:Int) : Array<Int> {
    val resultat = nums
    for (num in nums.indices) {
        resultat[num] += quantitat
    }
    return resultat
}

// Funció per omplir un Array.
fun omplirArray(mida : Int) : Array<Int> {
    val scan = Scanner(System.`in`)
    println("Escriu els numeros dels cuals vols treure una mitjana: ")
    val resultat = IntArray(mida)
    for (num in resultat.indices) {
        resultat[num] = scan.nextInt()
    }
    return resultat.toTypedArray()
}

// Funció per registrar la mida d'un Array.
fun registrarMida() : Int{
    val scan = Scanner(System.`in`)
    println("Introdueix la cuantitat de numeros totals: ")
    val resultat = scan.nextInt()
    return resultat
}
// Funció per registrar un numero enter que sumar al interior del Array.
fun registrarQuantitat() : Int{
    val scan = Scanner(System.`in`)
    println("Introdueix la cuantitat a sumar a cada numero: ")
    val resultat = scan.nextInt()
    return resultat
}
fun main() {
    val resultat = incrementarArray (omplirArray(registrarMida()), registrarQuantitat())
    for (num in resultat.indices) {
        println("${resultat[num]} ")
    }
}