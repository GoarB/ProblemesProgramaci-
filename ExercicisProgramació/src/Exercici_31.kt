import java.util.Scanner

fun main() {
    // Declarar scanner
    val scan = Scanner(System.`in`)
    // Demanar el numero de metres
    print("Escriu un numero de metres (en nombre enter) per saber l'equivalent en peus: ")
    val metres = scan.nextDouble()
    // Transformar els metres a peus
    val polzades = metres * 39.37
    val peus = polzades / 12

    // Mostrar el resultat
    print("El numero total de peus es de $peus.")

}