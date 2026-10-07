// Has vist que a dalt a la dreta el jutge et saluda? És una part important del jutge,
// i ara la faras tu.
// 1. Declarem el scanner
// 2. Demanem el nom al usuari
// 3. Imprimim el resultat
import java.util.Scanner

fun main() {
    // Declarar scanner
    val scan = Scanner(System.`in`)
    // Demanar el nom
    val nom = scan.nextLine()
    // Imprimeix el resultat
    print("Benvingut/da, $nom!")
}