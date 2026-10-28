/*
A Bambino li agrada votar, i vol votar a la Falange. Però no es presenta, només es presenten tres partits, A, B i C.
No obstant, a Bambino no se li dona bé el tema de la democràcia (cosa que ja havia quedat prou clara al veure a qui
volia votar) i no sap si el vot ha estat nul o no. Ajuda'l

Entrada
Cada entrada son exactament 6 nombres, A1,B1,C1
, amb els vots dels tres partits abans de que Bambino votés seguit per, A2,B2,C2
, amb els vots dels tres partits després de que Bambino votés.

Els 6 nombres estaran entre 0 i 1000

Sortida
Si el vot és vàlid, i per tant només ha augmentat un dels tres en un sol vot, es dirà el nom del partit al que ha
votat Bambino. Si no ha augmentat cap, es dirà "BLANC" Qualsevol combinació que no sigui compatible amb la
democràcia es dirà "NUL"

1. Llegir els vots dels partits A, B i C abans de votar.
2. Llegir els vots dels partits A, B i C després de votar.
3. Calcular la diferència de vots de cada partit.
4. Comprovar si cap partit ha augmentat.
5. Comprovar si només el partit A ha augmentat exactament en un vot.
6. Comprovar si només el partit B ha augmentat exactament en un vot.
7. Comprovar si només el partit C ha augmentat exactament en un vot.
8. Si no es compleix cap combinació vàlida, considerar el vot nul i mostrar el resultat.
*/

import java.util.Scanner

fun main() {

    val scanner = Scanner(System.`in`)

    // 1. Llegir els vots dels partits A, B i C abans de votar.

    val votsAAbans = scanner.nextInt()
    val votsBAbans = scanner.nextInt()
    val votsCAbans = scanner.nextInt()

    // 2. Llegir els vots dels partits A, B i C després de votar.

    val votsADespres = scanner.nextInt()
    val votsBDespRes = scanner.nextInt()
    val votsCDespRes = scanner.nextInt()

    // 3. Calcular la diferència de vots de cada partit.

    val diferenciaA = votsADespres - votsAAbans
    val diferenciaB = votsBDespRes - votsBAbans
    val diferenciaC = votsCDespRes - votsCAbans

    // 4. Comprovar si cap partit ha augmentat.

    if (diferenciaA == 0 && diferenciaB == 0 && diferenciaC == 0) {
        println("BLANC")

        // 5. Comprovar si només el partit A ha augmentat exactament en un vot.

    } else if (diferenciaA == 1 && diferenciaB == 0 && diferenciaC == 0) {
        println("A")

        // 6. Comprovar si només el partit B ha augmentat exactament en un vot.

    } else if (diferenciaA == 0 && diferenciaB == 1 && diferenciaC == 0) {
        println("B")

        // 7. Comprovar si només el partit C ha augmentat exactament en un vot.

    } else if (diferenciaA == 0 && diferenciaB == 0 && diferenciaC == 1) {
        println("C")

        // 8. Si no es compleix cap combinació vàlida, considerar el vot nul i mostrar el resultat.

    } else {
        println("NUL")
    }
}