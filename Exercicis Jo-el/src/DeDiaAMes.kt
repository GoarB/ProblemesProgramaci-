import java.util.Scanner

fun main() {
    // Declarar scanner
    val scan = Scanner(System.`in`)
    // Llegir els números
    val r1 = scan.nextInt()
    if (r1 < 32)
        print("1")
    else if (r1 < 60)
        print("2")
    else if (r1 < 91)
        print("3")
    else if (r1 < 121)
        print("4")
    else if (r1 < 151)
        print("5")
    else if (r1 < 182)
        print("6")
    else if (r1 < 213)
        print("7")
    else if (r1 < 244)
        print("8")
    else if (r1 < 274)
        print("9")
    else if (r1 < 305)
        print("10")
    else if (r1 < 335)
        print("11")
    else if (r1 < 366)
        print("12")
}