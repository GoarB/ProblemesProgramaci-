/*

2. Llegir el nombre de casos que s'han de processar.
3. Repetir el procés una vegada per cada cas.
4. Llegir la generació corresponent al cas actual.
5. Calcular quantes vegades s'ha d'escriure "caga" abans de "tio".
6. Mostrar "Caga " al principi de la frase.
7. Repetir "caga" el nombre de vegades calculat.
8. Mostrar "tio!" al final de la frase.
*/

import java.util.Scanner

fun main() {

    val scanner = Scanner(System.`in`)

    // Llegir el nombre de casos que s'han de processar.
    val nombreCasos = scanner.nextInt()

    // Repetir el procés per cada cas.
    for (casActual in 1..nombreCasos) {

        // Llegir la generació.
        val generacio = scanner.nextInt()

        // Calcular quantes vegades s'ha d'afegir "caga".
        val quantitatCaga = (generacio - 1) / 2

        // Mostrar l'inici de la frase sense salt de línia.
        print("Caga ")

        // Escriure "caga" tantes vegades com correspongui.
        for (repeticio in 1..quantitatCaga) {
            print("caga")
        }

        // Mostrar "tio!" i fer el salt de línia.
        println("tio!")
    }
}