/*
Un cop la meva opinió sobre els arrays ha quedat clara, anem a canviar una mica. Modificarem l'array abans d'escriure'l. Això significa que primer hauras de fer un bucle per llegir l'array, i després un altre bucle per modificar-ho. No pots fer-ho només amb un sol bucle. Sad.

Entrada
El problema serà de tres línies. La primera tindrà un nombre, K
que et dirà el tamany de l'array que has de crear La segona son K
nombres, separats per espais que et dirà el contingut de l'array que has de llegir. La tercera serà N,
un valor a sumar a tots els elements de l'array

Sortida
Tornaràs l'array sencer escrit, amb espais entre cada caràcter, després d'haver sumat N
a cada posició.

1. Llegir el tamany de l'array.
2. Obrir un bucle dins del bucle per tal de registrar tots els numeros introduits per l'usuari.
3. Crear el valor que registri el numero a sumar a cada numero de l'array.
4. Mostrar el contingut de l'array.
*/

import java.util.Scanner

fun main() {

    val scan = Scanner(System.`in`)

    // Llegir el tamany de l'array.

    var tamany = scan.nextInt()

    // Obrir un bucle dins del bucle per tal de registrar tots els numeros introduits per l'usuari.

    val entrada = IntArray(tamany)
    for (i in 0 until tamany) {
        entrada[i] = scan.nextInt()
    }
    // Crear el valor que registri el numero a sumar a cada numero de l'array.

    val suma = scan.nextInt()
    for (i in 0 until tamany) {
        entrada[i] += suma
    }
    // Mostrar el contingut de l'array.
    repeat(entrada.size) {
        println(entrada[it])
    }
}