import java.util.Scanner

fun main() {
    // Declarar scanner
    val scan = Scanner(System.`in`)
    // Demanar el primer número a l'usuari
    println("Escriu un número enter: ")
    val primer = scan.nextInt()
    // Demanar el segon número a l'usuari
    print("Escriu un segón número enter: ")
    val segon = scan.nextInt()
    // Comprobar si el primer número es major que el segón
    val edat =  primer >= segon
    // Mostrar si el primer número es major que el segón en valor Boolea
    println("La resposta en format boolea es: $edat")
}