/*
Francesco Virgolini, el cotxe més veloç de tutti l'Italia, ha avançat a un altre cotxe en la copa del mon.

Entrada
La primera línia indica els casos de prova a considerar Cada cas compta amb un nombre variable de línies. La primera
líniea té un enter, K, que indica quants cotxes hi ha a la cursa, i després vindràn K línies, cadascuna amb el nom
d'un cotxe. Es garanteix que un dels cotxes es dira "Francesco Virgolini", i mai serà el primer.

Sortida
Per cada cas de prova es vol retornar la llista amb Francesco Virgolini havent adelantat una posició,
en format estàndard de llista.

1. Registrar el nùmero de casos.
2. Registrar el nùmero de cotxes que participen en la cursa.
3. Registrar els noms del cotxe.
4. Trobar la casella on es troba Francesco Vergolini.
5. Avançar la posició de Vergolini en 1.
6. Mostrar el resultat després del canvi.
*/


import java.util.Scanner

fun main() {

    val scan = Scanner(System.`in`)

//1. Registrar el nùmero de casos.
    var casos = scan.nextInt()
    while(casos > 0) {

//2. Registrar el nùmero de cotxes que participen en la cursa.
        val quantcotxes = scan.nextInt()
        val llista = Array(quantcotxes) {""}

        scan.nextLine()
//3. Registrar els noms del cotxe.
        for (i in llista.indices) {
            llista[i] = scan.nextLine()
        }

//4. Trobar la casella on es troba Francesco Vergolini.
        for (i in 0 until quantcotxes) {
            if (llista[i] == "Francesco Virgolini") {

//5. Avançar la posició de Vergolini en 1.
                llista[i] = llista[i-1]

                llista[i-1] = "Francesco Virgolini"
            }
        }

//6. Mostrar el resultat després del canvi.
        println(llista.contentToString())
        casos--
    }
}