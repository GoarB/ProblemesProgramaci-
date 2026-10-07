import java.util.Scanner

fun main() {
    // Declarar scanner
    val scan = Scanner(System.`in`)
    // Demanem el numero de segons
    print("Escriu un numero de segons i els pasaré a hores, minuts i segons: ")
    val valor = scan.nextInt()
    // Calculem el número d'hores, segons minuts
    val segons = (valor + 0)  % 60
    val minuts = (valor / 60) % 60
    val hores = (valor / 3600) % 60
    print("Aixó son {$hores}h, {$minuts}m i{$segons}s!")
}
