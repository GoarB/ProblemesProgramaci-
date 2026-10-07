// Quan venen els meus nebots els hi reparteixo caramels. La idea és que tothom tingui els mateixos.
// Això sí, si no venen els nebots, no reben caramels.
// 1. Declarar scanner
// 2. Llegir l'entrada i crear les variables
// 3. Crear la condicio de que si el num2 es 0 respongui 0
import java.util.Scanner

fun main() {
    // Declarar scanner
    val scan = Scanner(System.`in`)
    // Llegir l'entrada i crear les variables
    val num1 = scan.nextInt()
    val num2 = scan.nextInt()
    // Crear la condicio de que si el num2 es 0 respongui 0
    if (num2 != 0) {
        val resultat = (num1 / num2)
        println("$resultat")
    }
    else println("0")

}