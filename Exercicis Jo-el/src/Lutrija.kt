
import java.util.Scanner

fun main() {

    val scan = Scanner(System.`in`)

    val a = scan.nextLong()
    val b = scan.nextLong()

    // 1 i 2. Crear els possibles nombres intermedis.
    val candidats = arrayOf(a - 2, a + 2, b - 2, b + 2)

    // 3. Comprovar quins candidats són primers.
    val primers = Array(4) { true }

    for (index in 0 until candidats.size) {

        val numero = candidats[index]

        if (numero < 2) {
            primers[index] = false

        } else if (numero > 2 && numero % 2L == 0L) {
            primers[index] = false

        } else {

            var divisor = 3L

            while (divisor <= numero / divisor && primers[index]) {

                if (numero % divisor == 0L) {
                    primers[index] = false
                }

                divisor += 2
            }
        }
    }

    // 4. Comprovar si A i B es poden connectar amb 2.
    var possible = true

    if (a != 2L && !primers[0] && !primers[1]) {
        possible = false
    }

    if (b != 2L && !primers[2] && !primers[3]) {
        possible = false
    }

    // 5. Crear un array per guardar la seqüència.
    val sequencia = Array(5) { 0L }
    var quantitat = 0

    if (possible) {

        // 6. Afegir A i connectar-lo amb 2.
        sequencia[quantitat] = a
        quantitat++

        if (a != 2L) {

            if (primers[0]) {
                // A - 2 és primer: connexió directa.
                sequencia[quantitat] = 2L
                quantitat++

            } else {
                // A + 2 és primer: utilitzem un intermediari.
                sequencia[quantitat] = a + 2
                quantitat++

                sequencia[quantitat] = 2L
                quantitat++
            }
        }

        // 7. Connectar 2 amb B.
        if (b != 2L) {

            if (primers[2]) {
                // B - 2 és primer: connexió directa.
                sequencia[quantitat] = b
                quantitat++

            } else {
                // B + 2 és primer: utilitzem un intermediari.
                sequencia[quantitat] = b + 2
                quantitat++

                sequencia[quantitat] = b
                quantitat++
            }
        }

        // 8. Mostrar la quantitat i la seqüència.
        println(quantitat)

        for (index in 0 until quantitat) {
            if (index > 0) {
                print(" ")
            }

            print(sequencia[index])
        }

        println()

    } else {

        // 9. Mostrar -1 si no existeix solució.
        println(-1)
    }
}
