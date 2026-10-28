/*
“Un cargol cau a un pou de cinc metres de profunditat. Durant el dia puja tres metres, però per la nit cau dos metres.
Quants dies triga en sortir del pou?” Pensa, pensa ... però la resposta és ... 3 (ho veus?).

fer un programa que ajudi als cargols a saber quan temps trigaran en sortir d’un pou, tenint en compte que no tots els
cargols tenen la mateixa capacitat de pujar durant el dia ni de caure per la nit.

L’entrada comença amb un número indicant la quantitat de casos de prova que vindran a continuació.

Cada cas de prova consta de: Una terna de números separats per un espai que indicaran:
-   Profunditat en metres del pou on cau el cargol (enter positiu entre 1 i 999)
    -   Metres que puja el cargol durant el dia (enter positiu entre 0 i 999)
    -   Metres que cau el cargol durant la nit (enter positiu entre 0 i 999)

Per cada cas de prova, caldrà respondre, en una sola línia:
-   Si el cargol pot sortir del pou:
        Número de dies que triga el cargol en sortir del pou
-   Si no pot sortir del pou:
        Missatge “NO”

1. Llegir el nombre de casos de prova.
2. Llegir la profunditat del pou i els metres que puja i baixa el cargol.
3. Inicialitzar els dies transcorreguts i la posició del cargol.
4. Comprovar si el cargol pot sortir del pou.
5. Repetir el procés mentre el cargol no hagi sortit.
6. Augmentar el comptador de dies.
7. Sumar els metres que puja durant el dia.
8. Comprovar si ha arribat a la superfície.
9. Restar els metres que baixa durant la nit si no ha sortit.
10. Mostrar els dies necessaris o NO si no pot sortir.
*/

import java.util.Scanner

fun main() {

    val scan = Scanner(System.`in`)

    // 1. Llegir el nombre de casos de prova.

    val nombrecasos = scan.nextInt()

    for (casactual in 1..nombrecasos) {

        // 2. Llegir la profunditat i els metres que puja i baixa.

        val profunditatpou = scan.nextInt()
        val metrespujada = scan.nextInt()
        val metresbaixada = scan.nextInt()

        // 3. Inicialitzar els dies i la posició del cargol.

        var dies = 0
        var posicioactual = 0

        // 4. Comprovar si el cargol pot sortir del pou.

        if (metrespujada >= profunditatpou) {

            // El cargol surt durant el primer dia.

            println(1)

        } else if (metrespujada <= metresbaixada) {

            // El cargol no avança prou per poder sortir.

            println("NO")

        } else {

            // 5. Repetir mentre no hagi sortit del pou.

            while (posicioactual < profunditatpou) {

                // 6. Augmentar el comptador de dies.

                dies++

                // 7. Sumar els metres que puja durant el dia.

                posicioactual += metrespujada

                // 8. Comprovar si ha arribat a la superfície.

                if (posicioactual >= profunditatpou) {
                    break
                }

                // 9. Restar els metres que baixa durant la nit.

                posicioactual -= metresbaixada
            }

            // 10. Mostrar els dies necessaris.

            println(dies)
        }
    }
}