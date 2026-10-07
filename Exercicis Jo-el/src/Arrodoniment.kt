// A Grau Superior les notes s'han de posar com un nombre enter, així que per un dia podras
// disfrutar del plaer de posar un 7 a l'home amb un 7.49 a l'examen
// 1. Declarar scanner
// 2. Llegir l'entrada numérica
// 3. Mostrar el resultat en número enter
import java.util.Scanner

fun main() {
    // Declarar scanner
    val scan = Scanner(System.`in`)
    // Llegir el número
    val num = scan.nextDouble()
    // Declarar les variables
    val entero = num.toInt()
    val decimal = num - entero
    // Crear la condicional i mostrar el resultat
    if (decimal >= 0.5) {
        println(entero + 1)
    } else {
          println(entero)
    }
}