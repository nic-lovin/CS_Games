if __name__ == '__main__':
    nbRocks = int(input())
    answer = set(input())
    for _ in range(0, nbRocks-1):
        answer = sorted(set(answer).intersection(set(input())))
    print(len(answer))
