/*
Anem a fer operacions matemàtiques. Donat un nombre enter n > 0, calcula els números que són divisors d'aquest.

Entrada
La primera línia indica els casos de prova a considerar. Cada cas compta amb 1 linea amb un número enter positiu.

Sortida
Per cada cas de prova caldrà mostrar la llista de divisors d'n en una línia i separats per un espai en blanc.

1. Crear la variable de la cuantitat de casos de prova.
2. Crear el bucle que permeti fer els calculs en numero de vegades introduit.
3. Crear la variable de l'entrada de l'usuari. i la variable string on es mostraran els divisors.
4. Crear un bucle en el que es comprobi quins numeros son divisors del entrat per l'usuari.
5. Afegir aquests numeros a una string.
6. Mostrar el resultat en pantalla.

 */

import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`)

//1. Crear la variable de la cuantitat de casos de prova.
    var casostotal = scan.nextInt()
//2. Crear el bucle que permeti fer els calculs en numero de vegades introduit.
    while (casostotal != 0){

//3. Crear la variable de l'entrada de l'usuari. i la variable string on es mostraran els divisors.

        val entrada : Int = scan.nextInt()
        var resultat = ""
    //4. Crear un bucle en el que es comprobi quins numeros son divisors del entrat per l'usuari.
    for (n in 1..entrada){

//5. Afegir aquests numeros a una string.

    if (entrada % n == 0){
        resultat += "$n "

    }
    }
//6. Mostrar el resultat en pantalla.
   println(resultat)
        casostotal--
    }
}