import java.util.Scanner

fun main() {
    // Declarar scanner
    val scan = Scanner(System.`in`)
    // Benvinguda al programa
    println("Benvigut al programa on sabrem si dos numeros son iguals amb un valor Boolea!")
    // Demanar el primer numero
    print("Escriu un número decimal: ")
    val primer = scan.nextDouble()
    // Demanar el segon número a l'usuari
    print("Escriu un segón número decimal: ")
    val segon = scan.nextDouble()
    // Transforma la sortida a Boolea
    val resultat = primer == segon
    print("El resultat Boolea es: $resultat ")
}