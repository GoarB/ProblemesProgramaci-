/*
A Bambino li agrada jugar a cartes i l’Egipte dels faraons, ... i per això, de tant en tant, li dona per fer piràmides
de cartes. Les piràmides són com la de la foto.

Entrada
L’entrada comença amb un número indicant la quantitat de casos de prova que vindran a continuació. Cada cas de prova
consta d’una línia amb el número de cartes de que disposa Bambino (enter positiu i menor que 1000)

Sortida
Per cada cas de prova, caldrà respondre, en una línia amb dos valors:

Alçada de la piràmide de cartes que es pot aconseguir
Número de cartes que sobren (és a dir, les cartes que no es poden posar perquè no arriben a completar un nivell
(residu).

1. Llegir el nombre de casos de prova.
2. Repetir el procés per cada cas de prova.
3. Llegir el nombre de cartes disponibles.
4. Inicialitzar l'alçada i les cartes del primer nivell.
5. Comprovar si tenim prou cartes per construir un nivell.
6. Restar les cartes utilitzades.
7. Augmentar l'alçada de la piràmide.
8. Calcular les cartes necessàries per al següent nivell.
9. Repetir el procés fins que no tinguem prou cartes.
10. Mostrar l'alçada i les cartes sobrants.
*/

import java.util.Scanner

fun main() {

    val scan = Scanner(System.`in`)

    val CARTES_INICIALS = 2
    val INCREMENT_CARTES = 3

    // 1. Llegir el nombre de casos de prova.

    val nombrecasos = scan.nextInt()

    // 2. Repetir el procés per cada cas de prova.

    for (casactual in 1..nombrecasos) {

        // 3. Llegir el nombre de cartes disponibles.

        var cartesdisponibles = scan.nextInt()

        // 4. Inicialitzar l'alçada i les cartes del primer nivell.

        var alcadapiramide = 0
        var cartesnivell = CARTES_INICIALS

        // 5 i 9. Repetir mentre tinguem prou cartes per completar un nivell.

        while (cartesdisponibles >= cartesnivell) {

            // 6. Restar les cartes utilitzades.

            cartesdisponibles -= cartesnivell

            // 7. Augmentar l'alçada de la piràmide.

            alcadapiramide++

            // 8. Calcular les cartes del següent nivell.

            cartesnivell += INCREMENT_CARTES
        }

        // 10. Mostrar l'alçada i les cartes sobrants.

        println("$alcadapiramide $cartesdisponibles")
    }
}