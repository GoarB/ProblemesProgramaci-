import java.util.Scanner

fun main() {
    // Declarar scanner
    val scan = Scanner(System.`in`)
    // Demanem el nombre de segons
    print("Diguem el nombre de segons: ")
    val segons: Int = scan.nextInt()
    // Calculem el resultat
    val suma = (segons + 1) % 60
    // Mostrem el resultat
    println("El total de segons restant es $suma segons.")

}