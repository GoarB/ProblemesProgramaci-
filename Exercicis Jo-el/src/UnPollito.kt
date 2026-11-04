/*
Aquest estiu caminant pel barri de La Rosaleda, a Màlaga, es va fer l’hora de dinar ... i vet aquí que vaig trobar un
lloc on venien pollastres rostits ...

No m’agrada fer publicitat, però era “el asador rosaleda” ... i de seguida vaig veure una cosa curiosa al seu nom ...
si el partíem per la meitat, les lletres de cada meitat eren les mateixes!!!, incloent-hi els espais.

Entrada
L’entrada comença amb un valor enter que indicarà el número de casos de prova.

Per cada cas de prova, vindrà una línia amb una frase que no estarà buida i completament en minúscules

Sortida
Per cada cas de prova s’indicarà en una línia:

SI ... si la frase compleix que partida per la meitat, la primera meitat i la segona tenen els mateixos caràcters i
en la mateixa quantitat.

NO ... cas contrari

1. Llegir el nombre de casos de prova.
2. Repetir el procés per cada cas.
3. Llegir la frase completa.
4. Calcular la mida de cada meitat.
5. Crear dos arrays per comptar els caràcters.
6. Comptar els caràcters de les dues meitats.
7. Comparar les quantitats dels caràcters.
8. Mostrar SI si les dues meitats són equivalents.
9. Mostrar NO si són diferents.
*/

import java.util.Scanner

fun main() {

    val scan = Scanner(System.`in`)

    val TOTAL_CARACTERS = 65536

    // 1. Llegir el nombre de casos de prova.

    val nombrecasos = scan.nextInt()
    scan.nextLine()

    // 2. Repetir el procés per cada cas.

    for (casactual in 1..nombrecasos) {

        // 3. Llegir la frase completa.

        val frase = scan.nextLine()

        // 4. Calcular la mida de cada meitat.

        val meitat = frase.length / 2

        // 5. Crear dos arrays per comptar els caràcters.

        val primerameitat = Array(TOTAL_CARACTERS) { 0 }
        val segonameitat = Array(TOTAL_CARACTERS) { 0 }

        // 6. Comptar els caràcters de les dues meitats.

        for (index in 0 until meitat) {

            val primercharacter = frase[index].code
            val segoncharacter = frase[frase.length - meitat + index].code

            primerameitat[primercharacter]++
            segonameitat[segoncharacter]++
        }

        // 7. Comparar les quantitats dels caràcters.

        var correcte = true

        for (index in 0 until TOTAL_CARACTERS) {

            if (primerameitat[index] != segonameitat[index]) {
                correcte = false
            }
        }

        // 8 i 9. Mostrar el resultat.

        if (correcte) {
            println("SI")
        } else {
            println("NO")
        }
    }
}