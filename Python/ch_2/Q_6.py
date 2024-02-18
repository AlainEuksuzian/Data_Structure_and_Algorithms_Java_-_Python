"""Write a PYTHON program that inputs a document and then outputs a bar-chart plot of
the frequencies of each alphabet character that appears within that document."""

import matplotlib.pyplot as plt


# main method to call all subroutines
def main():
    wordList = getFileInput(r'C:\Users\Alain E\Desktop\vscode-files\comp352-coding\Python\ch_2\t.txt')
    letter_dict = letter_counter(wordList)
    letter_chart(letter_dict)


#gets a txt file, parses each letter and adds it a list
def getFileInput(file:str) -> list:
    wordList = []

    with open(file, 'r') as text:
        for words in text:
            for letters in words:
                if letters != " ":
                    letters = letters.rstrip()
                    wordList.append(letters)
    
    return wordList


# gets a list input containing letters, and counts occurances stored in dictionary
def letter_counter(myList: list):
    letter_counter = {}

    for i in myList:
        if i not in letter_counter:
            letter_counter[i] = 1
        else:
            letter_counter[i] = letter_counter[i] +1
    
    return letter_counter


#gets a dictionary input and plots bar chart for each letter occurance
def letter_chart(letters : dict):
    plt.bar(letters.keys(), letters.values())
    plt.show()



main()