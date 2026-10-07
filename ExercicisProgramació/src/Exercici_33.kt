import java.util.Scanner

fun main() {
    // Declarar scanner
    val scan = Scanner(System.`in`)
    // Demanar el primer nombre
    print("Introdueix el primer nombre enter: ")
    val primer = scan.nextInt()
    // Demanar el segon nombre
    print("Introdueix el segon nombre: ")
    val segon = scan.nextInt()
    // Comprobem si el primer nombre es divisible pel segon
    val resultat = primer % segon
    val boolea: Boolean = resultat == 0
    println("El resultat de si es poden dividir en valor Boolea es $boolea")
}