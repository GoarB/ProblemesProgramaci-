import java.util.Scanner

fun main() {
    // Declarar scanner
    val scan = Scanner(System.`in`)
    //  Demanar una lletra
    print("Escriu una lletra en majúscula i te la tornaré en minúscula: ")
    val caracter: Char = scan.next().single()
    // Pasar la lletra a minúscula
    val minuscula = caracter.lowercase()
    // Mostrar si es una lletra en valor boolea
    print("La teva lletra es $minuscula")
}