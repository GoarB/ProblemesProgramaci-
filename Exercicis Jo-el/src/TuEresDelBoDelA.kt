/*
Quan era petit i anava al colegi sempre hi havia la conversa de quina era la millor classe si la A o la B. Mai
s'arribava a una conclusió coherent, però la classe que tenia més alumnes era la que feia més xivarri i guanyava
la discusió. Fes un programa que et faci un cartell(una matriu de 5x5) per saber quina és la millor classe.

Entrada
Cada cas de prova té dos línies. La primera línea conté un nombre positiu N amb el nombre d'alumnes de la classe A.
La segona línea conté un nombre positiu M amb el nombre d'alumnes de la classe B.

Sortida
Si la classe A té més alumnes que la B, torna una matriu amb la lletra A dibuixada. Per contrapartida, si la classe
B té més alumnes torna una matriu amb la lletra B. Si les dos classes tenen el mateix nombre el cartell està buit.

1. Llegir el nombre d'alumnes de la classe A.
2. Llegir el nombre d'alumnes de la classe B.
3. Crear una matriu de 5x5 plena de punts.
4. Comprovar si la classe A té més alumnes.
5. Dibuixar la lletra A a la matriu si guanya la classe A.
6. Comprovar si la classe B té més alumnes.
7. Dibuixar la lletra B a la matriu si guanya la classe B.
8. Si les classes empaten, mantenir la matriu plena de punts.
9. Recórrer les files de la matriu.
10. Mostrar cada fila separant els caràcters amb espais.
*/

import java.util.Scanner

fun main() {

    val scanner = Scanner(System.`in`)

    // 1. Llegir el nombre d'alumnes de la classe A.

    val alumnesClasseA = scanner.nextInt()

    // 2. Llegir el nombre d'alumnes de la classe B.

    val alumnesClasseB = scanner.nextInt()

    // 3. Crear una matriu de 5x5 plena de punts.

    val cartell = Array(5) { CharArray(5) { '.' } }

    // 4. Comprovar si la classe A té més alumnes.

    if (alumnesClasseA > alumnesClasseB) {

        // 5. Dibuixar la lletra A a la matriu si guanya la classe A.

        cartell[0][1] = 'X'
        cartell[0][2] = 'X'
        cartell[0][3] = 'X'

        cartell[1][0] = 'X'
        cartell[1][4] = 'X'

        cartell[2][0] = 'X'
        cartell[2][1] = 'X'
        cartell[2][2] = 'X'
        cartell[2][3] = 'X'
        cartell[2][4] = 'X'

        cartell[3][0] = 'X'
        cartell[3][4] = 'X'

        cartell[4][0] = 'X'
        cartell[4][4] = 'X'

        // 6. Comprovar si la classe B té més alumnes.

    } else if (alumnesClasseB > alumnesClasseA) {

        // 7. Dibuixar la lletra B a la matriu si guanya la classe B.

        cartell[0][0] = 'X'
        cartell[0][1] = 'X'
        cartell[0][2] = 'X'
        cartell[0][3] = 'X'

        cartell[1][0] = 'X'
        cartell[1][4] = 'X'

        cartell[2][0] = 'X'
        cartell[2][1] = 'X'
        cartell[2][2] = 'X'
        cartell[2][3] = 'X'

        cartell[3][0] = 'X'
        cartell[3][4] = 'X'

        cartell[4][0] = 'X'
        cartell[4][1] = 'X'
        cartell[4][2] = 'X'
        cartell[4][3] = 'X'
    }

    // 8. Si les classes empaten, la matriu es manté plena de punts.


    // 9. Recórrer les files de la matriu.

    for (fila in cartell) {

        // 10. Mostrar cada fila separant els caràcters amb espais.

        println(fila.joinToString(" "))
    }
}