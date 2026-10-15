/*
Harrison for() es un actor de Hollywood famós que fa molta, molta, molta pasta. Cada dia es dedica a comptar els seus milions

Entrada
Cada cas és una linea amb 1
 número, la quantitat de diners que té

Sortida
Per cada cas de prova caldrà respondre: Comptar milió a milió els diners que té harrison for()

1. Crear la variable del número de milions que guanya en Harrison Ford.
2. Crear la variable de un milio.
3. Crear el bucle que compti la cuantitat de milions
4. Imprimir la cuantitat de milions comptats.
 */

import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`)

//    1.Crear la variable de un milio.

    val MILIO : Long = 1000000

//    2.Crear la variable del número de milions que guanya en Harrison Ford i la unitat per poder fer el calcul
//    del bucle.

    val milionsford = scan.nextLong()
    val unitat = milionsford / MILIO
//    3.Crear el bucle que compti la cuantitat de milions.

    for (milions in 1 .. unitat ) {

        //    4.Imprimir la cuantitat de milions comptats.

        println(MILIO*milions)
    }




}