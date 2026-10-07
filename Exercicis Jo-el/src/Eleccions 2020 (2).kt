// Les eleccions a Estats Units en 2020 depenen del decisiu estat de Wisconsin. Els dos candidats, Boe Jiden i
// Tonald Drump, estan esperant els resultats que tu, com a Secretari d'Estat, donaràs.
// 1. Demanar la quantitat de vots.
// 2. Crear les condicionals de cada situació.
// 3. Mostrar el resultat.
fun main() {
    // Llegir els vots.
    val jiden: Int = readln().toInt()
    val drump: Int = readln().toInt()
    // Crear les condicionals de cada situació i mostrar el resultat en cas d'acomplir la condicional.
    if (jiden < drump) {
        println("Drump")
    }
    if (drump < jiden) {
        println("Jiden")
    }
    if (drump == jiden) {
        println("No")
    }
}