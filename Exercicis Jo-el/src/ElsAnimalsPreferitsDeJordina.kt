/*
A Jordina li agraden els animals. Potser li agraden MASSA
 els animals. Té una col·lecció de disfresses d'animals, que ensenya amb orgull a tothom. A vegades algú li pregunta
 si té un animal en concret a la seva col·lecció. La resposta gairebé sempre és sí

Entrada
La primera línia indica els casos de prova a considerar Cada cas conté múltiples linies. La primera té un nombre K
, que diu el nombre de línies que hi ha. Després venen K−1
 línies, cada una amb el nom d'un animal. l'última línea és el nom de l'animal que busquem a la col·lecció

Sortida
Si l'animal buscat està contingut en la col·lecció de la Jordina, torna "SI". Si no, torna "NO",

1. Llegir el nombre de casos de prova.
2. Repetir el procés per cada cas.
3. Llegir el nombre de línies del cas.
4. Crear un array per guardar els animals.
5. Llegir i guardar els animals de la col·lecció.
6. Llegir el nom de l'animal que busquem.
7. Inicialitzar la variable que indica si l'animal existeix.
8. Recórrer l'array i comparar els noms dels animals.
9. Actualitzar la variable si trobem l'animal.
10. Mostrar SI si l'animal existeix o NO si no existeix.
*/

import java.util.Scanner

fun main() {

    val scan = Scanner(System.`in`)

    // 1. Llegir el nombre de casos de prova.
    val nombrecasos = scan.nextInt()

    // 2. Repetir el procés per cada cas.
    for (casactual in 1..nombrecasos) {

        // 3. Llegir el nombre de línies del cas.
        val nombrelinies = scan.nextInt()
        scan.nextLine()

        // 4. Crear un array per guardar els animals.
        val animals = Array(nombrelinies - 1) { "" }

        // 5. Llegir i guardar els animals de la col·lecció.
        for (index in 0 until animals.size) {
            animals[index] = scan.nextLine()
        }

        // 6. Llegir el nom de l'animal que busquem.
        val animalbuscat = scan.nextLine()

        // 7. Inicialitzar la variable que indica si l'animal existeix.
        var trobat = false

        // 8. Recórrer l'array i comparar els noms dels animals.
        for (index in 0 until animals.size) {

            // 9. Actualitzar la variable si trobem l'animal.
            if (animals[index] == animalbuscat) {
                trobat = true
            }
        }

        // 10. Mostrar SI si l'animal existeix o NO si no existeix.
        if (trobat) {
            println("SI")
        } else {
            println("NO")
        }
    }
}