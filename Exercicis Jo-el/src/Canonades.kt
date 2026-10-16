/*
Volem saber quant ens costaria la instal·lació de canonades de la nostra casa tenint en compte que els 25 primers
metres costen 3€ el metre, que a partir dels 25 metres fins als 75 costarà 4€ el metre, i a partir dels 75m ens
costaria 5€ el metre de canonada.

Crea un programa que calculi quan costaria la instal·lació de les canonades.

Entrada
L’entrada serà d’una sola línia i constarà d’un nombre que són els metres de canonada que necessitem.

Sortida
El programa retornarà una línia amb el format “Xm: Y euros” on X són els metres de canonada i Y és el cost total.

1. Crear la variable de l'entrada de l'usuari amb el total de metres.
2. Crear una variable per tal de poder anar restant els metres que ja hem calculat i les variables de cada
   franja de metres.
3. Obrir un bucle que permeti anar multiplicant el numero de metres segons la franja de preu en que es trobi.
4. Mostrar el resultat total.

 */

import java.util.Scanner
import java.util.Locale

fun main() {

    val scan = Scanner(System.`in`).useLocale(Locale.US)

//    1. Crear la variable de l'entrada de l'usuari amb el total de metres.

    val entrada = scan.nextDouble()

//    2. Crear una variable per tal de poder anar restant els metres que ja hem calculat
//    i les variables de cada franja de metres.

    var metres = entrada
    val LIMIT1 = 25.0
    val LIMIT2 = 75.0
    val PREU24 = 25 * 3.0
    val PREU74 = (75 - 25) * 4.0
    var euros = 0.0

//    3. Obrir un bucle que permeti anar multiplicant el numero de metres segons la franja de preu en que es trobi.

    while (metres > 0) {
        if (entrada <= LIMIT1) {
            euros = entrada * 3.0
            metres -= 25
        } else if (metres <= LIMIT2) {
            euros = (entrada - LIMIT1) * 4.0 + PREU24
            metres -= 75
        } else {
            euros = (entrada - LIMIT2) * 5.0 + PREU24 + PREU74
            metres = 0.0
        }
    }

//    4. Mostrar el resultat total.
    println("${entrada.toFloat()}m: ${euros.toFloat()} euros")
}