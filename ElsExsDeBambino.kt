// Quan Bambino va sortir amb el seu primer ex, l'ex tenia 18 anys. Bambino va dir "mai més ningú de 18 anys" El segón
// ex de bambino tenia 29. Bambino va dir "mai més ningú de 29 anys" El tercer tenia 26. Bambino... sí,
// ja us ho imagineu.
// 1. Declarar scanner
// 2. Llegir entrada i crear variables
// 3. Crear condicional i mostrar el resultat

import java.util.Scanner

fun main() {
    // Declarar scanner
    val scan = Scanner(System.`in`)
    // Llegir l'entrada i crear les variables
    val ex1 = scan.nextInt()
    val ex2 = scan.nextInt()
    val ex3 = scan.nextInt()
    val novio = scan.nextInt()
    // Crear condicional i mostrar el resultat
    if (ex1 >= 18 && ex2 != ex1   && ex3 != ex2 && ex3 != ex1 && novio != ex1 && novio != ex2 && novio != ex3
        && novio >= 18) {
        println("SI")
    }
    else {
        println("NO")
    }
}