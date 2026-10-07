import java.util.Scanner
import javax.lang.model.type.NoType

fun main() {
    // Declarar scanner
    val scan = Scanner(System.`in`)
    //  Demanar un valor boolea
    print("Dona un valor boolea (true/false): ")
    val boolea = scan.nextBoolean()
    val resultat = !boolea
    // Mostrar el contrari al valor donat
    print("El contrari es $resultat")
}