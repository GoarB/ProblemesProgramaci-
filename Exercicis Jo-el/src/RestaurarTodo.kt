/*
A Pokémon, el Full Restore (Restaurar Tot) és un objecte que cura totalment al Pokémon i li treu
tots els estats alterats. Crea tres variables int per a il·lustrar l’estat d’un Pokémon, hp
(punts de vida), max_hp (punts de vida màxima) i status (estat, a on el 0 seria l’estat normal i
qualsevol altre nombre un estat altera).

Entrada
Cada cas té tres nombres, status, hp, i max_hp

Sortida
La frase del que ha fet el restaurar todo segons aquesta regla:
Pokémon Debilitat (hp és 0): No fa res - Imprimeix “DEBILITAT” per pantalla
Pokémon Ferit (hp és més que 0 pero menys que el màxim), sense estat alterat (status és 0):
El cura totalment - posa la vida al màxim i imprimeix “CURAR” per pantalla
Pokémon sa (hp és el màxim) amb Estat Alterat (status no és 0): Li cura l’estat alterat -
posa el status a 0 i imprimeix “ESTAT” per pantalla
Pokémon Ferit i amb Estat Alterat: Posa la vida al màxim i el status a 0, i imprimeix “CURAR I ESTAT” per pantalla
Pokémon sa i sense estats alterats: No fa res - imprimeix “RES” per pantalla

1. Importar la classe Scanner.
2. Crear l'Scanner per llegir les dades d'entrada.
3. Llegir l'estat actual del Pokémon.
4. Llegir els punts de vida actuals del Pokémon.
5. Llegir els punts de vida màxims del Pokémon.
6. Comprovar primer si el Pokémon està debilitat.
7. Comprovar si està ferit i té un estat alterat.
8. Comprovar si està ferit però no té cap estat alterat.
9. Comprovar si té la vida al màxim però té un estat alterat.
10. Si està sa i sense estat alterat, indicar que no cal fer res.
11. Mostrar per pantalla l'acció realitzada.
*/

import java.util.Scanner

fun main() {

    // Crear l'Scanner per llegir l'entrada.
    val scan = Scanner(System.`in`)

    // Llegir l'estat del Pokémon.
    var estat = scan.nextInt()

    // Llegir els punts de vida actuals.
    var vidaActual = scan.nextInt()

    // Llegir els punts de vida màxims.
    val vidaMaxima = scan.nextInt()

    // Variable que guardarà el missatge que mostrarem.
    var resultat = ""

    // Si la vida és 0, el Pokémon està debilitat.
    if (vidaActual == 0) {

        resultat = "DEBILITAT"

        // Si està ferit i també té un estat alterat.
    } else if (vidaActual < vidaMaxima && estat != 0) {

        // Restaurar tota la vida.
        vidaActual = vidaMaxima

        // Eliminar l'estat alterat.
        estat = 0

        resultat = "CURAR I ESTAT"

        // Si està ferit però no té cap estat alterat.
    } else if (vidaActual < vidaMaxima && estat == 0) {

        // Restaurar tota la vida.
        vidaActual = vidaMaxima

        resultat = "CURAR"

        // Si té tota la vida però té un estat alterat.
    } else if (vidaActual == vidaMaxima && estat != 0) {

        // Eliminar l'estat alterat.
        estat = 0

        resultat = "ESTAT"

        // Si té tota la vida i no té cap estat alterat.
    } else {

        resultat = "RES"
    }

    // Mostrar l'acció realitzada.
    println(resultat)
}