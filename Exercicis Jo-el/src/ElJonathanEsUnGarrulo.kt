/*
El Jonathan s’ha comprat un cotxe d'aquests antics.

Com que és un mica garrulo, el primer que vol fer és canviar-li el tub d'escapament per un que faci tremolar els vidres
de tot el barri. Ell vol ser el que més soroll faci a la concentració del diumenge, però alhora és un cagat: té por
que la policia el pari i li foti una multa que el deixi sense blanca. Per tant, ha de triar l'escapament més sorollós
que no superi els límits legals.

Explicació
El Jonathan ha anat al taller d'un col·lega i ha provat N escapaments diferents.

Per a cada escapament, el seu amic ha fet 10 accelerades i ha mesurat els decibels de cadascuna.

Un escapament es considera APTE si:

La mitjana de les 10 mesures no supera els 85 dB.
No té més de 3 pics seguits (consecutius) que passin dels 100 dB, perquè si sona un petardasso gaire llarg, la policia
el sentirà des de lluny.
El Jonathan vol saber quin és l'escapament que té la mitjana més alta d'entre els que són APTES. En cas d’empat, el
Jonathan es quedarà amb el primer que ha provat.

Entrada
La primera línia conté un enter N (nombre de tubs provats al taller).

A continuació, N línies. Cada línia conté 10 enters representant les 10 mesures de cada tub.

Sortida
S'ha d'imprimir: Escapament X: MITJANA Y, on X és el tub (1 per al primer, 2 per al segon...) i Y la seva mitjana.

Si cap tub passa la prova, s'imprimirà: CAP ESCAPAMENT HOMOLOGAT.

1. Llegir el nombre d'escapaments que es provaran.
2. Crear les variables del millor escapament.
3. Repetir el procés per cada escapament.
4. Crear les variables per calcular les mesures.
5. Llegir les 10 mesures de decibels.
6. Sumar els decibels de cada mesura.
7. Comprovar si la mesura supera els 100 decibels.
8. Comptar les mesures consecutives superiors a 100 decibels.
9. Reiniciar el comptador si la mesura no supera els 100 decibels.
10. Comprovar si hi ha més de 3 mesures consecutives superiors a 100 decibels.
11. Calcular la mitjana de decibels de l'escapament.
12. Comprovar si l'escapament compleix els requisits legals.
13. Guardar l'escapament si té una mitjana superior a la millor anterior.
14. Mostrar el millor escapament o indicar que cap està homologat.
*/

import java.util.Scanner

fun main() {

    val scan = Scanner(System.`in`)

    val MAX_MITJANA = 85
    val MAX_DECIBELS = 100
    val MAX_CONSECUTIUS = 3
    val TOTAL_MESURES = 10

    // 1. Llegir el nombre d'escapaments que es provaran.

    val nombreescapaments = scan.nextInt()

    // 2. Crear les variables del millor escapament.

    var millorescapament = 0
    var millormitjana = -1.0

    // 3. Repetir el procés per cada escapament.

    for (escapamentactual in 1..nombreescapaments) {

        // 4. Crear les variables per calcular les mesures.

        var sumadecibels = 0
        var consecutius = 0
        var escapamentapte = true

        // 5. Llegir les 10 mesures de decibels.

        for (mesuraactual in 1..TOTAL_MESURES) {

            val decibels = scan.nextInt()

            // 6. Sumar els decibels de cada mesura.

            sumadecibels += decibels

            // 7. Comprovar si la mesura supera els 100 decibels.

            if (decibels > MAX_DECIBELS) {

                // 8. Comptar les mesures consecutives superiors a 100 decibels.

                consecutius++

            } else {

                // 9. Reiniciar el comptador si no supera els 100 decibels.

                consecutius = 0
            }

            // 10. Comprovar si hi ha més de 3 mesures consecutives.

            if (consecutius > MAX_CONSECUTIUS) {
                escapamentapte = false
            }
        }

        // 11. Calcular la mitjana de decibels.

        val mitjana = sumadecibels.toDouble() / TOTAL_MESURES

        // 12. Comprovar si l'escapament compleix els requisits legals.

        if (escapamentapte && mitjana <= MAX_MITJANA) {

            // 13. Guardar l'escapament si té una mitjana superior.

            if (mitjana > millormitjana) {
                millormitjana = mitjana
                millorescapament = escapamentactual
            }
        }
    }

    // 14. Mostrar el millor escapament o indicar que cap està homologat.

    if (millorescapament != 0) {
        println("Escapament $millorescapament: MITJANA ${millormitjana.toInt()}")
    } else {
        println("CAP ESCAPAMENT HOMOLOGAT")
    }
}