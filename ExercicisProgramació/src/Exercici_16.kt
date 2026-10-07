import java.util.Scanner
import java.util.function.IntToDoubleFunction

fun main() {
    // Declarar scanner
    val scan = Scanner(System.`in`)
    // Demanem el nombre enter
    print("Escriu un nombre enter: ")
    val nombre : Int = scan.nextInt()
    // Transformem el nombre a decimal
    val doble : Double = nombre.toDouble()
    println("El teu numero amb decimals es $doble")
}