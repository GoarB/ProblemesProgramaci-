/*
Àlex té un patinet. A vegades puja les escales amb el patinet, però el seu patinet és massa gran i colpeja a un
altre alumne quan calcula malament les distàncies. Però no importa, perquè té segur a tercers

Entrada
Cada cas té tres nombres, C1
 és la distància en cm desde Alex a la paret, C2
 la distància en cm de l'altre alumne a la paret, i C3
 la llargària del patinet. Alex agafa el patinet sempre d'un extrem

Sortida
Per cada cas es dira "OK" si el patinet no colpeja a l'altre alumne, i "SEGURO" si Àlex ha de fer ús del seu
segur a tercers

1. Crear les variables de cada mesura.
2. Crear la variable de el total de cm que queden lliures en base a les tres mesures.
3. Crear les condicions que mostren si pasa o no el patinet.

 */
import java.util.Scanner
import java.util.Locale

fun main() {
    val scan = Scanner(System.`in`).useLocale(Locale.US)
//1. Crear les variables de cada mesura i del minim pero chocar.
    val cmalex : Double = scan.nextDouble()
    val cmalumne : Double = scan.nextDouble()
    val patinet : Double = scan.nextDouble()
    val accident = 0.0
//3. Crear les condicions que mostren si pasa o no el patinet.
    if (cmalex < cmalumne) {
        if (cmalex + patinet >= cmalumne) {
            print("SEGURO")
        }
        else println("OK")
    }
    else if (cmalex > cmalumne) {
        if (cmalex - patinet <= cmalumne) {
            print("SEGURO")
        }
        else println("OK")
    }
    else if (cmalex == cmalumne) {
        print("SEGURO")
    }
}