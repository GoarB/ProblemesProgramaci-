import java.util.Scanner

fun main() {
    // Declarar scanner
    val scan = Scanner(System.`in`)
    // Demanar la llargada
    print("Introdueix la llargada de l'habitació: ")
    val llarg : Double = scan.nextDouble()
    // Demanar l'ample
    print("Introdueix l'ample de l'habitació: ")
    val ample : Double = scan.nextDouble()
    // Demanar l'alçada
    print("Introdueix l'alçada de l'habitació: ")
    val altura : Double = scan.nextDouble()
    // Calcular i mostrar el resultat
    val resultat : Double = llarg * ample * altura
    println("El volum d'aire que cap a l'habitació es ${resultat}m.")
}