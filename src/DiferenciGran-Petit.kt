// A vegades a la vida vols saber qui ha guanyat. A vegades qui ha perdut. I a vegades vols veure com de pallissa
// ha estat el resultat.
// 1. Declarar scanner
// 2. Crear les variables de les entrades del usuari
// 3. Crear la variable del resultat de l'operació i fer-la positiva en cas necessari
// 4. Declarar les condicionals i mostrar el resultat

import java.util.Scanner
import kotlin.math.absoluteValue

fun main() {
    // Declarar scanner
    val scan = Scanner(System.`in`)
    // Crear les variables de les entrades del usuari
    val num1 = scan.nextInt()
    val num2 = scan.nextInt()
    //Crear la variable del resultat de l'operació i fer-la positiva en cas necessari
    val resultat = num1 - num2
    // Declarar les condicionals i mostrar el resultat
    println(resultat.absoluteValue)
}