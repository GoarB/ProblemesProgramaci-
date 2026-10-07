import java.awt.desktop.PrintFilesEvent
import java.util.Scanner

fun main() {
    // Declarar scanner
    val scan = Scanner(System.`in`)
    print("Escriu el preu original del producte: ")
    val preuInicial : Double = scan.nextDouble()
    print("Escriu el preu final del producte: ")
    val preuFinal : Double = scan.nextDouble()
    val descompte : Double = 100 - (preuFinal / preuInicial * 100)
    println("El descompte del producte es del $descompte%!")

}