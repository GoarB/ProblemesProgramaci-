/*
Un icónic atac de mag en el WoW es Explosión Arcana. Aquest atac comença fent poc mal, pero cada cop que el fas servir
fa un 100% més de mal. Per exemple, si el primer cop fa 100 punts de mal, el següent farà 200, el següent 300, el
següent 400, i així fins que passa un temps.

Entrada
Cada cas son dos nombres, casdascún en una linea. el primer, Ini
, es el dany inicial de Explosión Arcana. El segon, HP
, és la vida de l'enemic

Sortida
S'ha de dir quantes explosions arcanes s'han de tirar, comptant amb la regla anterior, per a matar l'enemic
(deixar-li la vida a 0).

1. Crear les variables de l'entrada respectiva del mal que fa i la de la vida total.
2. Crear les variables de la vida actual, el dany que fa l'atac cada torn i el numero de hits.
3. Crear el bucle en funcio de si la vida es 0 o menys que compti la quantitat de cops que necessites per
matar l'enemic.
4. Mostrar el total de cops necessaris.
 */

import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`)

   // 1. Crear les variables de l'entrada respectiva del mal que fa i la de la vida total.

    val INI  = scan.nextInt()
    val HPMAX = scan.nextInt()

    // 2. Crear les variables de la vida actual, el dany que fa l'atac cada torn i el numero de hits.

    var hp = HPMAX
    var dany = INI
    var hits = 0

    // 3. Crear el bucle en funcio de si la vida es 0 o menys que compti la quantitat de cops que necessites
    // per matar l'enemic.

    while (hp > 0) {
        hp -= dany
        dany += INI
        hits++
    }

    // 4. Mostrar el total de cops necessaris.

    println(hits)
}