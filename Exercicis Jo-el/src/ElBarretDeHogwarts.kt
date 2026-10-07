import java.util.Scanner

fun main() {
    // Declarar scanner
    val scan = Scanner(System.`in`)
    // Llegir els números
    val r1 = scan.nextLine()
    if (r1 == "Coratge")
        print("Gryffindor")
    else if (r1 == "Coneixement")
        print("Ravenclaw")
    else if (r1 == "Ambicio")
        print("Slytherin")
    else print("Hufflepuff")
}