/*
Barley, el perro ama las golosinas. Al final del día, está feliz o triste, según la cantidad y el tamaño de las
golosinas que recibe a lo largo del día. Las golosinas vienen en tres tamaños: pequeño, mediano y grande. Su
puntuación de felicidad se puede medir con la siguiente fórmula:

1×S+2×M+3×L

donde S es el número de premios pequeños, M es el número de premios medianos y L es el número de premios grandes.

Si la puntuación de felicidad de Barley es 10 o más, entonces está feliz. De lo contrario, está triste. Determina si
Barley está feliz o triste al final del día.

Entrada
Hay tres líneas de entrada. Cada línea contiene un número entero no negativo menor que 10. La primera línea contiene
el número de premios pequeños, S, la segunda línea contiene el número de premios medianos, M, y la tercera línea
contiene el número de premios grandes, L, que La Barley recibe en un día.

Salida
Si la puntuación de felicidad de Barley es 10 o más, imprime happy. De lo contrario, imprime sad.

1. Llegir la quantitat de llaminadures petites.
2. Llegir la quantitat de llaminadures mitjanes.
3. Llegir la quantitat de llaminadures grans.
4. Calcular la puntuació total de felicitat de Barley.
5. Comprovar si la puntuació és igual o superior a 10.
6. Mostrar "happy" si la puntuació és suficient.
7. Mostrar "sad" si la puntuació és inferior a 10.
*/

import java.util.Scanner

fun main() {

    val scan = Scanner(System.`in`)

    // 1. Llegir la quantitat de llaminadures petites.

    val llaminadurespetites = scan.nextInt()

    // 2. Llegir la quantitat de llaminadures mitjanes.

    val llaminaduresmitjanes = scan.nextInt()

    // 3. Llegir la quantitat de llaminadures grans.

    val llaminaduresgrans = scan.nextInt()

    // 4. Calcular la puntuació total de felicitat de Barley.

    val puntuaciofelicitat = llaminadurespetites +
            (llaminaduresmitjanes * 2) +
            (llaminaduresgrans * 3)

    // 5. Comprovar si la puntuació és igual o superior a 10.

    if (puntuaciofelicitat >= 10) {

        // 6. Mostrar "happy" si la puntuació és suficient.

        println("happy")

    } else {

        // 7. Mostrar "sad" si la puntuació és inferior a 10.

        println("sad")
    }
}