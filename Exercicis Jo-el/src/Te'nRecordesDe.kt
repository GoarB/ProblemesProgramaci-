/*
Sempre tens un amic pesat que et diu "Te'n recordes de...". Jo no perquè soc una aplicació web, però Marc me n'ha parlat. Clar que Marc potser tampoc té amics si li parla a una aplicació web.

Entrada
La primera línia indica els casos de prova a considerar Cada cas conté tres linies. La primera té un nombre K
. La segona conté K
 nombres del 0 al 100. La tercera conté un nombre P<K

Sortida
Per cada cas de prova es vol retornar el nombre que ocupava la posició P
 en la llista de nombres. Considereu que la primera posició és 0.

1. Llegim la quantitat de nombres
2. Creem un array de mida K
3. Guardem els nombres dins de l'array
4. Llegim la posició que volem consultar
5. Mostrem el nombre que hi ha en aquella posició

 */

import java.util.Scanner

fun main() {

    val scan = Scanner(System.`in`)

    val casos = scan.nextInt()

    repeat(casos) {

        // Llegim la quantitat de nombres
        val k = scan.nextInt()

        // Creem un array de mida K
        val numeros = IntArray(k)

        // Guardem els nombres dins de l'array
        for (i in 0 until k) {
            numeros[i] = scan.nextInt()
        }

        // Llegim la posició que volem consultar
        val p = scan.nextInt()

        // Mostrem el nombre que hi ha en aquella posició
        println(numeros[p])
    }
}
