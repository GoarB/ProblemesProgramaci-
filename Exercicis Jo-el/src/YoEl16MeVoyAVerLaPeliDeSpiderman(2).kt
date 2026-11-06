/*
Arnau va el 16 a veure la peli de Spiderman. Això significa que es perdrà una hora de classe abans i una hora de
classe després. Qui va a veure una peli EN MEITAT DEL SEU HORARI ESCOLAR?

Entrada
El cas de prova comença amb dos nombres, f i c, que tenen les files i les columnes de la matriu. Després, f∗c
Strings que detallen el contingut de la matriu. Hi haurà una i només una string que dirà SPIDERMAN

Sortida
La sortida són dues linies. s'ha de dir la classe que està immediatament a sobre de SPIDERMAN, i la que està
immediatament a sota de SPIDERMAN, que són les classes que es perdrà. Si SPIDERMAN no té una classe a sobre o a sota
es dirà respectivament NO

1. Registrar el tamany de la matriu.
2. Registrar el contingut de la matriu.
3. Si s'introdueix la paraula SPIDERMAN es mostrarà la paraula que es trobi just a sobre.
4. Comprovar si te una classe a sobre.
5. Comprobar si te una classe a sota.
6. Mostrar el resultat.
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
    var resultat2 = "NO"
    for (i in numeros.indices) {
        for (j in numeros[i].indices) {

//4. Comprovar si te una classe a sobre.
            if (numeros[i][j] == "SPIDERMAN") {
                if (i == numrows - 1) {
                    resultat = numeros[i - 1][j]
                }
//5. Comprobar si te una classe a sota.
                    else if (i in 1..<numrows - 1) {
                        resultat2 = numeros[i + 1][j]
                        resultat = numeros[i - 1][j]
                    }

            }
        }
    }

//6. Mostrar el resultat.
    println(resultat)
    println(resultat2)

}