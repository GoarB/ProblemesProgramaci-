// Un número és divisible entre 6 si ho és per 2 i 3, i entre 9 si sumes els seus dígits... no m'enrecordo.
// Fes un programa que faci això i jo em dedico a memoritzar les estadístiques del meu personatge al WorldofWarcraft
// 1. Llegir el numero
// 2. Crear la condicional e impirmir la resposta en funcio del numero donat
fun main() {
    // 1. Llegir el numero
    val num: Int = readln().toInt()
    // 2. Crear la condicional e impirmir la resposta en funcio del numero donat
    if (num % 5 == 0 && num % 8 == 0 && num % 9 == 0 && num % 7 == 0) {
        print("SI")
    }
        else  print("NO")
}