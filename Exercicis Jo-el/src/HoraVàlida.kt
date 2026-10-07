// A vegades tens un professor graciós que et posa una entrega per les 34 i mitja, o les 12:89.
// Fes un programa que li faci pagar per els seus crims.
// 1. Importar scanner
// 2. Crear les variables de la franja de hores, minuts i segons
// 3. Crear les variables de les entrades del usuari
// 4. Crear les condicionals i mostrar el resultat
import java.util.Scanner

fun main() {
    // Declarar scanner
    val scan = Scanner(System.`in`)
// 2. Crear les variables de la franja de hores, minuts i segons
    val FRANJAHORES : IntRange = 0..23
    val FRANJAMINUTS : IntRange = 0..59
    val FRANJASEGONS : IntRange = 0..59
// 3. Crear les variables de les entrades del usuari
    val hores = scan.nextLine().toInt()
    val minuts = scan.nextLine().toInt()
    val segons = scan.nextLine().toInt()
// 4. Crear les condicionals i mostrar el resultat
    if (hores in FRANJAHORES && minuts in FRANJAMINUTS && segons in FRANJASEGONS) {
        println("SI")
    }
    else
        println("NO")
}