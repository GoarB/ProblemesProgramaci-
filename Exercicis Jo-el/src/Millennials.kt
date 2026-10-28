/*
La Generació Y o milennials és un grup d'edat o generació que s'anomena així per seguir cronològicament la Generació X
i agrupa els nascuts als anys 80 i 90. Segons la vikipèdia … “És la generació amb més estudis, amb la millor ètica de
treball i amb unes ganes enormes de canviar el món a millor, tot i que no ho tenen fácil”.

Una de les coses que més agrada als millennials, són les sèries, que sovint descarreguen d’internet per veure quan
ells vulguin. Això sí, s’ha detectat, en alguns casos, un comportament una mica “anòmal” o, si més no, “estrany” ja
que alguns millennials no tenen prou paciència per veure tots els episodis d’una sèrie i es salten capítols ... per
veure el final.

Intentarem ajudar a diagnosticar possibles patologies en els millennials a partir del comportament que tenen veient
les sèries que descarreguen.

Entrada
L’entrada comença amb un número indicant la quantitat de casos de prova que vindran a continuació. Cada cas de prova
consta de:

Una línia que indica el número de línies del cas de prova i el número d’episodis d’una sèrie, i serà un número entre
1 i 25
Una seqüència de línies acabades per una línia amb el valor 0. Cada línia conté el número d’episodi que veu el
millennial, cronològicament. Aquest número sempre serà un valor entre 1 i el número d’episodis de la sèrie, i sempre
anirà pujant (tret del valor final 0 per indicar el final), sense repetició.
Sortida
Per cada cas de prova, caldrà respondre, en una única línia amb un diagnòstic:

Si no ha vist el capítol final, escriurà “ABANDONA”
Cas contrari:

si ha vist tots els episodis de la sèrie, escriurà “ORDENAT”
si s’ha perdut un episodi que no sigui l’últim, escriurà “ANSIOS”
si s’ha perdut almenys dos episodis, que no siguin l’últim, escriurà “ESTRESSAT”


1. Llegir el nombre de casos de prova.
2. Repetir el procés per cada cas de prova.
3. Llegir el nombre d'episodis visualitzats.
4. Llegir el nombre total d'episodis de la sèrie.
5. Crear una variable per guardar l'últim episodi visualitzat.
6. Llegir tots els episodis visualitzats.
7. Actualitzar l'últim episodi visualitzat.
8. Calcular quants episodis s'han saltat.
9. Comprovar si no s'ha vist l'últim episodi de la sèrie.
10. Comprovar si s'han vist tots els episodis.
11. Comprovar si només s'ha saltat un episodi.
12. Mostrar "ESTRESSAT" si s'han saltat dos o més episodis.
*/

import java.util.Scanner

fun main() {

    val scan = Scanner(System.`in`)

    // 1. Llegir el nombre de casos de prova.
    val nombrecasos = scan.nextInt()

    // 2. Repetir el procés per cada cas de prova.
    for (casactual in 1..nombrecasos) {

        // 3. Llegir el nombre d'episodis visualitzats.
        val episodisvistos = scan.nextInt()

        // 4. Llegir el nombre total d'episodis de la sèrie.
        val totalepisodis = scan.nextInt()

        // 5. Crear una variable per guardar l'últim episodi visualitzat.
        var ultimepisodivist = 0

        // 6. Llegir tots els episodis visualitzats.
        for (episodiactual in 1..episodisvistos) {

            // 7. Actualitzar l'últim episodi visualitzat.
            ultimepisodivist = scan.nextInt()
        }

        // 8. Calcular quants episodis s'han saltat.
        val episodissaltats = totalepisodis - episodisvistos

        // 9. Comprovar si no s'ha vist l'últim episodi de la sèrie.
        if (ultimepisodivist != totalepisodis) {
            println("ABANDONA")

        // 10. Comprovar si s'han vist tots els episodis.
        } else if (episodissaltats == 0) {
            println("ORDENAT")

        // 11. Comprovar si només s'ha saltat un episodi.
        } else if (episodissaltats == 1) {
            println("ANSIOS")

        // 12. Mostrar "ESTRESSAT" si s'han saltat dos o més episodis.
        } else {
            println("ESTRESSAT")
        }
    }
}
