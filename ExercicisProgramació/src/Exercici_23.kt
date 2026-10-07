import java.util.Scanner

fun main() {
    // Declarar scanner
    val scan = Scanner(System.`in`)
    //  Demanar un caràcter
    print("Escriu un caràcter i et diré si es una lletra: ")
    val caracter: Char = scan.next().single()
    // Comprobar si es una lletra
    val resultat: Boolean = caracter.isLetter()
    // Mostrar si es una lletra en valor boolea
    print("Es $resultat que sigui una lletra")
}