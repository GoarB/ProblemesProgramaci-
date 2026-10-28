/*
Un icónic atac de mag en el WoW es Explosión Arcana. Aquest atac comença fent poc mal, pero cada cop que el fas servir
fa un 100% més de mal. Per exemple, si el primer cop fa 100 punts de mal, el següent farà 200, el següent 300, el
següent 400, i així fins que passa un temps.

Entrada
Cada cas son dos nombres, casdascún en una linea. el primer, Ini
es el dany inicial de Explosión Arcana. El segon, Q és la quantitat d'Explosions Arcanes que es tiren

Sortida
S'ha de dir el dany TOTAL fet per totes les Explosions Arcanes. És a dir, la suma de totes. No la última

1. Llegir el dany inicial de l'Explosió Arcana.
2. Llegir la quantitat d'Explosions Arcanes.
3. Crear una variable per acumular el dany total.
4. Recórrer totes les explosions.
5. Calcular el dany de cada explosió.
6. Sumar el dany de cada explosió al total.
7. Mostrar el dany total.
*/

import java.util.Scanner

fun main() {

    val scan = Scanner(System.`in`)

    // 1. Llegir el dany inicial de l'Explosió Arcana.
    val Ini = scan.nextInt()

    // 2. Llegir la quantitat d'Explosions Arcanes.
    val quantitatExplosions = scan.nextInt()

    // 3. Crear una variable per acumular el dany total.
    var danyTotal = 0

    // 4. Recórrer totes les explosions.
    for (numeroExplosio in 1..quantitatExplosions) {

        // 5. Calcular el dany de cada explosió.
        val dany = Ini * numeroExplosio

        // 6. Sumar el dany de cada explosió al total.
        danyTotal += dany
    }

    // 7. Mostrar el dany total.
    println(danyTotal)
}