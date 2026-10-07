// Els físics que surten als comics de Marvel diuen que existeixen dimensions inverses, a on hi ha personatges que fan de
// tots els nostres defectes virtuds. Nosaltres invertirem alguna cosa moralment menys complexa.
// 1. Declara scanner
// 2. Llegir el número
// 3. Mostra el resultat

import java.util.Scanner

fun main() {
    // Declarar scanner
    val scan = Scanner(System.`in`)
    // Llegir el numero
    val num = scan.nextDouble()
    // Mostra el resultat
    print(1 / num)
}