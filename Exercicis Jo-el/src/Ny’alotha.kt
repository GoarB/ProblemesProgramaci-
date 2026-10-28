/*
Ha sortit fa poc la nova raid del WoW, Ny’alotha. En aquesta raid, es va per nivells. En el primer nivell hi ha un
monstre, que quan el mates, passes al següent nivell, que hi ha dos monstres. Els pots matar en l’ordre que vulguis
pero no pots passar al següent nivell fins que tots son morts. Per complicar la cosa, en alguns nivells hi ha monstres
opcionals, que no cal matar-los per a passar al següent nivell. Cada cop que surt una raid, els oficials de tots els
clans del WoW discuteixen sobre quin és el millor ordre per a acabar la raid (s’acaba una raid al matar el monstre
final de l’últim nivell), però hi ha moltíssimes possibilitats diferents

Entrada
La primera línia indica els casos de prova a considerar. Cada cas de prova són diverses línies. Comença amb un
nombre, N, que indica el nombre de nivells que hi ha. Després hi haurà N*2 nombres, per cada nivell, el nombre de
monstres obligatoris i el nombre de monstres opcionals. L’últim nivell sempre serà 1 0, perque només hi ha el
monstre final.

Sortida
Per cada cas s’haurà de tornar el nombre de combinacions diferents d’ordre de matar als monstres per a passar-se
la raid. Recordeu que la raid te la passes un cop has matat tots els monstres obligatoris, sense matar als opcionals.
Assumiu que un cop passeu de nivell no torneu mai al nivell anterior a matar els monstres opcionals. Com el número
pot ser motl alt (Blizzard pls) es calcularà mòdul 1.000.000.007.


1. Llegir el nombre de casos de prova.
2. Repetir el procés per cada cas de prova.
3. Llegir el nombre de nivells de la raid.
4. Crear una variable per acumular les combinacions totals.
5. Recórrer tots els nivells.
6. Llegir els monstres obligatoris i opcionals.
7. Calcular les ordenacions dels monstres obligatoris.
8. Crear un array per guardar les combinacions segons els opcionals eliminats.
9. Recórrer els monstres opcionals.
10. Actualitzar les combinacions en afegir un monstre opcional.
11. Sumar les combinacions possibles del nivell.
12. Multiplicar les combinacions del nivell per les de la raid i aplicar el mòdul per evitar nombres massa grans.
13. Mostrar el resultat final.
*/

import java.util.Scanner

fun main() {

    val scan = Scanner(System.`in`)

    val MODUL = 1000000007L

    // 1. Llegir el nombre de casos de prova.

    val nombrecasos = scan.nextInt()

    // 2. Repetir el procés per cada cas de prova.

    for (casactual in 1..nombrecasos) {

        // 3. Llegir el nombre de nivells de la raid.

        val nombrenivells = scan.nextInt()

        // 4. Crear una variable per acumular les combinacions totals.

        var combinacionstotals = 1L

        // 5. Recórrer tots els nivells.

        for (nivellactual in 1..nombrenivells) {

            // 6. Llegir els monstres obligatoris i opcionals.

            val monstresobligatoris = scan.nextInt()
            val monstresopcionals = scan.nextInt()

            // 7. Calcular les ordenacions dels monstres obligatoris.

            var factorialobligatoris = 1L

            for (numero in 1..monstresobligatoris) {
                factorialobligatoris =
                    (factorialobligatoris * numero) % MODUL
            }

            // 8. Crear un array per guardar les combinacions segons els opcionals eliminats.

            val combinacions = LongArray(monstresopcionals + 1)

            combinacions[0] = factorialobligatoris

            // 9. Recórrer els monstres opcionals.
            for (opcionalactual in 1..monstresopcionals) {

                // 10. Actualitzar les combinacions en afegir un monstre opcional.

                for (quantitat in opcionalactual - 1 downTo 0) {

                    val novescombinacions =
                        (combinacions[quantitat] *
                                (monstresobligatoris + quantitat + 1)) % MODUL

                    combinacions[quantitat + 1] =
                        (combinacions[quantitat + 1] + novescombinacions) % MODUL
                }
            }

            // 11. Sumar les combinacions possibles del nivell.

            var combinacionsnivell = 0L

            for (quantitat in 0..monstresopcionals) {
                combinacionsnivell =
                    (combinacionsnivell + combinacions[quantitat]) % MODUL
            }

            // 12. Multiplicar les combinacions del nivell per les de la raid i aplicar el mòdul per evitar
            // nombres massa grans.

            combinacionstotals =
                (combinacionstotals * combinacionsnivell) % MODUL
        }

        // 13. Mostrar el resultat final.

        println(combinacionstotals)
    }
}