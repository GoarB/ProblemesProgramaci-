import java.util.Scanner

fun main() {
    // Declarar scanner
    val scan = Scanner(System.`in`)
    // Demanar els graus Celsius
    print("Escriu la temperatura en graus Celsius: ")
    val celsius : Double = scan.nextDouble()
    // Calcular els graus en Fahrenheit
    val fahrenheit : Double = (celsius * 9/5) + 32
    // Mostrar el resultat
    print("La temperatura en graus Fahrenheit es de ${fahrenheit}º")
}