#  Ha sortit fa poc la nova raid del WoW, Ny’alotha. En aquesta raid, es va per nivells. En el primer nivell hi ha un
#  monstre, que quan el mates, passes al següent nivell, que hi ha dos monstres. Els pots matar en l’ordre que vulguis
#  pero no pots passar al següent nivell fins que tots son morts. Per complicar la cosa, en alguns nivells hi ha monstres
#  opcionals, que no cal matar-los per a passar al següent nivell. Cada cop que surt una raid, els oficials de tots els
#  clans del WoW discuteixen sobre quin és el millor ordre per a acabar la raid (s’acaba una raid al matar el monstre
#  final de l’últim nivell), però hi ha moltíssimes possibilitats diferents

#  Entrada
#  La primera línia indica els casos de prova a considerar. Cada cas de prova són diverses línies. Comença amb un
#  nombre, N, que indica el nombre de nivells que hi ha. Després hi haurà N*2 nombres, per cada nivell, el nombre de
#  monstres obligatoris i el nombre de monstres opcionals. L’últim nivell sempre serà 1 0, perque només hi ha el
#  monstre final.

#  Sortida
#  Per cada cas s’haurà de tornar el nombre de combinacions diferents d’ordre de matar als monstres per a passar-se
#  la raid. Recordeu que la raid te la passes un cop has matat tots els monstres obligatoris, sense matar als
#  opcionals. Assumiu que un cop passeu de nivell no torneu mai al nivell anterior a matar els monstres opcionals.
#  Com el número pot ser motl alt (Blizzard pls) es calcularà mòdul 1.000.000.007.

# 1. Definir el mòdul i llegir tota l'entrada.
# 2. Preparar les variables per llegir els nombres.
# 3. Recórrer tots els caràcters de l'entrada.
# 4. Construir els nombres a partir dels seus dígits.
# 5. Llegir el nombre de casos.
# 6. Llegir el nombre de nivells de cada cas.
# 7. Llegir els monstres obligatoris de cada nivell.
# 8. Llegir els monstres opcionals de cada nivell.
# 9. Calcular el factorial dels monstres obligatoris.
# 10. Inicialitzar les combinacions del nivell.
# 11. Recórrer les quantitats de monstres opcionals.
# 12. Calcular l'invers modular utilitzant bucles.
# 13. Calcular les noves possibilitats.
# 14. Acumular les combinacions del nivell.
# 15. Multiplicar les combinacions de la raid.
# 16. Controlar els nivells processats.
# 17. Mostrar el resultat quan s'acabi cada cas.
# 18. Preparar la lectura del següent nombre.

import sys

# 1. Definir el mòdul i llegir tota l'entrada.

MODUL = 1000000007
entrada = sys.stdin.read() + " "

# 2. Preparar les variables per llegir els nombres.

numero = 0
llegintnumero = False
estat = 0
nivellsprocessats = 0

# 3. Recórrer tots els caràcters de l'entrada.

for caracter in entrada:

    # 4. Construir els nombres a partir dels seus dígits.

    if '0' <= caracter <= '9':
        numero = numero * 10 + int(caracter)
        llegintnumero = True

    elif llegintnumero:

        # 5. Llegir el nombre de casos.

        if estat == 0:
            nombrecasos = numero
            estat = 1

        # 6. Llegir el nombre de nivells de cada cas.

        elif estat == 1:
            nombrenivells = numero
            nivellsprocessats = 0
            combinacionstotals = 1
            estat = 2

        # 7. Llegir els monstres obligatoris.

        elif estat == 2:
            monstresobligatoris = numero
            estat = 3

        else:

            # 8. Llegir els monstres opcionals.

            monstresopcionals = numero

            # 9. Calcular el factorial dels obligatoris.

            factorial = 1

            for factor in range(1, monstresobligatoris + 1):
                factorial = factorial * factor % MODUL

            # 10. Inicialitzar les combinacions del nivell.

            possibilitats = factorial
            combinacionsnivell = possibilitats

            # 11. Recórrer les quantitats d'opcionals.

            for quantitat in range(1, monstresopcionals + 1):

                # 12. Calcular l'invers modular amb bucles.

                base = quantitat
                exponent = MODUL - 2
                invers = 1

                while exponent > 0:

                    if exponent % 2 == 1:
                        invers = invers * base % MODUL

                    base = base * base % MODUL
                    exponent //= 2

                # 13. Calcular les noves possibilitats.

                possibilitats = (
                    possibilitats
                    * (monstresopcionals - quantitat + 1)
                    * (monstresobligatoris + quantitat)
                    * invers
                ) % MODUL

                # 14. Acumular les combinacions del nivell.

                combinacionsnivell = (
                    combinacionsnivell + possibilitats
                ) % MODUL

            # 15. Multiplicar les combinacions de la raid.

            combinacionstotals = (
                combinacionstotals * combinacionsnivell
            ) % MODUL

            # 16. Controlar els nivells processats.

            nivellsprocessats += 1
            estat = 2

            # 17. Mostrar el resultat quan s'acabi el cas.

            if nivellsprocessats == nombrenivells:
                print(combinacionstotals)
                estat = 1

        # 18. Preparar la lectura del següent nombre.

        numero = 0
        llegintnumero = False