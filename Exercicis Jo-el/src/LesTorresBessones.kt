/*
Sabieu que les torres Bessones de Nova York no són exactament de la mateixa altura? Bé, tècnicament ara SI que son de
la mateixa altura, pero abans no ho eren. Dos torres bessones, com les torres de Kuala Lumpur, es poden considerar
bessones si l'altura d'una torre està a menys de 5 metres de l'altra.

Donat dos nombres de l'altura de les torres, digues si són bessones

Entrada
Cada cas és de dues línies. La primera és el l'altura d'una torre, i la segona és l'altura de l'altra torre

Sortida
Per cada cas es dirà si les dues torres són bessones. Dues torres són bessones si la diferència d'altura entre una i
altra és 5 metres o menys. Torna "SI" en cas de ser bessones i "NO" en cas de no ser bessones

1. Llegir l'altura de la primera torre.
2. Llegir l'altura de la segona torre.
3. Calcular la diferència absoluta entre les dues altures.
4. Comprovar si la diferència és menor o igual a 5.
5. Mostrar "SI" si són torres bessones.
6. Mostrar "NO" si no són torres bessones.
*/

import java.util.Scanner
import kotlin.math.abs

fun main() {

    val scan = Scanner(System.`in`)

    // 1. Llegir l'altura de la primera torre.

    val alturatorre1 = scan.nextDouble()

    // 2. Llegir l'altura de la segona torre.

    val alturatorre2 = scan.nextDouble()

    // 3. Calcular la diferència absoluta entre les dues altures.

    val diferenciaaltura = abs(alturatorre1 - alturatorre2)

    // 4. Comprovar si la diferència és menor o igual a 5.

    if (diferenciaaltura <= 5) {

        // 5. Mostrar "SI" si són torres bessones.

        println("SI")

    } else {

        // 6. Mostrar "NO" si no són torres bessones.

        println("NO")
    }
}