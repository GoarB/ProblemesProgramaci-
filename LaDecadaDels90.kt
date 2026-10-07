/** La millor dècada és la dels 90. La gent que no hagi nascut als 90... pobres. De fet, totes les dècades dels 90
 * son bones. 1890 va ser una bona decada i 2090 també ho serà.
 *
 * Entrada:
 *Cada cas de prova consistira en un nombre, que representarà un any 0<N<10000
 *
 * Sortida:
 * Per cada cas de prova s'ha de dir SI si acaba amb nombres del 90 al 99 i NO en cas contrari
 *
 * 1. Declarar scanner.
 * 2. Crear les variables de les franjes d'any.
 * 3. Crear les variables de l'entrada de l'usuari.
 * 4. Crear les condicions per les cuals mostrem SI o NO i mostrar el resultat.
 * */

import java.util.Scanner

fun main() {
    // Declarar scanner
    val scan = Scanner(System.`in`)
    // 2. Crear les variables de les franjes d'any.
    val ANYS_POSSIBLES : IntRange = 0..10000
    val ANYS_VALIDS : IntRange = 90..99

    // 3. Crear les variables de l'entrada de l'usuari.
    val numero : Int = scan.nextLine().toInt()
    // 4. Crear les condicions per les cuals mostrem SI o NO i mostrar el resultat.
    if (numero in ANYS_POSSIBLES) {
        if (numero % 100 in ANYS_VALIDS) {
        println("SI")}
        else (println("NO"))
    }
    else (println("Aprén a llegir!"))
}