//En The Legend of Zelda, Majora’s Mask, tens 3 dies per a salvar el mon de l’impacte de la lluna.
// Tot i que internament el joc compta el temps en segons, els events més importants passen cada 12 hores, sent les
// 12 primeres el “matí del dia 1”, les 12 segones la “nit del dia 1”, les 12 terceres el “matí del dia 2” i així.
// Fes un programa que donat el nombre de segons que transcorreixen
// desde l’inici del joc, et digui en quin dia estas, i si és matí o nit.
// 1. Crear la variable del moment del dia
// 2. Demanar els segons en el que estem.
// 3. Crear les variables que indiquin el moment del dia en el que estem en base als segons.
fun main() {
    // 1. Crear la variable del moment del dia
    val MitgDia : Int = 43200
    // 2. Demanar els segons en el que estem.
    val seg : Int = readln().toInt()
    // 3. Crear la variable del moment
    val moment = seg / MitgDia
    // 4. Crear la variable del dia
    val dia = (moment/2)+1
    // 5. Crear les condicions per mostrar una o altre resposta i mostrar-la
    if (moment%2 == 0){
        println("mati del dia $dia")
    }
    else if (moment % 2 != 0){
        println("nit del dia $dia")
    }
}