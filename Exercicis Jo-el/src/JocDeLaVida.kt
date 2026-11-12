/*
El Joc de la Vida és un autòmata cel·lular dissenyat pel matemàtic britànic John Horton Conway al 1970

És un joc de zero jugadors, el que vol dir que la seva evolució està determinada pel seu estat inicial i no necessita
cap entrada de dades posterior. El tauler de joc és espai bidimensional rectangular, dividit en caselles (cèl·lules).
Cada casella te fins a 8 caselles veïnes, les que estan al seu voltant. Les cèl·lules tenen dos estats: vives o mortes.
Es tracta d’anar evolucionant el tauler de joc en base a unes regles, que marcaran si les caselles estan vives o
mortes. L’estat d’una casella evoluciona, d’una generació per la següent, sempre en funció de l’estat inicial de la
matriu. en funció d’una sèrie de regles:

Una casella morta amb exactament 2 ó 3 caselles veïnes, “neix” (és a dir, passa a estar viva). Altrament roman morta.
Una casella viva amb 2 ó 3 caselles veïnes segueix viva, altrament mor o roman morta (per soledat, o superpoblació).
Entrada
Cada cas de prova consta d’una sèrie de línies:

Files i columnes del tauler de joc (enters entre 1 i 10 separats per un espai).
Una línia per cada fila, amb l’estat de cada columna: si la columna està morta es representa amb un “0” i si està viva
amb un “1”. No hi ha separació entre l’estat de cada casella.
Sortida
Per cada cas de prova, caldrà respondre:

Una línia per cada fila, amb l’estat de cada columna a la següent generació, representat de la manera ja explicada i
havent aplicat les regles del “Joc de la Vida”.

1. Registrar la mida de la matriu.
2. Crear la matriu original i la matriu resultant.
3. Omplir la matriu amb les entrades de l'usuari.
4. Recorrer cada casella i comptar les caselles veines vives.
5. Aplicar les regles per determinar si la casella estara viva o morta.
6. Mostrar la matriu resultant.
*/

import java.util.Scanner

fun main() {

    val scan = Scanner(System.`in`)

//1. Registrar la mida de la matriu.
    val numrows = scan.nextInt()
    val numcolumns = scan.nextInt()

//2. Crear la matriu original i la matriu resultant.
    val numeros = Array(numrows) { IntArray(numcolumns) }
    val resultat = Array(numrows) { IntArray(numcolumns) }

//3. Omplir la matriu amb les entrades de l'usuari.
    for (i in 0 until numrows) {
        val linia = scan.next()

        for (j in 0 until numcolumns) {
            numeros[i][j] = linia[j].digitToInt()
        }
    }

//4. Recorrer cada casella i comptar les caselles veines vives.
    for (i in 0 until numrows) {
        for (j in 0 until numcolumns) {

            var veins = 0

            for (f in -1..1) {
                for (c in -1..1) {

                    val fila = i + f
                    val columna = j + c

                    if (fila >= 0 && fila < numrows &&
                        columna >= 0 && columna < numcolumns &&
                        (f != 0 || c != 0)) {

                        if (numeros[fila][columna] == 1) {
                            veins++
                        }
                    }
                }
            }

//5. Aplicar les regles per determinar si la casella estara viva o morta.
            if (veins == 2 || veins == 3) {
                resultat[i][j] = 1
            } else {
                resultat[i][j] = 0
            }
        }
    }

//6. Mostrar la matriu resultant.
    for (i in resultat.indices) {
        for (j in resultat[i].indices) {
            print(resultat[i][j])
        }
        println()
    }
}