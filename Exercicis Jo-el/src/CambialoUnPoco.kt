/*
A vegades et vols copiar d'algú i et diu la famosa frase "Te dejo copiar pero cambialo un poco para que el
profesor no se de cuenta".

Entrada
La primera línia indica els casos de prova a considerar Cada cas conté tres linies. La primera té un nombre K,
que diu el nombre de valors que hi ha. La segona, K nombres separats per espai. La tercera tindrà dos nombres, P1 i P2.

Sortida
Torna la llista de nombres que t'han passat, exactament igual, en una sola línia, canviant tots els nombres P1
 que apareguin per P2
*/

import java.util.Scanner

fun main() {

    val scan = Scanner(System.`in`)

    // Llegir el numero de casos de prova.
    var casosprova = scan.nextInt()
    // Obrir el bucle en funció dels casos de prova restants.
    while (casosprova > 0) {
        var casos = scan.nextInt()
        var cambios = casos
        // Obrir un bucle dins del bucle per tal de registrar tots els numeros introduits per l'usuari en funció
        // dels casos introduits previament.
        val entrada = IntArray(casos)
        while (casos > 0)
            for (i in 0 until casos) {
                entrada[i] = scan.nextInt()
                casos--
            }
        val p1 = scan.nextInt()
        val p2 = scan.nextInt()
        for (i in 0 until cambios) {
            if (entrada[i] == p1) {
                entrada[i] = p2
                cambios--
            }
        }
        repeat(entrada.size) {
            println(entrada[it])
        }
        casosprova--
    }

}