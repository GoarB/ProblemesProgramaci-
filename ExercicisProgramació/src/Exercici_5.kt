import java.util.Scanner

fun main() {
    // Declarar scanner
    val scan = Scanner(System.`in`)
    // Demanar el 1r número
    print("Introdueix un número: ")
    val numero1: Int = scan.nextInt()
    // Demanar el 2n número
    print("Introdueix un segón número: ")
    val numero2 : Int = scan.nextInt()
    // Demanar el 3r número
    print("Introdueix un tercer número: ")
    val numero3 : Int = scan.nextInt()
    // Demanar el 4t número
    print("Introdueix un quart número: ")
    val numero4 : Int = scan.nextInt()
    // Sumem els dos primers numeros i els multipliquem pel módul del 3r i quart numero
    val resultat : Int = ((numero1 + numero2) * (numero3 % numero4))
    print("La suma de $numero1 i $numero2 multiplicat pel módul" +
            " de $numero3 i $numero4 es: $resultat")
}