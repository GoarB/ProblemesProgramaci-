// Els Baby Boomers (coneguts com a boomers) són aquells nascuts entre 1945 i 1965. S'ha posat de moda cabrejar-los dient-lis "ok boomer"
// 1. Demanar l'any de naixement i crear la variable de boomer
// 2. Crear la condicional de ok Boomer
// 3. Crear la condicional de nah
fun main() {

    // 1. Demanar l'any de naixement i la variable de boomer
val any : Int = readln().toInt()
val boomer : IntRange = 1945..1965
    // 2. Crear la condicional de ok Boomer
    if (any in boomer) {
        println("ok boomer")
    }

    // 3. Crear la condicional de nah
    else println("nah")

}