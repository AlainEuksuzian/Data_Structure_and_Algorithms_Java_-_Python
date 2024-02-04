

"""Write a Java program that inputs a list of words, separated by whitespace, and
outputs how many times each word appears in the list. You need not worry about
efficiency at this point, however, as this topic is something that will be addressed
later in this book."""


def main():
    sentence_input = input("enter words seperated by a space bar:")
    word_list = sentence_input.split(" ")
    word_counter = {}

    for i in word_list:
        if i not in word_counter:
            word_counter[i] = 1
        else:
            word_counter[i] = word_counter[i] + 1

    for key, value in word_counter.items():
        print(key, "=>", value)
    


main()


