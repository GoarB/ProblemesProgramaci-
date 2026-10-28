/*
A la fase final de l’edició Programame de l’any 2016, l’equip Rest in Python, composat per Kevin López, Eduard Pedrosa
i Juan Quispe, van resoldre aquest problema en els primers 11 minuts del concurs. Per fer-ho, van haver de triar-lo
entre els deu problemas del quadernet, i el van resoldre correctament en Java. Van guanyar el premi a l’equip més
ràpid del concurs. Serveixi això per fer-lis un petit homenatge i animar-vos a vosaltres a resoldre correctament
el problema.

El caos más absoluto se ha apoderado de la caja en la que se guardan los cables USB en el taller de hardware.
La situación es ya insostenible, así que toca ordenarlos un poco. Como la tarea es pesada, se te ha ocurrido un
juego: intentar conectar todos los cables unos con otros formando un gran círculo… aunque ni siquiera tienes claro
que eso pueda hacerse, porque depende de cuántos cables de cada tipo haya en la caja…

Entrada
La entrada comienza con una línea con el número de casos de prueba que vendrán a continuación. Cada uno de los casos
representa un escenario en el que hay que intentar conectar todos los cables. Contiene dos líneas, una con el número
de cables que hay en la caja (al menos uno y no más de 10.000) y otra con una descripción de cada cable. Esa
descripción no es más que dos letras, una por cada extremo, donde M significa conector USB macho y H conector hembra.

Sortida
Para cada caso de prueba hay que escribir POSIBLE si pueden conectarse todos los cables para formar un círculo o
IMPOSIBLE en caso contrario.

1. Llegir el nombre de casos de prova.
2. Repetir el procés per cada cas de prova.
3. Llegir el nombre de cables del cas actual.
4. Crear comptadors per als connectors mascle i femella.
5. Repetir el procés per cada cable.
6. Llegir la descripció del cable.
7. Recórrer els dos connectors del cable.
8. Comptar els connectors M.
9. Comptar els connectors H.
10. Comprovar si hi ha el mateix nombre de connectors M que H.
11. Mostrar "POSIBLE" si es poden connectar tots els cables.
12. Mostrar "IMPOSIBLE" en cas contrari.
*/

import java.util.Scanner

fun main() {

    val scan = Scanner(System.`in`)

    // 1. Llegir el nombre de casos de prova.

    val nombrecasos = scan.nextInt()

    // 2. Repetir el procés per cada cas de prova.

    for (casactual in 1..nombrecasos) {

        // 3. Llegir el nombre de cables del cas actual.

        val nombrecables = scan.nextInt()

        // 4. Crear comptadors per als connectors mascle i femella.

        var connectormascle = 0
        var connectorfemella = 0

        // 5. Repetir el procés per cada cable.

        for (cableactual in 1..nombrecables) {

            // 6. Llegir la descripció del cable.

            val cable = scan.next()

            // 7. Recórrer els dos connectors del cable.

            for (connector in cable) {

                // 8. Comptar els connectors M.

                if (connector == 'M') {
                    connectormascle++

                    // 9. Comptar els connectors H.

                } else if (connector == 'H') {
                    connectorfemella++
                }
            }
        }

        // 10. Comprovar si hi ha el mateix nombre de connectors M que H.

        if (connectormascle == connectorfemella) {

            // 11. Mostrar "POSIBLE" si es poden connectar tots els cables.

            println("POSIBLE")

        } else {

            // 12. Mostrar "IMPOSIBLE" en cas contrari.

            println("IMPOSIBLE")
        }
    }
}