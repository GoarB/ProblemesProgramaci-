/*
En el joc d’Scrabble es disposa d’un taulell de 15x15 caselles on cada jugador forma paraules encadenades fins que no
resten fitxes per col.locar. Les paraules es formen amb lletres (cada lletra en una fitxa). A cada joc hi ha un nombre
determinat de lletres, les més habituals estan repetides vàries vegades, però hi ha lletres que es troben una o dos
vegades únicament. En aquesta ocasió considerem es juga a les 26 lletres de l’alfabet anglès (de l’A a la Z).

Entrada
L’entrada conté una primera línia amb el número de casos de prova a tractar. A continuació, per cada cas de prova
trobareu una línia amb 26 números enters separats per un espai en blanc, què corresponen al nombre total de lletres
de cada tipus. El primer nombre indica el nombre d’A’s, el segon, el nombre de B’s, …, fins al últim, que indica el
nombre de Z’s.

Desprès entraran una sèrie de paraules, cadascuna en una línia. L’última, serà un ‘.’, que no s’ha de processar.

Sortida
Per cada cas de prova mostrar en nombre total, i les paraules que s’han pogut formar, fent servir les fitxes inicials.
El resultat cal mostrar-ho en la sola línia, separant els valors per un espai en blanc. Atenció!! Cal respectar
l’ordre en la formació de les paraules. Es formaran el màxim nombre de paraules respectant l’ estricte ordre d’entrada.
Si una paraula no es pot formar, es passarà a la següent.

1. Llegir el nombre de casos de prova.
2. Repetir el procés per cada cas.
3. Crear un array per guardar les 26 quantitats de lletres.
4. Llegir les quantitats disponibles de cada lletra.
5. Llegir les paraules fins a trobar un punt.
6. Crear un array per comptar les lletres de cada paraula.
7. Comptar quantes vegades apareix cada lletra.
8. Comprovar si tenim prou fitxes per formar la paraula.
9. Si es pot formar, descomptar les fitxes utilitzades.
10. Guardar les paraules acceptades i comptar-les.
11. Mostrar el nombre de paraules i els seus noms.
*/

import java.util.Scanner

fun main() {

    val scan = Scanner(System.`in`)

    val TOTAL_LLETRES = 26

    // 1. Llegir el nombre de casos de prova.
    val nombrecasos = scan.nextInt()

    // 2. Repetir el procés per cada cas.
    for (casactual in 1..nombrecasos) {

        // 3. Crear un array per guardar les quantitats de lletres.
        val lletresdisponibles = Array(TOTAL_LLETRES) { 0 }

        // 4. Llegir les quantitats disponibles de cada lletra.
        for (index in 0 until TOTAL_LLETRES) {
            lletresdisponibles[index] = scan.nextInt()
        }

        // 5. Llegir les paraules fins a trobar un punt.
        var paraula = scan.next()
        var paraulesacceptades = 0
        var resultat = ""

        while (paraula != ".") {

            // 6. Crear un array per comptar les lletres de la paraula.
            val lletresnecessaries = Array(TOTAL_LLETRES) { 0 }

            // 7. Comptar quantes vegades apareix cada lletra.
            val paraulamajuscules = paraula.uppercase()

            for (index in 0 until paraulamajuscules.length) {
                val posicio = paraulamajuscules[index].code - 'A'.code
                lletresnecessaries[posicio]++
            }

            // 8. Comprovar si tenim prou fitxes per formar la paraula.
            var possible = true

            for (index in 0 until TOTAL_LLETRES) {
                if (lletresnecessaries[index] > lletresdisponibles[index]) {
                    possible = false
                }
            }

            // 9. Si es pot formar, descomptar les fitxes utilitzades.
            if (possible) {

                for (index in 0 until TOTAL_LLETRES) {
                    lletresdisponibles[index] -= lletresnecessaries[index]
                }

                // 10. Guardar la paraula acceptada i comptar-la.
                paraulesacceptades++
                resultat += " " + paraulamajuscules
            }

            // 5. Llegir la següent paraula.
            paraula = scan.next()
        }

        // 11. Mostrar el nombre de paraules i els seus noms.
        println("$paraulesacceptades$resultat")
    }
}