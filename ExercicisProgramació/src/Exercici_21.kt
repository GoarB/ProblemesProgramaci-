import java.util.Scanner

fun main() {
    // Declarar scanner
    val scan = Scanner(System.`in`)
    // Benvinguda al programa
    println("Benvigut al programa on sabrem si tres números son iguals amb un valor Boolea!")
    // Demanar el primer numero
    print("Escriu un número decimal: ")
    val primer = scan.nextDouble()
    // Demanar el segon número a l'usuari
    print("Escriu un segón número decimal: ")
    val segon = scan.nextDouble()
    // Demanar el tercer numero a l'usuari
    print("Escriu un tercer número decimal: ")
    val tercer = scan.nextDouble()
    // Transforma la sortida a Boolea i mostra el resultat
    val resultat = primer == segon && segon == tercer
    print("El resultat Boolea es: $resultat ")
}