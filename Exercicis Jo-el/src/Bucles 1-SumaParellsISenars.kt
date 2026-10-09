/*
Et proposem un petit repte. Donat un número enter positiu N, suma per separat els números parells i els números senars
entre 1 i N (inclós).

Entrada
L'entrada consta d'un primer número K que indica els casos de prova a tractar. Per cada cas de prova l'entrada serà un
número enter positiu.

Sortida
Es mostrarà un missatge indicant la suma dels nombres parells i la suma dels senars. El missatge tindrà el següent
format:


1. Declarar Scanner
2. Crear les variables per comptar parells, senars i per registrar les entrades que introduira l'usuari.
3. Crear el bucle i anar sumant o restant el total de numeros parells i senars.
4. Mostrar la sortida amb el total de resultats.
 */

import java.util.Scanner

fun main() {
    // Declarar scanner
    val scan = Scanner(System.`in`)
    // Crear les variables per comptar parells, senars i per registrar les entrades que introduira l'usuari.
    var parell = 0
    var senar = 0
    var entrades = scan.nextInt()
    // Crear el bucle i anar sumant o restant el total de numeros parells i senars.
    while (entrades  > 0) {
        entrades -= 1
        val numerousuari = scan.nextInt()
        val numeros = 1..numerousuari
        for (numero in numeros) {
            if (numero % 2 == 0) {
                parell += numero
            } else {
                senar += numero
            }
        }
        // Mostrar la sortida amb el total de resultats.
        println("PARELLS: $parell SENARS: $senar")
        parell = 0
        senar = 0
    }
}