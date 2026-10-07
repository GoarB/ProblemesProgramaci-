import java.util.Scanner

fun main() {
    // Declarar scanner
    val scan = Scanner(System.`in`)
    // Demanar un número a l'usuari
    print("Donam un número: ")
    val numero : Int = scan.nextInt()
    // Calcular resultat i mostrar
    val resultat = numero + 1
    print("Després ve el $resultat")
}