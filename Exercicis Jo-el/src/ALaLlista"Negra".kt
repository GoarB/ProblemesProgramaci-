/*
L'Albert és un noi molt aficionat als videojocs. A vegades, no es pot contenir i acaba jugant quan hi ha classe online.
Com que és un noi orgullós, no desactiva la "Game Ativity" al Discord, ja que confia en que ningú es dona compte. El
Marc, però, sol fixar-se en el que juguen els seus alumnes, però no l'importa si juguen o no, el que sí que fa és
jutjar, com aquesta pàgina et jutja a tú. Si et pilla jugant algo que no accepta durant la classe, et posa a la
Shitlist. Fes un programa per simular la ocasional vigilància del Marc per saber quin nivell de Shitlist li cauria a
l'Albert a un dia qualsevol.

Entrada
La primera línea serà un nombre que diu quants casos de prova hi ha. Cada cas constarà de tres línies. A la primera,
passarem la llista del que fa l'Albert a cada hora de de classe (6 hores, de 15 a 21), ja sigui el joc al que juga,
o fer Eclipse. Després, direm un nombre N que representarà el nombre de cops que el Marc s'hi fixa en el que fa,
seguit de N nombres, que seran les hores en les que mira (de 15 a 20). Si en algun dels moments de vigilància del
Marc, enxampa a l'Albert fent algo que no sigui Eclipse, el jutjarà. Si no està jugant a "HollowKnight", "DarkSouls"
o "Zelda" li otorgarà un nivell de Shitlist. Si a més està jugant al "LoL", seran 2 nivells.

Sortida
La sortida serà el nivell de Shitlist de l'Albert, en el format: ["Nivell de Shitlist: "+nivellShitlist]

1. Registrar el nùmero de casos de prova.
2. Registrar el horari del que fa l'Albert tenint en compte que l'horari te 6 hores.
3. Registrar les vegades i l'hora o hores en les que el Marc es fixa en el que fa l'Albert.
4. Per cada hora en que el Marc es fixi en el que fa l'Albert i estigui jugant ho registrarem.
5. Afegir a la llista les vegades que no esta estudiant excepte si esta jugant a certs jocs.
6. Si juga al LOL, li compta dues vegades (obviament).
7. Mostrar el nivell de Shitlist.
*/
import java.util.Scanner

fun main() {

    val scan = Scanner(System.`in`)

//1. Registrar el nùmero de casos de prova.
    val HORES = arrayOf(15, 16, 17, 18, 19, 20)
    val HORARI = 6
    val JOCSBONS = arrayOf("HollowKnight", "DarkSouls", "Zelda")
    val ELDIMONI = "LoL"
    var casos = scan.nextInt()
    while (casos > 0) {

//2. Registrar el horari del que fa l'Albert tenint en compte que l'horari te 6 hores.
        val horari = Array(HORARI) {""}
        scan.nextLine()
        for (i in horari.indices) {
            horari[i] = scan.next()
        }

//3. Registrar les vegades i l'hora o hores en les que el Marc es fixa en el que fa l'Albert.
        val MARCMIRA = scan.nextInt()

//4. Per cada hora en que el Marc es fixi en el que fa l'Albert i estigui jugant ho registrarem.


//5. Afegir a la llista les vegades que no esta estudiant excepte si esta jugant a certs jocs.


//6. Si juga al LOL, li compta dues vegades (obviament).


//7. Mostrar el nivell de Shitlist.


        casos--
    }
}