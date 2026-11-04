/*
Vicente vivia en un poble perdut a les muntanyes. No tenien ni aigua a casa, i l’havien de buscar a un pou, a
qualsevol hora del dia. La veritat és que passava moltes estones al dia caminant entre casa seva i el pou, i a vegades
se li feia de nit. El trajecte era avorrit, però Vicente, que era molt imaginatiu, sempre buscava algun entreteniment.
Un dia de lluna plena, va pensar com podria anar el pou a la lluna, encara que sigui fent volant la imaginació, i ...
certament va trobar la manera.

Entrada
La primera línia indica els casos de prova a considerar Cada cas de prova comença amb una línia amb un nombre K
, seguit per un nombre K
 de línies Cada línia contindrà una única paraula (sense espais ni accents, tot en majúscules).

Sortida
Vicente vol saber si la seqüència de paraules de cada cas de prova compleix el següent:

Totes les paraules tenen la mateixa longitud
Dues paraules consecutives són sempre iguals tret d’una única lletra que canvia (pot ser qualsevol lletra). Si es
compleixen aquests dues condicions, respondrà CORRECTE Cas contrari respondrà INCORRECTE

1. Llegir el nombre de casos de prova.
2. Repetir el procés per cada cas.
3. Llegir el nombre de paraules.
4. Llegir la primera paraula.
5. Inicialitzar la variable que indica si la seqüència és correcta.
6. Recórrer la resta de paraules.
7. Llegir la paraula actual.
8. Comprovar si les dues paraules tenen la mateixa longitud.
9. Comparar les lletres de les dues paraules.
10. Comprovar que només hi hagi una lletra diferent.
11. Actualitzar la paraula anterior.
12. Mostrar el resultat.
*/

import java.util.Scanner

fun main() {

    val scan = Scanner(System.`in`)

    // 1. Llegir el nombre de casos de prova.
    val nombrecasos = scan.nextInt()

    // 2. Repetir el procés per cada cas.
    for (casactual in 1..nombrecasos) {

        // 3. Llegir el nombre de paraules.
        val nombreparaules = scan.nextInt()

        // 4. Llegir la primera paraula.
        var paraulaanterior = scan.next()

        // 5. Inicialitzar la variable de control.
        var correcte = true

        // 6. Recórrer la resta de paraules.
        for (paraulaactual in 2..nombreparaules) {

            // 7. Llegir la paraula actual.
            val paraula = scan.next()

            // 8. Comprovar si tenen la mateixa longitud.
            if (paraula.length != paraulaanterior.length) {
                correcte = false

            } else {

                // 9. Comparar les lletres de les dues paraules.
                var lletresdiferents = 0

                for (index in 0 until paraula.length) {

                    if (paraula[index] != paraulaanterior[index]) {
                        lletresdiferents++
                    }
                }

                // 10. Comprovar que només hi hagi una lletra diferent.
                if (lletresdiferents != 1) {
                    correcte = false
                }
            }

            // 11. Actualitzar la paraula anterior.
            paraulaanterior = paraula
        }

        // 12. Mostrar el resultat.
        if (correcte) {
            println("CORRECTE")
        } else {
            println("INCORRECTE")
        }
    }
}