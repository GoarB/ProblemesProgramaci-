/*
Diu la llegenda que Euler de petit va poder sumar molt fàcilment tots els números del 0 al 100 perquè va donar-se
compte que 0+100 = 100, 1+99 = 100, 2+98 = 100, etc. D’aquí neix la fórmula d’Euler

nota: Euler té 32109382190381290 fórmules diferents i totes es diuen fórmula d'Euler

Entrada
La primera línia indica els casos de prova a considerar. Cada cas de prova compta amb un nombre N
, que sempre ha de ser parell, i després N
 nombres enters.

Sortida
Per a cada cas, en una línia, digues la suma dels nombres oposats per grandària. És a dir, la suma del més petit amb
el més gran, la suma del segon més petit amb el segón més gran, la suma del tercer més petit amb el tercer més gran,
etc, fins que els hagis dit tots. Hauràs de dir sempre N/2 nombres.

1. Llegir el numero de casos de prova.
2. Registrar el numero mes gran i el mes petit.
3. Obrir el bucle en funció dels casos de prova restants.
4. Registrar el numero de numeros que vol registrar l'usuari en base a l'entrada de l'usuari.
5. Registrar tots els numeros per tal de multiplicarlos.
6. Ordenar els numeros de mes petit a mes gran.
7. Considerar tots els nombres registrats en ordre i multiplicar el mes gran amb el mes petit, el segon mes
   gran amb el segon mes petit, i aixi succesivament.
8. Registrar el resultat de cada multiplicacio en una sola linea afegint un espai a partir del
   segon nombre registrat.
9. Mostrar el resultat.
 */



import java.util.Scanner

fun main() {

    val scan = Scanner(System.`in`)

    // Llegir el numero de casos de prova.

    var casosprova = scan.nextInt()

    // Registrar el numero mes gran i el mes petit.

    var resultat = ""

    // Obrir el bucle en funció dels casos de prova restants.

    while (casosprova > 0) {

        // Registrar el numero de numeros que vol registrar l'usuari en base a l'entrada de l'usuari.

        val tamany = scan.nextInt()

        // Registrar tots els numeros per tal de multiplicarlos.

        val entrada = IntArray(tamany)
        for (i in entrada.indices) {
            entrada[i] = scan.nextInt()
        }
        // Ordenar els numeros de mes petit a mes gran.
        entrada.sort()

        /* Considerar tots els nombres registrats en ordre i multiplicar el mes gran amb el mes petit, el segon mes
        gran amb el segon mes petit, i aixi succesivament. */

        var inici = 0
        var fi = entrada.size - 1
        while (inici <= fi) {
            if (resultat != "") {
                val result = entrada[inici] + entrada[fi]
                /* Registrar el resultat de cada multiplicacio en una sola linea afegint un espai a partir del
                   segon nombre registrat. */
                resultat += " "
                resultat += result.toString()
            } else {
                val result = entrada[inici] + entrada[fi]
                resultat += result.toString()
            }
            inici++
            fi--
        }
        casosprova--

        // Mostrar el resultat.

        println(resultat)
        resultat = ""
    }
}
