import java.util.Scanner

fun main() {
    // Declarar scanner
    val scan = Scanner(System.`in`)
    //  Demanar una lletra
    print("Escriu una lletra majúscula: ")
    val majuscula = scan.next().single().lowercase()
    // Demanar una segona lletra
    print("Escriu una lletra minúscula i et diré si es la mateixa lletra que la primera: ")
    val minuscula = scan.next().single().lowercase()
    // Mostrar si són iguals en valor boolea
    val resultat = majuscula == minuscula
    print("Es $resultat que son la mateixa lletra")
}