/*
Abans de començar a fer exercicis d'arrays, comprovem que podem llegir i escriure bé en arrays

Entrada
El problema serà de tres línies. La primera tindrà un nombre, K
 que et dirà el tamany de l'array que has de crear La segona son K
 nombres, separats per espais que et dirà el contingut de l'array que has de llegir. La tercera serà N
, una posició de l'array a on has d'accedir. Es garanteix que N<K
.

Sortida
Tornaràs dues linies. La primera serà l'array sencer escrit, amb espais entre cada caràcter. La segona serà el contingut de l'array a la posició N
 (recorda que la primera posició es 0).

Llegir el tamany de l'array.
Registrar els numeros que conte l'array.
Registrar la posicio desitjada de l'array
Mostrar el array sencer
Mostrar el contingut de l'array a la posicio desitjada

Leer el tamaño del array (K).
Crear el array con K posiciones.
Leer los K números y guardarlos en el array.
Leer la posición N que queremos consultar.
Mostrar todos los elementos separados por espacios.
Mostrar el elemento de la posición N.
*/


import java.util.Scanner

fun main() {

    val scan = Scanner(System.`in`)

    // Leer el tamaño del array.

    val tamany = scan.nextInt()

    // Crear un array de enteros.

    val numeros = IntArray(tamany)

    // Leer y guardar los números.

    for (i in 0 until tamany) {
        numeros[i] = scan.nextInt()
    }

    // Leer la posición N.

    val posicio = scan.nextInt()

    // Mostrar todos los elementos.

    for (i in 0 until tamany) {
        if (i > 0) {
            print(" ")
        }
        print(numeros[i])
    }
    println()

    // Mostrar el elemento de la posición N.

    println(numeros[posicio])
}
