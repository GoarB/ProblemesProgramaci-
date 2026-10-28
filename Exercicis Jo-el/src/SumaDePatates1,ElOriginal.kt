/*
Cada dia arriben més patates. Camions i camions de patates van arribant i descarregant. Inventa un programa que
les sumi totes

Entrada
Cada cas compta amb 1 linea amb diversos números. El primer nombre de camions que arriben, k. Després hi haurà k
nombres, que és les patates que du cada camió

Sortida
Per cada cas de prova caldrà respondre: La quantitat total de patates descarregades aquell dia

1. Llegir el nombre de camions.
2. Crear una variable per acumular el total de patates.
3. Repetir el procés tantes vegades com camions hi hagi.
4. Llegir les patates que porta cada camió.
5. Sumar les patates de cada camió al total.
6. Mostrar la quantitat total de patates.
*/

import java.util.Scanner

fun main() {

    val scan = Scanner(System.`in`)

    // 1. Llegir el nombre de camions.

    val nombrecamions = scan.nextInt()

    // 2. Crear una variable per acumular el total de patates.

    var totalpatates = 0

    // 3. Repetir el procés tantes vegades com camions hi hagi.

    for (camioactual in 1..nombrecamions) {

        // 4. Llegir les patates que porta cada camió.

        val patatescamio = scan.nextInt()

        // 5. Sumar les patates de cada camió al total.

        totalpatates += patatescamio
    }

    // 6. Mostrar la quantitat total de patates.

    println(totalpatates)
}