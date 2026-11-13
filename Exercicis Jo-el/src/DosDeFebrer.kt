/*
El dos de Febrer de 2020 és un nombre capicua com es pot veure en aquesta foto
Entrada
Cada cas conté un nombre K
.

Sortida
Per cada cas de prova has d’escriure SI si el nombre és capicua i NO si no ho és. Un nombre és capicua quan es llegeix
igual tant si llegeixes de dreta a esquerra com d'esquerra a dreta.

1. Registrar el nombre de l'usuari.
2. Dividir el nùmero en nùmeros més petits per tal de saber si és capicua.
3. Comprovar si el numero inicial es capicua en base als numeros donats al descompondre el numero.
4. Mostrar el resultat.
 */

import java.util.Scanner

fun main() {

    val scan = Scanner(System.`in`)

//1. Registrar el nombre de l'usuari.
    val numero = scan.next()

//2. Dividir el nùmero en nùmeros més petits per tal de saber si és capicua.
    val numeros: Array<Long> = numero.toString().map { it.digitToInt().toLong() }.toTypedArray()

//3. Comprovar si el nùmero inicial és capicua en base als numeros donats al descompondre el número.
    val midanums = numeros.size
    var resultat = true
    for (pos in 0 until midanums / 2) {
        if (numeros[pos] != numeros[midanums - 1 - pos]) {
            resultat = false
        }
        else if (resultat == true)
        {resultat = true}
    }

//4. Mostrar el resultat.
    if (resultat == true) {
        println("SI")
    }
    else {println("NO")}
}