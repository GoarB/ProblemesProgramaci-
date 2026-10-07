// Implementa un programa que simuli el joc del pedra-paper-tisora:
//
//Demana al jugador1, la seva opció: 1, 2, 3 (on 1 es pedra, 2 és paper i 3 és tisora).
//Demana al jugador2, la seva opció: 1, 2, 3 (on 1 es pedra, 2 és paper i 3 és tisora).
// 1. Establir els valors de pedra, paper i tisores
// 2. Llegir els numeros dels jugadors
val pedra = 1
val paper = 2
val tisora = 3
val error = 0
fun main() {
    // 2. Llegir els números dels jugadors
    val jugador1: Int = readln().toInt()
    val jugador2: Int = readln().toInt()
    // 3. Crear les condicionals en funció de l'entrada de cada jugador
    if (jugador1 == error || jugador2 == error) {
        println("ERROR")
    } else if (jugador1 == jugador2) {
        println("EMPAT")
    } else if (jugador2 == pedra && jugador1 == tisora || jugador2 == paper && jugador1 == pedra ||
        jugador2 == tisora && jugador1 == paper) {
        println("Jugador2")
    }
    else (print("Jugador1"))
}