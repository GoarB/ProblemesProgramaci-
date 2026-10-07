import java.util.Scanner

fun main() {
    // Declarar scanner
    val scan = Scanner(System.`in`)
    // Demanar numero d'alumnes de la 1ra classe
    print("Introdueix el numero d'alumnes de la primera classe: ")
    val classe1: Int = scan.nextInt()
    // Demanar numero d'alumnes de la 2na classe
    print("Introdueix el numero d'alumnes de la segona classe: ")
    val classe2 : Int = scan.nextInt()
    // Demanar numero d'alumnes de la 3ra classe
    print("Introdueix el numero d'alumnes de la tercera classe:")
    val classe3 : Int = scan.nextInt()
    // Calcular y mostrar el total de alumnes de la clase
    val totaltaules : Int = (classe1 / 2 + classe1 % 2) + (classe2 / 2 + classe2 % 2)+
            (classe3 / 2 + classe3 % 2 )
    print("El total de taules necesaris son: $totaltaules")
}