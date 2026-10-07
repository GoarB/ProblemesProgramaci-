import java.util.Scanner

fun main() {
    // Declarar scanner
    val scan = Scanner(System.`in`)
    // Demanar l'ample de l'habitació
    print("Introdueix l'ample de l'habitació en metres: ")
    val numero1: Float = scan.nextFloat()
    print("Introdueix la llargada de l'habitació en metres: ")
    val numero2 : Float = scan.nextFloat()
    val resultat : Float = numero1 * numero2
    print("L'àrea de l'habitació es: $resultat")
}