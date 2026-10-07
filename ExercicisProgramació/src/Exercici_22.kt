import java.util.Scanner

fun main() {
    // Declarar scanner
    val scan = Scanner(System.`in`)
    // Benvinguda al programa
    println("Aquest programa vol esbrinar si la dita es certa en valor boolea! ")
    // Demana els nivells de riure de cada persona
    print("Escriu el nivell de riure de la primera persona (1/10): ")
    val primer = scan.nextInt()
    print("Escriu el nivell de riure de la segona persona (1/10): ")
    val segon = scan.nextInt()
    print("Escriu el nivell de riure de la tercera persona (1/10): ")
    val tercer = scan.nextInt()
    print("Escriu el nivell de riure de la cuarta persona (1/10): ")
    val cuart = scan.nextInt()
    print("Escriu el nivell de riure de la cinquena persona (1/10): ")
    val cinque = scan.nextInt()
    // Transforma la sortida a Boolea i mostra el resultat
    val resultat = primer < segon && segon < tercer && tercer < cuart && cuart < cinque
    print("La dita en valor Boolea es $resultat")
}