/*
Donada una matriu i la seva mida, determinarem la posició del seu maxim

Entrada
El primer nombre es el nombre de casos. Per cada cas, primer es dirà les dimensions f i c, seguides per f*c nombres

Sortida
Per cada cas haureu d’escriure la posició (fila - columna) del nombre més gran de la matriu. L’haureu d’expressar com
ho expressaria un humà, es a dir, amb les files i columnes començant per 1.

1. Registrar el nùmero de casos posibles.
2. Registrar la mida de la matriu.
3. Omplir la matriu amb les entrades de l'usuari.
4. Buscar la posició del nombre més gran de la matriu,  tenint en compte que la posicio a mostrar es igual a la
posició + 1 (com si ho digues un huma).
5. Mostrar el resultat.
*/

import java.util.Scanner

fun main() {

    val scan = Scanner(System.`in`)

//1. Registrar el nùmero de casos posibles.
    var casos = scan.nextInt()
    while (casos > 0) {
//2. Registrar la mida de la matriu.
        val numrows = scan.nextInt()
        val numcolumns = scan.nextInt()
        val numeros = Array(numrows) { IntArray(numcolumns) }

//3. Omplir la matriu amb les entrades de l'usuari.
        for (i in 0 until numrows) {
            for (j in 0 until numcolumns) {
                numeros[i][j] = scan.nextInt()
            }
        }

//4. Buscar la posició del nombre mes gran de la matriu, tenint en compte que la posicio a mostrar es igual a la
// posició + 1 (com si ho digues un huma).
        var max = numeros[0][0]
        var resultat = "1 1"
        for (i in numeros.indices) {
            for (j in numeros[i].indices) {
                if (numeros[i][j] > max) {
                    max = numeros[i][j]
                    resultat = "${i+1} ${j+1}"
                }
            }
        }

//5. Mostrar el resultat.
        println(resultat)
        casos--
    }
}