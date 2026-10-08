// Les eleccions a Estats Units en 2020 depenen del decisiu estat de Wisconsin. Els tres candidats, Boe Jiden, Tonald
// Drump, i Sernie Banders estan esperant els resultats que tu, com a Secretari d'Estat, donaràs.
// 1. Demanar la quantitat de vots i crear les variables de cada entrada.
// 3. Crear les condicionals de cada situació.
// 4. Mostrar el resultat.
fun main() {
    // Llegir els vots.
    val jiden: Int = readln().toInt()
    val drump: Int = readln().toInt()
    val banders: Int = readln().toInt()
    // Crear les condicionals de cada situació i mostrar el resultat en cas d'acomplir la condicional.
    if (jiden > drump && jiden > banders) {
        println("Jiden")
    }
    if (drump > jiden && drump > banders) {
        println("Drump")
    }
    if (banders > drump && banders > jiden) {
        println("Banders")
    }
}