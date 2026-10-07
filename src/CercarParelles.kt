// En el Texas Hold'em, posen 3 cartes a sobre la taula. De vegades ja hi ha una parella directament amb aquestes
// 3 cartes, cosa que sol fer pujar les apostes
// 1. Declarar scanner
// 2. Crear la variable dels tres números
// 3. Crear les condicions i mostrar el resultat

import java.util.Scanner

fun main() {
    // Declarar scanner
    val scan = Scanner(System.`in`)
    // Crear la variable dels tres números
    val num1 = scan.nextInt()
    val num2 = scan.nextInt()
    val num3 = scan.nextInt()
    // Crear les condicions i mostrar el resultat
    if (num1 == num2 || num1 == num3 || num2 == num3){
    println("SI")
    }
    else println("NO")
}