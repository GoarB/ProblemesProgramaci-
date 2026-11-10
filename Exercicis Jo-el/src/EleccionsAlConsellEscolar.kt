/*
L’excelent programador, superb professor i millor persona Gregorio deixa el consell escolar, i vol amanyar les
votacions per a que no li torni a tocar. Fes un software per a ajudar a marcar vots en les eleccions al consell
escolar del Institut

Entrada
Cada cas sera un sol nombre del tamany de la casella de vots

Sortida
Per cada cas s’haurà de tornar una matriu quadrada del tamany marcat, amb les vores i les dues diagonals amb X.
La resta de caselles sera .

1. Registrar la mida de la matriu.
2. Omplir les columnes, marcant la primera i ultima columna i fila al complert.
3. Mostrar el contingut de la matriu.
 */
import java.util.Scanner

fun main() {

    val scan = Scanner(System.`in`)

//1. Registrar la mida de la matriu.
    val mida = scan.nextInt()
    val llista : Array<Array<String>> = Array(mida) { Array(mida) {""} }
    val ix = "X"
    val punt ="."

//2. Omplir les columnes, marcant la primera i ultima columna i fila al complert.
    for (i in 0 until mida) {
        for (j in 0 until mida) {
            if(i == 0 || i == mida-1 || j == 0 || j == mida-1 || i == j || i + j == mida - 1) {
                llista[i][j] = ix
            }
            else {
                llista[i][j] = punt
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