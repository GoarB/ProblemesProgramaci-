// Saps que cobro el mateix els Febrers que son de 29 dies que no els de 28 dies? Fes-te funcionari, deien.
// Serà divertit, deien.
//Ah sí. Els anys de traspàs son aquells divisibles entre 4. A no ser que siguin divisibles entre 100, que aleshores
// no ho són. Però si ho són entre 400 llavors sí que ho són.
// 1. Declarar scanner
// 2. Llegir l'entrada i crear la variable
// 3. Crear les variables del resultat
// 4. Crear les variables del resultat

import java.util.Scanner

fun main() {
    // Declarar scanner
    val scan = Scanner(System.`in`)
    // Llegir l'entrada i crear la variable
    val num = scan.nextInt()
    // Crear les variables del resultat
    val cuatre = num % 4
    val cuatrecents = num % 400
    val cent = num % 100
    // Crear les variables del resultat
    if (cent == 0 && cuatrecents != 0 ) {
        print("NO")
    }
    else if (cuatre == 0) {
        print("SI")
    }
    else (print("NO"))
}