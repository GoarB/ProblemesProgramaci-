import java.util.Scanner

fun main() {
    // Declarar scanner
    val scan = Scanner(System.`in`)
    // Demanem el numero de començals
    print("Escriu el numero de començals del sopar: ")
    val gent : Int = scan.nextInt()
    // Demanem l'import del sopar
    print("Quant ha costat el sopar? ")
    val compte : Double = scan.nextDouble()
    // Calculem l'import per persona
    val resultat : Double = compte / gent
    // Mostrem el resultat
    println("El preu per cap es de ${resultat}€ per persona")
}