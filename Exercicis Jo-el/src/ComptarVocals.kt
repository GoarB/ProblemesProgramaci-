/*
Fes un programa que llegeixi una frase. La sortida ens diu la quantitat de vegades que apareix cada
vocal (tant majúscula com minúscula).

Entrada
La primera línia indica els casos de prova a considerar. Cada cas conté una frase.

Sortida
Per cada cas de prova caldrà respondre: A: xxx E: xxx I: xxx O: xxx U: xxx

1. Llegir el nombre de casos de prova.
2. Consumir el salt de línia que queda després de llegir el nombre de casos.
3. Repetir el procés per cada cas de prova.
4. Llegir una frase completa.
5. Crear els comptadors de cada vocal.
6. Recórrer tots els caràcters de la frase.
7. Convertir cada caràcter a minúscula.
8. Comprovar quina vocal és i augmentar el comptador corresponent.
9. Mostrar el nombre d'aparicions de cada vocal amb el format demanat.
*/

import java.util.Scanner

fun main() {

    val scan = Scanner(System.`in`)

    // 1. Llegir el nombre de casos de prova.

    val nombrecasosprova = scan.nextInt()

    // 2. Consumir el salt de línia que queda després de llegir el nombre de casos.

    scan.nextLine()

    // 3. Repetir el procés per cada cas de prova.

    for (casActual in 1..nombrecasosprova) {

        // 4. Llegir una frase completa.

        val frase = scan.nextLine()

        // 5. Crear els comptadors de cada vocal.

        var quantitatA = 0
        var quantitatE = 0
        var quantitatI = 0
        var quantitatO = 0
        var quantitatU = 0

        // 6. Recórrer tots els caràcters de la frase.

        for (caracter in frase) {

            // 7. Convertir cada caràcter a minúscula.

            val caracterMinuscula = caracter.lowercaseChar()

            // 8. Comprovar quina vocal és i augmentar el comptador corresponent.

            if (caracterMinuscula == 'a') {
                quantitatA++
            } else if (caracterMinuscula == 'e') {
                quantitatE++
            } else if (caracterMinuscula == 'i') {
                quantitatI++
            } else if (caracterMinuscula == 'o') {
                quantitatO++
            } else if (caracterMinuscula == 'u') {
                quantitatU++
            }
        }

        // 9. Mostrar el nombre d'aparicions de cada vocal amb el format demanat.

        println("A: $quantitatA E: $quantitatE I: $quantitatI O: $quantitatO U: $quantitatU")
    }
}