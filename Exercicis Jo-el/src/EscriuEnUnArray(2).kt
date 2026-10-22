/*
Ja saps escriure arrays d'enters. Ara escriurem arrays de Strings.

Entrada
El problema serà de múltiples línies. La primera tindrà un nombre, K que et dirà el tamany de l'array que has de crear
després vindran K línies, tantes com el tamany de l'array, amb una String cadascuna L'última serà N, una posició de
l'array a on has d'accedir. Es garanteix que N<K.

Sortida
Tornaràs K+1 linies. Primer serà l'array sencer escrit, amb salt de línea entre cada string. La segona serà el
contingut de l'array a la posició N (recorda que la primera posició es 0).


*/
import java.util.Scanner

fun main() {

    val scan = Scanner(System.`in`)

    // Llegir el tamany del array.

    val tamany = scan.nextInt()

    // Crear un array de string.

    var paraules = Array<String> (tamany) {""}

    // Omplir el array amb cada paraula.

    for (i in 0 until tamany) {
        paraules[i] = scan.nextLine()
    }

    // Registrar la posició desitjada a mostrar.

    val posicio = scan.nextInt()
    
}