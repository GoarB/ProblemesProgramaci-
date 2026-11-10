/*
Un es podria pensar que els fantasmes de pacman només volen sortir de la seva àrea al centre del taulell per a
menjar-se a pacman. Res més allunyat de la veritat, els fantasmes són casolans i tan sols volen estar caminant dintre
de la casa comuna. No obstant, a vegades al estar tots a casa es bloquejen entre ells, i un fantasma bloquejat pot dur
a conseqüències funestes...

Entrada
La primera línia indica els casos de prova a considerar. Cada cas de prova consta de dues línies.

La primera té tres nombres, l’altura i amplada de la casa, f,c, que sempre seràn com a mínim 3, i el nombre de
fantasmes que hi ha k, que sempre serà 1 o més. La segona linea tindrà la posició dels k fantasmes, expressades en
coordenades x, y. Per tant, la longitud de la segona linea sera k*2 (cada fantasma tindra una x i una y). El primer
fantasma de la línia serà el fantasma blau, que serà el que controlarem. Pensa que la línia de fora de la casa es una
pared, així que una casa de 4x4 ([0..3][0..3]) tindrà només 4 caselles habitables (que seran: (1,1), (1,2), (2,1),
(2,2)) . Les coordenades dels fantasmes sempre estaran dintre de la casa (mai a la paret), i mai hi haurà dos
fantasmes a la mateixa casella.

Sortida
Per cada cas de prova caldrà respondre:

Si el fantasma blau no es pot moure (té bloquejades les sortides amunt, avall, esquerra i dreta, per una paret o un
altre fantasma) s’escriura “OH NO” Si el fantasma blau es pot moure (com a mínim no te bloquejada la sortida amunt,
avall, esquerra o dreta) s’escriura “THIS IS FINE”


1. Registrar el numero de casos a comprobar.
2. Registrar l'alçada, l'amplada de la casa i el numero de fantasmes.
3. Registrar les coordenades on es troba cada fantasma. La primera entrada serà el fantasma blau.
4. Comprobar si el fantasma blau es pot moure o per el contrari esta rodejat.
 */

import java.util.Scanner

fun main() {

    val scan = Scanner(System.`in`)

    val casos = scan.nextInt()

    repeat(casos) {

        val alcada = scan.nextInt()
        val amplada = scan.nextInt()
        val numFantasmes = scan.nextInt()

        val fantasmes = mutableSetOf<Pair<Int, Int>>()

        var blauX = 0
        var blauY = 0

        // Llegim les coordenades dels fantasmes
        repeat(numFantasmes) {

            val x = scan.nextInt()
            val y = scan.nextInt()

            if (it == 0) {
                blauX = x
                blauY = y
            }

            fantasmes.add(Pair(x, y))
        }

        // Comprovem si les quatre direccions estan bloquejades
        val amunt = blauX - 1 == 0 || Pair(blauX - 1, blauY) in fantasmes
        val avall = blauX + 1 == alcada - 1 || Pair(blauX + 1, blauY) in fantasmes
        val esquerra = blauY - 1 == 0 || Pair(blauX, blauY - 1) in fantasmes
        val dreta = blauY + 1 == amplada - 1 || Pair(blauX, blauY + 1) in fantasmes

        if (amunt && avall && esquerra && dreta) {
            println("OH NO")
        } else {
            println("THIS IS FINE")
        }
    }
}
