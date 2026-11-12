import java.util.Scanner

/*
Es vol posar tensió als anuncis de que es farà EL EVENTO es volen posar punts suspensius, perquè els punts suspensius
donen tensió. No obstant, el responsable de Marketing, P. Meloni, no sap de signes de puntuació així que els posa al
tuntun. Fes un programa que llegeix una frase amb varies paraules i després mitjançant un split la separi en un array
de paraules. Un cop fet això concatena punts suspensius “...” a cada paraula si aquesta és més curta que la paraula
següent. No afegeixis mai punts a l’última paraula.

Entrada
La primera línia indica els casos de prova a considerar. Per cada cas, hi haurà una sola línia amb una frase formada
només per lletres de l'alfabet anglès i espais.

Sortida
Per cada cas de prova caldrà respondre: La mateixa línea amb els punts suspensius corresponents.

1. Registrar el numero de casos.
2. Registrar la linea de paraules que dona l'usuari.
3. Afegir punts suspensius si la paraula es mes curta que l'anterior.

 */
fun main() {

    val scan = Scanner(System.`in`)
    var casos = scan.nextInt()
    while(casos > 0) {
    val frase = scan.nextLine()
        val paraules = Array(6) {frase.split(" ")}
        println(paraules.contentToString())
        for (i in paraules.indices) {
            if (i > 0 && paraules[i].size < paraules[i-1].size) {
                paraules[i] += "..."
            }
        }
        for (j in paraules.indices) {
            print(paraules[j] + " ")
        }
        casos--
    }
}