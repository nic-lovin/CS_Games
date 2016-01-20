nbLines = int(input())

for _ in range(nbLines):
    nbCharacters = int(input()) # Nombre de chiffres que contient la ligne
    lineTab = input().split() # Split la ligne en tableau de chiffres

    # Si le nbCharacters est pair, le résultat sera toujours 0.
    if nbCharacters % 2 == 0:
        print(0)
    else: # Sinon, on fait le XOR juste sur les indices pairs du tableau.
        answer = 0

        for i in range(0, nbCharacters, 2):
            answer ^= int(lineTab[i])

        print(answer)
