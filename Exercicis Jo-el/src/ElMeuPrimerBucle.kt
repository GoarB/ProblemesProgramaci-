/* Per què preferiu fer exercicis d'ifs d'un punt? Els de bucles en donen dos!
*
* Entrada
* La primera línia indica els casos de prova a considerar. Cada cas és una línia amb un nombre.
*
* Sortida
* Per cada cas de prova caldrà respondre: El nombre introduït més un.
*
* 1. Declarar Scanner
* 2. Crear la variable de la quantitat de números que s'introduiran.
* 3. Crear el bucle per el cual cada numero que introdueix l'usuari se li sumi 1 i mostrar el resultat.
*
* */


import java.util.Scanner

fun main() {
    // Declarar scanner
    val scan = Scanner(System.`in`)
    // Crear la variable de la quantitat de números que s'introduiran.
    var numentrades : Int = scan.nextInt()
    // Crear el bucle per el cual cada numero que introdueix l'usuari se li sumi 1 i mostrar el resultat.
    while (numentrades > 0){
        val entrada = scan.nextInt()
        println(entrada + 1)
        numentrades -= 1
    }

}