/*
Al congrés de la patata s’ha arribat a la ronda final de votacions entre “Lluís” i “patata”. Lamentablement entre totes
les eminencies científiques ninguna sap quan un número es més gran que l’altre. SALVA LA DEMOCRÀCIA

Entrada
La primera línia indica els casos de prova a considerar Cada cas compta amb 1 linea amb diversos números. El primer
nombre es el nombre d’opcions que es voten, k. Després hi haurà k nombres, que seràn els vots que ha aconseguit cada
opció. Es garantitza que mai hi haurà un empat entre guanyadors

Sortida
Per cada cas de prova caldrà respondre: El nombre corresponent a l’opció guanyadora

1. Llegir el numero de casos de prova.
2. Registrar el numero mes alt d'entre totes les opcions.
3. Obrir el bucle en funció dels casos de prova restants.
4. Obrir un bucle dins del bucle per tal de registrar tots els numeros introduits per l'usuari en
   funció dels casos introduits previament.
5. Mostrar el guanyador, sumant 1 al resultat per tal d'evitar el numero 0.
6. Restem 1 als casos de prova per tal de tancar el bucle.
 */

import java.util.Scanner

fun main() {

    val scan = Scanner(System.`in`)

    // Llegir el numero de casos de prova.

    var casosprova = scan.nextInt()

    // Registrar el numero mes alt d'entre totes les opcions.

    var guanyador = 0

    // Obrir el bucle en funció dels casos de prova restants.

    while (casosprova > 0) {
        val casos = scan.nextInt()

        /* Obrir un bucle dins del bucle per tal de registrar tots els numeros introduits per l'usuari en funció
         dels casos introduits previament. */

        val entrada = IntArray(casos)
        for (i in 0 until casos) {
            entrada[i] = scan.nextInt()
            if (entrada[i] > entrada[guanyador]) {
                guanyador = i
            }
        }
        // Mostrar el guanyador, sumant 1 al resultat per tal d'evitar el numero 0.

        println(guanyador + 1)
        guanyador = 0
        // Restem 1 als casos de prova per tal de tancar el bucle.

        casosprova--

    }
}