import java.util.Scanner

fun main() {
    // Declarar scanner
    val scan = Scanner(System.`in`)
    // Llegir els números
    val n1 = scan.nextInt()
    val n2 = scan.nextInt()
    // Mostrar el resultat
    print(n1 % n2)
}