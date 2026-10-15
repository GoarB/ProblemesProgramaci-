/*
Anem a fer operacions matemàtiques. Donat un nombre enter n >= 0 calcula el seu factorial (n!). Ajuda : si n> 2 , n! = n (n-1) (n-2) …. 1 0! = 1 i 1! = 1

Entrada
La primera línia indica els casos de prova a considerar Cada cas compta amb 1 linea amb un número enter positiu

Sortida
Per cada cas de prova caldrà mostrar el resultat de n!

1. Crear una variables per registrar el numero de casos de proba que introduira l'usuari.
2. Fer un bucle que per cada numero entre 1 i el numero que entri l'usuari ambdos inclosos.
3. Mostrar la sortida a cada cas.
 */

import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`)

//1. Crear una variable per registrar el numero de casos de proba que introduira l'usuari.

    var casostotals = scan.nextInt()

//2. Fer un bucle que per cada numero entre 1 i el numero que entri l'usuari ambdos inclosos.

    while (casostotals != 0) {

        val numero = scan.nextLong()
        var resultat : Long = 1
        for (num in 1..numero) {
            resultat *= num
        }
        //3. Mostrar la sortida a cada cas.
        println(resultat)
        casostotals--
    }
}