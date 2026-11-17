/*
Amb la inflació disparada el cistell de la compra s'ha posat pels núvols. Ajuda'ns a triar els millors productes.

Entrada
L'entrada comença amb un número N que indica el nombre de productes a comprar.

A continuació vindran N línies on tindrem el nom del producte (String) i el preu del producte (float)

Finalment tindrem un número P que indica el producte que volem consultar.

Sortida
Cal mostrar 3 línies, amb el producte més car, més barat i el que ocupa la posició P si ordenem del més car al més barat.

La primera línia mostrarà "EL MES CAR: " seguit del nom i el preu del producte, separats per un espai.

La segona línia mostrarà "EL MES BARAT: " seguit del nom i el preu del producte, separats per un espai.

La tercera línia mostrarà "EL BUSCAT: " seguit del nom i el preu del producte, separats per un espai.

(Per simplificar el problema, tant a l'entrada com a la sortida s'han omès els accents)

1. Registrar el numero de productes a comprar.
2. Omplir la llista de la compra amb les esntrades de l'usuari.
3. Registrar el producte que volem consultar.
4. Mostrar el producte mes car, el producte mes barat i el producte buscat.
*/
import java.util.Locale
import java.util.Scanner

fun main() {


    val scan = Scanner(System.`in`).useLocale(Locale.UK)

//1. Registrar el numero de productes a comprar.
    val mida = scan.nextInt()
//2. Omplir la llista de la compra amb les esntrades de l'usuari.
    val llistaprod = Array(mida) {""}
    val llistapreu = DoubleArray(mida) {0.0}
    for (i in 0 until mida) {
        llistaprod[i] = scan.next()
        llistapreu[i] = scan.nextDouble()
    }
    scan.nextLine()
//3. Registrar el producte que volem consultar.
    val producte  = scan.nextInt()
    var prodcar = ""
    var mescar = Double.MIN_VALUE
    var prodbarat = ""
    var mesbarat = Double.MAX_VALUE
    val preus = DoubleArray(mida)
    var productetrobat = ""
//4. Mostrar el producte mes car, el producte mes barat i el producte buscat.
    for (i in 0 until mida) {
        preus[i] = llistapreu[i]
        if (llistapreu[i] > mescar) {
            mescar = llistapreu[i]
            prodcar = llistaprod[i]
        }
        if (llistapreu[i] < mesbarat) {
            mesbarat = llistapreu[i]
            prodbarat = llistaprod[i]
        }
    }
    preus.sortDescending()
    for (i in 0 until mida) {
    if (llistapreu[i] == preus[producte - 1]) {
    productetrobat = llistaprod[i]
    }
    }
    println("EL MES CAR: $prodcar $mescar")
    println("EL MES BARAT: $prodbarat $mesbarat")
    println("EL BUSCAT: $productetrobat ${preus[producte-1]}")
}