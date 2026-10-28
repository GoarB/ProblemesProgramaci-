/*
Un eclipsi solar es produeix quan la lluna s'interposa al camí de la llum del sol i projecta la seva ombra a la Terra.
Aquest eclipsi total es produeix aproximadament cada any i mig en algun lloc de la Terra. Un eclipsi parcial, quan la
lluna no recobreix completament el sol, es produeix almenys dues vegades per any, en algun lloc de la Terra.

Acordem que per aquest problema:

1 any: 365 dies

Eclipsi Parcial cada ½ any: 183 dies (per fer-ho rodó)

Eclipsi Total cada 1 any i mig: 548 dies

Entrada
La primera línia indica els casos de prova a considerar. Cada cas és una línia amb 1 número que representa els dies que
han transcorregut des de l’inici dels temps. Entenem que a partir del dia 0 comença el compte dels eclipsis que hi ha
hagut des de sempre. Tingueu en compte que poden haver passat molts i molts dies.

Sortida
La sortida, en una línia, ha d’indicar si aquell dia hi ha eclipsi solar “TOTAL”, “PARCIAL” o “NO” (si no n’hi ha),
seguidament, ha d’indicar els dies que falten pel pròxim eclipsi i finalment, si serà total o parcial,
el que arribi abans.

Nota: Si aquell dia es produeix un eclipsi els dies que falten seran 0, i no s’indicarà res més.

1. Llegir el nombre de casos de prova.
2. Repetir el procés per cada cas de prova.
3. Llegir els dies transcorreguts.
4. Comprovar si aquell dia hi ha un eclipsi total.
5. Comprovar si aquell dia hi ha un eclipsi parcial.
6. Si no hi ha eclipsi, calcular els dies que falten pel pròxim eclipsi parcial.
7. Calcular els dies que falten pel pròxim eclipsi total.
8. Comparar quin dels dos eclipsis arribarà abans.
9. Mostrar "NO", els dies que falten i el tipus del pròxim eclipsi.
*/

import java.util.Scanner

fun main() {

    val scanner = Scanner(System.`in`)

    // 1. Llegir el nombre de casos de prova.

    val nombreCasosProva = scanner.nextInt()

    // 2. Repetir el procés per cada cas de prova.

    for (casActual in 1..nombreCasosProva) {

        // 3. Llegir els dies transcorreguts.

        val diesTranscorreguts = scanner.nextLong()

        // 4. Comprovar si aquell dia hi ha un eclipsi total.

        if (diesTranscorreguts % 548 == 0L) {
            println("TOTAL 0")

            // 5. Comprovar si aquell dia hi ha un eclipsi parcial.

        } else if (diesTranscorreguts % 183 == 0L) {
            println("PARCIAL 0")

        } else {

            // 6. Calcular els dies que falten pel pròxim eclipsi parcial.

            val diesFinsParcial = 183 - (diesTranscorreguts % 183)

            // 7. Calcular els dies que falten pel pròxim eclipsi total.

            val diesFinsTotal = 548 - (diesTranscorreguts % 548)

            // 8. Comparar quin dels dos eclipsis arribarà abans.

            if (diesFinsParcial < diesFinsTotal) {

                // 9. Mostrar els dies que falten i que el pròxim serà parcial.

                println("NO $diesFinsParcial PARCIAL")

            } else {

                // 9. Mostrar els dies que falten i que el pròxim serà total.

                println("NO $diesFinsTotal TOTAL")
            }
        }
    }
}