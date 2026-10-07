import java.util.Scanner
import kotlin.math.sqrt

fun main() {
    // Declarar scanner
    val scan = Scanner(System.`in`)
    // Benvinguda al programa
    println("Benvigut a la calculadora d'equacions de segón grau!")
    // Demanar el primer número
    print("Escriu un número: ")
    val a = scan.nextDouble()
    // Demanar el segon número a l'usuari
    print("Escriu un segón número: ")
    val b = scan.nextDouble()
    // Demanar el tercer número
    print("Escriu un altre número: ")
    val c = scan.nextDouble()
    // Resoldre l'equació
    val arrel = sqrt((b * b) - (4 * a * c))
    val positiu = (-b + arrel) / 2 * a
    val negatiu = (-b - arrel) / 2 * a
    println("Els dos resultat son $positiu i $negatiu")
}