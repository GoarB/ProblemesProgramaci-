/*
Per si era poc complicat l'anar a comprar, a sobre la mare vol comprovar si ho hem comprat tot i a quin preu. Com que
ens fa comprar un munt de productes, quan ens pregunta pels kiwis remanem i remanem fins trobar-los. Estaria molt
bé tenir-los ordenats...

Entrada
L'entrada comença amb un número N que indica el nombre de productes comprats.

A continuació vindran N línies on tindrem el nom del producte (String) i el preu del producte (float) que hem comprat

Finalment tindrem una línia amb el nom del producte que volem comprovar.

Sortida
Si no trobem el producte li direm "NO N'HI HAVIA"

Si trobem el producte li direm "SI, M'HA COSTAT " seguit del preu i, si no és el primer producte en ordre alfabètic,
seguirem amb "I TAMBE TINC " producte " A " preu , amb la informació del producte anterior en ordre alfabètic

(Per simplificar el problema, tant a l'entrada com a la sortida s'han omès els accents)
1. Registrar el numero de productes a comprar.
2. Omplir la llista de la compra amb les esntrades de l'usuari.
3. Registrar el producte que volem consultar.
4. Buscar el producte i mostrar el valor del producte si es troba.
5. Mostrar el resultat de la cerca.
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
    val llistanoms = Array(mida) {""}
    for (i in 0 until mida) {
        llistaprod[i] = scan.next()
        llistanoms[i] = llistaprod[i]
        llistapreu[i] = scan.nextDouble()
    }
    scan.nextLine()
    llistanoms.sortDescending()
//3. Registrar el producte que volem consultar.
    val productebuscat = scan.next()

//4. Buscar el producte i mostrar el valor del producte si es troba.
    var productetrobat = "NO N'HI HAVIA"
    var preutrobat = 0.0
    var producteanterior = ""
    var preuanterior = 0.0

    for (prod in 0 until mida) {
        if (llistaprod[prod] == productebuscat) {
            productetrobat = "SI, M'HA COSTAT"
            preutrobat = llistapreu[prod]
        }
    }
    for (nom in 0 until mida) {
        if (llistanoms[nom] == productebuscat && nom != mida - 1) {
            producteanterior = llistanoms[nom+1]
        }
    }
    for (preu in 0 until mida) {
        if (llistaprod[preu] == producteanterior) {
            preuanterior = llistapreu[preu]
        }
    }

//5. Mostrar el resultat de la cerca.
    if (preutrobat != 0.0 && producteanterior == "") {
        println("$productetrobat $preutrobat")
    }
    else if (preutrobat != 0.0) {
        println("$productetrobat $preutrobat I TAMBE TINC $producteanterior A $preuanterior")
    }
    else {
        println(productetrobat)
    }
    }
