/*
WebCaptioner (conegut a catalunya com WebCasteller), és una web que et permet posar subtítols a la veu a temps real.
Encara està aprenent, així que amb tal de que posi bé la meitat de les lletres ens donem per satisfet

Entrada
La primera línea son els casos de prova. Cada cas de prova són dues línies amb una sola paraula cadascuna. La primera
és el que has dit i la segona el que ha tornat WebCasteller

Sortida
Per cada cas de prova caldrà respondre: Si com a mínim la meitat de les lletres són iguals en posició i valor, es
tornara "GRACIES WEBCASTELLER" Si no, es tornarà "WEBCASTELLER ESTA TRAVIESO HOY". Si les strings tenen tamany
diferent, es prendrà com a referència la string més llarga.

1. Llegir el nombre de casos de prova.
2. Repetir el procés per cada cas de prova.
3. Llegir la paraula original.
4. Llegir la paraula retornada per WebCasteller.
5. Obtenir la longitud de la paraula més curta.
6. Obtenir la longitud de la paraula més llarga.
7. Crear un comptador de lletres coincidents.
8. Recórrer les posicions que existeixen a les dues paraules.
9. Comprovar si les lletres de la mateixa posició són iguals.
10. Augmentar el comptador quan les lletres coincideixin.
11. Comprovar si les coincidències són com a mínim la meitat de la paraula més llarga.
12. Mostrar "GRACIES WEBCASTELLER" si supera la meitat.
13. Mostrar "WEBCASTELLER ESTA TRAVIESO HOY" en cas contrari.
*/

import java.util.Scanner

fun main() {

    val scan = Scanner(System.`in`)

    // 1. Llegir el nombre de casos de prova.

    val nombrecasos = scan.nextInt()

    // 2. Repetir el procés per cada cas de prova.

    for (casactual in 1..nombrecasos) {

        // 3. Llegir la paraula original.

        val paraulaoriginal = scan.next()

        // 4. Llegir la paraula retornada per WebCasteller.

        val paraulawebcasteller = scan.next()

        // 5. Obtenir la longitud de la paraula més curta.

        val longitudcurta = minOf(paraulaoriginal.length, paraulawebcasteller.length)

        // 6. Obtenir la longitud de la paraula més llarga.

        val longitudllarga = maxOf(paraulaoriginal.length, paraulawebcasteller.length)

        // 7. Crear un comptador de lletres coincidents.

        var coincidencies = 0

        // 8. Recórrer les posicions que existeixen a les dues paraules.

        for (posicio in 0 until longitudcurta) {

            // 9. Comprovar si les lletres de la mateixa posició són iguals.

            if (paraulaoriginal[posicio] == paraulawebcasteller[posicio]) {

                // 10. Augmentar el comptador quan les lletres coincideixin.

                coincidencies++
            }
        }

        // 11. Comprovar si les coincidències són com a mínim la meitat de la paraula més llarga.

        if (coincidencies * 2 >= longitudllarga) {

            // 12. Mostrar el missatge si supera la meitat.

            println("GRACIES WEBCASTELLER")

        } else {

            // 13. Mostrar el missatge en cas contrari.

            println("WEBCASTELLER ESTA TRAVIESO HOY")
        }
    }
}