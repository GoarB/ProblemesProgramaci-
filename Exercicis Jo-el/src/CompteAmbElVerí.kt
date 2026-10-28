/*
En el videojoc League of Legends una de les parts més importants per al jungla (un dels rols), per exemple un Rammus,
és matar al primer gran monstre (conegut popularment com a “blau” o “vermell”). Per fer això necessites ajuda del teu
equip, com per exemple un Twitch. No obstant, alguns del teu equip poden tenir habilitats de verí…).

Entrada
La primera línia indica els casos de prova a considerar Cada cas de prova és una linea amb 3 nombres el primer, hp,
es la vida màxima del monstre de la jungla. El segón, rammus , es l’atac del Rammus. El tercer, twitch , es l’atac
del verí del twitch Es garantitza que els tres nombres son positius i majors de 0.

Sortida
En cada ronda, rammus i twitch atacaran al monstre de la jungla, restant-li tanta vida com el seu atac. Primer
sempre atacara rammus i després twitch. Per a cada cas de prova s’haura de respondre Si ha estat l’atac de rammus
el que ha matat el monstre, (fet que la vida baixes a 0 o menys), escriureu, RAMMUS, en cas de que fos el verí de
twitch escriureu TWITCH. Després del nom escriureu quantes rondes s’han necessitat per a matar el monstre

1. Llegir el nombre de casos de prova.
2. Repetir el procés per cada cas.
3. Llegir la vida del monstre, l'atac de Rammus i l'atac de Twitch.
4. Crear un comptador de rondes.
5. Repetir els atacs mentre el monstre segueixi viu.
6. Augmentar el nombre de rondes.
7. Restar l'atac de Rammus a la vida del monstre.
8. Comprovar si Rammus ha matat el monstre.
9. Si continua viu, restar l'atac de Twitch.
10. Comprovar si Twitch ha matat el monstre.
11. Mostrar qui ha matat el monstre i en quantes rondes.
*/

import java.util.Scanner

fun main() {

    val scan = Scanner(System.`in`)

    // 1. Llegir el nombre de casos de prova.
    val nombreCasos = scan.nextInt()

    // 2. Repetir el procés per cada cas.
    for (casActual in 1..nombreCasos) {

        // 3. Llegir la vida del monstre, l'atac de Rammus i l'atac de Twitch.
        var vidaMonstre = scan.nextInt()
        val atacRammus = scan.nextInt()
        val atacTwitch = scan.nextInt()

        // 4. Crear un comptador de rondes.
        var nombreRondes = 0

        var guanyador = ""

        // 5. Repetir els atacs mentre el monstre segueixi viu.
        while (vidaMonstre > 0) {

            // 6. Augmentar el nombre de rondes.
            nombreRondes++

            // 7. Restar l'atac de Rammus a la vida del monstre.
            vidaMonstre -= atacRammus

            // 8. Comprovar si Rammus ha matat el monstre.
            if (vidaMonstre <= 0) {
                guanyador = "RAMMUS"
                break
            }

            // 9. Si continua viu, restar l'atac de Twitch.
            vidaMonstre -= atacTwitch

            // 10. Comprovar si Twitch ha matat el monstre.
            if (vidaMonstre <= 0) {
                guanyador = "TWITCH"
                break
            }
        }

        // 11. Mostrar qui ha matat el monstre i en quantes rondes.
        println("$guanyador $nombreRondes")
    }
}
