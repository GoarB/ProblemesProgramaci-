/*
El departament d'ensenyament ha dit que hem de baixar la ràtio d'alumnes. Per a aconseguir-ho, farem una loteria i tirarem a un pou amb caimans a aquells que la guanyin.

Entrada
La primera línia indica els casos de prova a considerar Cada cas conté tres linies. La primera té un nombre K
. La segona conté K
 noms d'una sola paraula. La tercera conté un nombre P

Sortida
Per cada cas de prova es vol retornar tota la llista de nombres propocionada, pero sense l'alumne que era a la posició
P. Aquest està amb els caimans. Es considera que la primera posició és 0.

1. Registrar el numero de casos.
2. Registrar el nombre d'alumnes.
3. Registrar el nom dels alumnes.
4. Registrar quin alumne cau amb els caimans.
5. Mostrar els alumnes restants.
 */

import java.util.Scanner

fun main() {

    val scan = Scanner(System.`in`)

//1. Registrar el numero de casos.
    var casos = scan.nextInt()
    while(casos > 0) {

//2. Registrar el nombre d'alumnes.
        var mida = scan.nextInt()
        val llista = MutableList(mida) {""}

//3. Registrar el nom dels alumnes.
        for (i in 0 until mida) {
            llista[i] = scan.next()
        }

//4. Registrar quin alumne cau amb els caimans.
    val cau = scan.nextInt()
        llista.remove(llista[cau])
//5. Mostrar els alumnes restants.
for (i in llista.indices) {
   print(llista[i] + " ")
}
        casos--
    }
}
