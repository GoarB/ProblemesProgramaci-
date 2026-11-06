/*
El tres en raya però con gatos.

Entrada
La primera línia indica els casos de prova a considerar. Cada cas tindrà dues línies, la primera tindrà el nombre de
files (F) i la segona el nombre de columnes (C), seguit de una matriu F*C amb una serie de nombres que seràn 1 (gat)
o 0 (res). (Els gats utilitzats en una ratlla no poden utilitzar-se per formar una altre).

Sortida
Per a cada cas hauràs de donar la quantitat de línies que es poden formar amb els gats de la matriu, en format de un
nombre únic.

1. Registrar els casos de prova.
2. Registrar la mida de la matriu.
3. Omplir la matriu amb les entrades de l'usuari.
4. Comptar les ratlles horitzontals.
5. Comptar les ratlles verticals.
6. Mostrar el resultat.
*/

import java.util.Scanner

fun main() {

    val scan = Scanner(System.`in`)

//1. Registrar els casos de prova.
    var casos = scan.nextInt()

    while (casos > 0) {

//2. Registrar la mida de la matriu.
        val numrows = scan.nextInt()
        val numcolumns = scan.nextInt()
        val numeros = Array(numrows) { IntArray(numcolumns) }
        var resultat = 0

//3. Omplir la matriu amb les entrades de l'usuari.
        for (i in 0 until numrows) {
            for (j in 0 until numcolumns) {
                numeros[i][j] = scan.nextInt()
            }
        }

//4. Comptar les ratlles horitzontals.
        for (i in 0 until numrows - 2) {
            for (j in 0 until numcolumns) {

                if (numeros[i][j] == 1 &&
                    numeros[i + 1][j] == 1 &&
                    numeros[i + 2][j] == 1) {

                    resultat++

                    numeros[i][j] = 0
                    numeros[i + 1][j] = 0
                    numeros[i + 2][j] = 0
                }
            }
        }

//5. Comptar les ratlles verticals.
        for (i in 0 until numrows) {
            for (j in 0 until numcolumns - 2) {

                if (numeros[i][j] == 1 &&
                    numeros[i][j + 1] == 1 &&
                    numeros[i][j + 2] == 1) {

                    resultat++

                    numeros[i][j] = 0
                    numeros[i][j + 1] = 0
                    numeros[i][j + 2] = 0
                }
            }
        }
//6. Mostrar el resultat.
        println(resultat)
        casos--
    }
}
