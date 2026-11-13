/*
L'altre dia vaig anar al Mercadona a comprar vodka Knebep. I una dona se'm va colar!!!! Intolerable.

Entrada
La primera línia indica els casos de prova a considerar Cada cas conté tres linies. La primera té un nombre K
. La segona conté K
 nombres del 0 al 100. La tercera conté dos nombres C,P

Sortida
Per cada cas de prova es vol retornar tota la llista de nombres propocionada, pero amb l'element C
 que s'ha colat a la posició P
 Es considera que la primera posició és 0.

1. Registrar els casos prova.
2. Registrar la quantitat de entrades que entrarà l'usuari.
3. Registrar les entrades de la llista del 0 al 100.
4. Regitrar el nombre a afegir i la posicio on afegir-lo.
5. Mostrar el contingut de la llista.
 */

import java.util.Scanner

fun main() {

    val scan = Scanner(System.`in`)

//    1. Registrar els casos prova.
    var casos = scan.nextInt()
    while (casos > 0) {

//    2. Registrar la quantitat de entrades que entrarà l'usuari.
        val mida = scan.nextInt()
        val llista = MutableList(mida) {0}
        scan.nextLine()

//    3. Registrar les entrades de la llista del 0 al 100.
    for (numero in 0 until mida){
        llista[numero] = scan.nextInt()
    }

//    4. Regitrar el nombre a afegir i la posicio on afegir-lo.
        val nounumero = scan.nextInt()
        val posicio = scan.nextInt()
        llista.add(posicio,nounumero)

//    5. Mostrar el contingut de la llista.
        for (numero in llista.indices){
            print("${llista[numero]} ")
        }
        casos--
    }
}