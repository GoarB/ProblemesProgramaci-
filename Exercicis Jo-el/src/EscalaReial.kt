/*
La classe de Segon de DAM-Vi està plena d’otakus. Una de les grans aficions dels otakus es “Shipear” parelles. És a
dir, imaginar que dos alumnes són parella i dir lo macos que estan junts. Per a un major efecte comèdic, sempre agafen
a l’alumne més alt i l’alumne més baix. Es considera que com més diferència d’alçada hi hagi, millor és el shipeig.

Entrada
La primera línia indica els casos de prova a considerar Cada cas de prova és una linea amb diferents nombres El
primer, N, es el nombre d’alumnes que hi ha una classe, seguides de l’alçada de cada alumnes en centímetres. Les
alçades estaran entre 100 i 220.

Sortida
En cada ronda, s’haurà de dir la diferència d’alçada del millor shipeig possible


1. Llegir el nombre de casos de prova.
2. Repetir el procés per cada cas de prova.
3. Crear els arrays per guardar les cartes i els valors presents.
4. Llegir les 7 cartes i registrar els seus valors.
5. Comprovar si tenim les cartes necessàries per a una escala reial.
6. Inicialitzar les variables per buscar una escala normal.
7. Recórrer els valors de les cartes en ordre ascendent.
8. Comptar els valors consecutius que tenim.
9. Reiniciar el comptador quan falta un valor.
10. Comprovar si hem trobat almenys 5 valors consecutius.
11. Mostrar ESCALA REIAL, ESCALA o NO segons el resultat.
*/

import java.util.Scanner

fun main() {

    val scan = Scanner(System.`in`)

    val TOTAL_CARTES = 7
    val VALOR_MAXIM = 13
    val CARTES_ESCALA = 5

    // 1. Llegir el nombre de casos de prova.
    val nombrecasos = scan.nextInt()

    // 2. Repetir el procés per cada cas de prova.
    for (casactual in 1..nombrecasos) {

        // 3. Crear els arrays per guardar les cartes i els valors presents.
        val cartes = Array(TOTAL_CARTES) { 0 }
        val valorspresents = Array(VALOR_MAXIM + 1) { false }

        // 4. Llegir les 7 cartes i registrar els seus valors.
        for (index in 0 until cartes.size) {
            cartes[index] = scan.nextInt()
            valorspresents[cartes[index]] = true
        }

        // 5. Comprovar si tenim una escala reial.
        val escalareial = valorspresents[1] &&
                valorspresents[10] &&
                valorspresents[11] &&
                valorspresents[12] &&
                valorspresents[13]

        // 6. Inicialitzar les variables per buscar una escala normal.
        var consecutius = 0
        var escala = false

        // 7. Recórrer els valors de les cartes en ordre ascendent.
        for (valor in 1..VALOR_MAXIM) {

            // 8. Comptar els valors consecutius presents.
            if (valorspresents[valor]) {
                consecutius++
            } else {

                // 9. Reiniciar el comptador quan falta un valor.
                consecutius = 0
            }

            // 10. Comprovar si tenim almenys 5 valors consecutius.
            if (consecutius >= CARTES_ESCALA) {
                escala = true
            }
        }

        // 11. Mostrar el resultat segons la jugada.
        if (escalareial) {
            println("ESCALA REIAL")
        } else if (escala) {
            println("ESCALA")
        } else {
            println("NO")
        }
    }
}