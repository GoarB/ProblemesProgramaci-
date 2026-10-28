/*
Un professor vol saber per un treball quin es el nen més alt de la seva classe.

Entrada
L'entrada serà una línia on hi haurà 4 altures de les quals la PRIMERA altura correspon a l’ ALTURA MAXIMA permesa
 (inclosa) per a que una persona es consideri nen. Les 3 següents són altures dels tres nens alumnes. Suposarem les
 altures dels nens totes diferents.

Sortida
El programa escriurà “Nen Nº“ del nen més alt. En cas que tots superin l'altura màxima escriurà "No hi ha cap nen".

1. Llegir l'altura màxima permesa per considerar una persona nen.
2. Llegir les altures dels tres nens.
3. Comprovar si el primer nen compleix el límit d'altura.
4. Comprovar si el segon nen compleix el límit d'altura.
5. Comprovar si el tercer nen compleix el límit d'altura.
6. Comparar les altures vàlides per trobar el nen més alt, mostrar "Nen 1", "Nen 2" o "Nen 3" segons correspongui i
si cap dels tres compleix el límit, mostrar "No hi ha cap nen".

*/

import java.util.Scanner

fun main() {

    val scanner = Scanner(System.`in`)

    // 1. Llegir l'altura màxima permesa per considerar una persona nen.

    val alturaMaximaPermesa = scanner.nextInt()

    // 2. Llegir les altures dels tres nens.

    val alturaNen1 = scanner.nextInt()
    val alturaNen2 = scanner.nextInt()
    val alturaNen3 = scanner.nextInt()

    var alturaMesGranValida = -1
    var numeroNenMesAlt = 0

    // 3. Comprovar si el primer nen compleix el límit d'altura.

    if (alturaNen1 <= alturaMaximaPermesa) {
        alturaMesGranValida = alturaNen1
        numeroNenMesAlt = 1
    }

    // 4. Comprovar si el segon nen compleix el límit d'altura.

    if (alturaNen2 <= alturaMaximaPermesa && alturaNen2 > alturaMesGranValida) {
        alturaMesGranValida = alturaNen2
        numeroNenMesAlt = 2
    }

    // 5. Comprovar si el tercer nen compleix el límit d'altura.

    if (alturaNen3 <= alturaMaximaPermesa && alturaNen3 > alturaMesGranValida) {
        alturaMesGranValida = alturaNen3
        numeroNenMesAlt = 3
    }

    // 6. Comparar les altures vàlides per trobar el nen més alt, mostrar "Nen 1", "Nen 2" o "Nen 3" segons
    // correspongui i si cap dels tres compleix el límit, mostrar "No hi ha cap nen".

    if (numeroNenMesAlt == 0) {
        println("No hi ha cap nen")
    } else {
        println("Nen $numeroNenMesAlt")
    }
}