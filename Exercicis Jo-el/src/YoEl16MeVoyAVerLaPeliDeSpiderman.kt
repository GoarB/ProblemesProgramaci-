/*
Arnau va el 16 a veure la peli de Spiderman. Això significa que es perdrà una hora de classe

Entrada
El cas de prova comença amb dos nombres, f i c, que tenen les files i les columnes de la matriu. Després, f∗c
 Strings que detallen el contingut de la matriu. Hi haurà una i només una string que dirà SPIDERMAN

Sortida
s'ha de dir la classe que està immediatament a sobre de SPIDERMAN, que és la classe que es perdrà. Si SPIDERMAN està a
primera hora i no es perd cap classe, es dirà NO

1. Registrar el tamany de la matriu.
2. Registrar el contingut de la matriu.
3. Si s'introdueix la paraula SPIDERMAN es mostrarà la paraula que es trobi just a sobre.
4. Comprovar si te una classe a sobre.
5. Mostrar el resultat.
 */

import java.util.Scanner

fun main() {

    val scan = Scanner(System.`in`)

//1. Registrar la mida de la matriu.
    val numrows = scan.nextInt()
    val numcolumns = scan.nextInt()
    val numeros = Array(numrows) { Array(numcolumns) { "" } }

//2. Omplir la matriu amb les entrades de l'usuari.
    for (i in 0 until numrows) {
        for (j in 0 until numcolumns) {
            numeros[i][j] = scan.next()
        }
    }

//3. Buscar la posicio de SPIDERMAN.
    var resultat = "NO"

    for (i in numeros.indices) {
        for (j in numeros[i].indices) {

//4. Comprovar si te una classe a sobre.
            if (numeros[i][j] == "SPIDERMAN") {
                if (i > 0) {
                    resultat = numeros[i - 1][j]
                }
            }
        }
    }

    //5. Mostrar el resultat.
    println(resultat)

}