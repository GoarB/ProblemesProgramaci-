import java.util.Scanner

fun main() {
    // Declarar scanner
    val scan = Scanner(System.`in`)
    // Demanem la temperatura sense augment
    print("Quina es la temperatura inicial? ")
    val temperatura : Double = scan.nextDouble()
    // Demanem i registrem l'augment de temperatura
    print("Quin es l'augment de la temperatura? ")
    val augment : Double = scan.nextDouble()
    // Calculem la temperatura final
    val temperaturaFinal : Double = temperatura + augment
    // Mostrem la temperatura final
    print("La temperatura amb l'augment es de ${temperaturaFinal}º")
}