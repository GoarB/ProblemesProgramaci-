import java.util.Scanner

fun main() {
    // Declarar scanner
    val scan = Scanner(System.`in`)
    // Demanar el primer y segon numero
    print("Introdueix un numero per tal de sumarlo: ")
    val numero1: Int = scan.nextInt()
    print("Introdueix un segon numero per tal de sumarlo: ")
    val numero2 : Int = scan.nextInt()
    val resultat : Int = numero1 + numero2
    print("La suma de $numero1 i $numero2 es: $resultat")
}