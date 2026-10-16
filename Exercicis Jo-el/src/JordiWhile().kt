/*
Jordi While() és un streamer famós. Com tots els streamers, el que més por li fa es que l'hi posin 3 strikes
0a la compta, perquè aleshores li tancarien

Entrada
Cada cas és una linea amb un nombre desconegut de números. Els números seran, o bé un nombre positiu, amb els viewers
que ha tingut Jordi, o bé -1, que significa que li han posat un strike. La línea acaba al tercer strike.

Sortida
Per cada cas de prova caldrà respondre: Quants videos ha fet jordi fins a rebre el tercer strike (sense comptar
els vídeos amb strike)

1. Declarar scanner
2. Declarar les variables de videosbons, strikes i entrada de l'usuari.
3. Crear el bucle per comptar strikes i videos bons.
4. Mostrar el resultat.
 */

import java.util.Scanner

fun main() {
    // 1. Declarar scanner
    val scan = Scanner(System.`in`)
    // 2. Declarar les variables de videosbons, strikes, strike i maxstrikes.
    var videosbons : Int = 0
    var strikes : Int = 0
    val strike : Int = -1
    val maxstrikes = 3
    // 3. Crear el bucle per comptar strikes i videos bons.
    while (strikes != maxstrikes) {
        val entrada = scan.nextInt()
        if (entrada >= 0) {
            videosbons += 1
        }
        else if (entrada == strike) {
            strikes += 1
        }
    }
    // 4. Mostrar el resultat.
    println(videosbons)
}