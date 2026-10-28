/*
El abuelo Vedran está viendo su programa de lotería favorito en la televisión con la esperanza de convertirse en
millonario de la noche a la mañana. Las bolas de lotería están girando y rebotando antes de producir el siguiente
sorteo: 2, 5, 7, 11, 19, 23 y 31.

Vedran suspira porque no adivinó ni uno solo de esos números. "Parece que he pasado mi mejor momento ...", pensó
para sí mismo mientras apagaba la vieja televisión. Su visión también está empeorando, por lo que presionó el botón
equivocado en el control remoto y cambió al canal COCI.

El anfitrión, Sr. Malnar, habló con calma: "Estimados espectadores, en el lado izquierdo de la pantalla les mostraré
un número primo A y en el lado derecho de la pantalla les mostraré un número primo B. La primera persona que llame
con un array de números primos que comienzan con A, terminan con B y entre cada dos elementos vecinos el valor
absoluto de su diferencia tambén es prima recibirán un viaje gratis a IOI 2020 en Singapur ".

El viejo Vedran recuerda sus días de gloria como programador competitivo. Desafortunadamente, está oxidado y no
puede resolver el problema. De buen corazón, decides ayudar a Vedran a ganar un viaje a Singapur.

Nota: Un número primo es un número entero positivo mayor que 1 que solo es divisible por 1 y por sí mismo.

Entrada
La primera linea contiene dos números primos A,B(2≤A,B≤1014,A≠B)

Salida
Si la tarea es imposible, simplemente envía −1 en una sola línea.

De lo contrario, en la primera línea muestra el número de elementos en el array y en la segunda línea muestra sus
elementos separados por espacios. El tamaño de la array no debe ser mayor a 30 y sus elementos no deben ser mayores
a 1015. Se garantiza que, si existe una solución, hay al menos una que satisfaga esos límites.

Si hay varias soluciones correctas, imprima cualquiera de ellas.

1. Llegir els dos nombres primers A i B.
2. Crear un array amb els possibles nombres intermedis.
3. Comprovar quins nombres intermedis són primers.
4. Comprovar si A i B es poden connectar amb el nombre 2.
5. Crear un array per guardar la seqüència.
6. Afegir A i connectar-lo amb el nombre 2.
7. Connectar el nombre 2 amb B.
8. Mostrar -1 si no existeix solució.
9. Mostrar la quantitat de nombres i la seqüència si existeix.
*/

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

    // 4. Comprovar si els dos nombres es poden connectar amb 2.
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

            if (!primers[0]) {
                sequencia[quantitat] = a + 2
                quantitat++
            }

            sequencia[quantitat] = 2L
            quantitat++
        }

        // 7. Connectar 2 amb B.
        if (b != 2L) {

            if (!primers[2]) {
                sequencia[quantitat] = b + 2
                quantitat++
            }

            sequencia[quantitat] = b
            quantitat++
        }

        // 9. Mostrar la quantitat i la seqüència.
        println(quantitat)

        for (index in 0 until quantitat) {
            if (index > 0) {
                print(" ")
            }
            print(sequencia[index])
        }

        println()

    } else {

        // 8. Mostrar -1 si no existeix solució.
        println(-1)
    }
}