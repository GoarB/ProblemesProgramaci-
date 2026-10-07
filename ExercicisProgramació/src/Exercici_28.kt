import java.util.Scanner

fun main() {
    // Declarar scanner
    val scan = Scanner(System.`in`)
    // Benvinguda al programa
    println("Benvigut al programa on sabrem si algun numero es igual a 10 amb un valor Boolea!")
    // Demanar el primer número
    print("Escriu un número enter: ")
    val primer = scan.nextInt()
    // Demanar el segon número a l'usuari
    print("Escriu un segón número enter: ")
    val segon = scan.nextInt()
    // Demanar el tercer número
    print("Escriu un altre número enter: ")
    val tercer = scan.nextInt()
    // Demanar el primer número
    print("Escriu un últim número enter: ")
    val quart = scan.nextInt()
    // Transforma la sortida a Boolea
    val resultat = primer == 10 || segon == 10 || tercer == 10 || quart == 10
    println("El resultat en Boolea es: $resultat ")
}