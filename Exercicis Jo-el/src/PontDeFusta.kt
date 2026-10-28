/*
Volem fer un pont de fusta, tenim taulons de fusta de 1m i de 0.5m,

Entrada
La primera línea conté el número de casos que cal gestionar Per cada cas de prova, el programa demana la longitud
total del pont, i calcula quants taulons de fusta necessitarem, tenint el compte que per a cada tauló de fusta d'1m
després en posarem dos de 0,5m, i sempre començarem amb un tauló d'1m

Sortida
S’haurà de calcular el nombre de taulons utilitzats per aconseguir la longitud del pont que hem triat

1. Llegir el nombre de casos de prova.
2. Repetir el procés per cada cas.
3. Llegir la longitud total del pont.
4. Calcular quants blocs complets de 2 metres hi caben.
5. Calcular els taulons necessaris per als blocs complets.
6. Comprovar si queda 1 metre pendent.
7. Afegir un tauló d'1 metre si la longitud és senar.
8. Mostrar el nombre total de taulons necessaris.
*/

import java.util.Scanner

fun main() {

    val scanner = Scanner(System.`in`)

    // 1. Llegir el nombre de casos de prova.

    val nombreCasosProva = scanner.nextInt()

    // 2. Repetir el procés per cada cas.

    for (casActual in 1..nombreCasosProva) {

        // 3. Llegir la longitud total del pont.

        val longitudPont = scanner.nextInt()

        // 4. Calcular quants blocs complets de 2 metres hi caben.

        val blocsComplets = longitudPont / 2

        // 5. Calcular els taulons necessaris per als blocs complets.

        var totalTaulons = blocsComplets * 3

        // 6. Comprovar si queda 1 metre pendent.

        if (longitudPont % 2 != 0) {

            // 7. Afegir un tauló d'1 metre si la longitud és senar.

            totalTaulons++
        }

        // 8. Mostrar el nombre total de taulons necessaris.

        println(totalTaulons)
    }
}