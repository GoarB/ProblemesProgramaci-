/*
El juny de 2017, després de donar servei durant 61 anys, tancava l'escola pública més antiga del districte de Nou
Barris a Barcelona.

Es deia Sant Josep Oriol i va començar a funcionar el 1956. Neixia juntament amb l'aparició dels nous barris perifèrics
de Barcelona i va ser una de les primeres escoles de tot Catalunya en agafar l'immersió lingüística quan encara no
estava ni aprovada. Als inicis de la dècada dels 80 venien autocars amb escolars de tot Barcelona. El curs següent els
alumnes anirien al nou Institut Escola Trinitat Nova.

Un any més tard, el 2018, a les rehabilitades instal·lacions que havia deixat l'escola Sant Josep Oriol, neixia
l'Institut Tecnològic de Barcelona. Amb 170 alumnes de cicles formatius de la família d'Informàtica arrencava amb
la voluntat d'arribar fins als 550 alumnes oferint cicles novedosos com el DAM especialitzat en videojocs o el ASIX
especialitzat en ciberseguretat.

Els següents anys va experimentar un creixement molt gran i ja el 2021 es fregaven els 800 estudiants.

El 2023, coincidint amb la meva arribada al centre, l'institut va ser nomenat centre de la xarxa d'excel·lència de
l'Estat del sector de les Tecnologies de la Informació. Aquests centres es caracteritzen per la innovació, la
investigació aplicada i la incorporació de tecnologia disruptiva aplicada creant entorns i ecosistemes, i
desenvolupant projectes, l’emprenedoria i la internacionalització.

La teva tasca és, donat un curs, dir en quin centre es va poder cursar, si a l'escola Sant Josep Oriol o ja a
l'Institut Tecnològic de Barcelona. Però vigila que hi ha cursos que no es va poder fer classe a cap dels dos
instituts i no va ser per la pandèmia!

1. Llegir l'any inicial del curs.
2. Llegir el guió que separa els dos anys.
3. Llegir l'any final del curs.
4. Comprovar si el curs és anterior a l'obertura del Sant Josep Oriol.
5. Comprovar si el curs correspon al Sant Josep Oriol.
6. Comprovar si és el curs 2017-2018, quan no funcionava cap dels dos centres.
7. Comprovar si el curs correspon a l'Institut Tecnològic de Barcelona.
8. Mostrar "SJO", "ITB" o "NO" segons correspongui.
*/

import java.util.Scanner

fun main() {

    val scan = Scanner(System.`in`)

    // 1. Llegir l'any inicial del curs.

    val anyinicial = scan.nextInt()

    // 2. Llegir el guió que separa els dos anys.

    val separador = scan.next()

    // 3. Llegir l'any final del curs.

    val anyfinal = scan.nextInt()

    // 4. Comprovar si el curs és anterior a l'obertura del Sant Josep Oriol.

    if (anyinicial < 1956) {

        // 8. Mostrar "NO" si encara no existia cap dels dos centres.

        println("NO")

        // 5. Comprovar si el curs correspon al Sant Josep Oriol.

    } else if (anyinicial <= 2016) {

        // 8. Mostrar "SJO" si el curs es feia al Sant Josep Oriol.

        println("SJO")

        // 6. Comprovar si és el curs 2017-2018.

    } else if (anyinicial == 2017) {

        // 8. Mostrar "NO" perquè aquell curs no funcionava cap dels dos centres.

        println("NO")

        // 7. Comprovar si el curs correspon a l'Institut Tecnològic de Barcelona.

    } else {

        // 8. Mostrar "ITB" si el curs es feia a l'Institut Tecnològic de Barcelona.

        println("ITB")
    }
}