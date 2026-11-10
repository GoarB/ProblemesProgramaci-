/*
El Joc de la Vida és un autòmata cel·lular dissenyat pel matemàtic britànic John Horton Conway al 1970

És un joc de zero jugadors, el que vol dir que la seva evolució està determinada pel seu estat inicial i no necessita
cap entrada de dades posterior. El tauler de joc és espai bidimensional rectangular, dividit en caselles (cèl·lules).
Cada casella te fins a 8 caselles veïnes, les que estan al seu voltant. Les cèl·lules tenen dos estats: vives o mortes.
Es tracta d’anar evolucionant el tauler de joc en base a unes regles, que marcaran si les caselles estan vives o
mortes. L’estat d’una casella evoluciona, d’una generació per la següent, sempre en funció de l’estat inicial de la
matriu. en funció d’una sèrie de regles:

Una casella morta amb exactament 2 ó 3 caselles veïnes, “neix” (és a dir, passa a estar viva). Altrament roman morta.
Una casella viva amb 2 ó 3 caselles veïnes segueix viva, altrament mor o roman morta (per soledat, o superpoblació).
Entrada
Cada cas de prova consta d’una sèrie de línies:

Files i columnes del tauler de joc (enters entre 1 i 10 separats per un espai).
Una línia per cada fila, amb l’estat de cada columna: si la columna està morta es representa amb un “0” i si està viva
amb un “1”. No hi ha separació entre l’estat de cada casella.
Sortida
Per cada cas de prova, caldrà respondre:

Una línia per cada fila, amb l’estat de cada columna a la següent generació, representat de la manera ja explicada i
havent aplicat les regles del “Joc de la Vida”.

1. Registrar el nùmero de files i columnes del taulell.
2.
3.
4.
 */