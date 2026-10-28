/*
Avui hi ha festa a la taverna del porc degollat a Bilgewater. La banda del cèlebre capità Gangplank ha tornat després
d’un mes de saqueig i pillatge en els set mars. Mentres intentes buidar totes les reserves de rom de la taverna, el
capità se t’atansa i et proposa un joc com a fidel segon d’abord que ets. Posa 21 monedes de diferents tipus, Florins
de Demacia, Ducats de Piltover, Yuans d’Ionia, i doblons de Bilgewater, entre d’altres, en una curosa fila, i et diu
que cada torn cadascú ha d’agafar 1, 2 o 3 monedes, i després es passa el torn. Qui s’endú l’última moneda de la
taula, s’endú totes les monedes. Sabent que Gangplank es un vell pirata, saps que aquest joc ha de tenir trampa, i
efectivament, abans de que comenci la partida ja saps qui la guanyarà en cas de que els dos jugadors juguin
perfectament

Entrada
La primera línia indica els casos de prova a considerar Cada cas compta amb 2 nombres. El primer es el nombre de
monedes inicials (superior a 0) i el segon nombre serà un 0 o un 1 depenent de qui comença (sent un 0 tu i un 1
el capità Gangplank)

Sortida
Per cada cas de prova caldrà respondre: El guanyador de cada ronda si els dos jugadors juguen perfectament,
escribint “JO” o “GANGPLANK” (sense cometes)

1. Llegir el nombre de casos de prova.
2. Repetir el procés per cada cas de prova.
3. Llegir el nombre de monedes inicials.
4. Llegir quin jugador comença la partida.
5. Comprovar si el nombre de monedes és múltiple de 4.
6. Si és múltiple de 4, determinar el guanyador com el jugador que no comença.
7. Si no és múltiple de 4, determinar el guanyador com el jugador que comença.
8. Mostrar el nom del guanyador.
*/

import java.util.Scanner

fun main() {

    val scan = Scanner(System.`in`)

    // 1. Llegir el nombre de casos de prova.

    val nombrecasos = scan.nextInt()

    // 2. Repetir el procés per cada cas de prova.

    for (casactual in 1..nombrecasos) {

        // 3. Llegir el nombre de monedes inicials.

        val nombremonedes = scan.nextInt()

        // 4. Llegir quin jugador comença la partida.

        val jugadorinicial = scan.nextInt()

        // 5. Comprovar si el nombre de monedes és múltiple de 4.

        if (nombremonedes % 4 == 0) {

            // 6. Si és múltiple de 4, guanya el jugador que no comença.

            if (jugadorinicial == 0) {
                println("GANGPLANK")
            } else {
                println("JO")
            }

        } else {

            // 7. Si no és múltiple de 4, guanya el jugador que comença.

            if (jugadorinicial == 0) {
                println("JO")
            } else {
                println("GANGPLANK")
            }
        }
    }
}