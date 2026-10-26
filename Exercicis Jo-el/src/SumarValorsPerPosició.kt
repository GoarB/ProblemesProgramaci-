/*
Donada una seqüència de números enters, el programa calcularà la suma dels valors que es troben en posicions múltiples
de tres. El número que es troba a la primera posició indica el nombre total de valors a tractar en el cas de prova.

Entrada
L'entrada comença amb una línia amb el número de casos de prova a processar. Cada cas de prova és una línia formada
per una seqüència de nombres enters. El primer valor indica el nombre de valors a processar en aquest cas de prova, i
no s'ha de processar. Els números estan separats per un espai en blanc.

Sortida
Per cada cas de prova ens mostrarà la suma dels valors dels números que es troben en posicions múltiples de tres.

1. Declarar scanner.
2. Nombre de casos de prova
3. Bucle per processar cada cas de prova
4. Llegir tots els nombres i sumar els de posicions múltiples de 3

 */

import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`)

    // Nombre de casos de prova
    var entrades = scan.nextInt()

    // Bucle per processar cada cas de prova
    while (entrades > 0) {
        val casos = scan.nextInt()
        var resultat = 0

        // Llegir tots els nombres i sumar els de posicions múltiples de 3
        var posicio = 1
        while (posicio <= casos) {
            val num = scan.nextInt()

            if (posicio % 3 == 0) {
                resultat += num
            }

            posicio++
        }
        println(resultat)
        entrades--
    }
}