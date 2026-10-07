// Dos números enters A,B són contigus si A+1=B o B+1=A
// 1. Declarar scanner
// 2. Llegir els dos nombres
// 3. Crear la condició i mostrar el resultat
import java.util.Scanner

fun main() {
    // Declarar scanner
    val scan = Scanner(System.`in`)
    // Llegir els dos nombres
    val num1 = scan.nextInt()
    val num2 = scan.nextInt()
    // Crear la condició i mostrar el resultat
    if (num1 == num2 + 1 || num2 == num1 + 1) {
        println("SI")
    }
    else println("NO")

}