/* Has ofés al President Patata. El teu càstig serà escriure en la pissarra mil cops “no ofendre al president patata”

Entrada
La primera línia indica els casos de prova a considerar Cada cas compta amb un sol número.

Sortida
Per cada cas de prova caldrà respondre: No ofendre al president patata tants cops com sigui el nombre.
Després de cada cas fes un println buit.

1. Declarar scanner
2. Crear la variable dels casos de prova.
3. Crear el bucle i mostrar la frase tantes vegades com digui l'usuari
 */
import java.awt.PageAttributes.MediaType.C1
import java.util.Scanner

fun main() {
    // Declarar scanner
    val scan = Scanner(System.`in`)
    // Crear la variable dels casos de prova.
    val frase = "No ofendre al president patata"
    var numentrades : Int = scan.nextInt()
    // Crear el bucle i mostrar la frase tantes vegades com digui l'usuari
    repeat ( numentrades) {
        val entrada = scan.nextInt()
        repeat(entrada) {
        println("$frase")
        println("")
        numentrades -= 1
        }
    }
}