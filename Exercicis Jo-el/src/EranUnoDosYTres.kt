/*
Eran uno dos i tres, los famosos mosqueperros. El malvado Cardenal Richelieu ha colado gatos (entre otras cosas
indeseables) en los cuerpos de elite de los mosqueperros. Pasa revista a las tropas y separa los mosqueperros y
todo lo demás.

Entrada
La primera línia indica els casos de prova a considerar Cada cas de prova té dues línees. La primera es un nombre N
 que indica quantes tropes hi ha. Després vindrà una segona línea amb N tropes, separades per coma.

Sortida
Per a cada cas hauràs de donar dues llistes en format estàndard de llista La primera tindrà totes aquelles tropes que
continguin "Mosqueperro". La segona totes aquelles que no. L'ordre de les llistes ha de respectar l'ordre de les tropes

1. Llegir el nombre de casos de prova.
2. Repetir el procés per cada cas.
3. Llegir el nombre de tropes.
4. Llegir la línia completa.
5. Separar les tropes per comes.
6. Crear dues llistes.
7. Recórrer totes les tropes.
8. Comprovar si contenen la paraula exacta "Mosqueperro".
9. Classificar les tropes.
10. Mostrar les dues llistes.
*/

import java.util.Scanner

fun main() {

    val scan = Scanner(System.`in`)

    val MOSQUEPERRO = " Mosqueperro "

    // 1. Llegir el nombre de casos de prova.
    val nombrecasos = scan.nextInt()
    scan.nextLine()

    // 2. Repetir el procés per cada cas.
    for (casactual in 1..nombrecasos) {

        // 3. Llegir el nombre de tropes.
        val nombretropes = scan.nextInt()
        scan.nextLine()

        // 4. Llegir la línia completa.
        val linia = scan.nextLine()

        // 5. Separar les tropes per comes.
        val tropes = linia.split(",")

        // 6. Crear les dues llistes.
        val mosqueperros = mutableListOf<String>()
        val altres = mutableListOf<String>()

        // 7. Recórrer totes les tropes.
        for (index in 0 until nombretropes) {

            val tropa = tropes[index].trim()

            // 8. Afegir espais per identificar paraules completes.
            val nom = " " + tropa + " "

            // 9. Classificar les tropes.
            if (nom.contains(MOSQUEPERRO)) {
                mosqueperros.add(tropa)
            } else {
                altres.add(tropa)
            }
        }

        // 10. Mostrar les dues llistes.
        println(mosqueperros)
        println(altres)
    }
}