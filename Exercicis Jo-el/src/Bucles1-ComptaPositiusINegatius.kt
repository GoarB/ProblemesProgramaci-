/*
Et donen una seqüència de números enters que s'acaba amb un zero. Volem saber si tenim més números positius que
negatius o al inrevés.

Entrada
L'entrada consta d'una seqüencia de números enters que s'acaba en un zero.

Sortida
Indicarà POSITIUS si hi ha més positius que negatius, NEGATIUS si hi ha més valors negatius i IGUALS en cas d'empat.
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