/*
Ens demanaen fer estadístiques de notes a l'ESO. Fer un programa que donada una seqüència de notes numèriques entre
0 i 10 ens mostri:

nombre de notes vàlides introduïdes
la mitjana aritmètica de totes les notes introduïdes
quants han tret excel·lents [ 9, 10]
quants notables [ 7, 8)
quants bens [ 6 )
quants suficients [5)
quants insuficients (< 5 i > 3)
quants molt deficients [0 a 3].

Entrada
L'entrada consta d'una seqüencia de números corresponents a les notes obtingudes. La última nota és -1 i no s'ha de
processar. Pot haver-hi notes no vàlides, que s'ignoraran, al processar les dades.

Sortida
Es mostrarà un missatge en una sola línia amb els resultats obtingits. El missatge s'ajustarà al següent format:

1. Crear les vaariables per cada rang de notes posible.
2. Crear les variables per la cuantitat de notes valides i per cada cualificacio.
3. Crear el bucle que compti cada cas i el sumi al resultat.
4. Mostrar el resultat.

 */

import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`)
// 1. Crear les vaariables per cada rang de notes posible.
    val EXCELENT = 9
    val NOTABLE = 7
    val BE = 6
    val SUFICIENT = 5
    val MOLTDEFICIENT = 3
// 2. Crear les variables per la cuantitat de notes valides i per cada cualificacio.
    var notes = 0.toDouble()
    var mitjana : Double = 0.0
    var excelent = 0
    var notable = 0
    var be = 0
    var suficient = 0
    var insuficient = 0
    var moltdeficient = 0
// 3. Crear la variable de la primera entrada i el bucle que compti cada cas i el sumi al resultat.
    var entrada = scan.nextInt()
    while (entrada != -1) {
        if (entrada in EXCELENT..10) {
            notes++
            excelent++
            mitjana += entrada
        } else if (entrada >= NOTABLE) {
            notes++
            notable++
            mitjana += entrada
        }
        else if (entrada == BE) {
            notes++
            be++
            mitjana += entrada
        }
        else if (entrada == SUFICIENT) {
            notes++
            suficient++
            mitjana += entrada
        }
        else if (entrada in (MOLTDEFICIENT + 1)..<SUFICIENT) {
            notes++
            insuficient++
            mitjana += entrada
        }
        else if (entrada in 0..MOLTDEFICIENT) {
            notes++
            moltdeficient++
            mitjana += entrada
        }
        entrada = scan.nextInt()
    }
// 4. Dividir el total de notes sumades entre el total de notes correctes i mostrar el resultat.
    mitjana /= notes

    println("NOTES: ${notes.toInt()} MITJANA: $mitjana E: $excelent N: $notable B: $be S: $suficient I: $insuficient MD: $moltdeficient")
}