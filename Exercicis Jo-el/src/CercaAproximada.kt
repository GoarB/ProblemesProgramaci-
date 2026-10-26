/*
El Cap d'estudis m'ha cridat l'atenció per les sabates que duc, que estan totalment trencades. He intentat convèncer-lo
de que les sabates trencades son l'evolució lògica dels texans estripats i que per tant vaig a la moda, pero m'ha dit
que em compri unes noves sabates. Jo calço un 42, pero realment un 41 o un 43 ja em van bé.

Entrada
El problema comença amb un nombre N
 que diu quants casos té. Cada cas son 3 línies. La primera té un nombre K
 amb el tamany de l'array de sabates. Després K
 nombres amb la mida de totes les sabates. Tots entre 8 i 60. per últim un nombre M
 amb la meva mida

Sortida
Si hi ha unes sabates a l'array que vagin aproximadament bé. es respondrà "SI", sinó, "NO". Es considera aproximadament
bé quan és igual a M, un menys, o un més.

1. Llegir el numero de casos.
2. Obrir el bucle amb la cuantitat de casos.
3. Llegir el tamany de l'array de sabates.
4. Crear l'array amb el tamany especificat per l'usuari.
5. Omplir l'array amb cada talla de sabata
6. Llegir l'entrada de la talla que utilitza l'usuari
7. Crear els valor per poder llegir la talla amb un marge de + - 1
8. Mostrar la sortida en cas de que es puguin o no utilitzar les sabates del array.
 */

import java.util.Scanner

fun main() {

    val scan = Scanner(System.`in`)

    // Llegir el numero de casos.

    var casos = scan.nextInt()

    // Obrir el bucle amb la cuantitat de casos.

    while (casos > 0) {

        // Llegir el tamany de l'array de sabates.

        val tamany = scan.nextInt()

        // Crear l'array amb el tamany especificat per l'usuari.

        val entrada = IntArray(tamany)

    // Omplir l'array amb cada talla de sabata

        for (i in 0 until tamany) {
        entrada[i] = scan.nextInt()
        }
        // Llegir l'entrada de la talla que utilitza l'usuari

        val talla = scan.nextInt()

        // Crear els valor per poder llegir la talla amb un marge de + - 1

        val tallamenys = talla - 1
        val tallames = talla + 1

        // Mostrar la sortida en cas de que es puguin o no utilitzar les sabates del array.

        if (talla in entrada || tallamenys in entrada || tallames in entrada) {
            println("SI")
        }
        else {
            println("NO")
        }
        casos--
}
}