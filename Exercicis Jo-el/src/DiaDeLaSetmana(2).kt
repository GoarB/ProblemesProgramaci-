/*
Garfield odia els dilluns. Ajuda a Garfield a saber el dia de la setmana. Sap la gent que comença Grau Superior
a dia d'avui qui és Garfield? Ho he de preguntar.

Entrada
Cada cas és d'una línea, i conté un número N
de l'1 al 99999, els dos inclosos.

Sortida
Per cada cas es dira "Monday", "Tuesday", etc. fins a "Sunday" Sí, els anglesos comencen la setmana per Sunday,
pero també van amb sandàlies i mitjons, per tant la seva opinió no compta

1. Llegir el número indicat.
2. Calcular la posició del dia dins d'una setmana utilitzant el mòdul 7.
3. Determinar el dia de la setmana segons el resultat i mostrar el nom del dia.
*/

import java.util.Scanner

fun main() {

    val scanner = Scanner(System.`in`)

    // 1. Llegir el número indicat.

    val numeroDia = scanner.nextInt()

    // 2. Calcular la posició del dia dins d'una setmana utilitzant el mòdul 7.

    val posicioSetmana = numeroDia % 7

    // 3. Determinar el dia de la setmana segons el resultat i mostrar el nom del dia.

    if (posicioSetmana == 1) {
        println("Monday")
    } else if (posicioSetmana == 2) {
        println("Tuesday")
    } else if (posicioSetmana == 3) {
        println("Wednesday")
    } else if (posicioSetmana == 4) {
        println("Thursday")
    } else if (posicioSetmana == 5) {
        println("Friday")
    } else if (posicioSetmana == 6) {
        println("Saturday")
    } else {
        println("Sunday")
    }
}