/*
T'has fixat que si no fos perque en aquest número poso el multiplicand al final es podria fer sense arrays? Això es
perque vull que ho facis amb arrays. Em paguen per això.

Entrada
La primera línia indica els casos de prova a considerar Cada cas conté tres linies. La primera té un nombre K.
La segona conté K nombres del 0 al 100. La tercera conté un nombre P.

Sortida
Per cada cas de prova es vol retornar tota la llista de nombres propocionada, multiplicats per P.

1. Registrar el numero de numeros que introduira l'usauri en la següent.
2. Obrir un bucle dins del bucle per tal de registrar tots els numeros introduits per l'usuari.
3. Llegir el tamany de l'array.
4. Crear un array per guardar els numeros.
5. Mostrar el resultat de la cerca.
6. Restar una entrada per cada volta.

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

        val multiplica = scan.nextInt()

        for (num in 0 until tamany) {
            entrada[num] *= multiplica
        }
        // Mostrar el resultat de la cerca.

        repeat(entrada.size) {
            println(entrada[it])
        }

        // Restar una entrada per cada volta

        entrades--

    }
}