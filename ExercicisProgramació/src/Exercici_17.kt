import java.util.Scanner

fun main() {
    // Declarar scanner
    val scan = Scanner(System.`in`)
    // Demanar l'edat al usuari
    println("Diguem la teva edat i et diré si ets major d'edat: ")
    val edat = scan.nextInt() >= 18
    // Mostrar l'edat en valor Boolea
    println("La teva resposta en valor Boolea es: $edat")
}