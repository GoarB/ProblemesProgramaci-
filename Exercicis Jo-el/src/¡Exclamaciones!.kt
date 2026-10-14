/*
Marc nunca se acuerda de abrir las exclamaciones. Él dice que es porque en catalán no se abren las exclamaciones
pero yo creo que simplemente no sabe escribir. Vamos a crear un programa que asegure que hay tantos abrir exclamación
como cerrar exclamación para flamearlo.

Entrada
Cada caso es una línea de texto. El programa (y por tanto el bucle) acaba cuando la línea és "FIN", que no debe
procesarse.

Sortida
Por cada caso, responde SI si hay tantos abrir exclamación como cerrar exclamación y NO en caso contrario

1. Crear la primera entrada del usuari buida per tal de crear el bucle
2. Crear el bucle que cuente si el numero de exclamaciones abiertas i cerradas es el mismo y muestre el resultado.

 */

import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`)
//1. Crear la primera entrada del usuari buida per tal de crear el bucle
    val oberta = "¡"
    val tancada = "!"
    var entrada = ""
//2. Crear el bucle que cuente si el numero de exclamaciones abiertas i cerradas es el mismo y muestre el resultado.
    while (entrada != "FIN") {
        entrada += scan.nextLine()
        for (caracteres in entrada) {

        }
    }
}