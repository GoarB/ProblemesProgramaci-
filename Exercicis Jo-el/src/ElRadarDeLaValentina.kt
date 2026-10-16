/*
La Valentina té un Ràdar que pot detectar la quantitat d'energia de les persones. Per a calibrar-ho, fa 5 medicions de
cada persona, que li tornen un valor d'energia. Si l'energia es menys de 1000, serà de categoria H, si es entre 1000 i
10000, de categoria B i si és de 10000 o més, categoria M

Entrada
La primera línia indica els casos de prova a considerar Cada cas és una linea amb 5
 números, cadascún amb la medició de l'energia.

Sortida
Per cada cas de prova caldrà respondre: Si en alguna medició s'ha detectat un valor d'energia de 10000 o superior, M
Si no és M, pero hi ha algun valor d'energia 1000 o superior, B En cas contrari, H

1. Crear la variable que registri el numero de casos de prova totals que indiqui l'usuari i les de cada
    nivell d'energia i les vegades a registrar.
2. Crear un bucle que nomes funcioni mentre quedin casos de proba.
3. Registrar el nivell d'energia segons les entrades i donar un nivell entre M, B i H.
4. Crear la primera entrada del nivell d'energia i les condicions per tal de registrar el nivell.
5. Mostrar el resultat, reiniciar el numero de registres i restar un cas al total.

 */

import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`)

    // 1. Crear la variable que registri el numero de casos de prova totals que indiqui l'usuari i les de cada
    // nivell d'energia i les vegades a registrar.

    val M = 10000
    val B = 1000
    var casostotals = scan.nextInt()
    var nivell = ""
    var vegadesregistre = 5

    //2. Crear un bucle que nomes funcioni mentre quedin casos de proba.

    while(casostotals > 0) {

    //3. Registrar el nivell d'energia segons les entrades i donar un nivell entre M, B i H.

        repeat(vegadesregistre) {

            //4. Crear la primera entrada del nivell d'energia i les condicions per tal de registrar el nivell.

            val energia = scan.nextInt()
                if (energia >= M) {
                    nivell = "M"
                    vegadesregistre--
                } else if (energia >= B && nivell != "M") {
                    nivell = "B"
                    vegadesregistre--
                } else if (nivell !="M" && nivell != "B" || energia <= 0) {
                    nivell = "H"
                    vegadesregistre--
                }
            }

    //5. Mostrar el resultat, reiniciar el numero de registres i restar un cas al total.

        println(nivell)
        vegadesregistre = 5
        casostotals--
    }

}