/*
La mama ha fet sopa pel cap de setmana i amb la carn picada sobrant heu decidit fer croquetes!!!

Volem fer un programa que calculi el nombre de croquetes que surten depenent de la carn picada que tenim.

Normalment fem 2 tipus de croquetes: normals on utilitzem 4g de carn i petites on utilitzem 2.5g de carn. L'objectiu és que segons la mida de les croquetes les volem fer aquella mida que sobri menys carn picada.

Sempre hem de tindre carn suficient per a poder fer minimament una croqueta i com ens agraden el nombres rodons no utilitarem grams de carn amb decimals.

També volem saber si sobra carn o no per poder aprofitarla d'una altre forma.

Per últim, la mama m'ha demanat que es pugui saber quin tamany de paella necessitarem en base a les croquetes que hem fet: -Capacitat paella petita: fins a 9 croquetes -Capacitat paella mitjana: fins a 18 croquetes -Capacitat paella gran: fins a 36 croquetes

En cas de sortir més de 36 croquetes necessitarem una paella gegant.

Entrada
El programa llegeix el número de grams de carn picada (és un numero sencer).

Sortida
El programa informa del número de croquetes que podem fer, de la paella que utilitzarem per coure-les.

1. Llegir els grams de carn picada disponibles.
2. Calcular quantes croquetes grans es poden fer.
3. Calcular quanta carn sobra fent croquetes grans.
4. Calcular quantes croquetes petites es poden fer.
5. Calcular quanta carn sobra fent croquetes petites.
6. Comparar quina mida de croqueta deixa menys carn sobrant.
7. Guardar el nombre de croquetes i el tipus escollit.
8. Determinar la mida de la paella segons el nombre de croquetes.
9. Mostrar el nombre i el tipus de croquetes.
10. Mostrar la mida de la paella.
11. Mostrar els grams de carn que sobren.
*/

import java.util.Scanner

fun main() {

    val scanner = Scanner(System.`in`)

    // 1. Llegir els grams de carn picada disponibles.

    val gramsCarn = scanner.nextInt()

    // 2. Calcular quantes croquetes grans es poden fer.

    val nombreCroquetesGrans = gramsCarn / 4

    // 3. Calcular quanta carn sobra fent croquetes grans.

    val carnSobrantGrans = gramsCarn - nombreCroquetesGrans * 4.0

    // 4. Calcular quantes croquetes petites es poden fer.

    val nombreCroquetesPetites = (gramsCarn / 2.5).toInt()

    // 5. Calcular quanta carn sobra fent croquetes petites.

    val carnSobrantPetites = gramsCarn - nombreCroquetesPetites * 2.5

    var nombreCroquetesFinal = 0
    var tipusCroqueta = ""
    var carnSobrantFinal = 0.0

    // 6. Comparar quina mida de croqueta deixa menys carn sobrant.

    if (carnSobrantGrans <= carnSobrantPetites) {

        // 7. Guardar les dades de les croquetes grans.

        nombreCroquetesFinal = nombreCroquetesGrans
        tipusCroqueta = "grans"
        carnSobrantFinal = carnSobrantGrans

    } else {

        // 7. Guardar les dades de les croquetes petites.

        nombreCroquetesFinal = nombreCroquetesPetites
        tipusCroqueta = "petites"
        carnSobrantFinal = carnSobrantPetites
    }

    var tipusPaella = ""

    // 8. Determinar la mida de la paella segons el nombre de croquetes.

    if (nombreCroquetesFinal <= 9) {
        tipusPaella = "paella petita"
    } else if (nombreCroquetesFinal <= 18) {
        tipusPaella = "paella mitjana"
    } else if (nombreCroquetesFinal <= 36) {
        tipusPaella = "paella gran"
    } else {
        tipusPaella = "paella gegant"
    }

    // 9. Mostrar el nombre i el tipus de croquetes.

    println("$nombreCroquetesFinal croquetes $tipusCroqueta")

    // 10. Mostrar la mida de la paella.

    println(tipusPaella)

    // 11. Mostrar els grams de carn que sobren.

    println(carnSobrantFinal)
}