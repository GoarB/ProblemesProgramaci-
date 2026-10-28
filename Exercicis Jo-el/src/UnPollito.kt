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
2. Consumir el salt de línia pendent.
3. Repetir el procés per cada cas de prova.
4. Llegir la frase completa, incloent-hi els espais.
5. Calcular la longitud de la frase.
6. Comprovar si la longitud és parella.
7. Dividir la frase en dues meitats.
8. Crear una variable per controlar si les meitats són equivalents.
9. Recórrer els caràcters de la primera meitat.
10. Comptar les aparicions de cada caràcter a la primera meitat.
11. Comptar les aparicions del mateix caràcter a la segona meitat.
12. Comprovar si les quantitats són diferents.
13. Mostrar "SI" si les dues meitats tenen els mateixos caràcters.
14. Mostrar "NO" en cas contrari.
*/

import java.util.Scanner

fun main() {

    val scan = Scanner(System.`in`)

    // 1. Llegir el nombre de casos de prova.

    val nombrecasos = scan.nextInt()

    // 2. Consumir el salt de línia pendent.

    scan.nextLine()

    // 3. Repetir el procés per cada cas de prova.

    for (casactual in 1..nombrecasos) {

        // 4. Llegir la frase completa, incloent-hi els espais.

        val frase = scan.nextLine()

        // 5. Calcular la longitud de la frase.

        val longitudfrase = frase.length

        // 6. Comprovar si la longitud és parella.

        if (longitudfrase % 2 != 0) {
            println("NO")

        } else {

            // 7. Dividir la frase en dues meitats.

            val primerameitat = frase.substring(0, longitudfrase / 2)
            val segonameitat = frase.substring(longitudfrase / 2)

            // 8. Crear una variable per controlar si les meitats són equivalents.

            var mateixoscaracters = true

            // 9. Recórrer els caràcters de la primera meitat.

            for (caracteractual in primerameitat) {

                var comptadorprimera = 0
                var comptadorsegona = 0

                // 10. Comptar les aparicions del caràcter a la primera meitat.

                for (caracter in primerameitat) {
                    if (caracter == caracteractual) {
                        comptadorprimera++
                    }
                }

                // 11. Comptar les aparicions del mateix caràcter a la segona meitat.

                for (caracter in segonameitat) {
                    if (caracter == caracteractual) {
                        comptadorsegona++
                    }
                }

                // 12. Comprovar si les quantitats són diferents.

                if (comptadorprimera != comptadorsegona) {
                    mateixoscaracters = false
                }
            }

            // 13. Mostrar "SI" si les dues meitats tenen els mateixos caràcters.

            if (mateixoscaracters) {
                println("SI")

            } else {

                // 14. Mostrar "NO" en cas contrari.

                println("NO")
            }
        }
    }
}