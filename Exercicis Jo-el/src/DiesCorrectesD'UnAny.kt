// Programa que demana un número de dia de l’any, que pot ser qualsevol enter, i mostra per pantalla:
//
//Incorrecte!, si el número de dia no és correcte
//Correcte per un any no bixest!, si el dia està entre 1 i 365
//Correcte per un any bixest!, si el dia és 366
// 1. Declarar Scanner
// 2. Llegir l'entrada
// 3. Crear les condicionals i mostrar les respostes en cada casa

import java.util.Scanner

fun main() {

    // Declarar scanner
    val scan = Scanner(System.`in`)
    // Declarar variables d'any i any bixest
    val primerdia = 1
    val ultimdia = 365
    val bixest = 366
    // Llegir l'entrada
    val num = scan.nextInt()
    // Crear les condicionals i mostrar les respostes en cada cas
    if (num !in primerdia..bixest){
        println("Incorrecte!")
    }
    else if (num in primerdia..ultimdia) {
        println("Correcte per un any no bixest!")
    }
    else {
        println("Correcte per un any bixest!")
    }
}