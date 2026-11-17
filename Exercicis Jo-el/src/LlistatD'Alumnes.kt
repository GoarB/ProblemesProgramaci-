/*
Passar les notes és una de les tasques més avorrides que pot tenir un professor. T'ofereixes a ajudar al professor a
passar les notes? Potser pots ficar-hi cullerada i arreglar-te les notes...

Entrada
L'entrada comença amb un número N que indica el nombre d'alumnes de la classe.

A continuació vindran N línies on tindrem el nom de l'alumne, un número amb la nota que ha tret al primer parcial i un
altre número amb la nota del segon parcial

Finalment, tindrem dos números P1 i P2 que indiquen la posició de l'alumne si ordenem la nota del segon parcial de més
gran a més petit (P1) i la posició de l'alumne que ha tret la nota final més alta (P2). La nota final es calcula
com un 40% de P1 i un 60% de P2

Sortida
Cal mostrar 2 línies, amb el nom de l'alumne, la nota del primer parcial, la nota del segon parcial i la nota final,
separades per un espai.

La primera línia mostrarà el nom de la persona que ocupa el lloc P1 segons el segon parcial.

La segona línia mostrarà el nom de la persona que ocupa el lloc P2 segons la seva nota final.

1. Registrar el nombre d'alumnes.
2. Registrar la llista d'alumnes.
3. Registrar la llista de notes del primer parcial.
4. Registrar la llista de notes del segon parcial.
5. Registrar la posició de l'alumne segons la nota del segons parcial.
6. Registrar la posició de l'alumne segons la nota final.
*/
import java.util.Scanner

fun main() {

    val scan = Scanner(System.`in`)

//1. Registrar el nombre d'alumnes.
    val alumnes = scan.nextInt()
    val llistalumnes = Array(alumnes) {""}
    val llistanotesp1 = DoubleArray(alumnes)
    val llistanotesp2 = DoubleArray(alumnes)

//2. Registrar la llista d'alumnes.
    for (i in 0 until alumnes) {
        llistalumnes[i] = scan.next()
        llistanotesp1[i] = scan.nextDouble()
        llistanotesp2[i] = scan.nextDouble()
    }
scan.nextLine()
//3. Registrar la llista de notes del primer parcial.

//4. Registrar la llista de notes del segon parcial.

//5. Registrar la posició de l'alumne segons la nota del segons parcial.
    val segonparcial = scan.nextInt()
//6. Registrar la posició de l'alumne segons la nota final.
    val notafinal  = scan.nextInt()

    for (i in 0 until alumnes) {
        println(llistalumnes[i] + llistanotesp1[i] + llistanotesp2[i])
    }


}