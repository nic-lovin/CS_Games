if __name__ == '__main__':
    nbInt = input()
    test = sorted(input().split(" "))

    for i in range(0, len(test)):
        if test.count(test[i]) == 1:
            print(test[i])
# Y a surement moyen d'optimiser ça...
          
