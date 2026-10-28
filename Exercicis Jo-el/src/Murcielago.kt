/*
Murcielago es una de les poques paraules que tenen totes les vocals. saps alguna més?

Entrada
L'entrada es una sola paraula, escrita només en lletres minúscules de l'alfabet anglés. Sense accents.

Sortida
El programa escriurà “TOTES” si durant la frase han aparegut totes les vocals, i “FALTEN” si falta alguna vocal.

1. Llegir la paraula.
2. Crear una variable per controlar si ha aparegut cada vocal.
3. Recórrer totes les lletres de la paraula.
4. Marcar la vocal corresponent quan aparegui.
5. Comprovar si han aparegut totes les vocals.
6. Mostrar "TOTES" si hi són totes.
7. Mostrar "FALTEN" si en falta alguna.
*/

import java.util.Scanner

fun main() {

    val scan = Scanner(System.`in`)

    // 1. Llegir la paraula.

    val paraula = scan.next()

    // 2. Crear una variable per controlar si ha aparegut cada vocal.

    var tea = false
    var tee = false
    var tei = false
    var teo = false
    var teu = false

    // 3. Recórrer totes les lletres de la paraula.

    for (lletra in paraula) {

        // 4. Marcar la vocal corresponent quan aparegui.

        if (lletra == 'a') {
            tea = true
        } else if (lletra == 'e') {
            tee = true
        } else if (lletra == 'i') {
            tei = true
        } else if (lletra == 'o') {
            teo = true
        } else if (lletra == 'u') {
            teu = true
        }
    }

    // 5. Comprovar si han aparegut totes les vocals.

    if (tea && tee && tei && teo && teu) {

        // 6. Mostrar "TOTES" si hi són totes.

        println("TOTES")

    } else {

        // 7. Mostrar "FALTEN" si en falta alguna.

        println("FALTEN")
    }
}