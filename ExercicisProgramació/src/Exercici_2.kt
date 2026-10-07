import java.util.Scanner

fun main() {
    // Declarar scanner
    val scan = Scanner(System.`in`)
    // Demanar un numero
    print("Introdueix un numero per multiplicarlo per 2: ")
    val numero : Int = scan.nextInt()

    // Multiplicar-lo per 2
    val resultat = numero * 2

    // Imprimeix el resultat
    println("El numero resultant es: $resultat" )
}