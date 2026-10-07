import java.util.Scanner

fun main() {
    // Declarar scanner
    val scan = Scanner(System.`in`)
    // Demanar un número amb decimals
    print("Escriu un número amb decimals i et donaré el doble d'aquest número: ")
    val numero : Double = scan.nextDouble()
    // Calcular doble del número i mostrar
    val resultat = numero * 2
    println("El resultat es: $resultat")
}