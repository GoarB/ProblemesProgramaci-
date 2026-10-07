import java.util.Scanner
import kotlin.math.pow

fun main() {
    // Declarar scanner
    val scan = Scanner(System.`in`)
    // Demanar el import inicial de l'inversió
    print("Introdueix el valor de l'inversió inicial: ")
    val capital = scan.nextDouble()
    // Demanar el número d'anys invertits
    print("Introdueix la cuantitat d'anys: ")
    val anys = scan.nextDouble()
    // Demanar l'interés anual
    print("Introdueix el % anual de guany: ")
    val interes = scan.nextDouble() / 100
    // Calcular el total després de l'inversió
    val resultat = capital * (1 + interes).pow(anys)
    println("El total després de ${anys} anys al ${interes * 100}% es de ${resultat}.")
}