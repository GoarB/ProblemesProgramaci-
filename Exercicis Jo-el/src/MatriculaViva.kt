import java.util.Scanner

fun main() {

    val scan = Scanner(System.`in`)

    var alumnes = 0
    scan.next()
    var maxcap = scan.nextInt()
    var entrada = scan.next()
    while (entrada != "F") {
        if (entrada == "I" && alumnes != maxcap) {
            alumnes++
            scan.nextLine()
            entrada = scan.next()}
        else if (entrada == "B"){
                alumnes--
            scan.nextLine()
            entrada = scan.next()
            }
        else if (entrada == "A"){
            val num = scan.nextInt()
            maxcap = num
            entrada = scan.next()
        }
        else if (entrada == "N" || entrada == "S"){
            println(alumnes)
            entrada = scan.next()
        }
        else {
            val nom = scan.next()
            println("KO$nom")
            entrada = scan.next()
        }
    }
    println(alumnes)

}