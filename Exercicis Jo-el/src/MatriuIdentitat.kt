/*
Una matriu identitat és una matriu tots els valors de la qual són zero excepte en la seva diagonal principal que són 1.
La matriu cal que sigui quadrada, d'N posicions. N es demana a l'usuari.

Entrada
Cada cas sera un sol nombre consistent en el tamany de la matriu

Sortida
Per a cada cas, escriviu la seva matriu identitat corresponent

1. Registrar la mida de la matriu.
2. Registrar la matriu escrivint "1" en la seva diagonal positiva.
3. Mostrar el contingut de la matriu.
 */
import java.util.Scanner

fun main() {

    val scan = Scanner(System.`in`)

//1. Registrar la mida de la matriu.
    val mida = scan.nextInt()
    val llista = Array(mida) { IntArray(mida) }

//2. Registrar la matriu escrivint "1" en la seva diagonal positiva.
    for (i in 0 until mida) {
        for (j in 0 until mida) {
            if (i == j) {
                llista[i][j] = 1
            } else {
                llista[i][j] = 0
            }
        }
    }

//3. Mostrar el contingut de la matriu.
    for (i in 0 until mida) {
        for (j in 0 until mida) {
            print(llista[i][j])
        }
        println()
    }
}