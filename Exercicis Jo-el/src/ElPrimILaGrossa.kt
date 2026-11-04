/*
Havien passat més de 35 anys des que va acabar l’antiga EGB (Educació General Bàsica), però no importava. Semblava que
fos ahir. L’alumnat del Colegio Nacional Prim es tornava a reunir per saber de la seva vida. Era una d’aquelles coses
que val la pena viure. Per mantenir l’esperit i il·lusió entre tots aquells nens i nenes que rondaven la cinquantena,
Celia, una de les alumnes més actives, va fer una proposta que a tothom li va semblar be: compraria un número de la
loteria de la Grossa i el jugaríem entre tots. Be, aquesta era la idea, i la van fer, però no tothom tenia interès en
participar o be ho volien fer en quantitats diferents. Van buscar un número especial per ells i Celia va comprar tota
la quantitat possible d’aquest número. Després, va obrir una llista de peticions, on cada company podia demanar un
import que després li abonaria. No estava clar si podria satisfer totes les peticions o si al final seria ella qui
s’hauria de quedar el sobrant no assignat.

Entrada
La primera línia indica els casos de prova a considerar Cada cas de prova consta de dues línies.

La primera línia indica l’import que Celia va comprar del número a jugar, i serà un número enter entre 0 i 999999.

La segona línia conté totes les peticions dels companys. Seran números enters entre 0 i 999999. Quan es detecta un 0
vol dir que ja no hi ha cap sol·licitud més per aquell cas de prova. Com a màxim tindrà 100 sol·licituds

Sortida
Celia no te en compte l’ordre d’arribada de les sol·licituds. La seva intenció és satisfer quantes més sol·licituds,
millor. Això sí, una sol·licitud no es pot quedar a mitjes ... o s’accepta completament, o es rebutja. Per cada cas
de prova, caldrà respondre:

Una sola línia amb un valor que indicarà el número de sol·licituds acceptades (el zero no compta)

1. Llegir el nombre de casos de prova.
2. Repetir el procés per cada cas.
3. Llegir l'import total disponible.
4. Crear un array per guardar les sol·licituds.
5. Llegir les sol·licituds fins a trobar un zero.
6. Ordenar les sol·licituds de menor a major.
7. Inicialitzar l'import gastat i el comptador.
8. Recórrer les sol·licituds ordenades.
9. Comprovar si es pot acceptar cada sol·licitud.
10. Actualitzar l'import gastat i les sol·licituds acceptades.
11. Mostrar el nombre de sol·licituds acceptades.
*/

import java.util.Scanner

fun main() {

    val scan = Scanner(System.`in`)

    val MAX_SOLLICITUDS = 100

    // 1. Llegir el nombre de casos de prova.
    val nombrecasos = scan.nextInt()

    // 2. Repetir el procés per cada cas.
    for (casactual in 1..nombrecasos) {

        // 3. Llegir l'import total disponible.
        val importdisponible = scan.nextInt()

        // 4. Crear un array per guardar les sol·licituds.
        val sollicituds = Array(MAX_SOLLICITUDS) { 0 }
        var quantitatsollicituds = 0

        // 5. Llegir les sol·licituds fins a trobar un zero.
        var sollicitud = scan.nextInt()

        while (sollicitud != 0) {
            sollicituds[quantitatsollicituds] = sollicitud
            quantitatsollicituds++

            sollicitud = scan.nextInt()
        }

        // 6. Ordenar les sol·licituds de menor a major.
        for (index in 0 until quantitatsollicituds) {

            for (seguent in index + 1 until quantitatsollicituds) {

                if (sollicituds[index] > sollicituds[seguent]) {

                    val auxiliar = sollicituds[index]
                    sollicituds[index] = sollicituds[seguent]
                    sollicituds[seguent] = auxiliar
                }
            }
        }

        // 7. Inicialitzar l'import gastat i el comptador.
        var importgastat = 0
        var sollicitudsacceptades = 0

        // 8. Recórrer les sol·licituds ordenades.
        for (index in 0 until quantitatsollicituds) {

            // 9. Comprovar si es pot acceptar la sol·licitud.
            if (importgastat + sollicituds[index] <= importdisponible) {

                // 10. Actualitzar l'import gastat i el comptador.
                importgastat += sollicituds[index]
                sollicitudsacceptades++
            }
        }

        // 11. Mostrar el nombre de sol·licituds acceptades.
        println(sollicitudsacceptades)
    }
}