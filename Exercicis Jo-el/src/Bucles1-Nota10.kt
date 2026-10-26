/*
Acaben de fer un examen i ha anat excepcionalment bé. El professor es pregunta quants de vosaltres heu tret un 10. El podeu ajudar?

Entrada
L'entrada consta d'una seqüencia de números corresponents a les notes obtingudes. La última nota és -1 i no s'ha de processar.

Sortida
Es mostrarà un missatge indicant el nombre total de notes correctes llegides i el nombre total de notes 10. Una nota és vàlida si es troba entre 0 i 10.

El format del missatge de sortida serà el següent:

    TOTAL NOTES: xxx NOTES10: xxx

1. Declarar Scanner
2. Crear les varibles de l'entrada de l'usuari i les variables "0" per tal de comptar el numero de notes donades
i el numero de 10 en total.
3. Crear el bucle per comptar notes i 10.
4. Mostrar el resultat.

*/

import java.util.Scanner

fun main() {
    // Declarar scanner
    val scan = Scanner(System.`in`)
    // 2. Crear les varibles de l'entrada de l'usuari i les variables "0" per tal de comptar el numero de notes donades
    // i el numero de 10 en total.
    var notestotals : Int = 0
    var deustotals : Int = 0
    var entrada = scan.nextInt()
    // 3. Crear el bucle per comptar notes i 10.
    while (entrada != -1) {
        if (entrada == 10) {
            notestotals += 1
            deustotals += 1}
        else if (entrada in 0..10) {
            notestotals += 1
        }
        entrada = scan.nextInt()
    }
    // 4. Mostrar el resultat.
    println("TOTAL NOTES: $notestotals NOTES10: $deustotals")
}