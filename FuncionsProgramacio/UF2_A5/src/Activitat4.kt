import java.util.Scanner

/*
4. Implementa una funció que indiqui si una cadena b és prefix d’una altra cadena
a. La funció haurà de tenir la següent capçalera:
fun esPrefix (a:String, b:String) : Boolean
 */

fun esPrefix (a:String, b:String) : Boolean {
    var resultat = false
    if (a.startsWith(b)) {
        resultat = true
    }
    return resultat
}
fun main() {
    val scan  = Scanner(System.`in`)
    println("Escriu una frase: ")
    val frase = scan.nextLine()
    println("Escriu un altre frase i et diré si es prefix de la primera: ")
    val prefix = scan.nextLine()
    val resultat = esPrefix(frase, prefix)
    if (resultat == true) {
        println("Si, es prefix!")
    }
    else {
        println("No es prefix...")
    }
}