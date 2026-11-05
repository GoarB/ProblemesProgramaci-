/*
Abans de començar a fer exercicis de matrius, comprovem que podem llegir i escriure bé en matrius.

Entrada
El problema serà de tres línies. La primera tindrà dos números, F
 i C
 que et dirà el tamany de la matriu que has de crear després vindran F
 Files amb C
 números cada una Per últim vindran dos números, i
 i j

Sortida
Primer tornaràs la matriu, escrivint una fila per línea i separant els números amb espais. Després escriuràs el
contingut de la matriu en la fila i i columna j. S'entèn que es comença per 0.

1. Registrar el tamany de la matriu.
2. Registrar el contingut de la matriu.
3. Registrar el contingut de la fila i columna a mostrar.
4. Mostrar el contingut de la matriu.
5. Mostrar el contingut segons la fila i columna entrada.
 */

import java.util.Scanner

fun main() {

    val scan = Scanner(System.`in`)

//1. Registrar el tamany de la matriu.
    val numrows = scan.nextInt()
    val numcolumns = scan.nextInt()
    var numeros = Array(numrows) {IntArray(numcolumns)}

//2. Registrar el contingut de la matriu.
    for (i in 0 until numrows) {
        for (j in 0 until numcolumns) {
            numeros[i][j] = scan.nextInt()
        }
    }

//3. Registrar el contingut de la fila i columna a mostrar.
    val column = scan.nextInt()
    val row = scan.nextInt()

//4. Mostrar el contingut de la matriu.
    for (i in 0 until numrows) {
        println(numeros[i].joinToString(" "))
    }

//5. Mostrar el contingut segons la fila i columna entrada.
    println(numeros[column][row])
}