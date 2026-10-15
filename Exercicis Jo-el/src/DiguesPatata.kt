/*
Científics de tot el món s’han reunit per saber quina és la millor forma de prendre fotos de grup. Alguns diuen que s’ha de fer dir al grup “lluis”, i alguns altres “patata”. Has de fer un programa que digui aquestes paraules per veure com semblen.

Entrada
La primera línia indica els casos de prova a considerar Cada cas compta amb 1 linea

Sortida
Per cada cas de prova caldrà respondre: La linea que s’ha entrat

1. Crear una variable per registrar numero de casos registrats per l'usuari.
2. Crear el bucle en base a la cuantitat d'entrades. Per cada bucle llegirem l'entrada i la mostrarem.

 */

import java.util.Scanner

fun main() {
    // Declarar scanner
    val scan = Scanner(System.`in`)

//    1. Crear una variable per registrar numero de casos registrats per l'usuari.
    var numerodecasos : Int = scan.nextInt()
//    2. Crear el bucle en base a la cuantitat d'entrades. Per cada bucle llegirem l'entrada i la mostrarem.
    while (numerodecasos > 0) {
        var entrada = scan.next()
        println(entrada)
        numerodecasos--
    }
}