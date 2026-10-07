// En el Texas Hold'em, posen 3 cartes a sobre la taula. Si les 3 cartes fan un trio ja directament, aleshores
// la gent es torna boja.
// 1. Declara scanner
// 2. Llegir l'entrada i crear les variables
// 3. Declarar condicional i mostrar el resultat
import java.util.Scanner

fun main() {
    // Declarar scanner
    val scan = Scanner(System.`in`)
// Llegir l'entrada i crear les variables
    val C1 = scan.nextInt()
    val C2 = scan.nextInt()
    val C3 = scan.nextInt()
// Declarar condicional i mostrar el resultat
    if (C1 == C2 && C2 == C3) {
        println("SI")
    }
    else {
            println("NO")
    }
}