/*
Ets un rastrejador i estàs analitzant els casos de covid de tots els barris de catalunya. Et passaran els valors
diaris de l'índex de contagis. La teva única missió és avisar si algun valor passa de 300.

Entrada
La primera línia indica els casos de prova a considerar. Cada cas són dues línies. La primera conté un nombre N
amb la quantitat de dies durant els que faràs l'anàlisi. Després vindrà una línia amb N
nombres, cadascun amb el valor de l'índex de contagis de cada dia.

Sortida
Per cada cas de prova caldrà respondre: Si no hi ha cap valor per sobre de 300, OK Si n'hi ha algun igual o per
sobre de 300, ALARMA

1. Registrar el nùmero de casos totals.
2. Crear el bucle limitat pel nùmero de casos totals restants.
3. Registrar la variable de cada dia que registri el nùmero de dies.
4. Crear un bucle dins d'aquest que permeti registrar els casos d'alerta.
5. Mostrar si hi ha ALARMA o esta OK en funció de cada numero de casos durant un dia.
 */

import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`)

// 1. Registrar el nùmero de casos totals.

    var casosproba = scan.nextInt()

// 2. Crear el bucle limitat pel nùmero de casos totals restants.

    while (casosproba > 0) {

    // 3. Registrar la variable de cada dia que registri el nùmero de dies.

        var numdies = scan.nextInt()
        var alertas = 0
    // 4. Crear un bucle dins d'aquest que permeti registrar els casos d'alerta.

        while (numdies > 0) {
            var casos = scan.nextInt()
            if (casos >= 300) {
                alertas++
            }
            numdies--
        }

        // 5. Mostrar si hi ha ALARMA o esta OK en funció de cada numero de casos durant un dia.
        if(alertas > 0){
            println("ALARMA")
        }
        else {
            println("OK")
        }
        casosproba--
    }
}