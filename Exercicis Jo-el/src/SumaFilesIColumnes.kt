/*
A vegades, en la vida, tens que sumar files. Això no és el mateix que sumar filles. Sumar filles sona a algo masclista,
i seria millor que no passes. Per que es diuen files les files? Segons google ve de "filum", que en llatí és una vora
finíssima, però no veig que té a veure. Tot això no té sentit. No hauria d'escriure més enunciats de problemes.

Entrada
La primera línea tindrà dos nombres, F i C que et dirà el tamany de la matriu que has de crear després vindran F
Files amb C Nombres cada una Per ultim vindràn un nombre k

Sortida
Retorna la suma de tots els nombres de la fila k, i la suma de tots els nombres de la columna k,
separats per espai.

1. Registrar la mida de la matriu.
2. Registrar el contingut de la matriu.
3. Registrar el numero (k) de la fila i columna on sumar el contingut.
4. Sumar tots els nombres dins de la columna k i la fila k.
5. Mostrar el resultat de les dues sumes.
*/

import java.util.Scanner

fun main() {

    val scan = Scanner(System.`in`)

//1. Registrar la mida de la matriu.
    val numrows = scan.nextInt()
    val numcolumns = scan.nextInt()
    var numeros = Array(numrows) { IntArray(numcolumns) }

//2. Registrar el contingut de la matriu.
    for (i in 0 until numrows) {
        for (j in 0 until numcolumns) {
            numeros[i][j] = scan.nextInt()
        }
    }
//3. Registrar el numero (k) de la fila i columna on sumar el contingut.
    val numero = scan.nextInt()

//4. Sumar tots els nombres dins de la columna k i la fila k.
    val resultatrow = numeros[numero].sum()
    val resultatcolumn = numeros.sumOf { row -> row[numero] }


//5. Mostrar el resultat de les dues sumes.
    println("$resultatrow $resultatcolumn")

}