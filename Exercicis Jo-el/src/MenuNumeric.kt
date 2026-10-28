/*
Implementa un menu que tindrà 4 opcions

A - posar un numero inicial (entre el 0 i el 10), que l'usuari introduirà per teclat
B - posar un numero final (entre el 0 i el 10), que l'usuari introduirà per teclat
C - imprimir una compta entre el numero inicial i el final, amb un nombre per línea, incloent els dos. Si l'usuari no
ha posat numero inicial o final, escriure ERROR. si el numero final es mes petit que l'inicial, escriure ERROR
D - sortir del programa. En aquest cas, el programa dira "BYE" i acabara l'execució
No posis cap altre print més enllà dels necessaris en el punt C i D

Entrada
Cada cas son una combinació d'instruccions de l'usuari, que s'assegura que acaben en D. L'usuari és inteligent, i
sempre posarà els seus números entre 0 i 10, i posarà números quan li toca posar números i lletres quan li toca
posar lletres.

Sortida
La sortida del programa

1. Crear les variables per guardar el número inicial i el final.
2. Crear les variables per comprovar si s'han introduït els dos números.
3. Llegir la primera opció del menú.
4. Repetir el procés mentre l'opció sigui diferent de D.
5. Comprovar si l'usuari ha seleccionat l'opció A.
6. Llegir i guardar el número inicial.
7. Comprovar si l'usuari ha seleccionat l'opció B.
8. Llegir i guardar el número final.
9. Comprovar si l'usuari ha seleccionat l'opció C.
10. Verificar que s'han introduït els dos números i que el final no és inferior a l'inicial.
11. Mostrar "ERROR" si alguna condició no es compleix.
12. Recórrer els números entre l'inicial i el final si són vàlids.
13. Mostrar cada número en una línia.
14. Llegir la següent opció del menú.
15. Mostrar "BYE" quan l'usuari selecciona l'opció D.
*/

import java.util.Scanner

fun main() {

    val scan = Scanner(System.`in`)

    // 1. Crear les variables per guardar el número inicial i el final.

    var numeroinicial = 0
    var numerofinal = 0

    // 2. Crear les variables per comprovar si s'han introduït els dos números.

    var inicialintroduit = false
    var finalintroduit = false

    // 3. Llegir la primera opció del menú.

    var opcio = scan.next()

    // 4. Repetir el procés mentre l'opció sigui diferent de D.

    while (opcio != "D") {

        // 5. Comprovar si l'usuari ha seleccionat l'opció A.

        if (opcio == "A") {

            // 6. Llegir i guardar el número inicial.

            numeroinicial = scan.nextInt()
            inicialintroduit = true

            // 7. Comprovar si l'usuari ha seleccionat l'opció B.

        } else if (opcio == "B") {

            // 8. Llegir i guardar el número final.

            numerofinal = scan.nextInt()
            finalintroduit = true

            // 9. Comprovar si l'usuari ha seleccionat l'opció C.

        } else if (opcio == "C") {

            // 10. Verificar que els dos números existeixen i estan ordenats.

            if (!inicialintroduit || !finalintroduit || numerofinal < numeroinicial) {

                // 11. Mostrar "ERROR" si alguna condició no es compleix.

                println("ERROR")

            } else {

                // 12. Recórrer els números entre l'inicial i el final.

                for (numeroactual in numeroinicial..numerofinal) {

                    // 13. Mostrar cada número en una línia.

                    println(numeroactual)
                }
            }
        }

        // 14. Llegir la següent opció del menú.

        opcio = scan.next()
    }

    // 15. Mostrar "BYE" quan l'usuari selecciona D.

    println("BYE")
}