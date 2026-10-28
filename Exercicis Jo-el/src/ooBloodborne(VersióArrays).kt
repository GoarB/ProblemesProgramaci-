/*
A Bambino li agraden els videojocs.

Estava jugant al Bloodborne i va veure que tenia 2 lletres iguals seguides, en aquest cas oo. Després va veure que això
passa amb molts altres jocs, com aSSaSSins crEEd.

Per tant Bambino ha creat la nova regla de que un array es Bloodborne-like si té dos elements seguits iguals.

Donat un array, pots dir si compleix la nova regla que ha trobat Bambino?

Entrada
El problema comença amb un nombre N que diu els casos de prova que hi ha. Cada cas son dues línies. en la primera surt
K, el tamany de l'array Després venen K nombres.

Sortida
Si l'array té dos elements seguits, dirà SI. En cas contrari, dirà NO

1. Llegir el numero de casos de prova.
2. Obrir el bucle en funció dels casos de prova restants.
3. Regitrar el tamany del array en base a l'entrada de l'usuari.
4.  Crear una variable de tipus string per registrar el resultat final de la revisió.
5. Obrir un bucle dins del bucle per tal de registrar tots els numeros introduits per l'usuari en funció dels casos
   introduits previament.
6. Crear un bucle per tal de registrar si hi han dos numeros seguits iguals.
7. Si hi ha dos numeros seguits mostrem "SI" en cas contrari mostrem "NO".
8.  Mostrar el resultat.
 */

import java.util.Scanner

fun main() {

    val scan = Scanner(System.`in`)

    // Llegir el numero de casos de prova.

    var casosprova = scan.nextInt()

    // Obrir el bucle en funció dels casos de prova restants.

    while (casosprova > 0) {

        // Regitrar el tamany del array en base a l'entrada de l'usuari.

        val tamany = scan.nextInt()

        // Crear una variable de tipus string per registrar el resultat final de la revisió.

        var resultat = ""

        /* Obrir un bucle dins del bucle per tal de registrar tots els numeros introduits per l'usuari en funció
         dels casos introduits previament. */

        val entrada = IntArray(tamany)
        for (i in entrada.indices) {
            entrada[i] = scan.nextInt()
        }
        /* Crear un bucle per tal de registrar si hi han dos numeros seguits iguals.*/
        for (i in entrada.indices ) {

            // Si hi ha dos numeros seguits mostrem "SI" en cas contrari mostrem "NO".

            if (i != 0 && entrada[i] == entrada[i - 1]) {
                resultat = "SI"
            }
            else if (resultat != "SI") {
                resultat = "NO"
            }
        }
        // Mostrar el resultat.
        println(resultat)

        casosprova--
    }
}