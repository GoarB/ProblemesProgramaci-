/*
Estaria bé que una matriu tingués index of, eh?

Entrada
El problema serà de tres línies. La primera tindrà dos nombres, F i C
que et dirà el tamany de la matriu que has de crear després vindran F
Files amb C Nombres cada una Per ultim vindrà un nombre k

Sortida
Escriu la fila i columna a on es troba el nombre k.
Si no el troba, escriu -1 -1 Es garanteix que només apareix zero o una vegada en tota la matriu

1. Registrar la mida de la matriu.
2. Registrar el contingut de la matriu.
3. Registrar el nombre a buscar dins la matriu.
4. Buscar el nombre dins la matriu.
5. Mostrar on es troba el nombre dins la matriu o sino mostrar -1 -1.
*/

import java.util.Scanner

fun main() {

    val scan = Scanner(System.`in`)

//1. Registrar la mida de la matriu.
    val numrows = scan.nextInt()
    val numcolumns = scan.nextInt()
    var numeros = Array(numrows) { IntArray(numcolumns) }
    var resultat = ""

//2. Registrar el contingut de la matriu.
    for (i in 0 until numrows) {
        for (j in 0 until numcolumns) {
            numeros[i][j] = scan.nextInt()
        }
    }
//3. Registrar el nombre a buscar dins la matriu.
    val num = scan.nextInt()

//4. Buscar el nombre dins la matriu.
    for (i in 0 until numrows) {
        for (j in 0 until numcolumns) {
            if (numeros[i][j] == num) {
                resultat = "$i $j"
            }
            else if (resultat == "") {
                resultat = "-1 -1"
            }

        }
    }

//5. Mostrar on es troba el nombre dins la matriu o sino mostrar -1 -1.
    println(resultat)
}