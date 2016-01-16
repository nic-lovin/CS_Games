if __name__ == '__main__':
    firstWord = input()
    secondWord = input()
    answer = sorted(firstWord.intersection(secondWord))
    firstWord = len(firstWord) - len(sorted(firstWord.intersection(answer)))
    secondWord = len(secondWord) - len(sorted(secondWord.intersection(answer)))
    print(firstWord + secondWord)
