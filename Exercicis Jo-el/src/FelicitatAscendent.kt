// Diuen que allò important no és ser molt feliç, sinó ser cada dia més feliç que el dia anterior. A mi no em miris,
// sóc un programa d'ordinador.
// 1. Crear les variables per cada entrada.
// 2. Crear la condició e imprimir el resultat.

fun main() {
    // Crear les variables per cada entrada.
    val entrada1 = readln().toInt()
    val entrada2 = readln().toInt()
    val entrada3 = readln().toInt()
    // Crear la condició e imprimir el resultat.
    if (entrada1 < entrada2 && entrada3 > entrada2) {
        print("SI")
    } else print("NO")
}