/*
Donada una frase, calcula el nombre de lletres que formen la paraula més llarga.

Entrada
El primer nombre indica els casos de prova. Cada cas de prova consistirà en una frase. El text seran caràcters estàndar
de l'alfabet anglès, sense accents. El separador entre paraules serà sempre un espai en blanc. Nota: les lletres poden
ser majúscules i minúscules

Sortida
Per cada cas de prova es mostrarà un nombre que indica el total de lletres que conté la paraula més llarga.

1. Llegir el nombre de casos de prova.
2. Repetir el procés per cada cas.
3. Llegir la frase completa.
4. Inicialitzar els comptadors de lletres.
5. Recórrer la frase caràcter per caràcter.
6. Comptar les lletres de cada paraula.
7. Actualitzar la longitud màxima.
8. Mostrar la longitud de la paraula més llarga.
*/

import java.util.Scanner

fun main() {

    val scan = Scanner(System.`in`)

    // 1. Llegir el nombre de casos de prova.
    val nombrecasos = scan.nextInt()
    scan.nextLine()

    // 2. Repetir el procés per cada cas.
    for (casactual in 1..nombrecasos) {

        // 3. Llegir la frase completa.
        val frase = scan.nextLine()

        // 4. Inicialitzar els comptadors.
        var longitudactual = 0
        var longitudmaxima = 0

        // 5. Recórrer la frase caràcter per caràcter.
        for (index in 0 until frase.length) {

            // 6. Comprovar si el caràcter és una lletra.
            if (frase[index] != ' ') {
                longitudactual++

            } else {

                // 7. Actualitzar la longitud màxima.
                if (longitudactual > longitudmaxima) {
                    longitudmaxima = longitudactual
                }

                // Reiniciar el comptador per a la següent paraula.
                longitudactual = 0
            }
        }

        // Comprovar també l'última paraula de la frase.
        if (longitudactual > longitudmaxima) {
            longitudmaxima = longitudactual
        }

        // 8. Mostrar la longitud màxima.
        println(longitudmaxima)
    }
}