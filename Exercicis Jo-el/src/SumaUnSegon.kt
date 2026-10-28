/* Un segon és molt important, com veuràs en aquest problema que et farà perdre més d'un segon

Entrada
Cada cas és de tres línies, i conté un número per línia H,M,S,
que representen respectivament hores, minuts i segons. L'hora sempre serà una hora correcta i no cal validar-la.
S'entén que les hores van en format 0-23

Sortida
Per cada cas es dirà, en una sola línia, les hores, minuts i segons, si s'augmentés un segon a l'hora proporcionada.
No cal posar zeros a l'esquerra
1. Importar scanner.
2. Crear les variables de la franja d'hores, minuts i segons.
3. Crear les variables de les entrades de l'usuari i els segons +1.
4. Crear les condicionals i mostrar el resultat.
*/

import java.util.Scanner

fun main() {
    // Importar scanner.
    val scan = Scanner(System.`in`)
    // Crear les variables de la franja de hores, minuts i segons.
    val FRANJAHORES : IntRange = 0..23
    val FRANJAMINUTS : IntRange = 0..59
    val FRANJASEGONS : IntRange = 0..59
    // Crear les variables de les entrades del usuari i els segons + 1.
    var hores = scan.nextLine().toInt()
    var minuts = scan.nextLine().toInt()
    val segons : Int = scan.nextLine().toInt()
    var segonstotal = segons + 1
    // Crear les condicionals i mostrar el resultat.
    if (segonstotal !in FRANJASEGONS) {
        minuts += 1
        segonstotal -= segons + 1
        if (minuts !in FRANJAMINUTS) {
            hores += 1
            minuts -= 60
            if (hores !in FRANJAHORES) {
                hores -= 24
            }
        }
    }

    println("$hores $minuts $segonstotal")
}