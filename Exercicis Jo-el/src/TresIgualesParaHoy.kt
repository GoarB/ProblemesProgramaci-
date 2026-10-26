/*
Es vol saber si, donada una seqüència de 5 números enters, hi ha almenys 3 que siguin iguals.

Entrada
L’entrada comença amb un número indicant la quantitat de casos de prova que vindran a continuació. Cada cas de prova
consisteix en 5 números enters positius entre el 0 i el 99999

Sortida
Com a sortida, per a cada cas de prova, s’escriurà:

Si el cas conté almenys tres números iguals, escriurà el número repetit almenys 3 vegades
Si el cas no conté almenys tres números iguals, escriurà “NO”

1. Declarar Scanner.
2. Crear les variables del numero d'entrades.
3. Crear el bucle en base al numero d'entrades
4. Crear les condicions per a cada resultat i mostrar-ho
 */
import java.util.Scanner

fun main() {
// 1. Declarar scanner
    val scan = Scanner(System.`in`)
// 2. Crear les variables del numero d'entrades.
    var entrades : Int = scan.nextInt()
// 3. Crear el bucle en base al numero d'entrades
    for (i in 1..entrades) {
        val num1 = scan.nextInt()
        val num2 = scan.nextInt()
        val num3 = scan.nextInt()
        val num4 = scan.nextInt()
        val num5 = scan.nextInt()
// 4. Crear les condicions per a cada resultat i mostrar-ho
        if (num1 == num2 && num1 == num3 ||
            num1 == num2 && num1 == num4 ||
            num1 == num2 && num1 == num5 ||
            num1 == num3 && num1 == num4 ||
            num1 == num3 && num1 == num5 ||
            num1 == num4 && num1 == num5) {
            println(num1)
        } else if (num2 == num3 && num2 == num4 ||
            num2 == num3 && num2 == num5 ||
            num2 == num4 && num2 == num5) {
            println(num2)
        } else if (num3 == num4 && num3 == num5) {
            println(num3)
        } else if (num2 == num3 && num2 == num4 && num2 == num5) {
            println(num2)
        } else {
            println("NO")
        }
    }
}