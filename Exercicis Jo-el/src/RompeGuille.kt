/*
El Guille. El mires i saps que mai ha trencat un plat. Però si parlem de paper … aix si parlem de paper.
Al Guille li agrada agafar fulls quadrats de paper, anar a la meitat de cada costat, agafar unes tisores i … t’ho
pots imaginar.

Pot estar tooooota una tarda esmicolant un full ben gros de paper. Conclusió … no li donis unes tisores al Guille.

Entrada
Primer rebem el número de casos de prova, que serà un número enter positiu

Per cada cas de prova rebem un valor enter, corresponent a la longitud del costat que te el full quadrat

Sortida
Per cada cas de prova, indicarem el número de vegades que podrà tallar el Guille el full original, entenent que no
podrà fer-ho quan la longitud del costat sigui igual o inferior a 1

1. Llegir el nombre de casos de prova.
2. Repetir el procés per cada cas de prova.
3. Llegir la longitud del costat i convertir la coma decimal en punt.
4. Calcular la superfície inicial del full quadrat.
5. Crear un comptador per al nombre de talls.
6. Dividir la superfície per la meitat mentre sigui superior a 1.
7. Augmentar el comptador cada vegada que es fa un tall.
8. Mostrar el nombre total de talls.
*/

import java.util.Scanner

fun main() {

    val scan = Scanner(System.`in`)

    // 1. Llegir el nombre de casos de prova.

    val nombrecasos = scan.nextInt()

    // 2. Repetir el procés per cada cas de prova.

    for (casactual in 1..nombrecasos) {

        // 3. Llegir la longitud del costat i convertir la coma decimal en punt.

        val costat = scan.next().replace(",", ".").toDouble()

        // 4. Calcular la superfície inicial del full quadrat.

        var superficie = costat * costat

        // 5. Crear un comptador per al nombre de talls.

        var nombretalls = 0

        // 6. Dividir la superfície per la meitat mentre sigui superior a 1.

        while (superficie > 1) {

            superficie /= 2

            // 7. Augmentar el comptador cada vegada que es fa un tall.

            nombretalls++
        }

        // 8. Mostrar el nombre total de talls.

        println(nombretalls)
    }
}