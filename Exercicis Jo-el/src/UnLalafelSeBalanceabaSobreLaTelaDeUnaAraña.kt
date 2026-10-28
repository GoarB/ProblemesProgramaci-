/*
> (problema NO patrocinado por Square Enix)

¿Has oído hablar del famoso MMORPG aclamado por la crítica: FINAL FANTASY XIV? Si es así, enhorabuena, seguro que tu
vida es mejor que la de los que no lo han hecho. Si no es así... ¿A qué esperas?

Sea como sea seguro que SÍ que conoces la famosa cancioncilla que dice: "Un elefante se balanceaba sobre la tela de
una araña..." pues verás, en FINAL FANTASY XIV existe una adorable raza de pequeños humanoides que ¡Adora balancearse!
El problema es que las arañas les aterran, pero como son muy temerarios, si ven una telaraña intentarán balancearse...
Aunque siempre respetando la capacidad de la tela, no queremos ningún accidente.

ENTRADA
La primera linea indica el número de casos de prueba a considerar. Cada caso de prueba consta de dos líneas: la
primera es una secuencia de palabras entre las que aparecerán los términos "Lalafel, Telaranya o Aranya" (Es
importante que utiliceis la -ny- porque java se pone nervioso con la -ñ- ) . La segunda línea es un número N
 que determina la capacidad de las telarañas.

SALIDA
La frase "Hay x telarañas llenas." donde x es el número de telarañas COMPLETAMENTE OCUPADAS. Ten en cuenta que una
telaraña solo quedará ocupada cuando en la secuencia aparezcan tantos Lalafel como los necesarios para ocuparla.
También piensa que NO QUEREMOS ACCIDENTES por lo que siempre que haya una telaraña completa, los Lalafels que no
quepan esperaran a que aparezca otra telaraña. Por último recuerda: LOS LALAFELS ODIAN LAS ARAÑAS Si aparece una
araña en la secuencia, todos los lalafels que estaban balanceándose se irán corriendo y las telas se romperán,
quedando inutilizables.

1. Llegir el nombre de casos de prova.
2. Consumir el salt de línia pendent.
3. Repetir el procés per cada cas de prova.
4. Llegir la seqüència de paraules.
5. Llegir la capacitat de les telaranyes.
6. Separar la seqüència en paraules eliminant les comes.
7. Crear variables per controlar Lalafels esperant, Lalafels balancejant-se i telaranyes disponibles.
8. Recórrer totes les paraules de la seqüència.
9. Si apareix un Lalafel, posar-lo en una telaranya si hi ha espai o deixar-lo esperant.
10. Si apareix una Telaranya, afegir-la i col·locar-hi els Lalafels que estaven esperant.
11. Si apareix una Aranya, eliminar les telaranyes i els Lalafels que estaven balancejant-se.
12. Calcular quantes telaranyes estan completament plenes.
13. Mostrar el resultat.

1. Llegir el nombre de casos de prova.
2. Consumir el salt de línia pendent.
3. Repetir el procés per cada cas de prova.
4. Llegir la seqüència completa.
5. Llegir la capacitat de les telaranyes.
6. Convertir la seqüència a minúscules i separar-la en paraules.
7. Crear comptadors per als Lalafels i les telaranyes.
8. Recórrer totes les paraules de la seqüència.
9. Comptar cada Lalafel que aparegui.
10. Comptar cada Telaranya que aparegui.
11. Si apareix una Aranya, eliminar tots els Lalafels i telaranyes acumulats fins aquell moment.
12. Continuar processant les paraules que apareguin després de l'Aranya.
13. Calcular quantes telaranyes poden quedar completament plenes.
14. Mostrar el resultat.
*/

import java.util.Scanner

fun main() {

    val scan = Scanner(System.`in`)

    val LALAFEL = "lalafel"
    val TELARANYA = "telaranya"
    val ARANYA = "aranya"

    // 1. Llegir el nombre de casos de prova.
    val nombrecasos = scan.nextInt()

    // 2. Consumir el salt de línia pendent.
    scan.nextLine()

    // 3. Repetir el procés per cada cas de prova.
    for (casactual in 1..nombrecasos) {

        // 4. Llegir la seqüència completa.
        val sequencia = scan.nextLine()

        // 5. Llegir la capacitat de les telaranyes.
        val capacitat = scan.nextInt()
        scan.nextLine()

        // 6. Convertir la seqüència a minúscules i separar-la en paraules.
        val paraules = sequencia.lowercase().replace(",", "").split(" ")

        // 7. Crear comptadors per als Lalafels i les telaranyes.
        var nombrelalafels = 0
        var nombretelaranyes = 0

        // 8. Recórrer totes les paraules de la seqüència.
        for (paraulaactual in paraules) {

            // 9. Comptar cada Lalafel que aparegui.
            if (paraulaactual == LALAFEL) {
                nombrelalafels++

            // 10. Comptar cada Telaranya que aparegui.
            } else if (paraulaactual == TELARANYA) {
                nombretelaranyes++

            // 11. Si apareix una Aranya, eliminar tot el que hi havia acumulat fins aquell moment.
            } else if (paraulaactual == ARANYA) {
                nombrelalafels = 0
                nombretelaranyes = 0
            }

            // 12. El bucle continua processant les paraules que hi hagi després de l'Aranya.
        }

        var telaranyesplenes = 0

        // 13. Calcular quantes telaranyes poden quedar completament plenes.
        if (capacitat > 0) {

            val grupslalafels = nombrelalafels / capacitat

            if (grupslalafels < nombretelaranyes) {
                telaranyesplenes = grupslalafels
            } else {
                telaranyesplenes = nombretelaranyes
            }
        }

        // 14. Mostrar el resultat.
        println("Hay $telaranyesplenes telaranyas llenas.")
    }
}