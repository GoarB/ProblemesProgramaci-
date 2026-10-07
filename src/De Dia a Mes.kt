// Se't dona un número i has de dir el mes al que pertany si es comencés a
// comptar des de l'1 de gener.
// 1. Declarar variables de cada mes
// 2. Declarar scanner
// 3. Llegir números d'entrada
// 4.  Crear les condicionals
import java.util.Scanner
// Declarar les variables
val Gen = 32
val Feb = 60
val Mar = 91
val Abr = 121
val Mai = 151
val Jun = 182
val Jul = 213
val Ago = 244
val Sep = 274
val Oct = 305
val Nov = 335
val Des = 366
// Declarar scanner
fun main() {
    val scan = Scanner(System.`in`)
    // Llegir els números
    val r1 = scan.nextInt()
    // Crear les condicionals
    if (r1 < Gen)
        println("1")
    else if (r1 < Feb)
        println("2")
    else if (r1 < Mar)
        println("3")
    else if (r1 < Abr)
        println("4")
    else if (r1 < Mai)
        println("5")
    else if (r1 < Jun)
        println("6")
    else if (r1 < Jul)
        println("7")
    else if (r1 < Ago)
        println("8")
    else if (r1 < Sep)
        println("9")
    else if (r1 < Oct)
        println("10")
    else if (r1 < Nov)
        println("11")
    else if (r1 < Des)
        println("12")
}