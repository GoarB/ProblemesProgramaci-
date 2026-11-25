import java.util.Scanner
/*
Implementa una funció que calculi la mitjana dels elements d’un vector de
floats que se li passa com a paràmetre. La funció haurà de tenir la següent
capçalera:
 */

// Funció que calcula la mitjana d'un grup de numeros.
fun mitjana (nums:Array<Float>) : Float {
    var resultat = 0f
    for (i in nums.indices) {
        resultat += nums[i]
    }
  resultat /= nums.size
    return resultat
}

// Funció per omplir un Array.
fun omplir(mida : Int) : Array<Float> {
    val scan = Scanner(System.`in`)
    println("Escriu els numeros dels cuals vols treure una mitjana: ")
    val resultat = FloatArray(mida)
    for (num in resultat.indices) {
        resultat[num] = scan.nextFloat()
    }
    return resultat.toTypedArray()
}

// Funció per registrar un nùmero enter.
fun registrarInt() : Int{
    val scan = Scanner(System.`in`)
    println("Introdueix la cuantitat de numeros a calcular: ")
    val resultat = scan.nextInt()
    return resultat
}

// Funció principal de la qual surt el resultat que veurà l'usuari.
fun main() {
    val resultat = mitjana(omplir(registrarInt()))
    println("La mitjana d'entre aquests numeros es $resultat.")
}