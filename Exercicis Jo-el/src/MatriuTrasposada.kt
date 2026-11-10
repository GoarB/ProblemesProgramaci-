/*
Donada una matriu i la seva mida, donarem la matriu transposada. La matriu transposada es aquella a on les files es
converteixen en columnes i les columnes en files

Entrada
Per cada cas, primer es dirà les dimensions f i c, seguides per f files de c nombres

Sortida
per cada cas haureu de tornar la matriu transposada, que evidentment serà de c files i f columnes, amb els nombres
separats per un espai.

Poseu una lina buida entre matrius. (les linies buides no hi son a les entrades, només es perque ho vegueu mes clar
l’exemple)

1. Registrar la mida de la matriu en x i y.
2. Omplir la matriu amb els nombres donats.
3. Transposar el contingut de la matriu.
4. Mostrar el contingut de la matriu.
 */
import java.util.Scanner

fun main() {

    val scan = Scanner(System.`in`)

//1. Registrar la mida de la matriu en x i y.
    val midax = scan.nextInt()
    val miday = scan.nextInt()
    val llista = Array(miday) { IntArray(midax) }

//2. Omplir la matriu amb els nombres donats.
    for (i in 0 until midax) {
        for (j in 0 until miday) {
            llista[i][j] = scan.nextInt()
        }
    }

//3. Transposar el contingut de la matriu.
    for (i in 0 until midax) {
        for (j in 0 until miday) {

//4. Mostrar el contingut de la matriu.

            print(llista[j][i])
        }
        println()
    }

}