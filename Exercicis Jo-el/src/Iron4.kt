/* En tots els jocs a on hi ha un teclat hi ha un menú per fer varies coses, en que pots seleccionar varies opcions,
* i cada tecla farà una cosa diferent.
*
* bDemana amb Scanner una tecla i fes un switch a on cada opció representi una acció, segons aquesta taula.
* Torna l’opció escollida per pantalla.
* 1. Declarar scanner
* 2. Crear variable de l'entrada del usuari.
* 3. Crear el switch per a cada cas amb el seu retorn corresponent.
* */
import java.util.Scanner

fun main() {
    // Declarar scanner
    val scan = Scanner(System.`in`)
    // 2. Crear variable de l'entrada del usuari.
    val tecla: String = scan.nextLine().uppercase()
    // 3. Crear el switch per a cada cas amb el seu retorn corresponent.
    when (tecla) {
        "Q" -> {
            println("Skill 1")
        }
        "W" -> {
            println("Skill 2")
        }
        "E" -> {
            println("Skill 3")
        }
        "R" -> {
            println("Ultimate")
        }
        "B" -> {
            println("Recall")
        }
        "D" -> {
            println("Bronzes never use summoners")
        }
        "F" -> {
            println("Bronzes never use summoners")
        }
        else -> {
            println("Error")
        }
    }
}