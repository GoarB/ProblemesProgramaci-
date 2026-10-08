// Un Institut amb mètodes d'educació moderns va intentar fer que els alumnes es posessin les notes del
// butlletí ells mateixos. No va funcionar.
// 1. Declarar scanner
// 2. Creem les variables per a cada resultat.
// 3. Crear les condicions per cada resultat i mostrar-ho.
import java.util.Scanner

fun main() {
    // Declarar scanner
    val scan = Scanner(System.`in`)
    // Crear les variables dels examens parcials i les pràctiques.
    val NOTA : Int = scan.nextInt()
    // Creem les variables per a cada resultat.
    val EXCELENT = 9
    val NOTABLE = 7
    val aprobat = 5
    val SUSPES = 4
    // Crear les condicions per cada resultat i mostrar-ho.
    if (NOTA >= EXCELENT) {
        print("Excelent")
    }
    else if (NOTA >= NOTABLE) {
        print("Notable")
    }
    else if (NOTA >= aprobat) {
        print("Aprovat")
    }
    else if(NOTA <= SUSPES) {
        print("Suspes")
    }
}