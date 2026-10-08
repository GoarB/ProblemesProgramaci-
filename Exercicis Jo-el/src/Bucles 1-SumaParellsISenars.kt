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
2. Crear la variable de l'entrada de l'usuari y el valor del total de numeros introduits.
3. Crear el bucle i anar sumant o restatnt el total de numeros positius o negatius.
4. Crear les condicions per a cada sortida.
 */

import java.util.Scanner

fun main() {
    // Declarar scanner
    val scan = Scanner(System.`in`)
    // Crear la variable de l'entrada de l'usuari y el valor del total de numeros introduits.
    var entrada = 0
    var numerousuari = scan.nextInt()
    // Crear el bucle i anar sumant o restatnt el total de numeros positius o negatius.
    while (numerousuari != 0) {
        if (numerousuari > 0)
            entrada += 1
        else entrada -= 1
        numerousuari = scan.nextInt()
    }
    // Crear les condicions per a cada sortida.
    if (entrada > 0) {
        println("POSITIUS")
    }
    else if (entrada < 0) {
        println("NEGATIUS")
    }
    else (println("IGUALS"))
}