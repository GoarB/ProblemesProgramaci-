/*
Què passa si un número de tres dígits el multipliquem per 1001?

Exemple: 357 x 1001 → 357357 ... (es clona !!!)

I si el multipliquem per 1001001001?

357 x 1001001001 = 357357357357 ... (l’original i tres clons!!!)

Direm que un número c és N-clonador quan el resultat de multiplicar qualsevol número n de N xifres per c , el resultat
sigui una rèplica del número n. És a dir n*c = nnn...n Per exemple, 1001 i 1001001001 són 3-clonador

En realitat, és fàcil identificar els N-clonadors, ja que segueixen un patró molt definit ... són seqüències de 0 i 1
amb les següents característiques:

comencen per 1
acaben per 1
entre dos uns consecutius, el número de zeros és constant. Sigui N aquest número de zeros Aleshores estem davant
d’un número N+1 clonador.


 */