import java.util.Scanner

fun main() {
    // Declarar scanner
    val scan = Scanner(System.`in`)
    // Demanen el diametre de la pizza
    print("Diguem el diametre de la pizza e cm i et diré la seva superfície: ")
    val diametre : Double = scan.nextDouble()
    // Calculem el perimetre i donem el resultat
     val resultat  = Math.PI * ((diametre / 2) * (diametre / 2))
    println("El perímetre de la pizza es ${resultat}cm")
}