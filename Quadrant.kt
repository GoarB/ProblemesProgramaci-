/* En un joc 2D el punt (0,0) és l’origen del món i les coordenades (x,y) de qualsevol objecte situat en aquest món
* poden ser positives o negatives. Segons el signe de les coordenades l’objecte es troba en el quadrant 1, 2, 3 o 4.
* Fes un programa que donades les coordenades x i y del centre d’un enemic i que digui a quin quadrant es troba.
* ATENCIÓ: Si una de les coordenades val 0, llavors l’enemic es troba en DOS QUADRANTS. Si les coordenades són 0,0,
* llavors es troba al centre. Cal indicar-ho correctament a l’usuari.
* 1. Declarar scanner
* 2. Crear les variables per les entrades de l'usuari i la string on guardarem la sortida.
* 3. Crear les condicions per a cada cuadrant.
* 4. Mostrar la resposta.
* */

import java.util.Scanner

fun main() {
    // Declarar scanner
    val scan = Scanner(System.`in`)
    // Crear les variables per les entrades de l'usuari i la string on guardarem la sortida.
    val valorx : Int = scan.nextInt()
    val valory : Int = scan.nextInt()
    var resposta : String = ""
    // Crear les condicions per a cada cuadrant.
    if (valorx >= 0 && valory >= 0 ){
        resposta += "1"
    }
    if (valorx <= 0 && valory >= 0){
        if (resposta.isNotBlank()){
            resposta += ","
        }
        resposta += "2"
    }
    if (valorx <= 0 && valory <= 0 ){
        if (resposta.isNotBlank()){
            resposta += ","
        }
        resposta += "3"
    }
    if (valorx >= 0 && valory <= 0 ){
        if (resposta.isNotBlank()){
            resposta += ","
        }
        resposta += "4"
    }
    // Mostrar la resposta.
    println(resposta)
}