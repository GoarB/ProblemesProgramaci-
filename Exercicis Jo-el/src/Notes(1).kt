/*
L’activitat preferida de tots els professors és posar notes, mentre riuen malvadament i acaricien gats. Però els
professors som mandrosos (si no no ens hauriem fet funcionaris) així que ho volem fer automàticament. Rep una
graella d’alumnes i notes i fes la mitja de les notes.

...

No t'oblidis de riure malvadament

Entrada
L’entrada consisteix en un nombre N
, seguit de N casos. Cada cas tindrà dues línies, la primera tindrà el nombre d’alumnes (que seran les files)
i el nombre de mòduls (que seran les columnes), seguit de alumnes*moduls nombres que son la graella de notes

Sortida
Per a cada cas, escriviu les notes mitges de tots els alumnes. Ignoreu les comes, doneu tan sols el nombre enter

1. Registrar el nùmero de casos posibles.
2. Registrar la mida de la matriu.
3. Omplir la matriu amb les entrades de l'usuari.
4.
5.
*/

import java.util.Scanner

fun main() {

    val scan = Scanner(System.`in`)

//1. Registrar el nùmero de casos posibles.
    var casos = scan.nextInt()
    while (casos > 0) {
//2. Registrar la mida de la matriu.
        val numrows = scan.nextInt()
        val numcolumns = scan.nextInt()
        val numeros = Array(numrows) { IntArray(numcolumns) }

//3. Omplir la matriu amb les entrades de l'usuari.
        for (i in 0 until numrows) {
            for (j in 0 until numcolumns) {
                numeros[i][j] = scan.nextInt()
            }
        }
    }
}