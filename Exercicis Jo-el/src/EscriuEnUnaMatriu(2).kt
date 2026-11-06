/*
Ara anem a modificar una matriu

Entrada
El problema serà de tres línies. La primera tindrà dos nombres, F
 i C
 que et dirà el tamany de la matriu que has de crear després vindran F
 Files amb C
 Nombres cada una Per ultim vindran dos nombres, i
 i j

Sortida
Tornaràs la matriu. escrivint una fila per línea i separant els números amb espais, però canviant tots els nombres i
 per j

1. Registrar la mida de la matriu.
2. Registrar el contingut de la matriu.
3. Registrar el número que serà modificat i el número que posarem al seu lloc.
4. Substituir tots el numeros.
5. Mostrar el resultat.

 */

import java.util.Scanner

fun main() {

    val scan = Scanner(System.`in`)

//1. Registrar la mida de la matriu.
    val numrows = scan.nextInt()
    val numcolumns = scan.nextInt()
    val numeros = Array(numrows) { IntArray(numcolumns) }

//2. Registrar el contingut de la matriu.
    for (i in 0 until numrows) {
        for (j in 0 until numcolumns) {
            numeros[i][j] = scan.nextInt()
        }
    }

//3. Registrar el número que serà modificat i el número que posarem al seu lloc.
    var num1 = scan.nextInt()
    val num2 = scan.nextInt()

//4. Substituir tots els números.
    for (i in 0 until numrows) {
        for (j in 0 until numcolumns) {
            if (numeros[i][j] == num1) {
                numeros[i][j] = num2
            }
        }
    }
//5. Mostrar el resultat.
    for (i in 0 until numrows) {
        println(numeros[i].joinToString(" "))
    }
}