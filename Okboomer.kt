// Els Baby Boomers (coneguts com a boomers) són aquells nascuts entre 1945 i 1965. S'ha posat de moda cabrejar-los dient-lis "ok boomer"
// 1. Demanar l'any de naixement
// 2. Crear la condicional de ok Boomer
// 3. Crear la condicional de nah
fun main() {

    // 1. Demanar l'any de naixement
val any : Int = readln().toInt()

    // 2. Crear la condicional de ok Boomer
    if (any in 1945..<1966) {
        println("ok boomer")
    }

    // 3. Crear la condicional de nah
    else if (any > 1965){ print("nah")
    }
    else if (any < 1945){
        println("nah")
    }
}