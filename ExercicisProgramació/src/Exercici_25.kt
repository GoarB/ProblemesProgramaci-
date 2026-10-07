import java.util.Scanner

fun main() {
    // Declarar scanner
    val scan = Scanner(System.`in`)
    //  Demanar una lletra
    print("Escriu una lletra i te la tornaré en majúscula: ")
    val caracter: Char = scan.next().single()
    // Pasar la lletra a majúscula
    val majuscula = caracter.uppercase()
    // Mostrar si es una lletra en valor boolea
    print("La teva lletra es $majuscula")
}