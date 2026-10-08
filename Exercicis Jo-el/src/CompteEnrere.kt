/*
Elon Musk està comptant enrere per el seu llançament del seu nou coet de SpaceX. No obstant, Elon Musk va fins dalt de porros i no sap fer un compte enrere. Ajuda'l

Entrada
Cada cas és una línia amb 1 número positiu.

Sortida
El compte enrere del nombre mostrat fins a 0, incloent els dos.

1. Crear la variable de la quantitat de números que s'introduiran.
2. Crear el bucle que imprimeixi un numero menys que el bucle anterior.
 */

import java.util.Scanner

fun main() {
    // Declarar scanner
    val scan = Scanner(System.`in`)
    // Crear la variable de la quantitat de números que s'introduiran.
    var numentrada : Int = scan.nextInt()
    //  Crear el bucle que imprimeixi un numero menys que el bucle anterior.
    while (numentrada >= 0){
        println(numentrada)
        numentrada -= 1
    }

}