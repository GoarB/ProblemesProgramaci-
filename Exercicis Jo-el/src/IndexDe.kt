/*
Rubén té un harem de folis. (No jutgeu). Cada foli el té en una carpeta numerada a partir del 0. Li agradaria tenir un
sistema per a poder accedir ràpidament a la seva carpeta en cas de necessitar Urgentment el foli.

Entrada
La primera línia indica els casos de prova a considerar Cada cas conté tres linies. La primera té un nombre K
. La segona conté K
 nombres del 0 al 100. La tercera conté un nombre FOLI
.

Sortida
S'ha de tornar la posició del foli que és igual a FOLI
. En cas d'haver folis repetits, torna la posició del primer. Considera que les posicions comencen per 0. Si el foli
no està, torna -1

- Registrar el numero de numeros que introduira l'usauri en la següent.
- Obrir un bucle dins del bucle per tal de registrar tots els numeros introduits per l'usuari.
- Llegir el tamany de l'array.
- Crear un array per guardar els numeros.
- Introduir el numero a trobar dins de l'array.
- Mostrar el resultat de la cerca.
- Restar una entrada per cada volta

 */

import java.util.Scanner

fun main() {

    val scan = Scanner(System.`in`)



    // Registrar el numero de numeros que introduira l'usauri en la següent.

    var entrades = scan.nextInt()


    // Obrir un bucle dins del bucle per tal de registrar tots els numeros introduits per l'usuari.

    while (entrades > 0) {

        // Llegir el tamany de l'array.

        var tamany = scan.nextInt()

        // Crear un array per guardar els numeros.

        val entrada = IntArray(tamany)

        for (i in 0 until tamany) {
            entrada[i] = scan.nextInt()
        }

        // Introduir el numero a trobar dins de l'array.

        val FOLI = scan.nextInt()
        var resultat = -1
        for (foli in 0 until tamany) {
            if (entrada[foli] == FOLI && resultat == -1) {
                resultat = foli
            }
        }

        // Mostrar el resultat de la cerca.

        println(resultat)

        // Restar una entrada per cada volta

        entrades--

    }
}