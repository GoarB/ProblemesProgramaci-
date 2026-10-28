/*
La classe de Segon de DAM-Vi està plena d’otakus. Una de les grans aficions dels otakus es
“Shipear” parelles. És a dir, imaginar que dos alumnes són parella i dir lo macos que estan junts.
Per a un major efecte comèdic, sempre agafen a l’alumne més alt i l’alumne més baix. Es considera
que com més diferència d’alçada hi hagi, millor és el shipeig.

Entrada
La primera línia indica els casos de prova a considerar Cada cas de prova és una linea amb diferents nombres El primer, N, es el nombre d’alumnes que hi ha una classe, seguides de l’alçada de cada alumnes en centímetres. Les alçades estaran entre 100 i 220.

Sortida
En cada ronda, s’haurà de dir la diferència d’alçada del millor shipeig possible

1. Llegir el nombre de casos de prova.
2. Repetir el procés per cada cas de prova.
3. Llegir el nombre d'alumnes de la classe.
4. Crear un array per guardar les alçades dels alumnes.
5. Recórrer l'array per llegir i guardar cada alçada.
6. Inicialitzar l'alçada màxima i mínima amb el primer element.
7. Recórrer l'array per comparar les alçades.
8. Actualitzar l'alçada màxima quan es trobi una alçada superior.
9. Actualitzar l'alçada mínima quan es trobi una alçada inferior.
10. Calcular la diferència entre l'alçada màxima i mínima.
11. Mostrar la diferència d'alçades.
*/

import java.util.Scanner

fun main() {

    val scan = Scanner(System.`in`)

    // 1. Llegir el nombre de casos de prova.
    val nombrecasos = scan.nextInt()

    // 2. Repetir el procés per cada cas de prova.
    for (casactual in 1..nombrecasos) {

        // 3. Llegir el nombre d'alumnes de la classe.
        val nombrealumnes = scan.nextInt()

        // 4. Crear un array per guardar les alçades dels alumnes.
        val alcades = Array(nombrealumnes) { 0 }

        // 5. Recórrer l'array per llegir i guardar cada alçada.
        for (index in 0 until alcades.size) {
            alcades[index] = scan.nextInt()
        }

        // 6. Inicialitzar l'alçada màxima i mínima amb el primer element.
        var alcadamaxima = alcades[0]
        var alcadaminima = alcades[0]

        // 7. Recórrer l'array per comparar les alçades.
        for (index in 0 until alcades.size) {

            // 8. Actualitzar l'alçada màxima.
            if (alcades[index] > alcadamaxima) {
                alcadamaxima = alcades[index]
            }

            // 9. Actualitzar l'alçada mínima.
            if (alcades[index] < alcadaminima) {
                alcadaminima = alcades[index]
            }
        }

        // 10. Calcular la diferència entre les dues alçades.
        val diferenciaalcades = alcadamaxima - alcadaminima

        // 11. Mostrar la diferència d'alçades.
        println(diferenciaalcades)
    }
}