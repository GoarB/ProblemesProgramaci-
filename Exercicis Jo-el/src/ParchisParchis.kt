/*
A Bambino li agrada jugar al Parchís, i el grup de música Parchis. Li agrada especialment jugar al Parchís mentre
escolta Parchís. A aquest concepte li diu ParchísParchís.

En el Parchis, quan arribes a “casa” (la zona del teu color a on només poden entrar les teves fitxes), has d’arribar
a l'última casella amb un nombre exacte de jugades, si no “rebotes” en la casella de meta i tornes enrera. La següent
tirada tornes a anar endavant

Entrada
La primera línia indica els casos de prova a considerar Cada cas de prova és una linea amb 4 nombres. El primer es la
posició inicial, del 0 al 7. els 3 següents son 3 tirades de daus del 1 al 6

Sortida
Per a cada cas hauràs de dir la posició final després de les 3 tirades de daus, tenint en compte de que si algún
cop arrives a l’última casella (8) ja has guanyat i la resta de tirades son irrelevants

1. Llegir el nombre de casos de prova.
2. Repetir el procés per cada cas.
3. Llegir la posició inicial.
4. Inicialitzar la variable que indica si ha guanyat.
5. Repetir el procés per les tres tirades.
6. Llegir el valor del dau.
7. Comprovar si la fitxa encara no ha guanyat.
8. Sumar el valor del dau a la posició actual.
9. Comprovar si ha arribat exactament a la casella 8.
10. Fer rebotar la fitxa si supera la casella 8.
11. Mostrar la posició final.
*/

import java.util.Scanner

fun main() {

    val scan = Scanner(System.`in`)

    val META = 8
    val TOTAL_TIRADES = 3

    // 1. Llegir el nombre de casos de prova.
    val nombrecasos = scan.nextInt()

    // 2. Repetir el procés per cada cas.
    for (casactual in 1..nombrecasos) {

        // 3. Llegir la posició inicial.
        var posicioactual = scan.nextInt()

        // 4. Inicialitzar la variable que indica si ha guanyat.
        var guanyat = false

        // 5. Repetir el procés per les tres tirades.
        for (tiradaactual in 1..TOTAL_TIRADES) {

            // 6. Llegir el valor del dau.
            val dau = scan.nextInt()

            // 7. Comprovar si la fitxa encara no ha guanyat.
            if (!guanyat) {

                // 8. Sumar el valor del dau a la posició actual.
                posicioactual += dau

                // 9. Comprovar si ha arribat exactament a la meta.
                if (posicioactual == META) {
                    guanyat = true

                    // 10. Fer rebotar la fitxa si supera la meta.
                } else if (posicioactual > META) {
                    posicioactual = META - (posicioactual - META)
                }
            }
        }

        // 11. Mostrar la posició final.
        println(posicioactual)
    }
}